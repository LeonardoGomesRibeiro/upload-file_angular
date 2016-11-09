<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List all files</title>
</head>
<body>
	<table>
		<tr>
			<th>Create date</th>
			<th>Title</th>
			<th>Description</th>
		</tr>

		<tr ng-repeat="file in files">
			<td>{{ file.createdDate }}</td>
			<td>{{ file.title }}</td>
			<td>{{ file.description }}</td>
		</tr>

	</table>
	<script src="resources/bower_components/angular/angular.min.js"></script>
	<script src="resources/bower_components/angular-route/angular-route.min.js"></script>
	<script src="resources/scripts/app.js"></script>
</body>
</html>