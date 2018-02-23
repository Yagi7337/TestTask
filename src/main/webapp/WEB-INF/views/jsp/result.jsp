<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Result page. Test task. Web-systems.solutions</title>

<link href="/resources/core/css/bootstrap.min.css" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="/">Квадратное уравнение</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
		<h3 align="center">Квадратное уравнение:
			(${result.variableA})*x^2 + (${result.variableB})*x +
			(${result.variableC}) = 0</h3>
		<input type="hidden" name="id" value="${result.id}">
		<table class="table table-bordered">
			<tbody>
				<tr>
					<th>а</th>
					<td><input type="text" name="variableA"
						value="${result.variableA}" readonly></td>
				</tr>
				<tr>
					<th>b</th>
					<td><input type="text" name="variableB"
						value="${result.variableB}" readonly></td>
				</tr>
				<tr>
					<th>c</th>
					<td><input type="text" name="variableC"
						value="${result.variableC}" readonly></td>
				</tr>
				<tr>
					<th>x1 (Первый корень)</th>
					<td><input type="text" name="rootFirst"
						value="${result.rootFirst}" readonly></td>
				</tr>
				<tr>
					<th>x2 (Второй корень)</th>
					<td><input type="text" name="rootSecond"
						value="${result.rootSecond}" readonly></td>
				</tr>
				<tr>
					<th>Количество корней</th>
					<td><input type="text" name="countRoots"
						value="${result.countRoots}" readonly></td>
				</tr>
				<tr>
					<td colspan="2""><c:out value="${result.messageForUser}"></c:out>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<form>
							<input type="button" value="На главную"
								onClick='location.href="/"' class="btn btn-success">
						</form>
					</td>
				</tr>
			</tbody>
		</table>
	</div>
</div>

<footer>
	<p align="center">&copy; Yappie, 2018</p>
</footer>

<script src="/resources/core/css/bootstrap.min.js"></script>
</body>
</html>