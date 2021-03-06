<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- 	//import="member.model.vo.Member"   -->
<%
//로그인 확인을 위해서 내장된 session 객체를 이용
//Member loginMember = (Member)session.getAttribute("loginMember");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<title>topp</title>
<style type="text/css">
#topping_wrap1 {
	width: 100%;
}

#topping_header {
	width: 100%;
}

.main_menu {
	border-bottom: 1px solid black;
}

.main_menu_w1230 {
	width: 1230px;
	height: 75px;
	margin: 0 auto;
	clear: both;
}

#headerLogo img {
	width: 220px;
	height: 60px;
	margin-top: 4px;
	float: left;
}

#serviceLogo img {
	float: right;
	margin-top: 12px;
}

#loginLogo img {
	float: right;
	margin-top: 12px;
	margin-right: 5px;
}

.menubar {
	width: 740px;
	line-height: 75px;
	text-align: center;
	margin: 0 auto;
	float: left;
}

.menubar li {
	list-style: none;
	display: inline-block;
	margin-right: 45px;
}

.middle_area {
	display: block;
	margin: 0;
	padding: 0;
}

.menuLink {
	color: black;
}
</style>
</head>
<body>

	<div id="topping_wrap1">
		<div id="topping_header">
			<div class="main_menu">
				<div class="main_menu_w1230">
					<div>
						<a href="/topp/index.jsp" id="headerLogo"> <img
							src="/topp/resources/images/toppingLogo.png">
						</a>
					</div>
					<div class="middle_area">

						<ul class="menubar">
							<li><a class="menuLink" href="/topp/views/trip/tripView.jsp">여행정보 검색</a></li>
							<li><a class="menuLink" href="#">여행일기</a></li>
							<li><a class="menuLink" href="#">트립박스</a></li>
							<li><a class="menuLink" href="#">마이페이지</a></li>
							<li><a class="menuLink" href="#">커뮤니티</a></li>
						</ul>

						<div>
							<a href="/topp/index.jsp" id="serviceLogo"> <img
								src="/topp/resources/images/toppingService.png">
							</a>
						</div>

						<div>
							<a href="/topp/index.jsp" id="loginLogo"> <img
								src="/topp/resources/images/toppingLogin.png">
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>






