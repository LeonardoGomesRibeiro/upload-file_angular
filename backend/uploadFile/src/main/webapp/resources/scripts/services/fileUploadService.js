'use strict';
angular.module('dotSubApp')
.service('fileUpload', ['$http', function ($http) {
	
    this.uploadFileToUrl = function(file, uploadUrl){
        var fd = new FormData();
        fd.append('file', file.title);
        fd.append('description', file.description);
        fd.append('createdDate', file.createdDate);
        
        $http({
            url: uploadUrl,
            method: 'POST',
            data: fd,
            //assign content-type as undefined, the browser
            //will assign the correct boundary for us
            headers: { 'Content-Type': undefined},
            //prevents serializing payload.  don't do it.
            transformRequest: angular.identity,
            transformResponse: angular.identity
        }).success(function(success){
        	alert('success!')
        });
    }
}]);