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
        Assign Defect
        <small></small>
      </h1>
     <!--  <ol class="breadcrumb">
        <li><a href="#"><i class="fa fa-dashboard"></i> Dashboard</a></li>
        <li class="active">Here</li>
      </ol> -->
    </section>

    <!-- Main content -->
    <section class="content" ng-controller="DefectListController">

      <!-- Your Page Content Here -->
      <%if(request.getAttribute("message")!=null){ %>
       <div class="pad margin no-print">
      <div class="callout callout-info" style="margin-bottom: 0!important;">
        <h4>Defect ID '{{id.selector}}' {{message.selector}} {{lead.selector}}</h4>
        
      </div>
    </div>
      <%} %>
      <div class="box box-info">
            <div class="box-header with-border">
              <h3 class="box-title">Unassigned Defects</h3>

              <div class="box-tools pull-right">
                <button type="button" class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i>
                </button>
                <button type="button" class="btn btn-box-tool" data-widget="remove"><i class="fa fa-times"></i></button>
              </div>
            </div>
            <!-- /.box-header -->
            
            <div class="box-body">
              <div class="table-responsive">
                <table id="example2" class="table no-margin" >
                  <thead>
                  <tr>
                    <th>Defect ID</th>
                    <th>Defect Name</th>
                    <th>Defect Status</th>
                    
                  </tr>
                  </thead>
                  <tbody>
                  <tr ng-repeat="defect in defects">
                  
                    <td >
                    
  
                    <a href="LeadAssign.jsp?t={{defect.defect_id}}">{{defect.defect_id}}</a></td>
                    
                   
                    <td>{{defect.defect_name}}</td>
                    
                    <td   ><div ng-if="check(defect)=='New'"><span class="label label-warning">{{defect.defect_status}}</span></div>
                    </td>
                  
                  </tr>
  
                  </tbody>
                </table>
              </div>
              <!-- /.table-responsive -->
            </div>
            <!-- /.box-body -->
            <div class="box-footer clearfix">
            
              <a href="addDefect.jsp" class="btn btn-sm btn-info btn-flat pull-left">Create New Defect</a>
            
            </div>
            <!-- /.box-footer -->
          </div>
          <!-- /.box -->
       
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

<!-- SlimScroll -->
<script src="../../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="../../plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="../../dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="../../dist/js/demo.js"></script>
<!-- page script -->
<script src="lib/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="lib/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="js/tester/defectList.js"></script>


<script src="js/pages/dashboard.js"></script>

<script>
$(document).ready(function() {
    $('#example2').DataTable();
   
    });

</script>
<script >
var defectsFromDB = '${listOfDefects}';
var message='${message}';
var id='${id}';
var lead='${lead}';

</script>
</body>
</html>
