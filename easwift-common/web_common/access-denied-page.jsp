<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style type="text/css">
	.no-data {
	    min-height: 190px;
	    padding: 50px;
	    border: 1px solid #E6E9ED;
	    background: #fff;
	    color: #656D78;
	    font-size: 14px;
	    line-height: 2;
	    text-align: center;
		margin: 0 auto;
	}
	.no-data img {
	    width: 97px;
	    height: 97px;
	    display: block;
	    margin: auto;
	}
</style>
<title>访问被拒绝</title>
</head>
<script type="text/javascript" src="<%=basePath %>/web_common/static/js/jquery-1.7.2.js"></script>
<script type="text/javascript" src="<%=basePath %>/web_common/main/js/logout.js"></script>
<body>
	<div class="no-data">
		<img src="../common/images/no-data.png" alt="…">
		<p>您无权访问该系统，请与管理员联系 &nbsp; <a id="log_out" href="javascript:void(0)" lang="<%=basePath %>/systemAction/j_spring_security_logout">返回</a></p>
	</div>
</body>
</html>