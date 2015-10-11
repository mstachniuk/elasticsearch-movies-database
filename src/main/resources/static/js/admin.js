angular.module('admin', [])
    .controller('admin', function ($scope, $http) {

        $scope.reindexAllMovies = function () {
            $http.post("admin/reindexAllMovies");
        }

        $scope.continueIndexMovies = function () {
            $http.post("admin/continueIndexMovies");
        }
    });
