<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<section class="wrapper style1">
    <div class="inner">
        <!-- 2 Columns -->
        <div class="flex flex-2">
            <div class="col col1">
                <div class="image round fit">
                    <a href="news.jsp" class="link"><img src="images/pic01.jpg" alt=""/></a>
                </div>
            </div>
            <div class="col col2">
                <%--創辦人的話--%>
                <h3><%=EContent.FOUNDER.getName()%></h3>
                <c:forEach var="founder" items="<%=PSiteManager.getSiteContentList(EContent.FOUNDER)%>">
                    <p><c:out value="${founder.value}"/></p>
                </c:forEach>
            </div>
        </div>
    </div>
</section>

<!-- Section -->
<section class="wrapper style2">
    <div class="inner">
        <div class="flex flex-2">
            <div class="col col2">
                <%--我們的堅持--%>
                <h3><%=EContent.PERSIST.getName()%></h3>
                <p>
                <ol>
                    <c:forEach var="persist" items="<%=PSiteManager.getSiteContentList(EContent.PERSIST)%>">
                        <li><c:out value="${persist.title}"/><br><c:out value="${persist.value}"/></li>
                    </c:forEach>
                </ol>
            </div>
            <div class="col col1 first">
                <div class="image round fit">
                    <a href="#" class="link"><img src="images/pic02.jpg" alt=""/></a>
                </div>
            </div>
        </div>
    </div>
</section>
<!-- Section -->
<section class="wrapper style1">
    <div class="inner">
        <!-- 2 Columns -->
        <div class="flex flex-2">
            <div class="col col1">
                <div class="image round fit">
                    <a href="#" class="link"><img src="images/pic01.jpg" alt=""/></a>
                </div>
            </div>
            <div class="col col2">
                <%--大事記--%>
                <h3><%=EContent.MILESTONE.getName()%></h3>
                <p>
                <ul class="alt">
                    <c:forEach var="mileStone" items="<%=PSiteManager.getSiteContentList(EContent.MILESTONE)%>">
                        <li><c:out value="${mileStone.title}"/>&#9;<c:out value="${mileStone.value}"/></li>
                    </c:forEach>
                </ul>
            </div>
        </div>
    </div>
</section>