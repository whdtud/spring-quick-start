<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Home</title>
<link href="${pageContext.request.contextPath }/resources/css/home.css?11" rel="stylesheet">
</head>
<body>
	<div class="container">
        <header id="header">
        	<div class="content-box">
        		<div id="header-left">
        			<h1>질병관리청</h1>
        		</div>
        		<div id="header-right">
        			<div>
        				코로나바이러스감염증-19 | COVID-19 <br/>
        				<b style="font-size: 25px;">코로나19 예방접종 사전예약 시스템</b>
        			</div>
        		</div>
        	</div>
        </header>
        <main id="main">
        	<div class="content-box">
        		<div id="main-box">
	        		<section>
	        			<h1>코로나19 사전예약 및 접종기간 안내</h1>
	        		</section>
	        		<hr/>
	        		<div>
		        		<section>
		        			<h1>&lt;18~49세 예방접종 대상자&gt;</h1>
			        		<ul>
			        			<li>(접종대상) 18~49세(주민등록상 ‘72.1.1. ~’03.12.31. 출생)</li>
			        			<li>(백신종류) mRNA 백신(화이자 또는 모더나)</li>
			        			<li>(접종장소) 위탁의료기관, 예방접종센터</li>
			        			<li>※ 건강보험 미가입자의 경우 예방접종센터만 가능</li>
			        			<li>(추가예약기간) 18~49세 연령층 대상으로 9월18일(토) 18시까지</li>
			        			<li>(접종기간) 8.26.(목) ~ 10.2.(토) (2차 접종은 6주 뒤)</li>
			        		</ul>
		        		</section>
		        		<section>
		        			<h1>&lt;발달장애인·장애인 직업재활시설 이용자 등&gt;</h1>
			        		<ul>
			        			<li>(예약기간) 8.5.(목) 20시 ~ 9.18.(토) 18시까지</li>
			        			<li>(접종기간/백신) 8.26(목)~10.2.(토)</li>
			        		</ul>
		        		</section>
	        		</div>
        		</div>
        		<form action="/" method="post">
        			<input type="checkbox" name="identification">접종자 본인 또는 대리인임을 확인합니다.
        			<div>
        				<input type="submit" value="확인">
        			</div>
        		</form>
        	</div>
        </main>
        <footer id="footer">
        	<div class="content-box">
	        	<section>
		       		<h1>코로나 백신 접종 예약 시스템</h1>
					<dl>
						<dt>주소:</dt>
						<dd>경기도 하남시 풍산동 세미로 1길 10</dd>
						<dt>COPYRIGHT</dt>
						<dd>© 2021 질병관리청 ALL RIGHTS RESERVED.</dd>
					</dl>
		       	</section>
        	</div>
        </footer>
    </div>
</body>
</html>
