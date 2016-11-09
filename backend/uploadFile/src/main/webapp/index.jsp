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
  <style type="text/css">
	  #infoInputFile {
	    color: #999;
	    padding: 18px 14px 15px 0px;
	    display: inline-block;
	  }
	  .btn-footer button {
		float: right;
	  }
	  .btn-next {
	    display: inline-block;
	    padding: 6px 12px;
	    margin-bottom: 0;
	    font-size: 14px;
	    font-weight: 400;
	    line-height: 1.42857143;
	    text-align: center;
	    white-space: nowrap;
	    vertical-align: middle;
	    -ms-touch-action: manipulation;
	    touch-action: manipulation;
	    cursor: pointer;
	    -webkit-user-select: none;
	    -moz-user-select: none;
	    -ms-user-select: none;
	    user-select: none;
	    background-image: none;
	    border: 1px solid transparent;
	    border-radius: 4px;
	  }
  </style>
</head>

<body>

	<div class="container">
		<span id="infoInputFile">*Please, select a file and click next to upload.</span>
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
		<div class="btn-footer">
			<button type="button" id="" class="btn-next" style="">VIEW ALL</button>
			<a href="list">TEST3</a>
		</div>
		
	</div>

	<script src="resources/bower_components/angular/angular.min.js"></script>
	<script src="resources/bower_components/angular-route/angular-route.min.js"></script>
	<script src="resources/scripts/app.js"></script>
	<script src="resources/scripts/directives/fileUpload.js"></script>
	<script src="resources/scripts/services/fileUploadService.js"></script>

</body>
</html>
