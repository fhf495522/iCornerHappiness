<%@ page pageEncoding="UTF-8"%>
<div class="inner">
    <form method="post" action="#">
        <div class="row uniform">
            <div class="4u$ 12u$(small)">
                <input type="email" name="email" id="email" value="" placeholder="身分證字號" />
            </div>
            <div class="4u$ 12u$(small)">
                <input type="password" name="password" id="password" value="" placeholder="密碼" />
            </div>
            <!-- Break -->
            <div class="12u$">
                <ul class="actions">
                    <li><input type="submit" value="登入" onclick="changePage('reserve')"/></li>
                    <li><input type="submit" value="忘記密碼"/></li>
                </ul>
            </div>
        </div>
    </form>
</div>
