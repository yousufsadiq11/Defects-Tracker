
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

       <!-- search form (Optional) -->
      <!--<form action="#" method="get" class="sidebar-form">
        <div class="input-group">
          <input type="text" name="q" class="form-control" placeholder="Search...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
        </div>
      </form> -->
      <!-- /.search form -->
		
      <!-- Sidebar Menu -->
      <ul class="sidebar-menu">
        <li class="header">Menu</li>
        <jsp:include page="user-left-sidebar/admin.jsp"></jsp:include>
        <jsp:include page="user-left-sidebar/tester.jsp"></jsp:include>
        <li class="active"><a href="RedirectController?url=userProfileController&type=CONTROLLER"><i class="fa  fa-user"></i> <span>Update Profile</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->