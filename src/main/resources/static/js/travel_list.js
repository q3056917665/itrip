/**
 * Created by zhzbin on 2016/11/24.
 */
var travelList = {
    init: function (e) {
        var sef = this;
        sef.travelList = './travel_list.html';
        sef.travelMessage = './travel_message.html';
        $(function () {
            var test = new Vcity.CitySelector({
                input: 'travelCitySelect1'
            });
            var test = new Vcity.CitySelector({
                input: 'travelCitySelect2'
            });
            var test = new Vcity.CitySelector({
                input: 'travelCitySelect3'
            });

        });
        sef.bindEvent();

    },
    bindEvent: function (e) {
        var sef = this;
        $(".travel-model-grid").bind("click", function (e) {
            window.location = sef.travelMessage;
        });
        $(".search-one-param button").on("click", function (e) {
            var hideCheckId = this.getAttribute("data-show-id");
            var thPraent = $(this).closest(".search-one-param");
            if (!thPraent.hasClass("hide") && hideCheckId) {
                thPraent.addClass("hide");
                $("#" + hideCheckId).removeClass("hide").fadeIn();
            }
        })
        $(".search-param-cancel span").on("click", function (e) {
            var showCheckId = this.getAttribute("data-show-id");
            var thPraent = $(this).closest(".search-one-param");
            if (!thPraent.hasClass("hide") && showCheckId) {
                thPraent.addClass("hide");
                $("#" + showCheckId).removeClass("hide").fadeIn();
            }
        })
        $(".search-already .icon-remove").on("click", function (e) {
            $(this).closest("button").remove();
        });
        $("#check_localtion-hide input").on("click", function (e) {
            $("#travel_localtion").remove();
            var val="";
            $("#check_localtion-hide .checkbox-inline input").each(function(i,item){
                if(this.checked){
                    if(val){
                        val+="、"+this.value
                    }else{
                        val=this.value;
                    }
                }
            });
            $(".search-already").append('<button id="travel_localtion" class="btn"><span>游玩线路:' + val +
                '</span><i class="icon-remove"></i></button>')
            $("#travel_localtion .icon-remove").on("click", function (e) {
                $(this).closest("button").remove();
                $("#check_localtion-hide .checkbox-inline input").each(function(i,item){
                    this.checked =false;
                });
            });

        });


    },
    refresh: function (e) {
        alert("刷新函数是否正常使用？")
    }
};
