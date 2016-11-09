<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" ng-app="dotSubApp">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head
         content must come *after* these tags -->
<title>Upload Menu</title>

  <link rel="stylesheet" href="resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
  <script src="resources/bower_components/jquery/dist/jquery.min.js"></script>
  <script src="resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
  
</head>

<body>

	<div class="container">
		<div class="row row-content" ng-controller="UploadController">
			<div class="col-xs-12">
				<form enctype="multipart/form-data">
					<div class="form-group">
						<label class="control-label col-sm-2" for="title">Title:</label>
						<div class="col-sm-10">
							<input ng-model="title" type="text" class="form-control" id="title"
								placeholder="Change the file name if you want">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="description">Description:</label>
						<div class="col-sm-10">
							<input ng-model="description" type="text" class="form-control" id="description"
								placeholder="Type a brief description of this file">
						</div>
					</div>
							
					<div class="form-group">
						<label class="control-label col-sm-2" for="description">Upload File:</label>
						<div class="col-sm-10">
							<input type="file" file-upload file="file">
							<button ng-click="uploadFile()">upload file</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

	<script src="resources/bower_components/angular/angular.min.js"></script>
	<script src="resources/scripts/app.js"></script>
	<script src="resources/scripts/directives/fileUpload.js"></script>
	<script src="resources/scripts/services/fileUploadService.js"></script>

</body>
</html>
