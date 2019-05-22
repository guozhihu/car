var chkName;
var chkPhone;
var chkYzm;
var chkPsw;


$(document).ready(function init() {
	// body...
	chkName = document.getElementById('xname');
	chkPhone = document.getElementById('xmobile');
	/*var ltl = document.getElementById('logintype');*/
	chkYzm = document.getElementById('validateCode');
	chkPsw = document.getElementById('xpassword1');
	
	/*alert(chkName);
	alert(chkPhone);
	alert(chkYzm);
	alert(chkPsw);*/

})

/*function normalLogin() {
	// body...
	stl.className = 'cur';
	msl.className = '';
	yzm.style.display = 'none';
	psw.style.display = 'list-item';
}

function mobileLogin() {
	// body...
	stl.className = '';
	msl.className = 'cur';
	yzm.style.display = 'list-item';
	psw.style.display = 'none';
}*/

function regSubmit(){
    //alert("1");


     //js对象
    var regInfo = {
        "userName"         :$("input[name='xnameid']").val(),
        "userPassword"     :$("input[id='xpassword1']").val(),
        "realName"      :$("input[name='xname']").val(),
        "credentialsId"      :$("input[name='IDcard']").val(),
        "phoneNumber"      :$("input[name='xmobile']").val(),
    };
    alert(regInfo.userName);
    $.ajax({
        url:"http://134.175.13.213:8123/user/register",
        type:"POST",
        dataType:'json',
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(regInfo),

        success:function(yy){
            if (yy.code = 000000) {
                alert(yy.code);
                alert(yy.message);
                //alert(yy);
                //alert("登录成功");
                //window.location.href = "C:/Users/浩/Desktop/GYMindex/index2/index.html";
            }else if(yy.code = 001002){
                alert(yy.code);
                alert(yy.message);
                //alert(JSON.stringify(yy.data));
                //alert("登录成功");
                //sessionStorage.setItem("loginData", JSON.stringify(yy.data));
                //window.location.href = "file:\\C:\\Users\\浩\\Desktop\\GYMindex\\index2\\index.html";
                //window.location = "../index2/index.html"
            }
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            //alert("用户名或密码错误");
            //alert(JSON.stringify(regInfo));
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });

}


function IsNull(){
    /*var cname = document.getElementById('userName');
    var sname = document.getElementById('CheckName');*/
    /*判断中文正则表达式*/
    var chkDiv = document.getElementById('namecheck_tips');
    var errName = document.getElementById('errName');
    var regname=/^[\u0391-\uFFE5]+$/;

    if(chkName.value.length==0){

        chkDiv.style.display = 'block';
        //alert(chkDiv);
        errName.innerHTML = "对不起，姓名不能为空!";//请将“文本框”改成你需要验证的属性名称!
        //alert(errName);
        //alert(chkPsw);
    }
    else if(!chkName.value.match(regname)){
        chkDiv.style.display = 'block';
        //alert(chkDiv+"2");
        errName.innerHTML = "对不起，输入非中文!";
        //alert(errName+"2");

       /* if(!cname.value.match(regname)){
            sname.className="chkRed";
            sname.innerHTML="对不起，输入非中文!";
        }*/
        /*else{*/
        
        /*}*/
    }
    else{
        chkDiv.style.display = 'none';
    }
}

function ChkPwd(){
    var chkDiv2 = document.getElementById('passwordcheck_tips');
    var errPsw2 = document.getElementById('errPsw');
    //alert(chkDiv);
    /*var cpwd = document.getElementById('userPassword');
    var tpwd = document.getElementById('CheckPwd');*/
    var regpwd=/^[a-zA-Z0-9\~\!\@\#\$\%\^\&\*\_\+\{\}\:\"\|\<\>\?\-\=\;\'\\\,\.\/]{6,15}$/;

    if(chkPsw.value.length==0){

        chkDiv2.style.display = 'block';
        errPsw2.innerHTML="对不起，密码不能为空!";//请将“文本框”改成你需要验证的属性名称!
        //alert(errPsw.innerHTML);
    }
    else if(!chkPsw.value.match(regpwd)){

            chkDiv2.style.display = 'block';
            errPsw2.innerHTML = "对不起，密码格式不符合";
            alert(errPsw2.innerHTML);
    }
    else{
            chkDiv2.style.display = 'none';
    }
    //alert(chkPsw.value);

    
}


/*function ChkRepwd(){
    var fpwd = document.getElementById('userPassword');
    var spwd = document.getElementById('secondPassword');
    var trpwd = document.getElementById('CheckRpwd')

    if(fpwd.value!=spwd.value){
        trpwd.className="chkRed";
        trpwd.innerHTML="两次密码输入不一致!";
    }
    else{
        trpwd.innerHTML="";
    }
    // On load
}*/

function ChkPhone(){
    var chkDiv3 = document.getElementById('mobilecheck_tips');
    var errPhone = document.getElementById('errPhone');
    var regphe = /^1[3|4|5|7|8][0-9]{9}$/;

    if (chkPhone.value.length==0){
        chkDiv3.style.display = 'block';
        errPhone.innerHTML="对不起，手机号不能为空!";
    }

    else if (!chkPhone.value.match(regphe)){
         
        chkDiv3.style.display = 'block';
        errPhone.innerHTML="对不起，手机号不符合规范!";
        }
        else{
            chkDiv3.style.display = 'none';
        }
    
}