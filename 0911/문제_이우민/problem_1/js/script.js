$(function () {
  $(".bxslider").bxSlider({
    auto: true,
    pause: 3000,
    speed: 500,
    pager: true,
    controls: false,
    adaptiveHeight: true,
    adaptiveHeightSpeed: 300,
  });

  $(".slider-basic").slick({
    autoplay: true,
    autoplaySpeed: 3000,
    speed: 500,
    dots: true,
    arrows: false,
    infinite: true,
    slidesToShow: 1,
    slidesToScroll: 1,
  });

  var $nav = $("#mainNav");
  var $overlay = $(".transparency");
  var $mobileTab = $(".mobile_tab");
  var $mobileClose = $(".mobile_close");

  function openMobileNav() {
    $nav.addClass("active");
    $overlay.addClass("active");
    $("body").addClass("menu-open");
    $mobileTab.attr("aria-expanded", "true");
  }

  function closeMobileNav() {
    $nav.removeClass("active");
    $overlay.removeClass("active");
    $("body").removeClass("menu-open");
    $mobileTab.attr("aria-expanded", "false");

    $(".gnb > li").removeClass("on");

    $(".gnb > li > ul").stop().slideUp(0);
  }

  $mobileTab.on("click", function () {
    if ($nav.hasClass("active")) {
      closeMobileNav();
    } else {
      openMobileNav();
    }
  });

  $mobileClose.on("click", function () {
    closeMobileNav();
  });

  $overlay.on("click", function () {
    closeMobileNav();
  });

  $(".gnb > li > a").on("click", function (e) {
    if ($(window).width() > 1024) {
      return;
    }

    var $sub = $(this).next("ul");

    if ($sub.length === 0) {
      return;
    }

    e.preventDefault();

    var $parent = $(this).parent("li");
    var isOpen = $parent.hasClass("on");

    $parent.siblings().removeClass("on").children("ul").stop().slideUp(250);

    if (isOpen) {
      $parent.removeClass("on");

      $sub.stop().slideUp(250);
    } else {
      $parent.addClass("on");

      $sub.stop().slideDown(250);
    }
  });

  $(document).on("keydown", function (e) {
    if (e.key === "Escape") {
      if ($nav.hasClass("active")) {
        closeMobileNav();
        $mobileTab.focus();
      }
    }
  });

  $(window).on("resize", function () {
    if ($(window).width() > 1024) {
      closeMobileNav();
      $(".gnb > li > ul").removeAttr("style");
    }
  });
});
