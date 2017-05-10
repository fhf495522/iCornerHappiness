<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.processer.PUserManager" %>
<%@ page import="com.iCornerHappiness.processer.PUserView" %>
<%
    request.setCharacterEncoding("UTF-8");
    PUserView pUserView = new PUserView();
    // todo ------  encode PUserView  ------
    pUserView.setUserName(request.getParameter("userName"));
    pUserView.setUserId(request.getParameter("userId"));

    



    // 呼叫後端新增user
    PUserManager.addUser(pUserView);
%>
<script>
//    window.location='';
</script>
