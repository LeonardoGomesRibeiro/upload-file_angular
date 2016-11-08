'use strict';
angular.module('dotSubApp', [])
.controller('UploadController', ['$scope','fileUpload', function($scope, fileUpload) {
	$scope.uploadFile = function(){
        var file = $scope.myFile;
        console.log('file is ' );
        console.dir(file);
        var uploadUrl = "/uploadFile/rest/uploadFile";
        fileUpload.uploadFileToUrl(file, uploadUrl);
    };
}]);