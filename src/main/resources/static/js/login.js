/**
 * Created by zhzbin on 2016/12/6.
 */
var showMessage= $("#showErrorMessage");
var showTips=$("#promptMessage");
$("#login").on("click",function (e) {
    var email=jbit.util.validator.email;
    var mobile=jbit.util.validator.mobile;
    var password=jbit.util.validator.account;
    var name=$("#username").val();
    var pd=$("#password").val();
    var lc=$("#loginCode").val();
    var flage=true;
    function showErrorMess(ms) {
        flage=false;
        showTips.html(ms);
        showMessage.show();
    }
    if(name==""||name==null){
        showErrorMess("用户名不能为空！");
        return;
    }if(pd==""||pd==null){
        showErrorMess("密码不能为空！");
        return;
    }

    if(!(email(name).code||mobile(name).code)){
        showErrorMess("请输入有效的手机号码或邮箱");
        return;

    }
    if(!password(pd).code){
        showErrorMess("请输入正确的密码");
        return;
    }
    var isLc=false;
    $("#selectShowType input[type=radio]").each(function (i, item) {
       if(this.checked){
           if(this.value==1){
               isLc=true;
           }
       }
    });
    if(isLc){
        if(lc==""||lc==null){
            showErrorMess("验证码不能为空！");
            return;
        }
        if(!password(lc).code){
            showErrorMess("请输入正确的验证码");
            return;
        }
    }

    if(flage){
        showMessage.hide();
        window.location="./index.html"
    }
})
$("#selectShowType input[type=radio]").on("change",function (e) {
    if(this.value==1){
        $("#actionPass").hide();
        $("#staticPass").show();
    }else{
        $("#actionPass").show();
        $("#staticPass").hide();
    }
});
$(".right-erweima").on("click",function (e) {
    var sef=$(this);
    if(sef.hasClass("dian-nao")){
        clearTimeout(window.phone);
        clearTimeout(window.richScan);
        $("#staticOption").show();
        $("#actionOption").hide();
        sef.removeClass("dian-nao");
        $(".phone-richScan").hide();

    }else{
        sef.addClass("dian-nao");
        $("#staticOption").hide();
        $("#actionOption").show();
        movePhone(0);
    }
});
function movePhone(ml) {
    if(!(ml==200)){
        window.phone=setTimeout(function (e) {
            movePhone(ml+1)
        },0.1)
    }else{
        $(".phone-richScan").show();
        moveRichScan(0)
    }
    $(".phone-erweima").css("left",-ml)
}function moveRichScan(ml) {
    if(!(ml==131)){
        window.richScan=setTimeout(function (e) {
            moveRichScan(ml+1)
        },1)
    }
    $(".phone-richScan").css("left",-ml)
}