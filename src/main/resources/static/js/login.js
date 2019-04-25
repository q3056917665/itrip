$(function () {
    $("#selectShowType input[type=radio]").on("change",function (e) {
        if(this.value==1){
            $("#actionPass").hide();
            $("#staticPass").show();
        }else{
            $("#actionPass").show();
            $("#staticPass").hide();
        }
    });
});
