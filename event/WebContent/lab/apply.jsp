<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.ArrayList" %>
    <%@ page import ="Controller.ShowRoomController" %>
    <%@ page import = "javabean.Room" %>
    <% ShowRoomController s = new ShowRoomController(); 
   			 ArrayList<Room> data = s.show();				
    					%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery-1.8.3.js"></script>
  <script src="js/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body id="bg" style=" background-color: #efefef;">
  <header class="main-header"  style="background-image: url(images/background.jpg)"">
          <div class="container">
              <div class="row">
                  <div class="col-sm-12">

                      <h1><span class="hide">Laravel - </span><code>实验室预约管理系统</code></h1>
                      <h2 class="hide">PHP THAT DOESN'T HURT. CODE HAPPY &amp; ENJOY THE FRESH AIR.</h2>

                      <img src="images/title.png" alt="Laravel" class="hide">
                  </div>

                  <div class="col-sm-12">
                    <p class="text-right"><kbd>Author:gewenrui</kbd></p>
                   
                    <p class="text-right"> <span class="glyphicon glyphicon-home" aria-hidden="true"><code><a href ="login.jsp">注销</a></code></span></p>

                  </div>

              </div>
          </div>
      </header>

      <nav class="navbar navbar-default" role="navigation">
   <div class="navbar-header">
      <a class="navbar-brand" href="#">Laboratory Reservation Management System</a>
   </div>
   <div>
      <ul class="nav navbar-nav">
         <li class="active"><a href="login.jsp">登陆</a></li>
         <li><a href="register.jsp">注册</a></li>

      </ul>
   </div>
</nav>

      <div class="row">
<div class="col-sm-4" style="padding-left:100px">
</br></br></br>
  <ul class="list-group">
    <li class="list-group-item"><strong><a href="apply.jsp">申请实验室</a></strong></li>
  <li class="list-group-item"><strong><a href="password.jsp">修改密码</a></strong></li>
    <li class="list-group-item"><strong><a href="status.jsp">查看申请状态</a></strong></li>

  </ul>




</div>
<div class="col-sm-7">
</br>


 <div class="m-post" style="padding: 40px 40px 35px;
  margin: 40px 0 0;
  background: #fff;">
<form action="/event/apply" method ="post" >

     <div class="form-group">
        <label for="name">名称</label>
        <select class="form-control" name ="name">
        <%for(int i =0;i<data.size();i++){ %>
        <option value="<%= data.get(i).getName() %>"><%= data.get(i).getName() %></option>
        <% } %>

     </select>
     </div>
     <div class="form-group">
        <label for="name">时间</label>
      
 
        <input type="text" class="form-control" id="name" name="time"
           placeholder="例如：2008/1/12">

     </div>

     <div class="form-group">
        <label for="name">原因</label>
    <textarea class="form-control" rows="3" name="content"></textarea>
     </div>
     <button type="submit" class="btn btn-default ">申请</button>
   </form>
		<div class="info box">

		<!--<a class="date" href="">2015-11-16 01:18:16pm</a>
		<p style="float:right;">commit:28</p>-->

	</div>
</form>
</div>
 </div>






</div>


</body>
</html>