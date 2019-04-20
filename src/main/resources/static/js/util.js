/**
 * Created by zhzbin on 2016/11/22.
 */

// 对Date的扩展，将 Date 转化为指定格式的String
// 月(M)、日(d)、小时(h)、分(m)、秒(s)、季度(q) 可以用 1-2 个占位符，
// 年(y)可以用 1-4 个占位符，毫秒(S)只能用 1 个占位符(是 1-3 位的数字)
// 例子：
// (new Date()).Format("yyyy-MM-dd HH:mm:ss.S") ==> 2006-07-02 08:09:04.423
// (new Date()).Format("yyyy-M-d H:m:s.S")      ==> 2006-7-2 8:9:4.18
Date.prototype.Format = function (fmt) {
    var o = {
        "M+": this.getMonth() + 1,                 //月份
        "d+": this.getDate(),                    //日
        "H+": this.getHours(),                   //小时
        "m+": this.getMinutes(),                 //分
        "s+": this.getSeconds(),                 //秒
        "q+": Math.floor((this.getMonth() + 3) / 3), //季度
        "S": this.getMilliseconds()             //毫秒
    };
    if (/(y+)/.test(fmt))
        fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
    for (var k in o)
        if (new RegExp("(" + k + ")").test(fmt))
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
    return fmt;
}

/**
 * 重写toJSON方法
 * @returns {string}
 */
Date.prototype.toJSON = function () {
    var format = this.Format("yyyy-MM-dd HH:mm:ss");
    return (format.replace(" ", "T") + ".000Z");
};
/*
 * 数组处理函数
 * */
Array.prototype.indexOf = function (val) {
    for (var i = 0; i < this.length; i++) {
        if (this[i] == val) return i;
    }
    return -1;
};
Array.prototype.remove = function (val) {
    var index = this.indexOf(val);
    if (index > -1) {
        this.splice(index, 1);
    }
};
/*
* 判断全局变量jbit是否存在，如果不存在则重新初始化；
* */
if (!window.jbit) {
    window.jbit = {};
}

var biz = {};
var fn = biz.prototype;
biz.util = {
    /*
    * 缓存静态JS文件
    * */
    cacheJS:{},
    cacheHtml:{},
    /*
    * 获取静态js文件并缓存
    * */
    getJs: function (path, callbck) {
        function evalJs(e) {
            e.body=eval(e.body);
            return e;
        }
        var sef = this;
        if (sef.cacheJS[path]) {
            callbck.call(this,evalJs(new $.extend(sef.cacheJS[path])));
        } else {
            function success(e) {
                sef.cacheJS[path] = e;
                if (typeof callbck == "function") {
                    callbck.call(this, evalJs(new $.extend(sef.cacheJS[path])));
                }
            }
            $.ajax(path).success(function(e){
                success({
                    success:true,
                    body:e
                })
            }).fail(function (e) {
                callbck({
                    succes:false,
                    err:e
                })
            });
        }
    },
    getHtml:function (path, callbck) {
        var sef = this;
        if (this.cacheHtml[path]) {
            callbck(new $.extend(sef.cacheHtml[path]));
        } else {
            function success(e) {
                if (typeof callbck == "function") {
                    sef.cacheHtml[path] = e;
                    callbck(new $.extend(sef.cacheHtml[path]));
                }
            }
            $.ajax(path).success(function(e){
                success({
                    success:true,
                    body:e
                })
            }).fail(function (e) {
                callbck({
                    succes:false,
                    err:e
                })
            });
        }
    }
};
$.extend(true,window.jbit,biz);
biz.util.validator={
    password: function (v, ps) {
        var reg = /(^.{6,18}$)|(^.{32}$)/;
        return {code:reg.test(v),message: '请输入正确的密码！'};
    },
    mobile:function (mobile) {
        // 请输入手机号，手机号为11位
        return {code: /^0?1[3|4|5|7|8][0-9]\d{8}$/.test(mobile),message:"请输入有效的手机号码或邮箱！"};
    },email:  function (mail) {
        return {code: /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/.test(mail),message: '请输入有效的手机号码或邮箱！'}
    },account:  function (mail) {
        return {code: /^[0-9A-Za-z]{5,}$/.test(mail),message: '请输入正确的验证码'}
    }
};
jbit=$.extend({},jbit,biz);