/**
 * Created by zhzbin on 2016/12/9.
 */

/*
 * 标签示例:<div class='calendar' id='calendar'  style="margin: auto; width: 640px; height: 450px;"></div>
 * 参数为当前标签的ID
 * */
window.$Calendar = function (id) {
    if (!Date.prototype.Format) {
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
    }
    $this = this;
    var calendar = document.getElementById(id);
    $this.clickNode={};
    /*
     * 用于记录日期，显示的时候，根据dateObj中的日期的年月显示
     */
    $this.dateObj = (function () {
        var _date = new Date();    // 默认为当前系统时间
        return {
            getDate: function () {
                return _date;
            },
            setDate: function (date) {
                _date = date;
            }
        };
    })();
    /**
     * 渲染html结构
     */
    $this.renderHtml = function (id) {

        var titleBox = document.createElement("div");  // 标题盒子 设置上一月 下一月 标题
        var bodyBox = document.createElement("div");  // 表格区 显示数据

        // 设置标题盒子中的html
        titleBox.className = 'calendar-title-box';
        titleBox.innerHTML = "<span class='prev-month icon-chevron-left ' id='prevMonth'></span>" +
            "<span class='calendar-title' id='calendarTitle'></span>" +
            "<span id='nextMonth' class='next-month  icon-chevron-right'></span>";
        calendar.appendChild(titleBox);    // 添加到calendar div中
        // 设置表格区的html结构
        bodyBox.className = 'calendar-body-box';
        var _headHtml = "<tr>" +
            "<th>日</th>" +
            "<th>一</th>" +
            "<th>二</th>" +
            "<th>三</th>" +
            "<th>四</th>" +
            "<th>五</th>" +
            "<th>六</th>" +
            "</tr>";
        var _bodyHtml = "";

        // 一个月最多31天，所以一个月最多占6行表格
        for (var i = 0; i < 6; i++) {
            _bodyHtml += "<tr>" +
                "<td></td>" +
                "<td></td>" +
                "<td></td>" +
                "<td></td>" +
                "<td></td>" +
                "<td></td>" +
                "<td></td>" +
                "</tr>";
        }
        bodyBox.innerHTML = "<table id='calendarTable' class='calendar-table'>" +
            _headHtml + _bodyHtml +
            "</table>";
        // 添加到calendar div中
        calendar.appendChild(bodyBox);
    };
    /*
     * {key:time,value:{time:XXXX,text:XXXXX}}
     * */
    $this.dataMap = {};
    $this.setData = function (e) {
        if (!e.data) {
            return;
        }
        $this.dataMap = {};
        for (var i = 0; i < e.data.length; i++) {
            var key = $this.getDateStr(e.data[i].time);
            $this.dataMap[key] = data[i];
        }
        $this.showCalendarData();
        $this.bindEvent(e);
    };
    /**
     * 表格中显示数据，并设置类名
     */
    $this.showCalendarData = function () {
        var _year = $this.dateObj.getDate().getFullYear();
        var _month = $this.dateObj.getDate().getMonth() + 1;
        var _dateStr = $this.getDateStr($this.dateObj.getDate());

        // 设置顶部标题栏中的 年、月信息
        var calendarTitle = calendar.getElementsByClassName("calendar-title")[0];//  document.getElementById("calendarTitle");calendar-title
        var titleStr = _dateStr.substr(0, 4) + "年" + _dateStr.substr(4, 2) + "月";
        calendarTitle.innerText = titleStr;

        // 设置表格中的日期数据
        var _table = calendar.getElementsByClassName("calendar-table")[0];//document.getElementById("calendarTable");
        var _tds = _table.getElementsByTagName("td");
        var _firstDay = new Date(_year, _month - 1, 1);  // 当前月第一天
        for (var i = 0; i < _tds.length; i++) {
            var _thisDay = new Date(_year, _month - 1, i + 1 - _firstDay.getDay());
            var _thisDayStr = $this.getDateStr(_thisDay);
            _tds[i].innerHTML = "<div>" + _thisDay.getDate() + '</div><div>&nbsp;</div>';
            //_tds[i].data = _thisDayStr;
            if (parseInt(_thisDayStr) > parseInt($this.getDateStr(new Date()))) {
                var val = '&nbsp;';
                if ($this.dataMap[_thisDayStr]) {
                    val = $this.dataMap[_thisDayStr].text;
                }
                _tds[i].innerHTML = "<div>" + _thisDay.getDate() + '</div><div>' + val + '</div>';
            }
            _tds[i].setAttribute('data', _thisDayStr);

            if (_thisDayStr == $this.getDateStr(new Date())) {    // 当前天
                _tds[i].className = 'currentDay';
            } else if (_thisDayStr.substr(0, 6) == $this.getDateStr(_firstDay).substr(0, 6)) {
                _tds[i].className = 'currentMonth';  // 当前月
            } else {    // 其他月
                _tds[i].className = 'otherMonth';
            }
            if ($this.clickNode&&$this.clickNode.time&&_thisDayStr == $this.getDateStr($this.clickNode.time)) {    // 当前天
                _tds[i].className += ' calendar-item';//'currentDay';
            }
        }
    };

    function isCaMonth(returnData) {
        var oldDate = $this.dateObj.getDate();

        var olyear = oldDate.getFullYear();
        var olmonth = oldDate.getMonth() + 1;
        var cayear = returnData.time.getFullYear();
        var camonth = returnData.time.getMonth() + 1;
        if (olyear == cayear && camonth == olmonth) {
            return true;
        }
        return false;
    }

    /**
     * 绑定上个月下个月事件
     */
    $this.bindEvent = function (param) {
        var prevMonth = calendar.getElementsByClassName("prev-month")[0];//document.getElementById("prevMonth");
        var nextMonth = calendar.getElementsByClassName("next-month")[0];//document.getElementById("nextMonth");
        $this.addEvent(prevMonth, 'click', $this.toPrevMonth);
        $this.addEvent(nextMonth, 'click', $this.toNextMonth);
        var table = calendar.getElementsByClassName("calendar-table")[0];//document.getElementById("calendarTable");calendar-table
        var tds = table.getElementsByTagName('td');
        for (var i = 0; i < tds.length; i++) {
            $this.addEvent(tds[i], 'click', function (e) {
                var td = e.target.parentNode;
                var returnData=$this.dataMap[td.getAttribute('data')];
                if(!returnData){
                    return;
                }
                $this.clickNode=returnData;
                if(!isCaMonth(returnData)){
                    $this.toCaMonth(returnData);
                    return;
                }
                var item="calendar-item";
                $this.removeClassName(item);
                var _class=$this.getClassName(td,item);
                td.className=_class+" calendar-item";
                if (typeof  param.click == "function") {
                    param.click($this.dataMap[td.getAttribute('data')]);
                }
            });
        }
    };
    $this.removeClassName=function(remClsaa){
        var itemDom=calendar.getElementsByClassName(remClsaa);
        for(var i=0;i<itemDom.length;i++){
            var arry=new Array(itemDom[i].classList);
            arry[0].remove(remClsaa);
        }

    };
    $this.getClassName=function(dom,remClsaa){
        var arry=new Array(dom.classList);
        arry[0].remove(remClsaa);
        return arry.join(" ");
    };
    /**
     * 绑定事件
     */
    $this.addEvent = function (dom, eType, func) {
        if (dom.addEventListener) {  // DOM 2.0
            dom.addEventListener(eType, function (e) {
                func(e);
            });
        } else if (dom.attachEvent) {  // IE5+
            dom.attachEvent('on' + eType, function (e) {
                func(e);
            });
        } else {  // DOM 0
            dom['on' + eType] = function (e) {
                func(e);
            }
        }
    };

    /**
     * 点击到某个月图标触发
     */
    $this.toCaMonth = function (da) {
        var date = da.time;
        $this.dateObj.setDate(new Date(date.getFullYear(), date.getMonth(), 1));
        $this.showCalendarData();
    };
    /**
     * 点击上个月图标触发
     */
    $this.toPrevMonth = function () {
        var date = $this.dateObj.getDate();
        $this.dateObj.setDate(new Date(date.getFullYear(), date.getMonth() - 1, 1));
        $this.showCalendarData();
    };

    /**
     * 点击下个月图标触发
     */
    $this.toNextMonth = function () {
        var date = $this.dateObj.getDate();
        $this.dateObj.setDate(new Date(date.getFullYear(), date.getMonth() + 1, 1));
        $this.showCalendarData();
    };

    /**
     * 日期转化为字符串， 4位年+2位月+2位日
     */
    $this.getDateStr = function (date) {
        var _year = date.getFullYear();
        var _month = date.getMonth() + 1;    // 月从0开始计数
        var _d = date.getDate();

        _month = (_month > 9) ? ("" + _month) : ("0" + _month);
        _d = (_d > 9) ? ("" + _d) : ("0" + _d);
        return _year + _month + _d;
    };
    // 设置calendar div中的html部分
    $this.renderHtml(id);
    // 表格中显示日期

};