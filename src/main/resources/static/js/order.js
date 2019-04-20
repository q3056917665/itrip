'use strict';

//箭头封装	父级-孩子-添加类-删除类
function arrow(obj,clscld,clsone,clstwo) {
	obj.find(clscld).removeClass(clsone).addClass(clstwo);
}

/*按钮点击*/
$(".order-nav li").click(function(event) {

	if ($(this).find('.order-nav-wrapper').is(":hidden")){
			arrow($(this),'span','icon-angle-right','icon-angle-up');
			$(this).find('.order-nav-wrapper').slideDown();
	}else {
			arrow($(this),'span','icon-angle-up','icon-angle-right');
			$(this).find('.order-nav-wrapper').slideUp();;
	}
	
});



// tab 
// 
$(".order-tab a").click(function(event) {
	var index = $(this).index();
	$(this).addClass('current').siblings().removeClass('current');
	$(".order-list").eq(index).show().siblings().hide();
});
