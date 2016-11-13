
<!DOCTYPE html>
<html>
<head>
 <%session=request.getSession();
	if(session.getAttribute("userJson")!=null){%>
	<script>
document.location="DashboardController";//redirect to home page decider
</script>
		<%}		 %>
  <title>DT | Login</title>
  
 <jsp:include page="page/include/styleInfo.jsp"></jsp:include>
 <!-- iCheck -->
  <link rel="stylesheet" href="lib/plugins/iCheck/square/blue.css">
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href="dashboard.jsp"><b>Defect Tracker</b></a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg text-bold text-maroon">${message}</p>

    <form action="LoginController" method="post">
      <div class="form-group has-feedback">
        <input type="email" class="form-control" placeholder="Email" name="email" required>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" class="form-control" placeholder="Password" name="password" required>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox"> Remember Me
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
        </div>
        <!-- /.col -->
      </div>
    </form>
<!--     <a href="#">I forgot my password</a><br>

 -->  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<jsp:include page="page/include/script-library.jsp"></jsp:include>
<!-- iCheck -->
<script src="lib/plugins/iCheck/icheck.min.js"></script>
<script>
  $(function () {
    $('input').iCheck({
      checkboxClass: 'icheckbox_square-blue',
      radioClass: 'iradio_square-blue',
      increaseArea: '20%' // optional
    });
  });
</script>
</body>
</html>
