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

.blog_main {
	display: flex;
	margin-left: 50px;
	float: left;
	width: 580px; 
	border: solid 1px rgb(232, 235, 238);
	border-radius: 10px;
}

.trip_main {
 	display: flex; 
 	margin-left: 30px;
 	border: solid 1px rgb(232, 235, 238); 
 	border-radius: 10px;
 	width: 500px;
	float: left;
}

.blog_thumb {
	width: 135px;
}

.blog_box {
	margin-left: 30px;
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
		<div class="blog_main">
			<div class="blog_box">
				<a class="blog_thumb"
					href="https://blog.naver.com/priti1?Redirect=Log&logNo=222421448739">
					<img class="blog_thumb"
					src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDVfNTMg%2FMDAxNjI1NDg5NjI5NDc0.MW6w7yxhMI-XGXYiDr48E_RPsZiIB9g3Yldv8nV7U88g.qqowWlRQ9spzipJkObEw9ljCATw7KqXF-VyZZZoF0oAg.JPEG.priti1%2F20210628_112619.jpg%234032x2268&type=ff264_180">
				</a>
			</div>
			<div class="blog_conbox">
				<div>제목</div>
				<div>내용</div>
			</div>
		</div>
		<div class="trip_main">
			<div class="blog_box">
				<a class="blog_thumb"
					href="https://blog.naver.com/priti1?Redirect=Log&logNo=222421448739">
					<img class="blog_thumb"
					src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA3MDVfNTMg%2FMDAxNjI1NDg5NjI5NDc0.MW6w7yxhMI-XGXYiDr48E_RPsZiIB9g3Yldv8nV7U88g.qqowWlRQ9spzipJkObEw9ljCATw7KqXF-VyZZZoF0oAg.JPEG.priti1%2F20210628_112619.jpg%234032x2268&type=ff264_180">
				</a>
			</div>
			<div class="blog_conbox">
				<div>제목</div>
				<div>내용</div>
			</div>
		</div>
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