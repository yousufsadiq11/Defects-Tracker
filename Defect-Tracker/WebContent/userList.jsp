<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app>
<head>
 
  <title>Defect Tacker | Dashboard</title>
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

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <h1>
        Users
        <small>All the registered users on the system</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Admin</a></li>
        <li class="active">All Users</li>
      </ol>
    </section>

    <!-- Main content -->
    <section class="content" ng-controller="userListController">
				<!-- Your Page Content Here -->
				<div class="row">
					<div class="col-xs-12">
						<div class="box">
							<div class="box-header">
								<h3 class="box-title">Data Table With Full Features</h3>
							</div>
							<!-- /.box-header -->
							<div class="box-body">
								<table id="example1" class="table table-bordered table-striped">
									<thead>
										<tr>
											<th></th>
											<th>Full Name</th>
											<th>Team</th>
											<th>Role</th>
										</tr>
									</thead>
									<tbody>
										<tr  ng-repeat="user in users">
											<td>{{user.img}}</td>
											<td>{{user.fullName}}</td>
											<td>{{user.team}}</td>
											<td>{{user.role}}</td>
										</tr>
										<!-- <tr>
											<td>User Image</td>
											<td>John Doe</td>
											<td>User Management</td>
											<td>Developer</td>
										</tr>
										<tr>
											<td>User Image</td>
											<td>Jane Doe</td>
											<td>Data Management</td>
											<td>Team Lead</td>
										</tr>
										<tr>
											<td>User Image</td>
											<td>George</td>
											<td>User Management</td>
											<td>Tester</td>
										</tr>
										<tr>
											<td>User Image</td>
											<td>Bill</td>
											<td>Data Management</td>
											<td>Developer</td>
										</tr>
										<tr>
											<td>User Image</td>
											<td>Jack Reacher</td>
											<td>User Management</td>
											<td>Team Lead</td>
										</tr> -->
									</tbody>
									<tfoot>
										<tr>
											<th></th>
											<th>Full Name</th>
											<th>Team</th>
											<th>Role</th>
										</tr>
									</tfoot>
								</table>
							</div>
							<!-- /.box-body -->
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
<jsp:include page="page/include/script-library.jsp"></jsp:include>
<script src="lib/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="lib/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="js/admin/userList.js"></script>
<script>
  $(function () {
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false
    });
  });
</script>
</body>
</html>
