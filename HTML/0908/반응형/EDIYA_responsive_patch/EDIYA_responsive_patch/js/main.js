$(function () {
    /* =====================================================
       1. 메인 비주얼 - bxSlider
       ===================================================== */
    $('.bxslider').bxSlider({
        auto: true,
        pause: 3500,
        speed: 600,
        pager: true,
        controls: true,
        touchEnabled: true,
        adaptiveHeight: false
    });

    /* =====================================================
       2. Stick Coffee - Slick Slider
       ===================================================== */
    $('.slider-basic').slick({
        autoplay: true,
        autoplaySpeed: 3500,
        dots: true,
        arrows: false,
        infinite: true,
        speed: 500,
        slidesToShow: 1,
        slidesToScroll: 1,
        adaptiveHeight: true,
        pauseOnHover: true
    });

    /* 모바일 영상 인라인 재생 */
    $('.section2 video').attr('playsinline', 'playsinline');

    /* =====================================================
       3. 모바일 메뉴 생성
       기존 PC .gnb를 복제해서 사용하므로 HTML 메뉴를 두 번 작성할 필요 없음
       ===================================================== */
    function makeMobileMenu() {
        if ($('.mobile_nav').length) return;

        var mobileButton =
            '<button type="button" class="mobile_tab" ' +
            'aria-label="전체 메뉴 열기" aria-expanded="false" ' +
            'aria-controls="mobileNav">전체 메뉴</button>';

        var mobileNav =
            '<div class="transparency" aria-hidden="true"></div>' +
            '<aside class="mobile_nav" id="mobileNav" aria-hidden="true">' +
                '<div class="mobile_nav_head">' +
                    '<a href="#" class="mobile_nav_logo">' +
                        '<img src="images/top_logo_240822.gif" alt="EDIYA COFFEE">' +
                    '</a>' +
                    '<button type="button" class="mobile_close" aria-label="전체 메뉴 닫기">닫기</button>' +
                '</div>' +
                '<div class="mobile_util_wrap"></div>' +
                '<div class="mobile_menu"></div>' +
            '</aside>';

        $('.middle_top').append(mobileButton);
        $('body').append(mobileNav);

        /* PC 메뉴 복제 */
        var $mobileGnb = $('.gnb').clone(false);
        $mobileGnb.removeClass('gnb').addClass('mobile_gnb');
        $('.mobile_menu').append($mobileGnb);

        /* PC 상단 유틸 메뉴도 모바일에 일부 재사용 */
        var $mobileUtil = $('.lnb').clone(false);
        $mobileUtil.removeClass('lnb fl').addClass('mobile_util');
        $('.mobile_util_wrap').append($mobileUtil);

        /* 접근성용 상태값 */
        $('.mobile_gnb > li > a').each(function () {
            if ($(this).next('ul').length) {
                $(this).attr('aria-expanded', 'false');
            }
        });
    }

    makeMobileMenu();

    function openMobileNav() {
        $('.mobile_nav').addClass('active').attr('aria-hidden', 'false');
        $('.transparency').addClass('active').attr('aria-hidden', 'false');
        $('.mobile_tab').attr('aria-expanded', 'true');
        $('body').addClass('menu_open');
    }

    function closeMobileNav() {
        $('.mobile_nav').removeClass('active').attr('aria-hidden', 'true');
        $('.transparency').removeClass('active').attr('aria-hidden', 'true');
        $('.mobile_tab').attr('aria-expanded', 'false');
        $('body').removeClass('menu_open');

        $('.mobile_gnb > li')
            .removeClass('open')
            .children('ul')
            .stop(true, true)
            .slideUp(0);

        $('.mobile_gnb > li > a').attr('aria-expanded', 'false');
    }

    $('.mobile_tab').on('click', openMobileNav);
    $('.mobile_close, .transparency').on('click', closeMobileNav);

    /* 모바일 아코디언 */
    $('.mobile_gnb > li > a').on('click', function (e) {
        var $sub = $(this).next('ul');

        if (!$sub.length) return;

        e.preventDefault();

        var $li = $(this).parent();
        var isOpen = $li.hasClass('open');

        $li.siblings()
            .removeClass('open')
            .children('ul')
            .stop(true, true)
            .slideUp(200);

        $li.siblings().children('a').attr('aria-expanded', 'false');

        if (isOpen) {
            $li.removeClass('open');
            $sub.stop(true, true).slideUp(200);
            $(this).attr('aria-expanded', 'false');
        } else {
            $li.addClass('open');
            $sub.stop(true, true).slideDown(200);
            $(this).attr('aria-expanded', 'true');
        }
    });

    /* ESC로 닫기 */
    $(document).on('keydown', function (e) {
        if (e.key === 'Escape') {
            closeMobileNav();
        }
    });

    /* 태블릿/모바일 메뉴 열린 상태에서 PC 폭으로 커지면 초기화 */
    $(window).on('resize', function () {
        if ($(window).width() > 1024) {
            closeMobileNav();
        }
    });

    /* =====================================================
       4. 이벤트 팝업 닫기
       ===================================================== */
    $('.close_btn a').on('click', function (e) {
        e.preventDefault();
        $('.pop_slide_bn').fadeOut();
    });
});
