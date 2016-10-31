
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.*" %>
<%@page import="java.util.*"%>
<%@page import="com.dt.utility.DBUtility" %>
<%@page import="com.dt.utility.SQLConstants" %>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
 
<html>

<head>
 
  <title>Defect Tacker | Dashboard</title>
 <jsp:include page="page/include/styleInfo.jsp"></jsp:include>
</head>

<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

<style>
input:invalid {
  border: 1px solid white;
}


input:valid {
  border: 1px solid white;
}
</style>



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
       &nbsp;&nbsp; Add Defect
        
      </h1>
      <ol class="breadcrumb">
        <li><a href="dashboard.jsp"><i class="fa fa-dashboard"></i> Home</a></li>
        <li class="active">Add Defect</li>
      </ol>
    </section>

    <!-- Main content -->
    <form method="post" action="AddDefectController">
    <section class="content">

      <!-- Your Page Content Here -->
      <div class="col-xs-5">
                  <label>Defect Name</label>
                  <input type="text" class="form-control" placeholder="Enter Defect Name" name="defect_name" required >
                </div>
      <div class="col-xs-5">
                  <label>Defect Description</label>
                  <textarea class="form-control" rows="3" placeholder="Enter Defect Description" name="defect_desc" required></textarea>
                </div>
                <%Connection conn1=DBUtility.getConnection(); 
      
			
  		PreparedStatement pst1 = conn1.prepareStatement(SQLConstants.ROLE_NAME);
  		ResultSet rs1=pst1.executeQuery();
     
      %>
                 <div class="col-xs-5">
                  <label>Assign To</label>
                  <select class="form-control" name="assigned_to" required>
                  <%  while(rs1.next()){%>
                    <option><%=rs1.getString(1) %></option>
                   <%} %>
                  </select>
                  <%DBUtility.closeConnection(conn1); %>
                </div>
                <br><br>
                <br>
                <div class="col-xs-5">
                  <label>Defect Status</label>
                  <select class="form-control" name="defect_status" required>
                    <option>New</option>
                    <option>Re-Open</option>
                    <option>Closed</option>
                  </select>
                </div>
       <div class="col-xs-5">
                  <label>Defect Type</label>
                  <textarea type="text" class="form-control" rows="2" placeholder="Enter Defect Type" name="defect_type" required></textarea>
                </div>
                <div class="col-xs-5">
                  <div class="radio">
                    <label>
                      <input type="radio" name="severity" id="optionsRadios1" value="low" checked required>
                      
                     Low&nbsp;&nbsp;&nbsp;
                    </label>
                    <label>
                      <input type="radio" name="severity" id="optionsRadios1" value="moderate" required >
                      
                     Moderate&nbsp;&nbsp;&nbsp;
                    </label>
                    <label>
                      <input type="radio" name="severity" id="optionsRadios1" value="high" required>
                      
                     High
                    </label>
                         </div>
                                 </div>
                 <br>
                
      <br>
      
      <%Connection conn=DBUtility.getConnection(); 
      
			
  		PreparedStatement pst = conn.prepareStatement(SQLConstants.MODULE_ID);
  		ResultSet rs=pst.executeQuery();
      
      %>
      <div class="col-xs-5">
                  <label>Module ID</label>
                  <select class="form-control" name="module_id" required>
                     <%  while(rs.next()){%>
                    <option><%=rs.getInt(1) %></option>
                   <%} %>
                  </select>
                   <%DBUtility.closeConnection(conn); %>
                </div>
                   <br>
                
      <br><br><br>
                  <div class="col-xs-5">
                <button type="submit" class="btn btn-info pull-LEFT">Submit</button>
              </div>
    </section>
    </form>
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

</body>
</html>
