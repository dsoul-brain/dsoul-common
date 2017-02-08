<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<nav style="padding: 0 15px;">
	<ul class="pagination pagination-sm" style="float: right;">
		
		<c:choose>
			<c:when test="${pageup_key1 !=null }">
				<li><a href="javascript:void(0)" name="page_first_page_ots">首页</a></li>
			</c:when>
			<c:otherwise>
				<li class="disabled"><a href="javascript:void(0)">首页</a></li>
			</c:otherwise>
		</c:choose>
		
		

		<c:choose>
			<c:when test="${pageup_key1 !=null }">
				<li><a id="pre_page_ots_li" href="javascript:void(0)"
					aria-label="Previous"> <span aria-hidden="true">&lt;</span>
				</a></li>
			</c:when>
			<c:otherwise>
				<li class="disabled"><a href="javascript:void(0)"
					aria-label="Previous"> <span aria-hidden="true">&lt;</span>
				</a></li>
			</c:otherwise>
		</c:choose>

		<c:choose>
			<c:when test="${pagedown_key1 !=null }">
				<li><a id="next_page_ots_li" href="javascript:void(0)"
					aria-label="Next"> <span aria-hidden="true">&gt;</span>
				</a></li>
			</c:when>
			<c:otherwise>
				<li class="disabled"><a href="javascript:void(0)"
					aria-label="Next"> <span aria-hidden="true">&gt;</span>
				</a></li>
			</c:otherwise>
		</c:choose>
		
		
		<c:choose>
			<c:when test="${pagedown_key1 !=null }">
				<li><a href="javascript:void(0)" name="page_end_page_ots" data = "" >尾页</a></li>
			</c:when>
			<c:otherwise>
				<li class="disabled"><a href="javascript:void(0)">尾页</a></li>
			</c:otherwise>
		</c:choose>

	
	
	</ul>
</nav>