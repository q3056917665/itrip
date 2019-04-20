/*
* @Author: xianghai.peng
* @Date:   2016-12-13 15:19:05
* @Last Modified by:   xianghai.peng
* @Last Modified time: 2016-12-15 13:12:26
*/

'use strict';
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

//吸顶条切换
//
$(".fixTop a").click(function(event) {
	$(this).addClass('i_current').siblings().removeClass('i_current');
});

$(".score_list li ").click(function(event) {
	$(this).addClass('list_cur').siblings().removeClass('list_cur');
	var scoreKey = $( this ).index();
	$(".all_data").eq(scoreKey).addClass('all_data_cur').siblings().removeClass('all_data_cur');
});
$(function () {
	$("#videoMessage").css("width", $(".travel-model").width() * 0.5);
	$("#videoMessage").css("height", $(".travel-model").height() * 0.60 - 40);


	var myPlayer = videojs('videoMessage');
	$(".vjs-fullscreen-control").hide();
	$(".icon-play-circle").on("click", function (e) {
		$(".travel-model").show();
		$("#videoMessage video").attr("src", "images/video/travel/video1.mp4");
		myPlayer.play();
	});
	$(".model-remove").on("click", function (e) {
		$(".travel-model").hide();
		myPlayer.pause();
	});

//模拟下拉框
//
	//箭头封装	父级-孩子-添加类-删除类
function arrow(obj,clscld,clsone,clstwo) {
	obj.children(clscld).removeClass(clsone).addClass(clstwo);
}


	$(".select_box").click(function (event) {
		event.stopPropagation();
		$(this).find(".option").toggle();
		$(this).parent().siblings().find(".option").hide();
		// 箭头
		if ($(this).find('.option').is(":visible")) {
			arrow($(this), '.arr', 'icon-angle-down', 'icon-angle-up');
		} else {
			arrow($(this), '.arr', 'icon-angle-up', 'icon-angle-down');
		}
	});
	$(document).click(function (event) {
		var eo = $(event.target);
		if ($(".select_box").is(":visible") && eo.attr("class") != "option" && !eo.parent(".option").length)
			$('.option').hide();
		if ($('.option').is(":hidden")) {
			$(".arr").removeClass('icon-angle-up').addClass('icon-angle-down');
		}
	});
	/*赋值给文本框*/
	$(".option a").click(function () {
		var value = $(this).text();
		$(this).parent().siblings(".select_txt").text(value);
		$("#select_value").val(value)
	})
	$(".room_img_ms a").on("click",function (e) {
		$(".rom-show-image").hide();
		$(this).closest(".room_img_ms").next().show();
	});
	$(".rom-show-image .model-remove").on("click",function (e) {
		$(this).closest(".rom-show-image").hide();
	});
	$(".rom-show-image .small-img img").on("click",function (e) {
		var src=this.src;
		var bigImg=$(".big-img",$(this).closest(".rom-show-image"));
		bigImg.attr("src",src);
	});
	$(".btn-serach-div").on("click",function (e) {
		if($(this).hasClass("act")){
			$(this).removeClass("act");
		}else{
			$(this).addClass("act");
		}
	});
	$(".room_detail_fold a").on("click",function (e) {
		var id=$(this)[0].getAttribute("data-id");
		var status=$(this)[0].getAttribute("data-status");
		var hideSize=$(this)[0].getAttribute("data-hideData");
		var oldSize=$("#"+id)[0].getAttribute("rowSpan");
		var end = $(this).closest("tr").index();
		var start =  $("#"+id).closest("tr").index();
		if(status==0){
			$("#"+id).attr("rowspan",parseInt(oldSize)+parseInt(hideSize));
			$(this).html("收起 <i class='  icon-chevron-up'></i>");
		}else{
			$("#"+id).attr("rowspan",parseInt(oldSize)-parseInt(hideSize));
			$(this).html("展开全部房型 <i class=' icon-chevron-down'></i>")
		}
		for (var i=start;i<end ;i++) {
			if ($($("tr", $(this).closest("tbody"))[i]).hasClass("hidden") && status==0) {
				$($("tr", $(this).closest("tbody"))[i]).addClass("show").removeClass("hidden").fadeIn();
				$(this).attr("data-status",1);
			} else if ($($("tr", $(this).closest("tbody"))[i]).hasClass("show") && status==1 ) {
				$($("tr", $(this).closest("tbody"))[i]).addClass("hidden").removeClass("show").slideDown();
				$(this).attr("data-status",0);
			}
		}

	})

});


