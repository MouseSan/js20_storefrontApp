jQuery(document).ready( function() {

    /* ==============================================
     Owl Carousel
     =============================================== */
    $("#w-owl").owlCarousel({
        items: 1,
        navigation : false, // Show next and prev buttons
        navigationText: false,
        slideSpeed : 300,
        pagination:false,
        paginationSpeed : 400,
        singleItem: true,
        autoPlay: 4000,
        goToFirst : false,
        responsive: true
    });
});