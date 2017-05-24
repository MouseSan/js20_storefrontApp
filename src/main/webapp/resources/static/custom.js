jQuery(document).ready( function() {
    $('#carouselHacked').carousel();
    $('#item0').addClass('active');
});

function handleMessage(data) {
    var urlStr = window.location.pathname + ' #carouselHacked';
    $('#carouselHacked').load(urlStr, function () {
        $('#carouselHacked').carousel();
        $('#item0').addClass('active');
    });
}
