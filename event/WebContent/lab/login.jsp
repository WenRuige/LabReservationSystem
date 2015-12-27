<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ page import ="java.util.ArrayList" %>
    <%@ page import ="Controller.ShowNoticeController" %>
    <%@ page import = "javabean.Notice" %>
    <% ShowNoticeController s = new ShowNoticeController(); 
   			 ArrayList<Notice> data = s.show();				
    					%>
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
         <li><a class="text-right"></a></li>

      </ul>
   </div>
</nav>

      <div class="row">
<div class="col-sm-4">

 
 <center>
 
 <h3><kbd>公告通知</kbd></h3>

 </center>

<div class="media" style="padding-left:20px">
<%for(int i =0;i<data.size();i++){ %>
  <div class="media-left">
  
    <a href="#">
    <span class="glyphicon glyphicon-circle-arrow-right" aria-hidden="true"></span>
    </a>
  </div>
  
  <div class="media-body">
  
    <h4 class="media-heading"><%=data.get(i).getTitle() %></h4>
    <%=data.get(i).getContent() %>
  </div>
  <p class="text-right"><code> 发布时间:<%=data.get(i).getTime() %></code></p>
  <% } %>
  <p class="text-right"><a href="notice.jsp"> 查看更多..</a></p>
</div>



</div>
<div class="col-sm-4">
</br>



 <div class="m-post" style="padding: 40px 40px 35px;
  margin: 40px 0 0;
  background: #fff;">
<form action="/event/login" method="post">
     <div class="form-group">
        <label for="name">名称</label>
        <input type="text" class="form-control" id="name" name="username"
           placeholder="请输入名称">
     </div>
     <div class="form-group">
        <label for="name">密码</label>
        <input type="password" class="form-control" id="name" name="password"
           placeholder="请输入密码">
     </div>
     <button type="submit" class="btn btn-default ">登陆</button>
   </form>
		<div class="info box">

		<!--<a class="date" href="">2015-11-16 01:18:16pm</a>
		<p style="float:right;">commit:28</p>-->

	</div>

</div>
 </div>





<div class="col-sm-4">
<div class="text-info">
</br>
<span class="glyphicon glyphicon-tags" aria-hidden="true"></span>
实验室预约管理系统解决了<i>临时上课<i>造成的麻烦
</br>
为了方便教师以及<strong>实验室的管理</strong>


</div>
</div>
</div>
</html>