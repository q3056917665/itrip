'use strict';
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



// 互换值
$( ".ico_change").click(function() {
	var cityone = $(".cityone").val();
	var citytwo = $(".citytwo").val();
    var tem ;
    tem = cityone;
    cityone = citytwo;
    citytwo = tem;
    $(".cityone").val(cityone);
    $(".citytwo").val(citytwo);
});


// 筛选
$(".flight-left > ul > li").hover(function() {
	arrow($(this),'.arr-in','icon-angle-right','icon-angle-left');
	$(this).children('.flight-left-in').show();
	$(this).find('.flight-left-infirst').addClass('bdlnone');
	$(this).addClass('bdnone');
}, function() {
	arrow($(this),'.arr-in','icon-angle-left','icon-angle-right');
	$(this).children('.flight-left-in').hide();
	$(this).find('.flight-left-infirst').removeClass('bdlnone');
	$(this).removeClass('bdnone');
});


// 日历导航
$( '.i_calendar_tab_list ul a' ).click(function(){
		$(this).parent().addClass('i_act_wf').siblings().removeClass('i_act_wf');
	});
	var num =0;
	// 向上取整函数
	var Length = Math.ceil($('.i_calendar_tab_list ul li').length/8);
	$( '.i_prevDate a' ).click( function(){
		num++;
		if(num==Length){num=Length-1}
		$( '.i_calendar_tab_list ul' ).animate( {'left':-num*860} );
	} );

	$( '.i_next_date a' ).click( function(){
		num--;
		if(num==-1){num=0}
		$( '.i_calendar_tab_list ul' ).animate( {'left':-num*860} );
	} );



/*按钮点击*/
$(".sort-btnsubmit").click(function(event) {

	if ($(this).parent().siblings(".sort-list-detail-in").is(":hidden")){
			$(this).addClass('btncur').children('span').text("收起");
			arrow($(this),'i','icon-angle-down','icon-angle-up');
			//$(".sort-list-detail-in").toggle();
			$(this).parent().siblings(".sort-list-detail-in").slideDown();
	}else {
			$(this).removeClass('btncur').children('span').text("订票");
			arrow($(this),'i','icon-angle-up','icon-angle-down');
			//$(".sort-list-detail-in").toggle();
			$(this).parent().siblings(".sort-list-detail-in").slideUp();;
	}
	
});

// 吸顶效果
 var sideHeight = $('.reSearchForm').offset().top;
$(window).scroll(function(){
		var scrollHeight = $(window).scrollTop();//窗口的滚动高度
		      if (scrollHeight > sideHeight) {
		    	$('.formpos').addClass('linktop');


		    }else {
		    	$('.formpos').removeClass('linktop');
		    }

	});
	window.onload = function(){
		$(window).trigger('scroll');
	}
	$(window).resize(function() {
		$(window).trigger('scroll');
	});



// 分页
$( '.i_num' ).click(function(){
		$( this ).addClass('i_current').siblings().removeClass('i_current')
	});




/* CitySelector 初始化*/
var test_one=new Vcity.CitySelector({input:'citySelect_one'});
var test_two=new Vcity.CitySelector({input:'citySelect_two'});
var test_three=new Vcity.CitySelector({input:'citySelect_three'});
var test_four=new Vcity.CitySelector({input:'citySelect_four'});

