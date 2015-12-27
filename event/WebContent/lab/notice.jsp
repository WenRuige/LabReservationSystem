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
<div class="col-sm-2">

 
 



</div>
<div class="col-sm-8">




 <div class="m-post" style="padding: 40px 40px 35px;
  margin: 40px 0 0;
  background: #fff;">
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
  <hr>
  <% } %>
 
</div>
		<div class="info box">


		<!--<a class="date" href="">2015-11-16 01:18:16pm</a>
		<p style="float:right;">commit:28</p>-->

	</div>

</div>
 </div>





<div class="col-sm-2">

</div>
</div>
</html>