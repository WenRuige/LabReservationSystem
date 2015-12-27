<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<% String reason=request.getParameter("reason"); %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery-1.8.3.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script language="javascript" type="text/javascript">
var i = 3;
var intervalid;
intervalid = setInterval("fun()", 1000);
function fun() {
if (i == 0) {
window.location.href = "javascript:history.go(-1)";
clearInterval(intervalid);
}
document.getElementById("mes").innerHTML = i;
i--;
}
</script>
<title>Insert title here</title>
</head>
<body id="bg" style=" background-color: #efefef;">
<center>
<div class="row">
 <div class="col-sm-4">
 </div>
  <div class="col-sm-4">
    <div class="thumbnail">
      <img src="images/success.jpg" alt="...">
      <div class="caption">
        <h3>成功啦~~~</h3>
        <kbd>Success:</kbd><code> <%=reason %></code>
        <p><div id="errorfrm">

<div id="error">

<p>将在 <span id="mes">3</span> 秒钟后返回上一页！</p>

</div></p>
        <p><a href="javascript:history.go(-1)" class="btn btn-default" role="button">返回上一步</a></p>
      </div>
    </div>
  </div>
</div>
</div>
</center>
 </body>
</html>