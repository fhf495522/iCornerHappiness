<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<!-- Section -->
<section class="wrapper">
    <div class="inner">
        <header class="align-center">
            <h1>最新消息</h1>
        </header>
        <div class="flex flex-2">
            <div class="col2">
                <%--創辦優惠--%>
                <h3><%=EContent.OFFER.getName()%></h3>
                <c:forEach var="offer" items="<%=PSiteManager.getSiteContentList(EContent.OFFER)%>">
                    <p><c:out value="${offer.value}"/></p>
                </c:forEach>
            </div>
        </div>
    </div>
</section>
