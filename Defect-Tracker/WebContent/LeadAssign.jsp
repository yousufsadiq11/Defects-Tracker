
<%@ page import = "java.sql.*" %> 
<%@ page import="com.dt.utility.*" %>
<%@ page import="com.dt.model.*" %>
<%@page import="java.util.*" %>
<%@ page import="com.google.gson.*"%>
<%@page import="com.google.gson.JsonArray" %>
<%@page import="com.google.gson.reflect.TypeToken" %>

<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html ng-app="defect-tracker">
<head>
 
  <title>Defect Tracker | Dashboard</title>
 <jsp:include page="page/include/styleInfo.jsp"></jsp:include>
 
</head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
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
        Defect ID: <%=request.getParameter("t") %>
        <small></small>
      </h1>
     <!--  <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        <li class="active">Here</li>
      </ol> -->
    </section>

    <!-- Main content -->
    <section class="content">
  <% 
Connection con = DBUtility.getConnection();
String input=request.getParameter("t");
PreparedStatement stmt = con.prepareStatement(SQLConstants.GET_SPECIFIC_DEFECT);
stmt.setString(1, input);
ResultSet rs = stmt.executeQuery();
System.out.println(input);


 try
 {
	 ArrayList<Defect> listOfDefects = new ArrayList<Defect>();
  if(rs!=null)
  {

    rs.next();

JsonArray jsonArray = new JsonArray();

    if(true)
    {
    	Defect defect = new Defect();
		defect.setDefect_id(rs.getInt("defect_id"));
		defect.setDefect_name(rs.getString("defect_name"));
		defect.setDefect_status(rs.getString("defect_status"));
		defect.setDefect_desc(rs.getString("defect_desc"));
		
		listOfDefects.add(defect);
		}
	

 }
  %> 
 <% 
 

                    for(Defect defect:listOfDefects) {%>
      <!-- Default box -->
     
      <div class="box">
        <div class="box-header ">
          <h3 class="box-title"><b>Defect Name:  </b><%=defect.getDefect_name() %></h3>
                  
          <div class="box-tools pull-right">
            <button type="button" class="btn btn-box-tool" data-widget="collapse" data-toggle="tooltip" title="Collapse">
              <i class="fa fa-minus"></i></button>
            <button type="button" class="btn btn-box-tool" data-widget="remove" data-toggle="tooltip" title="Remove">
              <i class="fa fa-times"></i></button>
          </div>
        </div>
        <div class="box-body">
         <b> Defect Description:  </b>
   
                    	 <%=defect.getDefect_desc() %>
                    	
        </div>
        <div class="box-body">
         <b> Defect Status: </b>
   
                    	 <%=defect.getDefect_status() %>
                    	
        </div> 
        <% 
                    }
 }
                    catch(SQLException e) 
                    {
                     e.printStackTrace();
                    }
                   

                    %>
          
        <!-- /.box-body -->
        
							<%
								Connection conn1 = DBUtility.getConnection();
								PreparedStatement pst1 = conn1.prepareStatement(SQLConstants.ROLE_NAME_LEAD);
								ResultSet rs1 = pst1.executeQuery();
							%>
        
        <form method="post" action="assignLeadsController">
        <input type="hidden" name="hidden" value=<%=request.getParameter("t") %>>
        
        <div class="box-body" >
         
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
		  <div class="box-footer" >
                      <input type="submit" value="Assign" class="btn btn-sm btn-info btn-flat pull-right"></a>  
        </div>
        		</form>
        </div>
        
      
        
        <!-- /.box-footer-->
      </div>
      <!-- /.box -->

    </section>
      <!-- Your Page Content Here -->
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



<script src="js/pages/dashboard.js"></script>
</body>
</html>
