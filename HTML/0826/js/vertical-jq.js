$(function(){
    $('nav').hide();
    $('.sub').hide();

    $('.ham').click(function(){
        $('nav').slideToggle();
        $(this).toggleClass('on');
    });

    $('.m_menu>li>a').click(function(e){
        var status = $(this).next('.sub').css('display');
        if(status == 'none'){
            $('.sub').slideUp();
            $(this).next('.sub').slideDown();
        }else{
            $('.sub').slideUp();
        }
    });

});