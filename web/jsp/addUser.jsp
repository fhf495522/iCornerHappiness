<%@ page import="com.iCornerHappiness.enumeration.EZodiac" %>
<%@ page import="com.iCornerHappiness.enumeration.EAstrological" %>
<%@ page import="com.iCornerHappiness.enumeration.EReligion" %>
<%@ page import="com.iCornerHappiness.enumeration.EEducation" %>
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
                <input type="radio" id="male" name="priority" checked>
                <label for="male">男</label>
            </div>
            <div class="2u$ 12u$(small)">
                <input type="radio" id="female" name="priority">
                <label for="female">女</label>
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
                公分 (cm)
            </div>
            <div class="3u 12u$(small)">
                <input type="number" name="email" id="weight" value="" placeholder="體重" />
            </div>
            <div class="1u 12u$(small)">
                公斤 (kg)
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
                <input type="radio" id="cig_Y" name="smk">
                <label for="cig_Y">有</label>
            </div>
            <div class="2u 12u$(small)">
                <input type="radio" id="cig_N" name="smk">
                <label for="cig_N">無</label>
            </div>
            <div class="1u 12u$(small)">
                飲酒
            </div>
            <div class="1u 12u$(small)">
                <input type="radio" id="drink_Y" name="drk">
                <label for="drink_Y">有</label>
            </div>
            <div class="2u 12u$(small)">
                <input type="radio" id="drink_N" name="drk">
                <label for="drink_N">無</label>
            </div>
            <div class="1u 12u$(small)">
                飲食
            </div>
            <div class="1u 12u$(small)">
                <input type="radio" id="veg_N" name="veg">
                <label for="veg_N">葷</label>
            </div>
            <div class="2u$ 12u$(small)">
                <input type="radio" id="veg_Y" name="veg">
                <label for="veg_Y">素</label>
            </div>
            <!-- Break -->
            <div class="2u 12u$(small)">
                <div class="select-wrapper">
                    <select name="star" id="star">
                        <option value="">- 生肖 -</option>
                        <option value="1"><%=EZodiac.Zodiac1.getName()%></option>
                    </select>
                </div>
            </div>
            <div class="2u 12u">
                <div class="select-wrapper">
                    <select name="religion">
                        <option value="">- 宗教 -</option>
                        <option value="<%=EReligion.Religion3%>"><%=EReligion.Religion3.getName()%></option>
                        <option value="<%=EReligion.Religion2%>"><%=EReligion.Religion2.getName()%></option>
                        <option value="<%=EReligion.Religion1%>"><%=EReligion.Religion1.getName()%></option>
                        <option value="<%=EReligion.Religion4%>"><%=EReligion.Religion4.getName()%></option>
                        <option value="<%=EReligion.Religion5%>"><%=EReligion.Religion5.getName()%></option>
                        <option value="<%=EReligion.Religion9%>"><%=EReligion.Religion9.getName()%></option>
                    </select>
            </div>
            </div>
            <div class="2u 12u">
                <div class="select-wrapper">
                    <select nmame="edu">
                        <option value="">- 最高學歷 -</option>
                        <option value="<%=EEducation.Education4%>"><%=EEducation.Education4.getName()%>
                        </option>
                        <option value="<%=EEducation.Education3%>"><%=EEducation.Education3.getName()%>
                        </option>
                        <option value="<%=EEducation.Education2%>"><%=EEducation.Education2.getName()%>
                        </option>
                        <option value="<%=EEducation.Education1%>"><%=EEducation.Education1.getName()%>
                        </option>
                    </select>
                </div>
            </div>
            <div class="3u 12u">
                <input type="text" name="school" id="school" value="" placeholder="學校名稱"/>
            </div>
            <div class="3u 12u">
                <input type="text" name="major" id="major" value="" placeholder="系所名稱"/>
            </div>
            <div class="3u 12u">
                <input type="text" name="ocu" id="ocu" value="" placeholder="職業類別">
            </div>
            <div class="3u 12u">
                <input type="text" name="workplace" id="workplace" value="" placeholder="工作地">
            </div>
            <div class="3u 12u">
                <input type="text" name="company" id="company" placeholder="服務機關">
            </div>
            <div class="3u$ 12u$">
                <input type="text" name="jobtitle" id="jobtitle" placeholder="職稱">
            </div>
            <div class="2u 12u">
                與公婆同住
            </div>
            <div class="1u 12u">
                <input type="radio" id="liveto_Y" name="liveto">
                <label for="liveto_Y">可</label>
            </div>
            <div class="1u 12u">
                <input type="radio" id="liveto_N" name="liveto">
                <label for="liveto_N">否</label>
            </div>
            <div class="2u 12u">
                <input type="text" name="line" id="line" placeholder="line">
            </div>
            <div class="6u$ 12u">
                <input type="email" name="email" id="emailAddUser" placeholder="email">
            </div>
            <!-- Break -->
            <div class="6u 12u">
                <textarea name="hobby" id="hobby" placeholder="自身興趣" rows="3"></textarea>
            </div>
            <div class="6u$ 12u$">
                <textarea name="personality" id="personality" placeholder="自身個性" rows="3"></textarea>
            </div>
            <div class="6u 12u">
                <textarea name="pro" id="pro" placeholder="自身優點" rows="3"></textarea>
            </div>



            <!-- Break -->
            <div class="12u$">
                <div class="12u$">
                <!textarea name="message" id="message" placeholder="其他說明" rows="6"></textarea>
            </div>
            <!-- Break -->
            <div class="12u$">
                <ul class="actions">
                    <li><!input type="submit" value="儲存" onclick="changePage('reserve')" /></li>
                    <li><!input type="reset" value="重填" class="alt" /></li>
                </ul>
            </div>
        </div>
    </form>
</div>


