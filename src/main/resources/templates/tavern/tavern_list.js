/**
 * Created by zhzbin on 2016/11/24.
 */
var tavernList = {
    init: function (e) {
        var sef = this;
        sef.tavernMessage = '../hotelDetail.html';
        var test = new Vcity.CitySelector({
            input: 'tavernCitySelect1'
        });
        sef.bindEvent();
    }, bindEvent: function (e) {
        var sef = this;
        $(".tavern-model-grid").on("click", function (e) {
            if (!$(this).hasClass("tavern-gray")) {
                window.location = sef.tavernMessage;
            }
        });

    }, refresh: function (e) {
        alert("刷新函数是否正常使用？")
    }
};
