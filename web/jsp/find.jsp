<%@ page pageEncoding="UTF-8"%>
<!-- Section -->
<section class="wrapper style1">
    <div class="inner">
        <header class="align-center">
            <h1>尋找甜蜜對象</h1>
            <!--<p>Cras sagittis turpis sit amet est tempus, sit amet consectetur purus tincidunt.</p>-->
        </header>
        <div class="12u$ 12u$(medium)" id="searchCondition">
            <form method="post" action="#">
                <div class="row uniform">
                    <div class="12u$">
                        <input type="text" name="name" id="name" value="" placeholder="會員編號" />
                    </div>
                    <div class="12u$">
                        <div class="select-wrapper">
                            <select name="category" id="photo">
                                <option value="1">-- 照片 --</option>
                                <option value="1">不拘</option>
                                <option value="1">有</option>
                                <option value="1">無</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="height1">
                                <option value="1">-- 身高(高於) --</option>
                                <option value="1">140</option>
                                <option value="1">150</option>
                                <option value="1">160</option>
                                <option value="1">170</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="height2">
                                <option value="1">-- 身高(低於) --</option>
                                <option value="1">140</option>
                                <option value="1">150</option>
                                <option value="1">160</option>
                                <option value="1">170</option>
                                <option value="1">不拘</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="weight1">
                                <option value="1">-- 體重(大於) --</option>
                                <option value="1">40</option>
                                <option value="1">50</option>
                                <option value="1">60</option>
                                <option value="1">70</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="weight2">
                                <option value="1">-- 身高(小於) --</option>
                                <option value="1">40</option>
                                <option value="1">50</option>
                                <option value="1">60</option>
                                <option value="1">70</option>
                                <option value="1">不拘</option>
                            </select>
                        </div>
                    </div>
                    <!--星座-->
                    <div class="12u$">
                        <input type="checkbox" id="star_all" name="copy">
                        <label for="star_all">星座不拘</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_2" name="copy">
                        <label for="star_2">摩羯座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_3" name="copy">
                        <label for="star_3">水瓶座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_5" name="copy">
                        <label for="star_5">雙魚座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_6" name="copy">
                        <label for="star_6">牡羊座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_7" name="copy">
                        <label for="star_7">金牛座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_8" name="copy">
                        <label for="star_8">雙子座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_9" name="copy">
                        <label for="star_9">巨蟹座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_10" name="copy">
                        <label for="star_10">獅子座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_11" name="copy">
                        <label for="star_11">處女座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_12" name="copy">
                        <label for="star_12">天秤座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_1" name="copy">
                        <label for="star_1">天蠍座</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="star_4" name="copy">
                        <label for="star_4">射手座</label>
                    </div>
                    <!--血型-->
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="blood_all" name="blood">
                        <label for="blood_all">血型不拘</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="blood_A" name="blood">
                        <label for="blood_A">A</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="blood_B" name="blood">
                        <label for="blood_B">B</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="blood_AB" name="blood">
                        <label for="blood_AB">AB</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="blood_O" name="blood">
                        <label for="blood_O">O</label>
                    </div>
                    <!-- 年齡 -->
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="age1">
                                <option value="1">-- 年齡(大於) --</option>
                                <option value="1">25</option>
                                <option value="1">26</option>
                                <option value="1">27</option>
                                <option value="1">28</option>
                                <option value="1">29</option>
                                <option value="1">30</option>
                                <option value="1">31</option>
                                <option value="1">32</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="category" id="age2">
                                <option value="1">-- 年齡(小於) --</option>
                                <option value="1">25</option>
                                <option value="1">26</option>
                                <option value="1">27</option>
                                <option value="1">28</option>
                                <option value="1">29</option>
                                <option value="1">30</option>
                                <option value="1">31</option>
                                <option value="1">32</option>
                                <option value="1">不拘</option>
                            </select>
                        </div>
                    </div>
                    <!--生肖-->
                    <div class="12u$">
                        <input type="checkbox" id="zodiac_all" name="copy">
                        <label for="zodiac_all">生肖不拘</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_2" name="copy">
                        <label for="zodiac_2">鼠</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_3" name="copy">
                        <label for="zodiac_3">牛</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_5" name="copy">
                        <label for="zodiac_5">虎</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_6" name="copy">
                        <label for="zodiac_6">兔</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_7" name="copy">
                        <label for="zodiac_7">龍</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_8" name="copy">
                        <label for="zodiac_8">蛇</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_9" name="copy">
                        <label for="zodiac_9">馬</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_10" name="copy">
                        <label for="zodiac_10">羊</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_11" name="copy">
                        <label for="zodiac_11">猴</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_12" name="copy">
                        <label for="zodiac_12">雞</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_1" name="copy">
                        <label for="zodiac_1">狗</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="zodiac_4" name="copy">
                        <label for="zodiac_4">豬</label>
                    </div>
                    <!--學歷-->
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="edu_all" name="edu">
                        <label for="edu_all">學歷不拘</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="edu_1" name="edu">
                        <label for="edu_1">專科</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="edu_2" name="edu">
                        <label for="edu_2">大學</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="edu_3" name="edu">
                        <label for="edu_3">碩士</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="edu_4" name="edu">
                        <label for="edu_4">博士</label>
                    </div>

                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="live" id="live">
                                <option value="1">-- 現居地 --</option>
                                <option value="1">不拘</option>
                                <option value="1">基隆市</option>
                                <option value="1">台北市</option>
                                <option value="1">新北市</option>
                                <option value="1">桃園市</option>
                                <option value="1">新竹縣市</option>
                                <option value="1">苗栗縣</option>
                                <option value="1">台中市</option>
                                <option value="1">彰化縣</option>
                                <option value="1">雲林縣</option>
                                <option value="1">嘉義縣市</option>
                                <option value="1">台南市</option>
                                <option value="1">高雄市</option>
                                <option value="1">屏東縣</option>
                                <option value="1">宜蘭縣</option>
                                <option value="1">花蓮縣</option>
                                <option value="1">台東縣</option>
                                <option value="1">澎湖縣</option>
                            </select>
                        </div>
                    </div>
                    <div class="6u 12u$(xsmall)">
                        <div class="select-wrapper">
                            <select name="work" id="work">
                                <option value="1">-- 工作地 --</option>
                                <option value="1">不拘</option>
                                <option value="1">基隆市</option>
                                <option value="1">台北市</option>
                                <option value="1">新北市</option>
                                <option value="1">桃園市</option>
                                <option value="1">新竹縣市</option>
                                <option value="1">苗栗縣</option>
                                <option value="1">台中市</option>
                                <option value="1">彰化縣</option>
                                <option value="1">雲林縣</option>
                                <option value="1">嘉義縣市</option>
                                <option value="1">台南市</option>
                                <option value="1">高雄市</option>
                                <option value="1">屏東縣</option>
                                <option value="1">宜蘭縣</option>
                                <option value="1">花蓮縣</option>
                                <option value="1">台東縣</option>
                                <option value="1">澎湖縣</option>
                            </select>
                        </div>
                    </div>

                    <!--職業-->
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_all" name="career">
                        <label for="career_all">職業不拘</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_1" name="career">
                        <label for="career_1">政府機關</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_2" name="career">
                        <label for="career_2">國營/國辦民營</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_3" name="career">
                        <label for="career_3">軍人</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_4" name="career">
                        <label for="career_4">警察</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_5" name="career">
                        <label for="career_5">教育/研究</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_6" name="career">
                        <label for="career_6">經商</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_7" name="career">
                        <label for="career_7">建築/營造</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_8" name="career">
                        <label for="career_8">金融/保險</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_9" name="career">
                        <label for="career_9">製造供應商</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_10" name="career">
                        <label for="career_10">房地產</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_11" name="career">
                        <label for="career_11">資訊科技</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_12" name="career">
                        <label for="career_12">服務</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_13" name="career">
                        <label for="career_13">農漁牧</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_14" name="career">
                        <label for="career_14">醫療/保健</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_15" name="career">
                        <label for="career_15">法律</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_16" name="career">
                        <label for="career_16">零售流通</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_17" name="career">
                        <label for="career_17">交通/運輸</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_18" name="career">
                        <label for="career_18">旅遊</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_20" name="career">
                        <label for="career_20">傳媒娛樂</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_19" name="career">
                        <label for="career_19">出版</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_22" name="career">
                        <label for="career_22">藝術</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_21" name="career">
                        <label for="career_21">行銷/企劃</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_23" name="career">
                        <label for="career_23">學生</label>
                    </div>
                    <div class="2u 12u$(small)">
                        <input type="checkbox" id="career_24" name="career">
                        <label for="career_24">待業</label>
                    </div>
                    <div class="4u 12u$(small)">
                        <input type="text" name="name" id="career_key" value="" placeholder="其他職業關鍵字" />
                    </div>


                    <div class="12u$">
                        <ul class="actions">
                            <li><input type="button" value="尋找" onclick="hideCondition()" /></li>
                            <li><input type="reset" value="清除" class="alt" /></li>
                        </ul>
                    </div>
                </div>
            </form>
        </div>
        <!--<p>Curabitur venenatis lorem ut finibus finibus. Ut quis eleifend libero, nec ultricies metus. Morbi magna risus, congue sit amet pellentesque eget, malesuada ut justo. Sed ac pretium quam. Ut vel ex vitae enim sagittis posuere ac id erat. Vestibulum vel ullamcorper tellus. Donec sapien massa, venenatis ac felis vel, vestibulum sagittis enim. Maecenas ut egestas lorem, nec luctus ligula. Vestibulum neque diam, aliquet non enim a, cursus lacinia metus. Aenean fringilla luctus rhoncus. Integer vulputate massa ac suscipit venenatis. Integer luctus elit non nulla fringilla, ullamcorper maximus sem congue. Integer tristique eu nisi nec fermentum. Ut malesuada quis massa at ultricies.</p>-->
        <!--<p>Donec molestie tellus eu tincidunt dignissim. Sed sollicitudin bibendum ultricies. Vivamus tristique justo lacinia dui tempus consequat. Sed hendrerit justo in nisl auctor, id rutrum tortor congue. Vivamus mattis nibh et sem rutrum, vel viverra purus viverra. Donec et justo at orci euismod hendrerit vel vel neque. Donec gravida ipsum in augue volutpat laoreet. Ut lobortis turpis sit amet sodales ultrices.</p>-->
    </div>
</section>
<!-- search List -->
<section class="wrapper style2">
    <div class="inner">
        <div class="table-wrapper">
            <table class="alt">
                <tbody>
                <tr>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                </tr>
                <tr>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                </tr>
                <tr>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                </tr>
                <tr>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                    <td>
                        <span class="image left"><img src="images/pic02.jpg" alt="" /></span>
                        姜泰安&nbsp;男 &nbsp; 30 <br>
                        180cm &nbsp; 60kg &nbsp; 摩羯座 &nbsp; A<br>
                        碩士 &nbsp; 現居:台南 &nbsp; 交通/運輸 &nbsp; 工作:高雄
                    </td>
                </tr>
            </table>
        </div>
    </div>
</section>

<script>
    function hideCondition() {
        $('#searchCondition').hide();

    }
</script>