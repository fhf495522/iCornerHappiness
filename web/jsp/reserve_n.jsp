<section class="wrapper style1">
    <div class="inner">
        <header class="align-center">
            <h1>預約面談與線上報名</h1>
            <P>請務必先填妥基本資料後再進行預約面談。<br>預約面談及報名前務必先閱讀本站注意事項。</P>
        </header>
        <div class="12u$ 12u$(medium)">
            <ul class="actions fit small">
                <li><a href="#" onclick="$('.toggleBtn').addClass('alt'); $(this).removeClass('alt');changeInnerPage('login')" class="toggleBtn button fit small">登入會員</a></li>
                <li><a href="#" onclick="$('.toggleBtn').addClass('alt'); $(this).removeClass('alt');changeInnerPage('addUser')" class="toggleBtn button fit small alt">加入會員</a></li>
            </ul>
        </div>
    </div>
</section>

<section id="innerSection" class="wrapper style1"></section>
<script>
    $(document).ready(function () {
        changeInnerPage("login")
    });

    function changeInnerPage(fileName){
        $("#innerSection").load("jsp/" + fileName+".jsp");
    }
</script>