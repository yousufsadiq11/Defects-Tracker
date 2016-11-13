<%@page import="com.dt.model.User"%>
<%@page import="com.google.gson.Gson"%>

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
        <%String userJson = session.getAttribute("userJson").toString();
        User user = new User();
		Gson gson = new Gson(); 
		user = gson.fromJson(userJson,User.class);
		if((null != user.getRole()) && user.getRole().equals("ADMIN")){
        %>
        <jsp:include page="user-left-sidebar/admin.jsp"></jsp:include>
        <%}else if(user.getRole().equals("Tester")){ %>
        <jsp:include page="user-left-sidebar/tester.jsp"></jsp:include>
        <%}else if(user.getRole().equals("Developer")){  %>
        <jsp:include page="user-left-sidebar/developer.jsp"></jsp:include>
        <%}else if(user.getRole().equals("Team Lead")){  %>
        <jsp:include page="user-left-sidebar/teamLead.jsp"></jsp:include>
        <%} %>
        <li><a href="UserProfileController"><i class="fa  fa-user"></i> <span>Update Profile</span></a></li>
        <li><a href="RedirectController?url=updatePassword&type=PAGE"><i class="fa  fa-gear"></i> <span>Change Password</span></a></li>
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->