<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="com.dt.utility.DBUtility"%>
<%@page import="com.dt.utility.SQLConstants"%>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>

<title>Defect Tacker | Add Defect</title>
<jsp:include page="page/include/styleInfo.jsp"></jsp:include>
<!-- iCheck -->
  <link rel="stylesheet" href="lib/plugins/iCheck/square/blue.css">
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
				<h1>Add Defect</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">Add Defect</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content">

				<div class="box box-warning">
					<!-- /.box-header -->
					<div class="box-body">
						<form role="form" method="post" action="AddDefectController">
							<!-- text input -->
							<div class="form-group col-md-12">
								<label>Defect Name</label> <input type="text"
									class="form-control" placeholder="Defect Name"
									name="defect_name" required>
							</div>
							<div class="form-group col-md-12">
								<label>Defect Description</label>
								<textarea class="form-control" rows="2"
									placeholder="Defect Description" name="defect_desc"
									required></textarea>
							</div>
							

							<div class="form-group col-md-6">
								<label>Defect Status</label> <select class="form-control"
									name="defect_status" required>
									<option>New</option>
									<option>Re-Open</option>
									<option>Closed</option>
								</select>
							</div>
							<div class="form-group col-md-6">
							<label>Defect Severity</label>
								<div>
									 <input type="radio" class="minimal" name="severity" value="low"
										checked required>Low
									 <input type="radio" class="minimal" name="severity"
										value="moderate" required>Moderate
									 <input type="radio" class="minimal" name="severity"
										value="high" required>High
									
								</div>
							</div>
							<div class="form-group col-md-12">
								<label>Defect Type</label>
								<input type="text"
									class="form-control" placeholder="Defect Type"
									name="defect_type" required>
							</div>
							
							<%
								Connection conn = DBUtility.getConnection();
								PreparedStatement pst = conn.prepareStatement(SQLConstants.MODULE_ID);
								ResultSet rs = pst.executeQuery();
							%>
							<div class="form-group col-md-6">
								<label>Module ID</label> <select class="form-control"
									name="module_id" required>
									<%
										while (rs.next()) {
									%>
									<option><%=rs.getInt(1)%></option>
									<%
										}
									%>
								</select>
								<%
									DBUtility.closeConnection(conn);
								%>
							</div>
							<%
								Connection conn1 = DBUtility.getConnection();
								PreparedStatement pst1 = conn1.prepareStatement(SQLConstants.ROLE_NAME);
								ResultSet rs1 = pst1.executeQuery();
							%>
							<div class="form-group col-md-6">
								<label>Assign To</label> <select class="form-control"
									name="assigned_to" required>
									<%
										while (rs1.next()) {
									%>
									<option><%=rs1.getString(1)%></option>
									<%
										}
									%>
								</select>
								<%
									DBUtility.closeConnection(conn1);
								%>
							</div>
							<div class="form-group col-md-6">
								<button type="submit" class="btn btn-block btn-primary btn-lg">Submit</button>
							</div>
							<div class="form-group col-md-6">
								<button type="reset" class="btn btn-block btn-danger btn-lg">Reset</button>
							</div>
						</form>
					</div>
					<!-- /.box-body -->
				</div>
				<div style="display: none"></div>
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
	<!-- iCheck -->
<script src="lib/plugins/iCheck/icheck.min.js"></script>
<script>
  $(function () {
    $(' input[type="radio"].minimal').iCheck({
      radioClass: 'iradio_square-blue',
    });
  });
</script>
</body>
</html>
