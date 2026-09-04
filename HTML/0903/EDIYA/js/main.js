$(function(){
    var slider = $('.bxslider').bxSlider({
        auto:true,
    });


    $('.slider-basic').slick({
        autoplay: true,
        dots: true,
        arrows: false,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1
    });

});
$(function () {         
    $(".close_btn a").on("click", function (e) {
        e.preventDefault();
        $(".pop_slide_bn").fadeOut();
    });
});