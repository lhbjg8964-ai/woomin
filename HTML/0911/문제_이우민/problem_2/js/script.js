$(function () {
  $(".tab-menu li").click(function (e) {
    e.preventDefault();

    var i = $(this).index();
    $(".tab-menu li").removeClass("on");
    $(this).addClass("on");
    $(".tab-content > div").stop().fadeOut(300);

    setTimeout(function () {
      $(".tab-content > div").eq(i).stop().fadeIn(300);
    }, 300);
  });
});
