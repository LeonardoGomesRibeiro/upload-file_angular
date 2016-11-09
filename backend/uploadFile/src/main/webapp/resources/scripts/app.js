'use strict';
angular.module('dotSubApp', ['ngRoute'])
.config(function($routeProvider) {
    $routeProvider
    .when("/list", {
        templateUrl : "templates/listAll.jsp",
        controller: 'ListFilesController'
    }).otherwise({
		redirectTo: '/'
    });
})
.controller('UploadController', ['$scope','fileUpload', function($scope, fileUpload) {
	$scope.fileData = {};
	$scope.uploadFile = function(){
        var file = $scope.file;
        file.title = $scope.name ? $scope.name : file.title;
        file.createdDate = new Date();
        file.description = $scope.description;        
        console.log('file is ');
        console.dir(file);
        
        var clearFields = function (scope){
        	$scope.title = '';
        	$scope.description = '';
        };
        
        var uploadUrl = "/uploadFile/rest/uploadFile";
        fileUpload.uploadFileToUrl(file, uploadUrl, clearFields);
    };
}]);