<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>코로나19 예방접종 사전예약 시스템</title>
<link href="${pageContext.request.contextPath }/resources/css/reset.css" rel="stylesheet">
<link href="${pageContext.request.contextPath }/resources/css/naverAuth.css" rel="stylesheet">
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
					<h1>네이버 인증</h1>
				</div>
				<div id="main-box">
					<div>네이버 인증을 진행해 주세요.</div>
					<br>
					<div>네이버 로그인 후 보유하신 휴대폰의 네이버 앱에서 인증을 완료할 수 있습니다.</div>
					
					<form action="naverAuth.do" method="post">
						<input type="submit" value="인증 요청">
					</form>
				</div>
			</div>
			<div>
				<div>
				
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