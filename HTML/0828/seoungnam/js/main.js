$(function () {
  var slide1 = $(".bxslider").bxSlider({
    auto: true,
    pager: false,
    pause: 2000,
    controls: false,

    onSlideBefore: function ($slideElement, oldIndex, newIndex) {
      // 슬라이드 변경 시 현재 슬라이드 번호 업데이트
      $("#current").text(newIndex + 1);
    },
  });

  // 재생 / 일시정지 버튼
  $(".pause").on("click", function () {
    if ($(this).hasClass("on")) {
      $(this).removeClass("on");
      slide1.startAuto();
    } else {
      $(this).addClass("on");
      slide1.stopAuto();
    }

    return false;
  });

  // 이전 버튼 클릭
  $(".prev").on("click", function (e) {
    e.preventDefault();
    slide1.goToPrevSlide();
  });

  // 다음 버튼 클릭
  $(".next").on("click", function (e) {
    e.preventDefault();
    slide1.goToNextSlide();
  });
});