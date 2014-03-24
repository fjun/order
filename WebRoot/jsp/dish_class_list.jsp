<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp"></jsp:include>
<!-- CONTENT -->
<div id="content" class="white">
	<h1>
		<img src="img/icons/posts.png" alt="" /> 菜品管理 - 菜品分类
	</h1>
	<div class="bloc">
		<div class="title">菜品分类</div>
		<div>
			<br>
			<a href="dishClass/to_add_dish_class.do" class="button">新增</a>
			<%--<a href="dishClass/to_add_dish_class.do" class="button">编辑</a>--%>
			<a href="dishClass/to_add_dish_class.do" class="button">删除</a>
		</div>
		<br>
		<div class="content">
			<table>
				<thead>
					<tr>
						<th><input type="checkbox" class="checkall" />
						</th>
						<th>分类编码</th>
						<th>分类名称</th>
						<th>上级分类</th>
						<th>显示排序号</th>
						<th>创建时间</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${dishClassList }" var="dishClass">
						<tr>
							<td><input type="checkbox" />
							</td>
							<td>${dishClass.code }</td>
							<td>${dishClass.name }</td>
							<td>${dishClass.parent.name }</td>
							<td>${dishClass.orderNo }</td>
							<td>${dishClass.ts }</td>
							<td class="actions">
								<a href="dishClass/to_edit_dish_class.do?id=${dishClass.id }" title="编辑">
									<img src="img/icons/actions/edit.png" alt="" />
								</a>
								<a href="dishClass/delete_dish_class.do?id=${dishClass.id }" title="删除">
									<img src="img/icons/actions/delete.png" alt="" />
								</a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="pagination">
				<a href="#" class="prev">«</a> 
				<a href="#">1</a> 
				<a href="#" class="current">2</a>
				 ... 
				<a href="#">21</a> 
				<a href="#">22</a> 
				<a href="#" class="next">»</a>
			</div>
		</div>
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>