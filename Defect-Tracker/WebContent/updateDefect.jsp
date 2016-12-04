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
<html ng-app="defect-tracker">
<head>

<title>Defect Tacker | Update Defect</title>
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
				<h1>Update Defect</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
					<li class="active">Update Defect</li>
				</ol>
			</section>

			<!-- Main content -->
			<section class="content" ng-controller="defectDataController">

				<div class="box box-warning">
					<!-- /.box-header -->
					<div class="box-body">
						<form role="form" method="post" action="UpdateDefectController">
							<!-- text input -->
							<div class="form-group col-md-4">
								<label>Defect ID</label> <input type="text"
									class="form-control" 
									name="defect_id" ng-model="defect.defect_id" readonly="readonly">
							</div>
								<div class="form-group col-md-8">
								<label>Defect Description</label>
								<textarea class="form-control" rows="2"
									placeholder="Defect Description" name="defect_desc" ng-model="defect.defect_desc" readonly="readonly"></textarea>
							</div>
							<div class="form-group col-md-4">
								<label>Defect Name</label> <input type="text"
									class="form-control"  ng-model="defect.defect_name" 
									name="defect_name" readonly="readonly">
							</div>
						   <div class="form-group col-md-8">
								<label>Comments</label> 
								<textarea class="form-control" rows="2" placeholder="Comments"
									name="comment" ng-model="defect.comment"></textarea>
                             </div>
							

							<div class="form-group col-md-4">
								<label>Defect Status</label> <select class="form-control"
									name="defect_status" ng-model="defect.defect_status">
									<option>New</option>
									<option>Re-Open</option>
									<option>Fixed</option>
									<option>Closed</option>
								</select>
							</div>
							<div class="form-group col-md-8">
								<label>Defect Type</label> 
								<input type="text"
									class="form-control" placeholder="Defect Type"
									name="defect_type" ng-model="defect.defect_desc" readonly="readonly">
                             </div>
							<div class="form-group col-md-4">
							<label>Defect Severity</label>
								<div>
									 <input type="radio" class="minimal" name="severity" value="low"
										checked required> Low
									 <input type="radio" class="minimal" name="severity"
										value="moderate" required> Moderate
									 <input type="radio" class="minimal" name="severity"
										value="high" required> High
									
								</div>
							</div>
							
							<div class="form-group col-md-4">
								<label>Module ID</label> <input type="text"
									class="form-control" placeholder="Defect Type"
									name="module_id" ng-model="defect.module_id" readonly="readonly">
								
							</div>
								<%
								Connection conn1 = DBUtility.getConnection();
								PreparedStatement pst1 = conn1.prepareStatement(SQLConstants.ROLE_NAME);
								ResultSet rs1 = pst1.executeQuery();
							%>
							<div class="form-group col-md-4">
								<label>Assign To</label> <select class="form-control"
									name="assigned_to" ng-model="defect.assigned_to" >
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
							<div class="col-xs-2">
								<button type="submit" class="btn btn-block btn-primary btn-lg">Update</button>
							</div>
							<div class="form-group col-md-2">
								<button type="reset" class="btn btn-block btn-danger btn-lg">Close</button>
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
	<!-- iCheck -->
<script src="lib/plugins/iCheck/icheck.min.js"></script>
<script src="js/pages/updateDefect.js"></script>
<script>
var selectedDefect = '${selectedDefect}';
  $(function () {
    $(' input[type="radio"].minimal').iCheck({
      radioClass: 'iradio_square-blue',
    });
  });
  
</script>
</body>
</html>
