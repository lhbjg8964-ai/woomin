$(function(){
   var slide1 = $('.bxslider').bxSlider({
        auto:true,
        pager:false,
        pause:2000,
        controls:false,
        // onSliderLoad:function(currentIndex){
        //     $('#current').text(currentIndex+1);
        // },

        onSlideBefore:function($slideElement,oldIndex,newIndex){
           //슬라이드 변경시 현재 슬라이드 번호 업데이트
            $('#current').text(newIndex + 1);
        }
        //$slideElement 이동할 슬라이드 
        //old 슬라이드 이전 슬라이드 번호
        //newIndex 이동할 슬라이드 번호
    });

    $('.pause').on('click',function(){
        if($(this).hasClass('on') == 'true'){
            $(this).removeClass('on');
            slide1.startAuto();
        }else{
            $(this).addClass('on');
            slide1.stopAuto();
        }

        return false;
    });
    //이전 버튼 클릭
    $('.prev').on('click',function(){
        slide1.goToPrevSlide();
        return false;
    });

     $('.next').on('click',function(e){
        e.preventDefault();
        slide1.goToNextSlide();
     });

});