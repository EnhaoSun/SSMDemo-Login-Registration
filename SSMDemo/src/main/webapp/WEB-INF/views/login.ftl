<#assign base = request.getContextPath() />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!--===============================================================================================-->
    <link rel="icon" type="image/png" href="${base}/resources/images/icons/favicon.ico"/>
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/bootstrap/css/bootstrap.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/animate/animate.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/css-hamburgers/hamburgers.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/animsition/css/animsition.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/select2/select2.min.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/vendor/daterangepicker/daterangepicker.css">
    <!--===============================================================================================-->
    <link rel="stylesheet" type="text/css" href="${base}/resources/css/util.css">
    <link rel="stylesheet" type="text/css" href="${base}/resources/css/main.css">
    <!--===============================================================================================-->
</head>
<body>

<div class="limiter">

    <div class="container-login100" style="background-image: url('${base}/resources/images/home.jpg');">
        <div class="wrap-login100 p-t-30 p-b-50">
				<span class="login100-form-title p-b-41">
					Account Login
				</span>
            <form class="login100-form validate-form p-b-33 p-t-5" action="${base}/checkLogin" method="post">

                <div class="wrap-input100 validate-input" data-validate = "Enter username">
                    <input class="input100" type="text" name="userName" placeholder="User name" >
                    <span class="focus-input100" data-placeholder="&#xe82a;"></span>
                </div>

                <div class="wrap-input100 validate-input" data-validate="Enter password">
                    <input class="input100" type="password" name="password" placeholder="Password">
                    <span class="focus-input100" data-placeholder="&#xe80f;"></span>
                </div>
                <#if message??>
                    <div class="text-danger" align="center">
                        <i class="fa fa-times-circle"></i>
                        ${message}
                    </div>
                </#if>

                <div class="container-login100-form-btn m-t-32">
                    <button class="login100-form-btn">
                        Login
                    </button>
                </div>
            </form>
            <div class="txt1">
                <a href="registerForm" >Click here to sign up</a>
            </div>
            <div class="txt1">
            <a href="home" >Go back home</a>
            </div>
        </div>
    </div>
</div>


<div id="dropDownSelect1"></div>

<!--===============================================================================================-->
<script src="${base}/resources/vendor/jquery/jquery-3.2.1.min.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/vendor/animsition/js/animsition.min.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/vendor/bootstrap/js/popper.js"></script>
<script src="${base}/resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/vendor/select2/select2.min.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/vendor/daterangepicker/moment.min.js"></script>
<script src="${base}/resources/vendor/daterangepicker/daterangepicker.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/vendor/countdowntime/countdowntime.js"></script>
<!--===============================================================================================-->
<script src="${base}/resources/js/main.js"></script>

</body>
</html>
