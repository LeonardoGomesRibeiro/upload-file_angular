'use strict';
angular.module('dotSubApp', ['ngRoute'])
.config(function($routeProvider) {
    $routeProvider
    .when("/upload", {
        templateUrl : "templates/upload.jsp",
        controller: 'UploadFileController'
    })
    .when("/list", {
        templateUrl : "templates/listAll.jsp",
        controller: 'ListFilesController'
    }).otherwise({
		redirectTo: '/'
    });
})
.controller('ListFilesController', ['$scope', function($scope, fileUpload) {
	$scope.listFiles = function(){
        $scope.files = [{
        			createdDate: new Date(),
        			title: 'test',
        			description: 'description'
        		}];
    };
}])
;