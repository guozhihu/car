var stl;
var msl;
var yzm;
var psw;
var cname;
var errmsg;
var psw;

$(document).ready(function init() {
	// body...
	stl = document.getElementById('normallogin');
	msl = document.getElementById('mobilelogin');
	/*var ltl = document.getElementById('logintype');*/
	yzm = document.getElementById('phoneYzmLi');
	psw = document.getElementById('pswSwitch');
	
/*	alert(stl);
	alert(msl);
	alert(yzm);
	alert(psw);
*/
})

function normalLogin() {
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
}

function loginSubmit(){
    //alert("1");


     //js对象
    var loginInfo = {
        "userName"         : $("input[id='normal_id']").val(),
        "userPassword"          :$("input[id='xpasstext']").val(),
    };
    //alert("2");
    $.ajax({
        url:"http://134.175.13.213:8123/user/login",
        type:"POST",
        dataType:'json',
        contentType:'application/json;charset=utf-8',
        data:JSON.stringify(loginInfo),

        success:function(yy){
            if (yy.code != 000000) {
                alert(yy.message);
                //alert(yy);
                //alert("登录成功");
                //window.location.href = "C:/Users/浩/Desktop/GYMindex/index2/index.html";
            }else {
                alert(yy.message);
                //alert("登录成功");
                //sessionStorage.setItem("loginData", JSON.stringify(yy.data));
                //window.location.href = "file:\\C:\\Users\\浩\\Desktop\\GYMindex\\index2\\index.html";
                //window.location = "../index2/index.html"
            }
        },
        error:function(XMLHttpRequest, textStatus, errorThrown){
            //alert("用户名或密码错误");
            alert(JSON.stringify(loginInfo));
            alert(XMLHttpRequest.status);
            alert(XMLHttpRequest.readyState);
            alert(textStatus);
        }
    });

}


function IsNull(){
    cname = document.getElementById('normal_id');
    errmsg = document.getElementById('errMsg');
    psw = document.getElementById('xpasstext');
    //alert(psw.value);
    /*判断中文正则表达式*/
    /*var regname=/^[\u0391-\uFFE5]+$/;*/

    if(cname.value.length==0){
        errmsg.innerHTML="对不起，用户名或密码不能为空!";//请将“文本框”改成你需要验证的属性名称!
        document.getElementById('errormsg').style.display = 'list-item';
    }
    else if(psw.value.length==0){
    	errmsg.innerHTML="对不起，密码不能为空!";
    	}
    	else{
    	document.getElementById('errormsg').style.display = 'none';
       /* if(!cname.value.match(regname)){
            sname.className="chkRed";
            sname.innerHTML="对不起，输入非中文!";
        }*/
        /*else{*/
        /*sname.className="chkGrn";
        sname.innerHTML="用户名可用";*/
        /*}*/
    }
}
