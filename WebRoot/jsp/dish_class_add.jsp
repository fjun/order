<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
<!--            
              CONTENT 
                        -->
<div id="content" class="white">
	<h1>
		<img src="img/icons/posts.png" alt="" /> Forms
	</h1>
	<div class="bloc">
		<form action="dishClass/add_dish_class.do" method="post">
			<div class="title">添加菜品分类</div>
			<div class="content">
				<div class="input">
					<label for="code">分类编码</label> <input type="text" id="code" name="code" /> <span
						class="error-message"></span>
				</div>
				<div class="input">
					<label for="name">分类名称</label> <input type="text" id="name" name="name" /> <span
						class="error-message"></span>
				</div>
				<div class="input">
					<label for="orderNo">显示排序号</label> <input type="text" id="orderNo" name="orderNo" />
					<span class="error-message"></span>
				</div>
				<div class="submit">
					<input type="submit" value="提交" /> 
					<input type="reset" value="重置" class="white" />
					<input type="button" value="返回" class="white" onclick="javascript:window.history.back()"/>
				</div>
			</div>
		</form>
	</div>
</div>

<jsp:include page="footer.jsp"></jsp:include>