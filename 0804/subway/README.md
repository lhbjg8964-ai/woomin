# Subway 클론 프로젝트

써브웨이(Subway) 공식 사이트 UI를 참고해 만든 정적 웹 페이지입니다.

---

## 폴더 구조

```
subway/
├── index.html          # 메인 HTML
├── css/
│   └── subway.css      # 스타일시트
├── images/             # 이미지 리소스
└── README.md           # 프로젝트 정리 문서
```

---

## 파일 설명

### `index.html`

메인 페이지. 구성은 아래와 같습니다.

| 영역 | 설명 |
|------|------|
| `header` | 로고 (`logo_w.png`) |
| `nav#gnb` | GNB 메뉴 (호버 시 2depth 펼침) |
| `section.s1` | 메인 비주얼 + 퀵링크 + 메뉴 슬라이더 |

**GNB 1depth 메뉴**

- 메뉴소개 / 이용방법 / 새소식 / 써브웨이 / 가맹점 / 온라인 주문

**메뉴 탭 (클래식 기준 표시)**

- 클래식, 프레쉬&라이트, 프리미엄, 아침메뉴

**클래식 메뉴 카드**

| 메뉴 | 이미지 |
|------|--------|
| 에그마요 | `sandwich_cl06_01.jpg` |
| 이탈리안 비엠티 | `sandwich_cl01_01.jpg` |
| 햄 | `sandwich_cl04_01.jpg` |
| 참치 | `sandwich_cl05_01.jpg` |

### `css/subway.css`

주요 스타일 포인트:

- 브랜드 컬러: `#009223` (초록), `#ffce32` (노랑)
- 헤더 상단 5px 초록 보더
- GNB 호버 시 높이 확장 (`55px` → `250px`)
- 퀵링크: 매장찾기 / 가맹신청·문의
- 메뉴 카드 호버 시 `scale(1.2)` + more 버튼 표시
- 슬라이더 prev/next 화살표 (`icon_event_slider_arr.png`)

---

## images 폴더 정리

### 로고 · UI

| 파일명 | 용도 |
|--------|------|
| `logo_w.png` | 헤더 로고 |
| `bul_tit.png` | 메뉴 섹션 제목 불릿 |
| `btn_more.png` | 메뉴 카드 호버 more 버튼 |
| `icon_map.png` | 매장찾기 아이콘 |
| `icon_franchise.png` | 가맹신청 아이콘 |
| `icon_event_slider_arr.png` | 슬라이더 화살표 |
| `icon_quickmenu.png` | 퀵메뉴 아이콘 |
| `icon_sns_facebook.png` | SNS 페이스북 |
| `icon_sns_instar.png` | SNS 인스타그램 |

### 배경

| 파일명 | 용도 |
|--------|------|
| `bg_content.gif` | 콘텐츠 배경 |
| `bg_utilization.png` | 이용방법 배경 |
| `img_subway_history.png` | 써브웨이 역사 |

### 메인 슬라이더

| 파일명 | 용도 |
|--------|------|
| `s1.jpg` ~ `s6.jpg` | 메인 비주얼 배너 |

### 샌드위치 메뉴

| 접두어 | 카테고리 | 예시 |
|--------|----------|------|
| `sandwich_cl*` | 클래식 | cl01 이탈리안 비엠티, cl04 햄, cl05 참치, cl06 에그마요 |
| `sandwich_fl*` | 프레쉬&라이트 | fl01, fl02, fl04, fl06 |
| `sandwich_pm*` | 프리미엄 | pm01, pm06, pm07, pm08, pm10 |
| `sandwich_bf*` | 아침메뉴 | bf01, bf02 |

### 기타

| 파일명 | 비고 |
|--------|------|
| `1776303711720_cHFR4i.png` 등 | 다운로드된 추가 이미지 |

---

## 실행 방법

`index.html`을 브라우저에서 열면 됩니다. 별도 서버나 빌드 과정은 없습니다.

```
index.html 더블클릭 또는 Live Server로 열기
```

---

## 참고 (학습 메모)

HTML 주석에 정리된 작업 팁:

1. **이미지 다운로더** — 크롬 확장으로 서브웨이 사이트 이미지 수집
2. **ColorZilla** — 스포이드로 브랜드 색상 추출 (`#009223` 등)
