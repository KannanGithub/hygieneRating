$(document).ready(function() {
    getJSONData(contextPath + "/posts.json", false, function(data) {
        alert("Hi");
    });

});


function getJSONData(url, cache, successCallback, errorCallback) {
    $.get({
        headers: {
            'accept': 'application/json; charset=utf-8'
        },
        contentType: 'application/json; charset=utf-8',
        url: url,
        cache: cache   /* needed for IE, which caches by default. */
    })
        .done(function(data){
            //successCallback(data);
        })
        .fail(function(error){
            //status 302 needs to be redirected to login page
            if (error.status === 302) {
                console.log('Session timeout, redirects to dashboard.');
                window.location.href = contextPath;
            } else if(errorCallback && typeof(errorCallback) === "function") {
                errorCallback(error);
            } else {
                // errorHandling(error);
            }
        });
}