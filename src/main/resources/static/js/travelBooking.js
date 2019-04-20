/*
* @Author: xianghai.peng
* @Date:   2016-12-09 09:48:34
* @Last Modified by:   xianghai.peng
* @Last Modified time: 2016-12-15 16:20:57
*/

'use strict';

/*我们需要一个全局的变量，来控制图片的播放张数*/ 
var $key=0; 
/*右侧按钮开始*/
$(".right").click(function(event) {
 autoplay();  /*调用函数*/
});
/*左侧按钮 */

$(".left").click(function(event) {
$(".box ul li").eq($key).fadeOut(600);  /*第一张图片 淡出 */
$key--;  
$key=$key%$(".box ul li").length;  /*比较好的写法  利用取余的出来的*/
$(".box ul li").eq($key).fadeIn(600);   /*而张图片 淡出 */
$(".box ol li").eq($key).addClass('current').siblings().removeClass('current');

});

/*定时器开始*/

var timer=setInterval(autoplay, 2000);  /*开启定时器*/
function autoplay(){
   	$(".box ul li").eq($key).fadeOut(600);  /*第一张图片 淡出 */
	$key++;  
	$key=$key%$(".box ul li").length;  
	$(".box ul li").eq($key).fadeIn(600);   
    $(".box ol li").eq($key).addClass('current').siblings().removeClass('current');
}
/*当鼠标经过这个大盒子的时候，要关闭定时器*/

$(".box").hover(function() {
  $(".left,.right").show();
  clearInterval(timer);
  timer=null;   /*节省内存*/
}, function() {
 $(".left,.right").hide();
 /*一般开启定时器之前，首先先清除定时器*/
 clearInterval(timer);  
 timer=setInterval(autoplay, 2000);  
});

$(".box ol li").mouseenter(function(event) {
	$(".box ul li").eq($key).fadeOut(600);  
	$key=$(this).index();$(this).addClass('current').siblings().removeClass("current");
	$(".box ul li").eq($key).fadeIn(600); /*显示出你点击的那个*/

});


//箭头封装	父级-孩子-添加类-删除类
function arrow(obj,clscld,clsone,clstwo) {
	obj.children(clscld).removeClass(clsone).addClass(clstwo);
}

//模拟下拉框
$(".select_box").click(function(event){   
    event.stopPropagation();
    $(this).find(".option").toggle();
	 $(this).parent().siblings().find(".option").hide();
    // 箭头
    if ($(this).find('.option').is(":visible")) {
    	arrow($(this),'.arr','icon-angle-down','icon-angle-up');
    }else{
    	 arrow($(this),'.arr','icon-angle-up','icon-angle-down');
    }
});
$(document).click(function(event){
    var eo=$(event.target);
    if($(".select_box").is(":visible") && eo.attr("class")!="option" && !eo.parent(".option").length)
    $('.option').hide();
    if ($('.option').is(":hidden")) {
    	$(".arr").removeClass('icon-angle-up').addClass('icon-angle-down');
    }                                      
});
/*赋值给文本框*/
$(".option a").click(function(){
    var value=$(this).text();
    $(this).parent().siblings(".select_txt").text(value);
    $("#select_value").val(value)
 })

/*banner 右侧*/

/*鼠标经过显示隐藏函数*/
function blockcur ( clsP , clsC , clsCur) {
		$(clsP).hover(function() {
		$(this).children(clsC).addClass(clsCur);
	}, function() {
		$(this).children(clsC).removeClass(clsCur);
	});
}

blockcur ( ".price-sale" , '.price-sale-detail' , 'detail-block');
blockcur ( ".child_height" , 'i' , 'childcur');




$(".special_info dd").click(function(event) {
	$(this).addClass('ddcur').siblings().removeClass('ddcur')
});


// 出发
$( ".start_pos" ).focus(function(event) {
	$(this).siblings('i').removeClass('icon-angle-down').addClass('icon-angle-up')
});
$( ".start_pos" ).blur(function(event) {
	$(this).siblings('i').removeClass('icon-angle-up').addClass('icon-angle-down')
});






//费用

$( '.i_title a' ).click(function(event) {
	$(this).addClass('i_current').siblings().removeClass('i_current');
});

//吸顶条


 $(window).scroll(function(){
 		var sideHeight = $(".i_title").offset().top;
		var scrollHeight = $(window).scrollTop();
		      if (scrollHeight > sideHeight) {
		    	$('.fixTop').addClass('fixTop-cur');
		    }else {
		    	$('.fixTop').removeClass('fixTop-cur');
		    }

	});
	window.onload = function(){
		$(window).trigger('scroll');
	}
	$(window).resize(function() {
		$(window).trigger('scroll');
	});



/*日历*/

var calender = new $Calendar("calendar");
    var data = function (e) {
        var data = [];
        var date = new Date();
        for (var i = 0; i < 30; i++) {
            var time = new Date(date.getFullYear(), date.getMonth(), date.getDate() + i + 1);
            if (Math.random() > 0.5) {
                data.push({
                    time: time,
                    text: "￥5999起"
                })
            }
        }
        return data;
    }();
    calender.setData({
        data: data,
        click: function (e) {

             console.debug(e);
             $(".all_resource").slideToggle();
        }
    });