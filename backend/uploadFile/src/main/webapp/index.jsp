<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" >

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

<body ng-app="dotSubApp">

	<div class="container">		
		<ng-view></ng-view>		
	</div>
	<script src="resources/bower_components/angular/angular.min.js"></script>
	<script src="resources/bower_components/angular-route/angular-route.min.js"></script>
	<script src="resources/scripts/app.js"></script>
	<script src="resources/scripts/controllers/uploadFileController.js"></script>
	<script src="resources/scripts/directives/fileUpload.js"></script>
	<script src="resources/scripts/services/fileUploadService.js"></script>

</body>
</html>
