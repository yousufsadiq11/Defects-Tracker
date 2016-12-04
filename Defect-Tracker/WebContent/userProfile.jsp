<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app="defect-tracker">
<head>
 
  <title>Defect Tacker | My Profile</title>
 <jsp:include page="page/include/styleInfo.jsp"></jsp:include>
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

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Manage User
      </h1>
      <ol class="breadcrumb">
      	<li><a href="RedirectController?url=DashboardController&type=CONTROLLER"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        <li class="active">My Profile</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content" ng-controller="userDataController">
		 <!-- Your Page Content Here -->
				<div class="row">
					<div class="col-xs-12">
	<%if(request.getAttribute("message")!=null){ %>
					<div class="callout callout-info">
							<h4>Ding!</h4>
								<p>${message}</p>
							</div>
							<%} %>
      <div class="box box-warning">
            <div class="box-header with-border">
              <h3 class="box-title">User Profile</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <form role="form">
                <!-- text input -->
                <div class="form-group">
                  <label>Full Name</label>
                  <input type="text" class="form-control" placeholder="Full Name" ng-model="user.userName">
                </div>
                <div class="form-group">
                  <label>Email</label>
                  <input type="text" class="form-control" placeholder="Email" ng-model="user.email" readonly="readonly">
                </div>
                <!-- select -->
                <div class="form-group">
                  <label>User Module</label>
                  <input type="text" class="form-control" placeholder="Module" ng-model="user.module" readonly="readonly">
                </div>
                
                <div class="form-group">
                  <label>User Role</label>
                                    <input type="text" class="form-control" placeholder="Email" ng-model="user.role" readonly="readonly">
                </div>
                <div class="form-group col-md-6">
                <button type="button" class="btn btn-block btn-primary btn-lg" ng-click="updateDetails()">Update Details</button>
                </div>
                <div class="form-group col-md-6">
                <button type="reset" class="btn btn-block btn-danger btn-lg">Reset</button>
                </div>
              </form>
            </div>
            <!-- /.box-body -->
          </div>
			<div style="display:none">
			<form id="userForm" action="" method="post">
			<input type="hidden" name="user" />
			<input type="submit">
			</form>
			</div>
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

<!-- REQUIRED JS SCRIPTS -->
<script src="js/pages/userProfile.js"></script>
<script>
var selectedUser = '${selectedUser}';
var listOfModules = '${listOfModules}';
var listOfRoles = '${listOfRoles}';
</script>
</body>
</html>
