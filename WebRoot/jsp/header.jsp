<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
<title>餐饮系统</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />

<!-- jQuery AND jQueryUI -->
<script type="text/javascript" src="js/libs/jquery/1.6/jquery.min.js"></script>
<script type="text/javascript"
	src="js/libs/jqueryui/1.8.13/jquery-ui.min.js"></script>

<!-- Compressed Version
        <link type="text/css" rel="stylesheet" href="min/b=CoreAdmin&f=css/reset.css,css/style.css,css/jqueryui/jqueryui.css,js/jwysiwyg/jquery.wysiwyg.old-school.css,js/zoombox/zoombox.css" />
        <script type="text/javascript" src="min/b=CoreAdmin/js&f=cookie/jquery.cookie.js,jwysiwyg/jquery.wysiwyg.js,tooltipsy.min.js,iphone-style-checkboxes.js,excanvas.js,zoombox/zoombox.js,visualize.jQuery.js,jquery.uniform.min.js,main.js"></script>
        -->
<link rel="stylesheet" href="css/min.css" />
<script type="text/javascript" src="js/min.js"></script>
</head>
<body>
	<script type="text/javascript" src="content/settings/main.js"></script>
	<link rel="stylesheet" href="content/settings/style.css" />
	<div class="settings" id="settings">
		<div class="wrapper">
			<div class="grid3">
				<div class="titre">Backgrounds</div>
				<a href="url(css/img/bg.html" class="backgroundChanger active"
					title="White"></a> <a href="url(css/img/dark-bg.html"
					class="backgroundChanger dark" title="Dark"></a> <a
					href="url(css/img/wood.html" class="backgroundChanger dark"
					title="Wood"></a> <a href="url(css/img/altbg/smoothwall.html"
					class="backgroundChanger" title="Smoothwall"></a> <a
					href="url(css/img/altbg/black_denim.html"
					class="backgroundChanger dark" title="black_denim"></a> <a
					href="url(css/img/altbg/carbon.html" class="backgroundChanger dark"
					title="Carbon"></a> <a href="url(css/img/altbg/double_lined.html"
					class="backgroundChanger" title="Double lined"></a>
				<div class="clear"></div>
			</div>
			<div class="grid3">
				<div class="titre">Bloc style</div>
				<a href="black.html" class="blocChanger" title="Black"
					style="background:url(css/img/bloctitle.png);"></a> <a
					href="white.html" class="blocChanger active" title="White"
					style="background:url(css/img/white-title.png);"></a> <a
					href="wood.html" class="blocChanger" title="Wood"
					style="background:url(css/img/wood-title.jpg);"></a>
				<div class="clear"></div>
			</div>
			<div class="grid3">
				<div class="titre">Sidebar style</div>
				<a href="grey.html" class="sidebarChanger active" title="Grey"
					style="background:#494949"></a> <a href="black.html"
					class="sidebarChanger" title="Black" style="background:#262626"></a>
				<a href="white.html" class="sidebarChanger" title="White"
					style="background:#EEEEEE"></a>
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>
		<a class="settingbutton" href="#"> </a>
	</div>
	<!-- HEAD -->
	<div id="head">
		<div class="left">
			<a href="#" class="button profile"><img
				src="img/icons/top/huser.png" alt="" /> </a> Hi, <a href="#">John
				Doe</a> | <a href="#">Logout</a>
		</div>
		<div class="right">
			<form action="#" id="search" class="search placeholder">
				<label>Looking for something ?</label> <input type="text" value=""
					name="q" class="text" /> <input type="submit" value="rechercher"
					class="submit" />
			</form>
		</div>
	</div>

	<!-- SIDEBAR -->
	<div id="sidebar">
		<ul>
			<li><a href="index.jsp"> <img
					src="index.jsp" alt="" /> 桌面 </a>
			</li>
			<li class="current"><a href="#"><img
					src="img/icons/menu/layout.png" alt="" /> 菜品管理</a>
				<ul>
					<li class="current"><a href="dishClass/dish_class_list.do">菜品分类</a>
					</li>
					<li><a href="forms.html?p=forms">菜品</a></li>
					<li><a href="table.html?p=table">Table</a></li>
					<li><a href="tabs.html?p=tabs">Tabs</a></li>
					<li><a href="gallery.html?p=gallery">Gallery</a></li>
					<li><a href="notifications.html?p=notif">Notifications</a></li>
					<li><a href="charts.html?p=charts">Charts</a></li>
					<li><a href="typography.html?p=typo">Typography</a></li>
					<li><a href="icons.html?p=icons">Icons</a></li>
					<li><a href="calendar.html?p=calendar">Calendar</a></li>
				</ul>
			</li>
			<li><a href="#"><img src="img/icons/menu/brush.png" alt="" />
					Another submenu</a>
				<ul>
					<li><a href="#">Fake menu #1</a></li>
					<li><a href="#">Fake menu #2</a></li>
					<li><a href="#">Fake menu #3</a></li>
				</ul>
			</li>
			<li><a href="#"><img src="img/icons/menu/brush.png" alt="" />
					Infinite sublevel</a>
				<ul>
					<li><a href="#">Fake menu #1</a></li>
					<li><a href="#">Fake menu #2</a></li>
					<li><a href="#">Fake menu #3</a>
						<ul>
							<li><a href="#">Fake menu #1</a></li>
							<li><a href="#">Fake menu #2</a></li>
							<li><a href="#">Fake menu #3</a>
								<ul>
									<li><a href="#">Fake menu #1</a></li>
									<li><a href="#">Fake menu #2</a></li>
									<li><a href="#">Fake menu #3</a></li>
								</ul>
							</li>
						</ul>
					</li>
				</ul>
			</li>
			<li class="nosubmenu"><a href="#"><img
					src="img/icons/menu/lab.png" alt="" /> This button is useless</a></li>
			<li class="nosubmenu"><a href="modal.html"
				class="zoombox w450 h700"><img src="img/icons/menu/comment.png"
					alt="" /> Modal box</a></li>
		</ul>
	</div>