$(function () {

  // nav 클릭
  $("nav li").click(function (e) {
    e.preventDefault();

    let i = $(this).index();
    let winWidth = $(window).width();

    $("html, body").stop().animate({
      scrollLeft: winWidth * i
    }, 700);
  });


  // 가로 스크롤
  $(window).scroll(function () {

    let sct = $(this).scrollLeft();
    let winWidth = $(this).width();

    // 1번 화면
    if (sct < winWidth * 0.5) {
      $("nav li").removeClass("on");
      $("nav li").eq(0).addClass("on");
    }

    // 2번 화면
    else if (sct < winWidth * 1.5) {
      $("nav li").removeClass("on");
      $("nav li").eq(1).addClass("on");
    }

    // 3번 화면
    else if (sct < winWidth * 2.5) {
      $("nav li").removeClass("on");
      $("nav li").eq(2).addClass("on");
    }

    // 4번 화면
    else {
      $("nav li").removeClass("on");
      $("nav li").eq(3).addClass("on");
    }

  });

});