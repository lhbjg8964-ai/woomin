$(function () {
  $(".bxslider").bxSlider({
    mode: "horizontal",
    auto: true,
    pause: 1500,
    speed: 500,
  });

  $(".con1 .tab_menu li").on("click", function () {
    $(this).addClass("on");
    $(this).siblings().removeClass("on");
  });
});