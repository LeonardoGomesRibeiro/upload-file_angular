'use strict';
angular.module('dotSubApp').directive('fileUpload', ['$parse', function ($parse) {
    return {
        restrict: 'A',
        scope: {
        	file: '='
        },
        link: function(scope, element, attrs) {
            element.bind('change', function(){
            	var files = event.target.files;
                var file = files[0];
                scope.file = file ? file : undefined;
                scope.$apply();
            });
        }
    };
}]);