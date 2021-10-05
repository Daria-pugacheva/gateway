angular.module('market-front', []).controller('indexController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/product-service/';

    $scope.loadProducts = function () {
        $http.get(contextPath + 'products')
            .then(function (response) {
                console.log(response);
                $scope.products = response.data;
            });
    };

    $scope.showInfo = function (product) {
        alert(product.information);
    };

    $scope.loadProducts();

});