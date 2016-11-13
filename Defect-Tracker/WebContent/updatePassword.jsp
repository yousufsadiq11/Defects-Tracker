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
        My Profile
      </h1>
      <ol class="breadcrumb">
      	<li><a href="RedirectController?url=DashboardController&type=CONTROLLER"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        <li class="active">My Profile</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content" ng-controller="updatePasswordController">
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
              <h3 class="box-title">Update Password</h3>
            </div>
            <!-- /.box-header -->
            <div class="box-body">
              <form role="form">
                <!-- text input -->
                <div class="form-group">
                  <label>Existing Password</label>
                  <input id="currentPassword" type="password" class="form-control" placeholder="Current Password" ng-model="currentPassword" required>
                </div>
                <div class="form-group">
                  <label>New Password</label>
                  <input id="newPassword" type="password" class="form-control" placeholder="New Password" ng-model="newPassword" required>
                </div>
                <div class="form-group">
                  <label>Confirm Password</label>
                  <input id="confirmPassword" type="password" class="form-control" placeholder="Confirm Password" ng-model="confirmPassword" required>
                </div>
                
                <div class="form-group col-md-6">
                <button type="submit" class="btn btn-block btn-primary btn-lg" ng-click="updateDetails()">Update Password</button>
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
			<div id="confirm-dialog" class="modal fade modal-danger" role="dialog">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Error</h4>
              </div>
              <div class="modal-body">
                <p id="message"></p>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
        <!-- /.modal -->
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
var selectedUser = '${userJson}';
</script>
</body>
</html>
