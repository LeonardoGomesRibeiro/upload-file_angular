angular.module('dotSubApp')
.controller('ListFilesController', ['$scope', function($scope) {
	
	$scope.files = [{
		createdDate: new Date(),
		title: 'test',
		description: 'description'
	}];
	
}]);