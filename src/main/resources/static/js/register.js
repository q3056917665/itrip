$(function () {
    huanCode();
    $('.i-reg-top label').click(function (event) {
        event.stopPropagation();
        var index = $(this).index();
        $('.i-reg-bottom').eq(index).addClass('cur').siblings().removeClass('cur');
    });
})

function addUserByPhone() {
    var UUIDCode1 = $(".UUIDCode1").val(); //邮箱激活码
    var yzm1=$(".yzm1").val(); //验证码
    var yzm3 = $(".i_check_in").html();
    var uuid1=$(".uuid1").html();
    if(UUIDCode1==""||yzm1==""){
        alert("激活码或验证码不能为null!");
    }else {
        var UUIDCode = $(".UUIDCode1").val();
        if (UUIDCode==uuid1&&yzm1==yzm3) {
            $.ajax({
                cache: false,
                type: 'POST',
                url: "registerByPhone",
                data: $('.fromOne').serialize(),
                error: function () {
                    alert("与服务断开连接!")
                },
                success: function (bool) {
                    if (bool == "1") {
                        alert("用户注册成功!");
                        window.location.href = 'loginHtml';
                    } else if ((bool == "0")) {
                        alert("用户注册失败!");
                        window.location.href = 'registerHtml';
                    }else if(bool=="00"){
                        alert("手机号或者密码必须填写!");
                        window.location.href = 'registerHtml';
                    }
                }
            })
        } else {
            var i = confirm("激活码或验证码错误，请重新注册!");
            if (i == true) {
                window.location.href = 'registerHtml';
            } else {
                window.location.href = 'registerHtml';
                return;
            }
        }
    }
}

function addUserByEmail() {
    var UUIDCode = $(".UUIDCode2").val(); //邮箱激活码
    var yzm2=$(".yzm2").val(); //验证码
    var yzm3 = $(".i_check_in").html();
    var uuid = $(".uuid2").html();

    if(UUIDCode==""||yzm2==""){
        alert("激活码或验证码不能为null!");
    }else{
        if (UUIDCode == uuid&&yzm2==yzm3) { //激活码正确判断
            $.ajax({
                cache: false,
                type: 'POST',
                url: "registerByEmail",
                data: $('.fromTwo').serialize(),
                error: function () {
                    alert("与服务断开连接!")
                },
                success: function (bool) {
                    if (bool == "1") {
                        alert("用户注册成功!");
                        window.location.href = 'loginHtml';
                    } else if ((bool == "0")) {
                        alert("用户注册失败!");
                        window.location.href = 'registerHtml';
                    }else if(bool=="00"){
                        alert("邮箱号或者密码必须填写!");
                        window.location.href = 'registerHtml';
                    }
                }
            })
        } else {
            var i = confirm("激活码或验证码错误，请重新注册!");
            if (i == true) {
                window.location.href = 'registerHtml';
            } else {
                window.location.href = 'registerHtml';
                return;
            }
        }
    }
}

function uPwd(i) {
    if (i == 1) {
        var userPwd1 = $(".linkidcard1").val();
        if (userPwd1 == '') {
            $(".userPwd1").html("密码不能为空");
            $(".userPwd1").css({"color": "red", "font-size": "15px"})
            return false;
        } else {
            $(".userPwd1").html("<i class='fa fa-check fa-2x' style='color:green'>");
            return true;
        }
    } else if (i == 2) {
        var userPwd2 = $(".linkidcard2").val();
        if (userPwd2 == '') {
            $(".userPwd2").html("密码不能为空");
            $(".userPwd2").css({"color": "red", "font-size": "15px"});
            return false;
        } else {
            $(".userPwd2").html("<i class='fa fa-check fa-2x' style='color:green'>");
            return true;
        }
    }
}

// 验证码
function idCode() {
    var arr = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'];
    var str = '';
    for (var i = 0; i < 4; i++)
        str += '' + arr[Math.floor(Math.random() * arr.length)];
    return str;
}

$('.i_check_in').html(idCode());

function huanCode() {
    $('.i_check_in').html(idCode());
}

function uEmail() {
    var email = /^[a-zA-Z0-9_-]+@([a-zA-Z0-9]+\.)+(com|cn|net|org)$/;
    var userEmail = $(".usercode").val();
    if (userEmail == "") {
        $(".userEmail").html("邮箱不能为空");
        $(".userEmail").css({"color": "red", "font-size": "15px"});
        return false;
    } else if (!email.test(userEmail)) {
        $(".userEmail").html("邮箱格式不正确");
        $(".userEmail").css({"color": "red", "font-size": "15px"});
        return false;
    } else {
        $.ajax({
            cache: false,
            type: 'POST',
            url: 'AddFormByAjax?usercode=' + userEmail,
            error: function () {
                alert("与服务断开连接");
            },
            success: function (number) {
                if (number == true) {
                    $(".userEmail").html("此邮箱已被注册，请重新输入");
                    $(".userEmail").css({"color": "red", "font-size": "15px"});
                    return false;
                } else if (number == false) {
                    $(".userEmail").html("<i class='fa fa-check fa-2x' style='color:green'>");
                    return true;
                }
            }
        });
    }
}

function uPhone() {
    var userPhone = $(".phone").val();
    var phone = /^[1][3,4,5,7,8][0-9]{9}$/;
    if (userPhone == "") {
        $(".userPhone").html("手机号不能为空");
        $(".userPhone").css({"color": "red", "font-size": "15px"});
        return false;
    } else if (!phone.test(userPhone)) {
        $(".userPhone").html("手机号格式不正确");
        $(".userPhone").css({"color": "red", "font-size": "15px"});
        return false;
    } else {
        $.ajax({
            cache: false,
            type: 'POST',
            url: 'AddFormByAjax?usercode=' + userPhone,
            error: function () {
                alert("与服务断开连接");
            },
            success: function (number) {
                if (number == true) {
                    $(".userPhone").html("此手机号已被注册，请重新输入");
                    $(".userPhone").css({"color": "red", "font-size": "15px"});
                    return false;
                } else if (number == false) {
                    $(".userPhone").html("<i class='fa fa-check fa-2x' style='color:green'>");
                    return true;
                }
            }
        })
    }
}

/***
 * 验证码判断
 * @param i
 */
function yzm(i) {
    if (i == 1) {
        var yzm1 = $(".yzm1").val();
        if (yzm1 == "") {
            alert("验证码不能为空!");
        }
    } else if (i == 2) {
        var yzm2 = $(".yzm2").val();
        if (yzm2 == "") {
            alert("验证码不能为空!");
        }
    }
}

function getEmailUUID() {
    var uemail = $(".usercode").val();
    if (uemail != '') {
        alert("正在发送激活邮件，请稍等...");
        $.ajax({
            cache: false,
            type: 'POST',
            url: 'getEmailUUID?usercode=' + uemail,
            error: function () {
                alert("与服务断开连接!");
            },
            success: function (str) {
                if (str == null) {
                    alert("激活邮件发送失败!")
                } else {
                    alert("激活邮件已发送!")
                    $(".uuid2").html(str);
                    $(".uuid2").css("display", "none");
                }
            }
        })
    } else {
        alert("请先输入邮箱!");
    }
}

function getPhoneUUIDFake() {
    var getPhone = $(".phone").val();
    if(getPhone !=''){
        alert("正在发送手机短信!请注意查收!");
        $.ajax({
            cache:false,
            type:'POST',
            url:'getPhoneUUID?usercode='+getPhone,
            error:function () {
                alert("与服务器断开连接");
            },
            success:function (str) {
             if(str!=""){
                 alert("激活码发送成功");
                 $(".uuid1").html(str);
                 $(".uuid1").css("display", "none");
             }else{
                 alert("激活码发送失败");
             }
            }
        })
    }else{
        alert("请先输入手机号");
    }
}