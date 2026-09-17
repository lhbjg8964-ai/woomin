$(function () {
  var isPlay = true;
  var total = $(".slider > li").length;
  $("#total").text(total);
  var slider = $(".slider").bxSlider({
    auto: true,
    pause: 3000,
    speed: 500,
    pager: false,
    controls: false,
    infiniteLoop: true,
    onSliderLoad: function (currentIndex) {
      $("#current").text(currentIndex + 1);
    },
    onSlideBefore: function ($slideElement, oldIndex, newIndex) {
      $("#current").text(newIndex + 1);
    },
  });
  $(".prev").click(function () {
    slider.goToPrevSlide();
  });
  $(".next").click(function () {
    slider.goToNextSlide();
  });
  $(".play").click(function () {
    if (isPlay == true) {
      slider.stopAuto();
      $(this).find("img").attr("src", "images/play.png");
      $(this).find("img").attr("alt", "재생");
      isPlay = false;
    } else {
      slider.startAuto();
      $(this).find("img").attr("src", "images/pause.png");
      $(this).find("img").attr("alt", "일시정지");
      isPlay = true;
    }
  });
});
