<table>
	<tr>
		<th>Create date</th>
		<th>Title</th>
		<th>Description</th>
	</tr>

	<tr ng-repeat="file in files">
		<td ng-bind="file.createdDate | date: 'MM/dd/yyyy'" ></td>
		<td>{{ file.title }}</td>
		<td>{{ file.description }}</td>
	</tr>	
</table>