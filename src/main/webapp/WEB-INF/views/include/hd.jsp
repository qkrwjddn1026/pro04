<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri = "http://java.sun.com/jsp/jstl/functions"%>
<c:set var="path1" value="${pageContext.request.contextPath }" />
<div class="top-bar">
  <div class="top-bar-left">
    <ul class="menu">
      <li class="menu-text">????Site</li>
      <li><a href="${path1 }/member/list.do">회원</a></li>
      <li><a href="${path1 }/board/list.do">게시판</a></li>
    </ul>
  </div>
  <div class="top-bar-right">
    <ul class="menu">
      <li><a href="#">Three</a></li>
      <li><a href="#">Four</a></li>
      <li><a href="#">Five</a></li>
      <li><a href="#">Six</a></li>
    </ul>
  </div>
</div>