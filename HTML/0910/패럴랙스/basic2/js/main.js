$(function () {
    $(window).scroll(function () {

        var sct = $(this).scrollTop();

        $('#sValue').text(sct);

        // area1 : 스크롤할수록 확대
        var h1 = sct * 0.001 + 0.5;

        if (h1 > 0.5) {
            $('#area1').css(
                'transform',
                'scale(' + h1 + ')'
            );
        }

        // area2 : Y축 회전
        if (h1 > 0.5) {
            $('#area2').css(
                'transform',
                'perspective(1000px) rotateY(' + sct + 'deg)'
            );
        }

        // area3 : 작아지면서 회전
        var h3 = 2 - sct * 0.0009;

        $('#area3').css(
            'transform',
            'scale(' + h3 + ') rotate(' + sct + 'deg)'
        );

        // area4 : 점점 나타남
        var h4 = sct * 0.0009;

        if (h4 <= 1) {
            $('#area4').css('opacity', h4);
        }

    });
});