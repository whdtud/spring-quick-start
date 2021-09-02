<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나19 예방접종 사전예약 시스템</title>
<link href="${pageContext.request.contextPath }/resources/css/reset.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/resources/css/landing.css" rel="stylesheet">
<script src="${pageContext.request.contextPath }/resources/js/landing.js"></script>
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
				<div>
					<h1>
						본인 인증 방법을 선택하고 인증을 진행해 주세요.<br/>
						인증 방법별로 대기 시간이 다를 수 있습니다.
					</h1>
				</div>
				<div>
					<div>
						인증 대기 신호등
					</div>
					<div>
						<ul>
							<li><div class="circle" style="background-color: green;"></div>원활</li>
							<li><div class="circle" style="background-color: orange;"></div>지연</li>
							<li><div class="circle" style="background-color: red;"></div>혼잡</li>
							<li><div class="circle" style="background-color: gray;"></div>선택불가</li>
						</ul>
					</div>
				</div>
				<div>
					<h1>본인 인증 방법별 인증 대기 신호등을 확인하고 선택하세요.</h1>
					<form id="identification-form">
						<ul>
							<li><input type="radio" name="chk-info" id="naver" value="naver">네이버 인증서</li>
							<li><input type="radio" name="chk-info" id="kakao" value="kakao">카카오 인증</li>
							<li><input type="radio" name="chk-info" id="pass" value="pass">PASS 인증서</li>
							<li><input type="radio" name="chk-info" id="bank" value="bank">공동/금융인증서</li>
							<li><input type="radio" name="chk-info" id="phone" value="phone">휴대폰 인증</li>
						</ul>
					</form>
				</div>
				<div>
					<input type="button" value="본인인증 바로가기" onclick="onClickSubmit()">
				</div>
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