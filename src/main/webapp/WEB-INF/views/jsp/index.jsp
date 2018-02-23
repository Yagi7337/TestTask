<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Variables page. Test task. Web-systems.solutions</title>

<link href="/resources/core/css/bootstrap.min.css" rel="stylesheet" />
</head>

<nav class="navbar navbar-inverse navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="#">Квадратное уравнение</a>
		</div>
	</div>
</nav>

<div class="jumbotron">
	<div class="container">
		<h3 align="center">Квадратное уравнение: a*x^2 + b*x + c = 0</h3>
		<h5>Введите значение коэффициентов</h5>
		<form action="saveAndCalculate" method="post">
			<table class="table table-bordered">
				<tbody>
					<tr>
						<th>a</th>
						<td><input type="text" name="variableA" required="required"></td>
					</tr>
					<tr>
						<th>b</th>
						<td><input type="text" name="variableB" required="required"></td>
					</tr>
					<tr>
						<th>с</th>
						<td><input type="text" name="variableC" required="required"></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Рассчитать"
							class="btn btn-success">
					</tr>
				</tbody>
			</table>
		</form>

	</div>
</div>

<footer>
	<p align="center">&copy; Yappie, 2018</p>
</footer>

<script src="/resources/core/css/bootstrap.min.js"></script>

</body>
</html>