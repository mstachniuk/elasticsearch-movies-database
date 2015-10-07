angular.module('admin', [])
    .controller('admin', function ($scope, $http) {

        $scope.reindexAllMovies = function () {
            $http.post("admin/reindexAllMovies");
        }

    });
