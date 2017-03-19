<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%
    request.setCharacterEncoding("UTF-8");
    EContent content = EContent.valueOf(request.getParameter("content"));
    PSiteManager.addContent(content);
%>
<script>
    window.location='../bo/siteContent.jsp?content=<%=content%>';
</script>
