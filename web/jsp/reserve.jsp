<section class="wrapper style1">
    <div class="inner">
        <header class="align-center">
            <h1>預約面談與線上報名</h1>
            <P>請務必先填妥基本資料後再進行預約面談。<br>預約面談及報名前務必先閱讀本站注意事項。</P>

            <!--<p>Cras sagittis turpis sit amet est tempus, sit amet consectetur purus tincidunt.</p>-->
        </header>
        <div class="12u$ 12u$(medium)">
            <ul class="actions fit small">
                <li><a href="#" onclick="$('.toggleBtn').addClass('alt'); $(this).removeClass('alt');changeInnerPage('addUser')" class="toggleBtn button fit small">修改基本資料</a></li>
                <li><a href="#" onclick="$('.toggleBtn').addClass('alt'); $(this).removeClass('alt');changeInnerPage('meeting')" class="toggleBtn button alt fit small">預約面談</a></li>
                <li><a href="#" onclick="$('.toggleBtn').addClass('alt'); $(this).removeClass('alt');changeInnerPage('online')" class="toggleBtn button alt fit small">線上報名</a></li>
            </ul>
        </div>
    </div>
</section>

<section id="innerSection" class="wrapper style1"></section>
<script>
    $(document).ready(function () {
        changeInnerPage("addUser")
    });

    function changeInnerPage(fileName){
        $("#innerSection").load("jsp/" + fileName+".html");
    }
</script>