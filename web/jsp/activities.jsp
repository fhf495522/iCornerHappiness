<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page pageEncoding="UTF-8"%>
<%@ page import="com.iCornerHappiness.processer.PSiteManager" %>
<%@ page import="com.iCornerHappiness.enumeration.EContent" %>
<section class="wrapper">
    <div class="inner">
        <header class="align-center">
            <h1>聯誼活動辦法</h1>
        </header>
        <div class="flex flex-2">
            <dl>
                <%--報名資格--%>
                <dt><h4><%=EContent.QUALIFICATION.getName()%></h4></dt>
                <dd>
                    須同時符合以下各項條件
                    <ol>
                        <c:forEach var="persist" items="<%=PSiteManager.getSiteContentList(EContent.QUALIFICATION)%>">
                            <li><c:out value="${persist.value}"/></li>
                        </c:forEach>
                    </ol>

                </dd>
                <dt><h4>聯誼種類與流程</h4></dt>
                <dd>
                    <h5>線上交友</h5>
                    <blockquote>適合較害羞，不喜歡參加多人聯誼活動之會員。</blockquote>
                    <div class="table-wrapper">
                        <table class="alt">
                            <thead>
                            <tr>
                                <th width="50px">流程</th>
                                <th width="100px">階段</th>
                                <th>活動辦法說明</th>
                                <th width="15%">備註</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>加入會員</td>
                                <td>線上填寫會員資料後線上預約面談，現場且由專人面談，審核通過後繳交面談費用NT$200元後加入會員。</td>
                                <td>面談地點原則上為台南火車站附近。</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>啟用系統</td>
                                <td>擇一使用本系統線上交友3個月或10則回覆留言功能，後續欲繼續使用則繳交NT$200元/次，可再使用3個月或10則留言回覆功能；NT$400元/次，可使用6個月或20則留言回覆功能，以此類推。</td>
                                <td>1.繳費方式詳預約面談與線上報名中說明。<br>
                                    2.選擇時限或則數方案後當次不可再變更。
                                </td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>尋找對象</td>
                                <td>
                                    (1)自行於本系統搜尋適合對象，可先以留言方式初步
                                    了解與溝通，以增加同意聊天機會或不經留言直接
                                    進行步驟(2)「我想認識你/妳」。(留言請勿留有連
                                    絡資訊並需經審核後發佈)。<br>
                                    (2)點「我想認識你/妳」後經對方同意可進行聊天互
                                    動。欲停止聊天，請明確告知對方並取消「我想認
                                    識你/妳」勾選，我們將發送訊息告知雙方。<br>
                                    	同時間最多可選擇認識3位異性朋友聊天互動。<br>
                                    	對方「同意」則提供Line聯絡方式給雙方。<br>
                                    	對方「不同意」則系統會發送通知，逾7天未回覆視同不同意。
                                </td>
                                <td>聊天互動階段請自行審慎評估是否提供電話號碼給對方或赴約見面需求。</td>
                            </tr>
                            <tr>
                                <td rowspan="2">4</td>
                                <td>交往</td>
                                <td>
                                    (1)	聊天互動感覺良好務必「擇一」交往。<br>
                                    (2)	雙方皆需知會我們欲與對方交往，我們將寄發雙方聯絡方式並關閉其檔案及停止會員搜尋功能，期間請專心交往。
                                </td>
                                <td>雙方決議交往時務必知會我們，詳注意事項10</td>
                            </tr>
                            <tr>
                                <td>再尋找</td>
                                <td>
                                    (1)	雙方決議不繼續交往，請雙方皆需知會我們不繼續與對方交往，我們將重新開啟雙方檔案及會員搜尋功能。<br>
                                    (2)	後續再回到流程3尋找適合對象或報名參加談話聯誼活動。
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>結婚</td>
                                <td>進入婚嫁階段請務必通知【i?轉角幸福】，並依自身經濟能力及心意餽贈媒人禮金。</td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <h5>談話聯誼</h5>
                    <blockquote>適合想穩定下來或以結婚為前提之會員，藉由多方面探討兩性話題、婚姻生活及親子議題，可於短時間了解雙方之價值觀，減少尋覓對象所產生的時間成本。方式詳下方聯誼流程中說明。</blockquote>
                    <div class="table-wrapper">
                        <table class="alt">
                            <thead>
                            <tr>
                                <th width="50px">流程</th>
                                <th width="100px">階段</th>
                                <th>活動辦法說明</th>
                                <th width="15%">備註</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr>
                                <td>1</td>
                                <td>加入會員</td>
                                <td>線上填寫會員資料後線上預約面談，現場且由專人面談，審核通過後繳交面談費用NT$200元後加入會員。</td>
                                <td>面談地點原則上為台南火車站附近。</td>
                            </tr>
                            <tr>
                                <td>2</td>
                                <td>報名深度聯誼活動</td>
                                <td>(1)線上報名參加深度聯誼活動。<br>
                                    (2)於確定活動成行3天內完成繳費，確認無誤後會寄送詳細活動流程及說明給大家。
                                </td>
                                <td>繳費方式詳預約面談與線上報名中說明</td>
                            </tr>
                            <tr>
                                <td>3</td>
                                <td>尋找對象</td>
                                <td>
                                    (1)	活動時間：依挑選時段分別為：上午時段09:00~12:00或下午時段14:00~17:00<br>
                                    (2)	活動地點：確認繳費後通知，原則上為台南東門城圓環附近(東門路長榮路交接口之東門城圓環)<br>
                                    (3)	活動人數：男女各10名(共20名)。<br>
                                    (4) 活動流程：<br>
                                    1. 聯誼伙伴介紹(由主持人介紹)<br>
                                    2. 話題討論(由主持人引導談話)<br>
                                    3. 自由聊天交流<br>
                                    4. 配對
                                </td>
                                <td>本聯誼活動多由主持人介紹及引導談話，過程輕鬆，無須過度緊張，僅需帶著一顆輕鬆愉快的心情準時參加我們所安排的活動即可。</td>
                            </tr>
                            <tr>
                                <td rowspan="2">4</td>
                                <td>交往</td>
                                <td>
                                    (1)	配對成功交往或活動後與同期參加之異性聊天互動，感覺良好務必「擇一」交往。<br>
                                    (2)	請雙方皆需告知我們欲與對方交往，我們將關閉其檔案，期間請專心交往(現場配對成功者將直接關閉檔案，無須再告知)。
                                </td>
                                <td>雙方決議交往時務必知會我們，詳注意事項10</td>
                            </tr>
                            <tr>
                                <td>再尋找</td>
                                <td>
                                    (1)	雙方決議不繼續交往，請雙方皆需告知我們不繼續交往，我們將重新開啟雙方檔案。<br>
                                    (2)	後續再回到流程2挑選合適梯次參加或報名線上交友活動。
                                </td>
                                <td></td>
                            </tr>
                            <tr>
                                <td>5</td>
                                <td>結婚</td>
                                <td>進入婚嫁階段請務必通知【i?轉角幸福】，並依自身經濟能力及心意餽贈媒人禮金。</td>
                                <td></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </dd>
            </dl>
        </div>
    </div>
</section>
