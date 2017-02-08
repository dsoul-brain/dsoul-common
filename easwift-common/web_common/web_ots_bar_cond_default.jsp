<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- <input type="hidden" name="limit" value="2" /> -->
<input type="hidden" id="pagetype" name="pagetype" value="BEGIN" />
<input type="hidden" id="pageup_key1" name="pageup_key1" value="${pageup_key1 }" />
<input type="hidden" id="pageup_key2" name="pageup_key2" value="${pageup_key2 }" />
<input type="hidden" id="pageup_key3" name="pageup_key3" value="${pageup_key3 }" />
<input type="hidden" id="pageup_key4" name="pageup_key4" value="${pageup_key4 }" />
<input type="hidden" id="pagedown_key1" name="pagedown_key1" value="${pagedown_key1 }" />
<input type="hidden" id="pagedown_key2" name="pagedown_key2" value="${pagedown_key2 }" />
<input type="hidden" id="pagedown_key3" name="pagedown_key3" value="${pagedown_key3 }" />
<input type="hidden" id="pagedown_key4" name="pagedown_key4" value="${pagedown_key4 }" />
<script>
function search(){
	/* $("#pagetype").val(1); */
	$("form").submit();
}
$(function() {
	$("a[name='page_first_page_ots']").click(function(){
		ROOF.Utils.showBlock();
		$("#pagetype").val('BEGIN');
		$("form").submit();
		ROOF.Utils.hideBlock();
		return false;
	});
	$("#pre_page_ots_li").click(function(){
		ROOF.Utils.showBlock();
		$("#pagetype").val('PAGEUP');
		$("form").submit();
		ROOF.Utils.hideBlock();
		return false;
	});
	$("#next_page_ots_li").click(function(){
		ROOF.Utils.showBlock();
		$("#pagetype").val('PAGEDOWN');
		$("form").submit();
		ROOF.Utils.hideBlock();
		return false;
	});
	$("a[name='page_end_page_ots']").click(function(){
		ROOF.Utils.showBlock();
		$("#pagetype").val('END');
		$("form").submit();
		ROOF.Utils.hideBlock();
		return false;
	});
});
</script>