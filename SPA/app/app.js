// create the module and name it phpro
// also include ngRoute for all our routing needs
var phpro = angular.module('angulartest', ['ngRoute']);

// configure our routes
phpro.config(function($routeProvider) {

$routeProvider
        // route for the index page
        .when('/', {
                templateUrl : 'templates/index.html',
                controller  : 'mainCtrl'
        })

        // route for the FAQ page
        .when('/faq', {
        templateUrl : 'templates/faq.html',
        controller  : 'faqCtrl'
        })

        // route for the contact page
        .when('/contact', {
                templateUrl : 'templates/contact.html',
                controller  : 'contactCtrl'
        });
});

// create the controller and inject Angular's $scope
phpro.controller('mainCtrl', function($scope) {
        // create a message to display in our view
        $scope.heading = 'Welcome';
        $scope.message = 'Here you will find the meaning of life.';
});

phpro.controller('faqCtrl', function($scope) {
        $scope.heading = 'FAQ';
        $scope.message = 'This is where you will find the accumulated knowledge of the world.';
});

phpro.controller('contactCtrl', function($scope) {
        $scope.heading = 'Contact Angular JS';
        $scope.message = 'Contact Debraj Maity:';
});