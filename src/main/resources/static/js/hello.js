angular.module('hello', [])
    .controller('home', function ($scope, $http) {
        $http.get('info/').success(function (data) {
            $scope.info = data;
        });
    });
