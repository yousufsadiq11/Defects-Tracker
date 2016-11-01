<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app>
<head>
 
  <title>Defect Tracker | Dashboard</title>
 <jsp:include page="page/include/styleInfo.jsp"></jsp:include>
 <!-- DataTables -->
  <link rel="stylesheet" href="lib/plugins/datatables/dataTables.bootstrap.css">
</head>
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">
  <jsp:include page="page/common/nav-bar.jsp"></jsp:include>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">
	<jsp:include page="page/common/left-sidebar.jsp"></jsp:include>
  </aside>
<div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Add New User
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Admin</a></li>
        <li class="active">Add New User</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content">
				<!-- Your Page Content Here -->
				<div class="row">
					<div class="col-xs-12">
						<div class="add-user-box">
  <div class="login-box-body">

    <form method="post" action="AddUserController">
      <div class="form-group has-feedback">
        <input type="email" class="form-control" placeholder="Email"
        name="email" required>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
            <div class="row">
      <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">Add</button>
        </div>
        </div>
              </form>
        
  </div>  <!-- login-box-body-end -->
  
				</div>  <!-- login-box -->
				</div>
				</div>
			</section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


  <!-- Main Footer -->
  <footer class="main-footer">
   <jsp:include page="page/include/footer.jsp"></jsp:include>
  </footer>

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <jsp:include page="page/common/right-sidebar.jsp"></jsp:include>
  </aside>
  <!-- /.control-sidebar -->
  <!-- Add the sidebar's background. This div must be placed
       immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->
<jsp:include page="page/include/script-library.jsp"></jsp:include>
<script src="js/admin/addUser.js"></script>
<script>
function greeting(){
    alert("User is sucessfully added in the system")
}
</script>

</body>
</html>
