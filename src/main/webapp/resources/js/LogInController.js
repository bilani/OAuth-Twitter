/**
 * 
 */

var loginApp = angular.module('loginApp', []);
loginApp.controller('loginController', function($scope) {
	$scope.user = '';
	$scope.pass = '';
});
