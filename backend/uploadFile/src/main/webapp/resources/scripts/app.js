'use strict';
angular.module('dotSubApp', [])
.controller('UploadController', ['$scope','fileUpload', function($scope, fileUpload) {
	$scope.fileData = {};
	$scope.uploadFile = function(){
        var file = $scope.file;
        file.title = $scope.name ? $scope.name : file.title;
        file.createdDate = new Date();
        file.description = $scope.description;
        
        console.log('file is ');
        console.dir(file);
        var uploadUrl = "/uploadFile/rest/uploadFile";
        fileUpload.uploadFileToUrl(file, uploadUrl);
    };
}]);