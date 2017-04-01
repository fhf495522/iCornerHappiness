<%@ page pageEncoding="UTF-8"%>
<div class="inner">
    <form method="post" action="#">
        <div class="row uniform">
            <div class="4u 12u$(small)">
                <input type="text" name="name" id="name" value="" placeholder="姓名" />
            </div>
            <div class="4u 12u$(small)">
                <input type="email" name="email" id="email" value="" placeholder="身分證字號" />
            </div>
            <div class="2u 12u$(small)">
                <input type="radio" id="female" name="priority" checked>
                <label for="female">女</label>
            </div>
            <div class="2u$ 12u$(small)">
                <input type="radio" id="male" name="priority">
                <label for="male">男</label>
            </div>
            <!-- Break -->
            <div class="4u 12u$(small)">
                <input type="tel" name="name" id="phone" value="" placeholder="住家電話" />
            </div>
            <div class="4u 12u$(small)">
                <input type="tel" name="email" id="mobile" value="" placeholder="手機號碼" />
            </div>
            <div class="1u 12u$(small)">
                出生年月日
            </div>
            <div class="3u$ 12u$(small)">
                <input type="date" name="name" id="birth" value="" placeholder="" />
            </div>
            <!-- Break -->
            <div class="12u$">
                <input type="text" name="email" id="home" value="" placeholder="戶籍地址" />
            </div>
            <div class="12u$">
                <input type="text" name="email" id="address" value="" placeholder="現居地址" />
            </div>
            <!-- Break -->
            <div class="3u 12u$(small)">
                <input type="number" name="name" id="height" value="" placeholder="身高" />
            </div>
            <div class="1u 12u$(small)">
                cm
            </div>
            <div class="3u 12u$(small)">
                <input type="number" name="email" id="weight" value="" placeholder="體重" />
            </div>
            <div class="1u 12u$(small)">
                kg
            </div>
            <div class="4u$ 12u$">
                <div class="select-wrapper">
                    <select name="category" id="category">
                        <option value="">- 血型 -</option>
                        <option value="1">A</option>
                        <option value="1">B</option>
                        <option value="1">AB</option>
                        <option value="1">O</option>
                        <option value="1">其他</option>
                    </select>
                </div>
            </div>
            <!-- Break -->
            <div class="1u 12u$(small)">
                吸菸
            </div>
            <div class="1u 12u$(small)">
                <input type="radio" id="cig_Y" name="priority">
                <label for="cig_Y">有</label>
            </div>
            <div class="2u 12u$(small)">
                <input type="radio" id="cig_N" name="priority">
                <label for="cig_N">無</label>
            </div>
            <div class="1u 12u$(small)">
                飲酒
            </div>
            <div class="1u 12u$(small)">
                <input type="radio" id="drink_Y" name="priority">
                <label for="drink_Y">有</label>
            </div>
            <div class="2u 12u$(small)">
                <input type="radio" id="drink_N" name="priority">
                <label for="drink_N">無</label>
            </div>
            <div class="1u 12u$(small)">
                飲食
            </div>
            <div class="1u 12u$(small)">
                <input type="radio" id="veg_N" name="priority">
                <label for="veg_Y">葷</label>
            </div>
            <div class="2u$ 12u$(small)">
                <input type="radio" id="veg_Y" name="priority">
                <label for="veg_Y">素</label>
            </div>
            <!-- Break -->
            <div class="3u 12u$(small)">
                <div class="select-wrapper">
                    <select name="star" id="star">
                        <option value="">- 星座 -</option>
                        <option value="1">水瓶</option>
                    </select>
                </div>
            </div>
            <div class="3u 12u$(small)">
                <div class="select-wrapper">
                    <select name="star" id="star">
                        <option value="">- 生肖 -</option>
                        <option value="1">鼠</option>
                    </select>
                </div>
            </div>
            <div class="3u$ 12u$">
                <input type="text" name="email" id="region" value="" placeholder="宗教" />
            </div>


            <!-- Break -->
            <div class="12u$">
                <textarea name="message" id="message" placeholder="其他說明" rows="6"></textarea>
            </div>
            <!-- Break -->
            <div class="12u$">
                <ul class="actions">
                    <li><input type="submit" value="儲存" onclick="changePage('reserve')" /></li>
                    <li><input type="reset" value="重填" class="alt" /></li>
                </ul>
            </div>
        </div>
    </form>
</div>
