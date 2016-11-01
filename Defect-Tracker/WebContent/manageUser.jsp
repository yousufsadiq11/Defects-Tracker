<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app='defect-tracker'>
<head>
 
  <title>Defect Tacker | Dashboard</title>
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
        <li><a href="#"><i class="fa fa-dashboard"></i> All Users</a></li>
        <li class="active">Manage User</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content" ng-controller="userDataController">

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
                  <input type="text" class="form-control" placeholder="Full Name" ng-model="user.userName" disabled>
                </div>
                <div class="form-group">
                  <label>Email</label>
                  <input type="text" class="form-control" placeholder="Email" ng-model="user.email" disabled>
                </div>


                <!-- select -->
                <div class="form-group">
                  <label>User Module</label>
                  <select class="form-control"  ng-model="userModule" ng-options = "module.moduleName for module in listOfModules"></select>
                </div>
                
                <div class="form-group">
                  <label>User Role</label>
                  <select class="form-control"  ng-model="userRole" ng-options = "role.roleName for role in listOfRoles"></select>
                </div>
                <div class="form-group col-md-6">
                <button type="button" class="btn btn-block btn-primary btn-lg" ng-click="updateDetails()">Update Details</button>
                </div>
                <div class="form-group col-md-6">
                <button type="button" class="btn btn-block btn-danger btn-lg" ng-click="confirmDelete()">Remove User</button>
                </div>
              </form>
            </div>
            <!-- /.box-body -->
             <div id="confirm-dialog" class="modal fade modal-danger" role="dialog">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">Alert</h4>
              </div>
              <div class="modal-body">
                <p>Do you really want to remove the user? This action cannot be reversed.</p>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Cancel</button>
                <button type="button" class="btn btn-outline" ng-click="removeUser()">Proceed</button>
              </div>
            </div>
            <!-- /.modal-content -->
          </div>
          <!-- /.modal-dialog -->
        </div>
        <!-- /.modal -->
          </div>
			<div style="display:none">
			<form id="userForm" action="" method="post">
			<input type="hidden" name="user" />
			<input type="submit">
			</form>
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
<jsp:include page="page/include/script-library.jsp"></jsp:include>
<script src="js/admin/manageUser.js"></script>
<script>
var selectedUser = '${selectedUser}';
var listOfModules = '${listOfModules}';
var listOfRoles = '${listOfRoles}';
</script>
</body>
</html>
