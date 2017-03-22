<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<%@ page import="com.iCornerHappiness.processer.PSiteContentView" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%@ page import="com.iCornerHappiness.commons.CValidateTools" %>
<script type="text/javascript" src="../assets/js/jquery.min.js"></script>
<%
    EContent content = CValidateTools.isBlankOrNull(request.getParameter("content"))?EContent.FOUNDER:EContent.valueOf(request.getParameter("content"));
    ArrayList<PSiteContentView> list = PSiteManager.getSiteContentList(content);
%>
<c:set var="content" value="<%=content%>" />
<c:set var="list" value="<%=list%>" />
<html>
<head>
    <title>網站內容設定</title>
</head>
<body>
<h1>Site Content Management</h1>
<select onchange="changeContent(this.value)">
    <c:forEach var="contentOption" items="<%=EContent.values()%>">
        <option value='<c:out value="${contentOption}"/>' <c:if test="${contentOption==content}">selected</c:if>>
            <c:out value="${contentOption.name}"/>
        </option>
    </c:forEach>
</select>
<br>
<h2>
    類型:<c:out value="${content.contentType.name}"/>
    <input type="button" value="新增" onclick="addContent()">
</h2>
<form id="form" action="../action/saveContent.jsp" method="POST">
    <input type="hidden" name='content' value='<c:out value="${content}"/>'>
    <c:if test="${content.contentType=='PARAGRAPH'}">
        <c:forEach var="view" items="${list}">
            <input type="hidden" name='content_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.content}"/>'>
            <input type="hidden" name='contentOrder' value='<c:out value="${view.contentOrder}"/>'>
            <input type="hidden" name='title_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.title}"/>'>
            <input type="button" value="刪除" onclick="deleteContent('<c:out value="${view.contentOrder}"/>')"><br>
            <textarea name='value_<c:out value="${view.contentOrder}"/>' rows="6" cols="80" title="content"><c:out value="${view.value}"/></textarea>
            <br>
        </c:forEach>
    </c:if>
    <c:if test="${content.contentType=='ORDERED'}">
        <ol>
            <c:forEach var="view" items="${list}">
                <li>
                    <input type="hidden" name='content_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.content}"/>'>
                    <input type="hidden" name='contentOrder' value='<c:out value="${view.contentOrder}"/>'>
                    <input type="text" name='title_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.title}"/>'>
                    <input type="button" value="刪除" onclick="deleteContent('<c:out value="${view.contentOrder}"/>')"><br>
                    <textarea name='value_<c:out value="${view.contentOrder}"/>' rows="2" cols="100" title="content"><c:out value="${view.value}"/></textarea>
                    <textarea name='memo_<c:out value="${view.contentOrder}"/>' rows="2" cols="100" title="memo"><c:out value="${view.memo}"/></textarea>
                </li>
            </c:forEach>
        </ol>
    </c:if>
    <c:if test="${content.contentType=='UNORDERED'}">
        <ul>
            <c:forEach var="view" items="${list}">
                <li>
                    <input type="hidden" name='content_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.content}"/>'>
                    <input type="hidden" name='contentOrder' value='<c:out value="${view.contentOrder}"/>'>
                    <input type="text" name='title_<c:out value="${view.contentOrder}"/>' value='<c:out value="${view.title}"/>'>
                    <input type="button" value="刪除" onclick="deleteContent('<c:out value="${view.contentOrder}"/>')"><br>
                    <textarea name='value_<c:out value="${view.contentOrder}"/>' rows="2" cols="100" title="content"><c:out value="${view.value}"/></textarea>
                </li>
            </c:forEach>
        </ul>
    </c:if>
    <br>
    <input type="submit" value="儲存">
</form>
</body>
<script>
    function changeContent(content){
        window.location = "siteContent.jsp?content="+content;
    }

    function deleteContent(contentOrder){
        window.location = "../action/deleteContent.jsp?content=<c:out value="${content}"/>&contentOrder="+contentOrder;
    }

    function addContent(content){
        window.location = "../action/addContent.jsp?content=<c:out value="${content}"/>";
    }
</script>
</html>
