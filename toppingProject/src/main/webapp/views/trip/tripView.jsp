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
#wrap {
	min-width: 1230px;
	margin: 0 auto;
}

#sns_main {
	display: block;
	float: left;
	border: solid 1px rgb(232, 235, 238);
	border-radius: 15px;
	margin-left: 30px;
	margin-right: 30px;
	width: 650px;
}

#trip_main {
	display: block;
	float: left;
	border: solid 1px rgb(232, 235, 238);
	border-radius: 15px;
	width: 448px;
}

.sns_contents {
	display: block;
	width: 580px;
}

.trip_contents {
	display: block;
	width: 400px;
}

.blog_title {
	display: block;
	width: 230px;
	height: 25px;
	line-height: 24px;
}

.blog_cont {
	display: block;
	width: 230px;
}

.blog_p {
	width: 200px;
}

.blog_thumb {
	display: block;
	float: right;
	width: 132px;
}

.bx {
	list-style: none;
	display: list-item;
}
</style>
</head>
<body>
	<header>
		<%@ include file="/views/common/menubar.jsp"%>
	</header>
	<div id="wrap">
		<br>
		<br>
		<div class="sns_main" id="sns_main">
			<ul class="list total">
				<li class="bx" id="blog_1">
					<div class="sns_contents" style="display: flex;">
						<div class="blog_title">
						<h3>제목</h3>
						</div>
						<div class="blog_cont">
						<p>내용</p>
						</div>
						<a class="blog_thumb"
							href="https://blog.naver.com/priti1?Redirect=Log&logNo=222421448739">
							<img class="blog_thumb"
							src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDVfNTMg%2FMDAxNjI1NDg5NjI5NDc0.MW6w7yxhMI-XGXYiDr48E_RPsZiIB9g3Yldv8nV7U88g.qqowWlRQ9spzipJkObEw9ljCATw7KqXF-VyZZZoF0oAg.JPEG.priti1%2F20210628_112619.jpg%234032x2268&type=ff264_180">
						</a>
					</div>
				</li>
			</ul>
		</div>
		<div class="trip_main" id="trip_main">
			<ul class="list total">
				<li class="bx" id="blog_1">
					<div class="trip_contents" style="display: flex;"></div>
				</li>
			</ul>
		</div>
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