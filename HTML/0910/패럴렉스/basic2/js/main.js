$(function(){
    $(window).scroll(function(){
         var sct = $(this).scrollTop();
		$("#sValue").text(sct);
        var h1 = sct * 0.001 + 0.5;  // 0.6 0.7 0.8
        if(h1 > 0.5){
            $('#area1').css('transform','scale('+h1+')');
        }
        if(h1 > 0.1){
            $('#area2').css('transform','perspective(1000px) rotateY('+sct+'deg)');
        }

        var h3 = 2 - sct * 0.0009;  //1.9 1.8 1.7

        $('#area3').css('transform','scale('+h3+') rotate('+sct+'deg)');
 
        var h4 = sct * 0.0009; // 0.1 0.2 0.3
        if(h4 <=1){
            $('#area4').css('opacity',h4);
        }

    });
});