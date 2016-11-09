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