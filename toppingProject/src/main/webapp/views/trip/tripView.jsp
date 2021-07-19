<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">
<title>topp</title>
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300&display=swap')
	;

* {
	font-family: 'Noto Sans KR', sans-serif;
}

#wrap {
	width: fit-content;
	min-width: 1230px;
	margin: 0 auto;
}

.search_header {
	text-align: center;
	margin-top: 60px;
	margin-bottom: 50px;
}

.searchBar {
	display: inline-block;
	margin-top: 40px;
	margin-bottom: 20px;
	border: 1px solid LightCoral;
	border-radius: 5px;
}

input:focus {
	outline: none;
}

.btn_search_submit {
	color: white;
	background-color: LightCoral;
	border: 0;
}

label {
	display: inline-block;
	width: 80px;
	line-height: 25px;
}

.searchView {
	display: inline-block;
	margin: auto;
	margin-top: 40px;
}

.bx {
	list-style: none;
}

.blog_main {
	margin-left: 30px;
	float: left;
	width: 580px;
}

.trip_list_total {
	padding: 0;
}

.trip_main {
	margin-left: 30px;
	width: 500px;
	float: left;
	border-left: solid 1px black;
}

.blog_thumb {
	width: 135px;
	margin-right: 10px;
	border-bottom-left-radius: 5px;
	border-bottom-right-radius: 5px;
	border-top-left-radius: 5px;
	border-top-right-radius: 5px;
}

.trip_thumb {
	width: 135px;
	margin-right: 10px;
	border-bottom-left-radius: 5px;
	border-bottom-right-radius: 5px;
	border-top-left-radius: 5px;
	border-top-right-radius: 5px;
}

.blog_box {
	margin-left: 30px;
	display: flex;
	padding-top: 10px;
	padding-left: 15px;
	padding-bottom: 10px;
	border: solid 1px rgb(232, 235, 238);
	border-radius: 10px;
	padding-bottom: 10px;
}

.trip_box {
	margin-left: 30px;
	display: flex;
	padding-top: 10px;
	padding-left: 15px;
	padding-bottom: 10px;
	border: solid 1px rgb(232, 235, 238);
	border-radius: 10px;
}
</style>
</head>
<body>
	<header>
		<%@ include file="/views/common/menubar.jsp"%>
	</header>
	<div id="wrap">
		<div class="search_header">
			<!-- 여행정보 검색 -->
			<h1 class="searchTitle">여행정보 검색</h1>
			<form action="" method="post">
				<!-- 여행 검색바 -->
				<div class="searchBar">
					<input type="text" name="searchTrip"
						placeholder="   여행가고 싶은 곳을 입력해주세요." onfocus="this.placeholder=''"
						onblur="this.placeholder='   여행가고 싶은 곳을 입력해주세요.'" size="50"
						style="border: 0;">
					<button class="btn_search_submit" type="submit">
						<i class="bi bi-search" style="font-size: 1.5rem"></i>
					</button>
				</div>
				<!-- 카테고리 체크박스 -->
				<div class="searchChk">
					<h5 style="display: inline-block; margin-right: 10px;">상세검색</h5>
					<label><input type="checkbox" name="tripCate" value="01"
							checked="checked">관광지</label> <label><input
							type="checkbox" name="tripCate" value="02" checked="checked">맛집</label>
					<label><input type="checkbox" name="tripCate" value="03"
							checked="checked">액티비티</label> <label><input
							type="checkbox" name="tripCate" value="04" checked="checked">숙박</label>
				</div>
			</form>
		</div>
		<div class="searchView">
			<!-- SNS 검색목록 -->
			<div class="blog_main">
				<h4 style="text-align: center; margin-bottom: 15px;">SNS 검색목록</h4>
				<h6 style="text-align: center;">blog</h6>
				<ul class="blog_list_total">
					<li class="bx" id="blog_1">
						<div class="blog_box">
							<a class="blog_thumb"
								href="https://blog.naver.com/priti1?Redirect=Log&logNo=222421448739">
								<img class="blog_thumb"
								src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDVfNTMg%2FMDAxNjI1NDg5NjI5NDc0.MW6w7yxhMI-XGXYiDr48E_RPsZiIB9g3Yldv8nV7U88g.qqowWlRQ9spzipJkObEw9ljCATw7KqXF-VyZZZoF0oAg.JPEG.priti1%2F20210628_112619.jpg%234032x2268&type=ff264_180">
							</a>
							<div class="blog_conbox">
								<div>
									<h5>제목</h5>
								</div>
								<div>내용</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
			<!-- 관광지 상세정보 목록 -->
			<div class="trip_main">
				<h4 style="text-align: center; margin-bottom: 15px;">관광지 검색목록</h4>
				<h6 style="text-align: center;">trip</h6>
				<ul class="trip_list_total">
					<li class="bx" id="trip_1">
						<div class="trip_box">
							<a class="trip_thumb"
								href="https://blog.naver.com/priti1?Redirect=Log&logNo=222421448739">
								<img class="trip_thumb"
								src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDVfNTMg%2FMDAxNjI1NDg5NjI5NDc0.MW6w7yxhMI-XGXYiDr48E_RPsZiIB9g3Yldv8nV7U88g.qqowWlRQ9spzipJkObEw9ljCATw7KqXF-VyZZZoF0oAg.JPEG.priti1%2F20210628_112619.jpg%234032x2268&type=ff264_180">
							</a>
							<div class="trip_conbox">
								<div>
									<h5>제목</h5>
								</div>
								<div>내용</div>
							</div>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<h1 style="text-align: center;">
			여행검색 페이지<i class="bi bi-heart-fill"
				style="font-size: 2rem; color: Red;"></i>
		</h1>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
	</div>
	<footer>
		<%@ include file="../../views/common/footer.jsp"%>
	</footer>
</body>
</html>