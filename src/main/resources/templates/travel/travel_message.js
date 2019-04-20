/**
 * Created by zhzbin on 2016/11/24.
 */
var travel = {
    init: function (e) {
        var sef = this;

        var $mlNav = $('.ml-nav');
        $('#dowebok').fullpage({
            verticalCentered: !1,
            navigation: !0,
            onLeave: function (index, nextIndex, direction) {
                if (index == 2 && direction == 'up') {
                    $mlNav.animate({
                        top: 119
                    }, 680);
                } else if (index == 1 && direction == 'down') {
                    $mlNav.animate({
                        top: 0
                    }, 400);
                } else if (index == 3 && direction == 'up') {
                    $mlNav.animate({
                        top: 0
                    }, 500);
                } else {
                    $mlNav.animate({
                        top: -66
                    }, 400);
                }
                $("#fp-nav ul li a span, .fp-slidesNav ul li a span").css("background", "#fff");
                if ((index == 5 && direction == 'down') || index == 6 || index == 7) {
                    $("#fp-nav ul li a span, .fp-slidesNav ul li a span").css("background", "#000")
                } else if (index == 4 && direction == 'down') {
                    $("#fp-nav ul li a span, .fp-slidesNav ul li a span").css("background", "#000")
                }
            }
        });
        sef.banner = function (e) {
            var num = 0;
            var timer = null;
            var i_circle = $(e + ' .lb li');
            var i_banner = $(e + ' .banner_list li');

            function autoPlay() {
                timer = setInterval(function () {
                    num++;
                    if (num == i_circle.length + 1) {
                        num = 0;
                    }
                    i_circle.eq(num).addClass('cur').siblings().removeClass('cur');
                    i_banner.eq(num).fadeIn(600).siblings().fadeOut();
                }, 3000);
            }

            i_circle.hover(function () {
                clearInterval(timer);
                $(this).addClass('cur').siblings().removeClass('cur');
                num = $(this).index();
                i_banner.eq(num).fadeIn(600).siblings().fadeOut();
            }, function () {
                autoPlay();
            });
// 鼠标经过banner图事件
            i_banner.hover(function () {
                clearInterval(timer);
            }, function () {
                autoPlay();
            });
        }
        sef.bindEvent();
    },
    bindEvent: function (e) {

        var myPlayer = videojs('videoMessage');
        $(".vjs-fullscreen-control").hide();
        $(".icon-play-circle").on("click",function(e){
            $(".travel-model").show();
            $("#videoMessage video").attr("src", "../images/video/travel/video1.mp4");
            myPlayer.play();
        });
        $(".vjs-play-control").on("click",function(e){
            if(!$(this).hasClass("vjs-playing")){
                var whereYouAt = myPlayer.currentTime();
                if(whereYouAt==77.312){
                    $("#videoMessage video").attr("src", "../images/video/travel/video1.mp4");
                    var myPlayer = videojs('videoMessage');
                    myPlayer.play();
                }
                e.stopPropagation()
            }
            e.stopPropagation()
            // $(".travel-model").show();
            // $("#videoMessage video").attr("src", "../images/video/travel/video1.mp4");
            // myPlayer.play();
        });
        $(".model-remove").on("click",function(e){
            $(".travel-model").hide();
            myPlayer.pause();
        });

    }, refresh: function (e) {
        alert("刷新函数是否正常使用？")
    }
};