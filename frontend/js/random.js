function Random($scope, $http) {
    $http.get('https://epicquotes.herokuapp.com/random').
        success(function(data) {
            $scope.quote = data;
        });
}
