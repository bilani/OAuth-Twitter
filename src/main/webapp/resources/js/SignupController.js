/**
 * 
 */
var singupApp = angular.module('singupApp', []);
singupApp.controller('signupController', function($scope) {
	$scope.name = '';
	$scope.lastName = '';
	$scope.user = '';
	$scope.email = '';
	$scope.pass = '';
});