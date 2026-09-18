$(function () {
  $("dd").hide();

  $("dl dt").click(function () {
    var status = $(this).next("dd").css("display");
    if (status == "none") {
      $("dd").slideUp("slow");
      $(this).next().slideDown("slow");
      $("dl dt").removeClass("selected");
      $(this).addClass("selected");
    }
  });

  $("dl dt").mouseover(function () {
    $(this).addClass("over");
  });
  $("dl dt").mouseout(function () {
    $(this).removeClass("over");
  });
});
