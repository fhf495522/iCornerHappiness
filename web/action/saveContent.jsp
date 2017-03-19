<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.processer.PSiteContentView" %>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%
    request.setCharacterEncoding("UTF-8");
    String content = request.getParameter("content");
    String[] contentOrders = request.getParameterValues("contentOrder");
    ArrayList list = new ArrayList();
    for(String contentOrder:contentOrders){
        PSiteContentView view = new PSiteContentView();
        view.setContent(EContent.valueOf(request.getParameter("content_" + contentOrder)));
        view.setContentOrder(Integer.valueOf(contentOrder));
        view.setTitle(request.getParameter("title_" + contentOrder));
        view.setValue(request.getParameter("value_" + contentOrder));
        list.add(view);
    }
    PSiteManager.setSiteContentList(list);
%>
<script>
    window.location='../bo/siteContent.jsp?content=<%=content%>';
</script>
