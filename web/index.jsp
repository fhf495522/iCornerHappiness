<%@page pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>iの轉角幸福&nbsp;&nbsp;i&nbsp;の&nbsp;Corner of happiness - Urban by TEMPLATED</title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <link rel="stylesheet" href="assets/css/main.css"/>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery.scrolly.min.js"></script>
    <script src="assets/js/jquery.scrollex.min.js"></script>
    <script src="assets/js/skel.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>
</head>
<body class="subpage">

<!-- Header -->
<header id="header">
    <div class="logo"><a href="#" onclick="changePage('about')">iの轉角幸福&nbsp;<span>i&nbsp;の&nbsp;Corner of happiness</span></a></div>
    <a href="#menu">Menu</a>
</header>

<!-- Nav -->
<nav id="menu">
    <ul class="links">
        <li><a href="#" onclick="changePage('about')">關於我們</a></li>
        <li><a href="#" onclick="changePage('news')">最新消息</a></li>
        <li><a href="#" onclick="changePage('activities')">聯誼活動辦法</a></li>
        <li><a href="#" onclick="changePage('find')">尋找甜蜜對象</a></li>
        <li><a href="#" onclick="changePage('reserve_n')">預約面談與線上報名</a></li>
        <li><a href="#" onclick="changePage('notice')">注意事項</a></li>
        <li><a href="#" onclick="changePage('bulletin')">公告消息</a></li>
        <li><a href="#" onclick="changePage('contact')">聯絡我們</a></li>
        <li><a href="#" onclick="changePage('couple')">牽手良緣錄</a></li>
    </ul>
</nav>

<!-- Banner -->
<div id="aboutBanner"></div>

<!-- Main -->
<div id="main"></div>

<!-- Footer -->
<footer id="footer">
    <div class="copyright">
        <!--<ul class="icons">-->
        <!--<li><a href="#" class="icon fa-twitter"><span class="label">Twitter</span></a></li>-->
        <!--<li><a href="#" class="icon fa-facebook"><span class="label">Facebook</span></a></li>-->
        <!--<li><a href="#" class="icon fa-instagram"><span class="label">Instagram</span></a></li>-->
        <!--<li><a href="#" class="icon fa-snapchat"><span class="label">Snapchat</span></a></li>-->
        <!--</ul>-->
        <p>&copy; Untitled. All rights reserved. Design: <a href="https://templated.co">TEMPLATED</a>. Images: <a
                href="https://unsplash.com">Unsplash</a>.</p>
    </div>
</footer>

</body>
<script>
    $(document).ready(function () {
        changePage("reserve_n")
    });

    function changePage(fileName){
        if(fileName == "about"){
            $("#aboutBanner").load("jsp/banner.jsp");
        } else{
            $("#aboutBanner").html("");
        }

        $("#main").load("jsp/" + fileName+".jsp");

        $("#menu").removeClass("visible");

    }
</script>
</html>