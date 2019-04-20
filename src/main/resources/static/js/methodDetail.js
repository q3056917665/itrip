'use strict';
// 首页轮播图
var num = 0;
var timer = null;
var i_circle = $( '.banner .lb li' );
var i_banner = $( '.banner_list li' );
// 自动轮播
function autoPlay(){
	timer = setInterval( function(){
		num++;
		if(num == i_circle.length+1){
			num=0;
		}
		i_circle.eq(num).addClass( 'cur' ).siblings().removeClass('cur');
		i_banner.eq(num).fadeIn(600).siblings().fadeOut();
	},3000 );
}
//调用自动轮播
autoPlay();
// 经过小圆点切换
i_circle.hover( function(){
	clearInterval(timer);
	$( this ).addClass( 'cur' ).siblings().removeClass('cur');
	num = $( this ).index();
	i_banner.eq(num).fadeIn(600).siblings().fadeOut();
},function(){
	autoPlay();
	});
// 鼠标经过banner图事件
i_banner.hover(function(){
	clearInterval(timer);	
},function(){
	autoPlay();
	});

/*折线图开始*/
var line = echarts.init(document.getElementById('flodline'));
line.setOption({
    title: {
        x: 'center',
        text: '成都最近1~2月各旅游景点人数',
        textStyle: {
            fontSize: '18',
            color: '#4c4c4c',
            fontWeight: 'bolder'
        }
    },
    tooltip: {
        trigger: 'axis'
    },
    toolbox: {
        show: true,
        feature: {
            dataZoom: {
                yAxisIndex: 'none'
            },
            dataView: {readOnly: false},
            magicType: {type: ['line', 'bar']}
        }
    },
    xAxis:  {
        type: 'category',
        boundaryGap: false,
        data: ['03-01','03-10','03-20','03-30','04-01','04-10','04-20','04-30','05-01','05-10','05-20','05-30'],
        axisLabel: {
            interval:0
        }
    },
    yAxis: {
        type: 'value'
    },
    series: [
        {
            name:'杜甫草堂',
            type:'line',
            data:[723, 642, 618, 745, 648, 649,700, 745, 618, 765, 779,600],
            itemStyle : {  
                        normal : {  
                            lineStyle:{  
                                color:'#6be6c1'  
                            }  
                        }  
                    },
            markLine: {data: [{type: 'average', name: '平均值'}]}
        },
        {
            name:'都江堰',
            type:'line',
            data:[443, 352, 418, 345, 448, 349,300, 352, 418, 445, 348, 449,300],
            itemStyle : {  
                        normal : {  
                            lineStyle:{  
                                color:'#626c91'  
                            }  
                        }  
                    },
            markLine: {data: [{type: 'average', name: '平均值'}]}
        }
        ,
        {
            name:'黄龙溪古镇 ',
            type:'line',
            data:[143, 452, 718, 885, 848, 890, 900, 972, 998, 825, 888, 949,800],
            itemStyle : {  
                        normal : {  
                            lineStyle:{  
                                color:'#3fb1e3'  
                            }  
                        }  
                    },
            markLine: {data: [{type: 'average', name: '平均值'}]}
        }
    ]
}) ;


/*电梯*/
var h1 = $( '.guide' ).offset().top;
var h2 = $( '.statis' ).offset().top;
var h3 = $( '.tra-note' ).offset().top;
var h4 = $( '.plan-note' ).offset().top;
var iWH = 10;

function change( numy ){
	$('.i-floor ul li').eq(numy).addClass('act').siblings().removeClass('act');
};

function userscroll(){
	var iScroll = $( document ).scrollTop();

	if( iScroll+30 >= h4 ){
		change(3);
	}else if( iScroll+30 >= h3 ){
		change(2);
	}else if( iScroll+30 >= h2 ){
		change(1);
	}else if( iScroll+10 >= h1 ){
		$( '.i-floor' ).fadeIn();
		change(0);
	}else{
		$( '.i-floor' ).fadeOut();
	}
}

$( document ).scroll( userscroll);

var arrTop = [ h1,h2,h3,h4 ]

$( '.i-floor ul li' ).click( function(){
	var numy = $( this ).index();
	 change( numy );

	$( document ).off();
	$( 'html,body' ).stop().animate( { 'scrollTop':arrTop[numy] },500,function(){
		$( document ).scroll( userscroll);
	} );
} );


