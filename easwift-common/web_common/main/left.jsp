<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String pathl = request.getContextPath();
	String basePathl = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+pathl+"/";
%>
<!-- 本页面涉及的js函数，都在top.jsp页面中     -->
<div id="sidebar" class="menu-min">
	<ul class="nav nav-list">
		<li class="active" id="fhindex">
		  <a href="<%=basePath%>mainAction/main.action"><i class="icon-dashboard"></i><span>主页<!-- 后台首页 --></span></a>
		</li>
		<li id="z1">
			<a href="siMenu('z1','lm1','推荐人','roleAction/list.action')">
				<i class="icon-dashboard"></i><span>推荐人</span>
			</a>
		</li>
	</ul>

	<div id="sidebar-collapse"><i class="icon-double-angle-left"></i></div>
</div><!--/#sidebar-->