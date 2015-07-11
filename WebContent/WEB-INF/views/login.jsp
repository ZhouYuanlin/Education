<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Login</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<meta name="keywords" content="Flat Dark Web Login Form Responsive Templates, Iphone Widget Template, Smartphone login forms,Login form, Widget Template, Responsive Templates, a Ipad 404 Templates, Flat Responsive Templates" />

<link href="css/style.css" rel='stylesheet' type='text/css' />

<script type="text/javascript" src="js/jquery.min.js"></script>

</head>
<body>
<script>$(document).ready(function(c) {
	$('.close').on('click', function(c){
		$('.login-form').fadeOut('slow', function(c){
	  		$('.login-form').remove();
		});
	});	  
});
</script>

<h1></h1>
<div class="login-form">
	<div class="close"> </div>
	<div class="head-info">
		<label class="lbl-1"> </label>
		<label class="lbl-2"> </label>
		<label class="lbl-3"> </label>
	</div>
	<div class="clear"> </div>
	<div class="avtar"><img src="images/avtar.png" /></div>
	<form>
		<input type="text" class="text" value="账号" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '账号';}" >
		<div class="key">
			<input type="password" placeholder="密码" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Password';}">
		</div>
		<div class="identity">
			<label class="radio-inline">
  				<input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked="true"> 学生
			</label>
			<label class="radio-inline">
  				<input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2"> 教师
			</label>
			<label class="radio-inline">
 				 <input type="radio" name="inlineRadioOptions" id="inlineRadio3" value="option3"> 管理员
			</label>
		</div>
	</form>
	<div class="login"><p>新用户&nbsp;<a href="register.html">注册</a>&nbsp;在这里</p></div>

	<div class="signin"><input type="submit" value="登录" ></div>
</div>


</body>
</html>