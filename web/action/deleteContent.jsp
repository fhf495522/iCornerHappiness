<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%
    request.setCharacterEncoding("UTF-8");
    EContent content = EContent.valueOf(request.getParameter("content"));
    int contentOrder = Integer.valueOf(request.getParameter("contentOrder"));
    PSiteManager.deleteContent(content, contentOrder);
%>
<script>
    window.location='../bo/siteContent.jsp?content=<%=content%>';
</script>
