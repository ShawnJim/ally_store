	
	
		
		//register页面验证
		var emailemailState = false;
		
			//鼠标点击邮箱的文本框时，文本框里面的字消失
            $('#txtEmail').focus(function () {
                if (emailState == false) {
                    $(this).val('');
                }
            });
		
		
		 $("#txtEmail").blur(function () {
                if ($(this).val() == '') {
                    $("#spinfo").text("邮箱不能为空").css("color","red");
                    $(this).focus();
                }
                else {
                    if (/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test($(this).val()) == false) {
                        $("#spinfo").text("邮箱格式不正确，请重新填写").css("color","red");
                        $(this).focus();
                    }
                    else {
                        $("#spinfo").text('邮箱正确').css("color","green");
                        //$("#spinfo").append("<img src=images/onSuccess.gif />");
                        emailState=true;
                    }
                }
          });
          
        
        
        //login页面验证
          
        //鼠标点击用户名的文本框时，文本框里面的字消失
        
         var loginUState = false;
         
            $('#login_userName').focus(function () {
                if (loginUState == false) {
                    $(this).val('');
                }
            });
            
            $("#login_userName").blur(function () {
                if ($(this).val() == '') {
                    $("#Uspinfo").text("用户名不能为空").css("color","red");
                    $(this).focus();
                }
                else {
                	
                    if (/^[a-zA-z][a-zA-Z0-9_]{5,16}$/.test($(this).val()) == false) {
                        $("#Uspinfo").text("用户名格式不正确，请重新填写(6-16位)").css("color","red");
                        $(this).focus();
                    }
                    else {
                        $("#Uspinfo").text('用户名正确').css("color","green");
                        //$("#spinfo").append("<img src=images/onSuccess.gif />");
                        loginUState=true;
                    }
                }
          });
          
          
        
        
        
         var loginPState = false;
         	//鼠标点击密码的文本框时，文本框里面的字消失
            $('#login_password').focus(function () {
                if (loginPState == false) {
                    $(this).val('');
                }
            });
            
            $("#login_password").blur(function () {
                if ($(this).val() == '') {
                    $("#Pspinfo").text("密码不能为空").css("color","red");
                    $(this).focus();
                }
//              else {
//              	
//                  if (/^[a-zA-z][a-zA-Z0-9_]{6,16}$/.test($(this).val()) == false) {
//                      $("#Pspinfo").text("密码格式不正确，请重新填写(6-16位)").css("color","red");
//                      $(this).focus();
//                  }
//                  else {
//                      $("#Pspinfo").text('密码正确').css("color","green");
//                      //$("#spinfo").append("<img src=images/onSuccess.gif />");
//                      loginPState=true;
//                  }
//              }
          });
            
            
        

