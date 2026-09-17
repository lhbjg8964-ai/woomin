EDIYA 반응형 적용 방법
======================

대상 GitHub 경로
HTML/0903/EDIYA

1) 새 파일 추가
----------------
이 폴더의 css/responsive.css 를
HTML/0903/EDIYA/css/responsive.css 로 복사합니다.

2) index.html 수정
------------------
기존:
<link rel="stylesheet" href="css/style.css">

바로 아래에 추가:
<link rel="stylesheet" href="css/responsive.css">

그리고 nav 닫는 태그를 확인하세요.
현재 index.html은 nav 내부의 .shadow 다음에 </nav>가 빠져 있습니다.

기존 형태:
<div class="shadow"></div>
</div>
<div class="main">

수정 형태:
<div class="shadow"></div>
</nav>
</div>
<div class="main">

3) main.js 교체
---------------
이 폴더의 js/main.js 로
HTML/0903/EDIYA/js/main.js 를 교체합니다.

4) 동작 기준
------------
- 1025px 이상: 기존 PC GNB 유지
- 1024px 이하: 상단 PC 메뉴를 숨기고 햄버거 메뉴 표시
- 767px 이하: 콘텐츠를 모바일 1열 중심으로 재배치
- Stick Coffee: 모바일에서 상품 2개씩 배치
- section7: 태블릿 2열 / 모바일 1열
- 영상: width:100%, max-width 유지
- footer: 모바일에서 자동 줄바꿈
- 이벤트 팝업: 모바일에서 작은 크기로 우측 하단 배치

5) 별도 HTML 모바일 메뉴를 작성하지 않아도 됩니다.
--------------------------------------------------
main.js가 기존 .gnb 메뉴를 복제해서 모바일 아코디언 메뉴를 자동 생성합니다.
기존 메뉴를 수정하면 모바일 메뉴도 함께 바뀝니다.
