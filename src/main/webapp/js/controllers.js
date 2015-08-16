var feedbackModulApp = angular.module('feedbackModulApp', []);

feedbackModulApp.controller('FeedbackListCtrl', function ($scope, $http) {
    $http.get('feedbacks').success(function (data) {
        $scope.feedbacks = data;
    });
});