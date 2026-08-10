# 오늘 학습 정리 — Float / Flex / Grid

> HTML 태그 총정리(`HTML_태그_총정리.md`)는 제외하고,  
> 카드 레이아웃 실습과 **Float · Flex · Grid** 차이점을 정리한 문서입니다.

---

## 1. 오늘 만든 파일

| 파일 | 내용 |
|------|------|
| `cards-layout.html` | Float / Flex / Grid를 한 페이지에 비교 |
| `cards-float.html` | Float만 사용한 카드 3개 |
| `cards-flex.html` | Flex만 사용한 카드 3개 |
| `cards-grid.html` | Grid만 사용한 카드 3개 |
| `clearfix.html` | Float + Clearfix 연습 |
| `flex.html` | Flex로 카드 배치 연습 |

공통 구조: **이미지 + 제목 + 설명**이 있는 카드 3개를 가로로 배치

---

## 2. 세 가지 레이아웃이란?

웹에서 카드·박스를 나란히 배치하는 대표적인 방법입니다.

| 방식 | 한 줄 요약 |
|------|------------|
| **Float** | 예전 방식. 요소를 왼쪽/오른쪽으로 띄워 배치 |
| **Flex** | 한 줄(또는 한 열) 정렬에 강함. 현대적 1차원 레이아웃 |
| **Grid** | 행과 열을 동시에 다루는 2차원 레이아웃 |

---

## 3. Float

### 개념

- `float: left` 또는 `float: right`로 요소를 띄워 옆에 붙입니다.
- 원래는 **글 옆에 이미지**를 배치하려고 만든 속성입니다.
- 레이아웃용으로도 오래 쓰였지만, 지금은 Flex/Grid를 더 많이 씁니다.

### 핵심 코드

```css
.float-wrap::after {
  content: "";
  display: block;
  clear: both;   /* 부모 높이 붕괴 방지 */
}

.float-wrap .card {
  float: left;
  width: calc(33.333% - 16px);
  margin-right: 24px;
}

.float-wrap .card:last-child {
  margin-right: 0;
}
```

### Clearfix이란?

자식이 `float`되면 부모 높이가 **0처럼** 보이는 문제가 생깁니다.  
부모에 `::after { clear: both; }`를 넣어 높이를 복구하는 기법이 **Clearfix**입니다.

다른 해결법:
- 부모에 `overflow: hidden`
- 부모에 직접 `height` 지정 (비추천 — 값 맞추기 어려움)

### 장단점

| 장점 | 단점 |
|------|------|
| 예전 코드/교재에서 자주 등장 | 부모 높이 붕괴 → Clearfix 필요 |
| 간단한 좌우 배치 가능 | 간격·정렬이 번거로움 |
| | 반응형·세로 정렬이 어려움 |

### 언제 쓰나?

- 예전 사이트 유지보수
- 글 흐름 안에 이미지 띄우기
- 학습 목적 (개념 이해)

---

## 4. Flex (Flexbox)

### 개념

- 부모에 `display: flex`를 주면 **자식들이 한 방향**으로 정렬됩니다.
- **1차원** 레이아웃: 가로 **또는** 세로 중 하나를 주로 다룹니다.
- `gap`으로 간격, `flex: 1`로 균등 너비를 쉽게 줄 수 있습니다.

### 핵심 코드

```css
.flex-wrap {
  display: flex;
  gap: 24px;
}

.flex-wrap .card {
  flex: 1;   /* 남은 공간을 균등 분배 */
}

@media (max-width: 768px) {
  .flex-wrap {
    flex-direction: column;  /* 모바일: 세로 쌓기 */
  }
}
```

### 자주 쓰는 속성

| 속성 | 설명 |
|------|------|
| `display: flex` | Flex 컨테이너 만들기 |
| `flex-direction` | `row`(가로) / `column`(세로) |
| `justify-content` | 주축(가로) 정렬 |
| `align-items` | 교차축(세로) 정렬 |
| `gap` | 자식 사이 간격 |
| `flex: 1` | 남는 공간을 나눠 가짐 |

### 장단점

| 장점 | 단점 |
|------|------|
| 코드가 짧고 직관적 | 복잡한 격자(행+열)는 Grid가 더 나음 |
| 세로 가운데 정렬 쉬움 | |
| 반응형 전환이 쉬움 | |
| Clearfix 불필요 | |

### 언제 쓰나?

- 네비게이션 바
- 카드 한 줄 배치
- 버튼 그룹, 폼 한 줄 정렬
- **대부분의 1줄 레이아웃**

---

## 5. Grid

### 개념

- 부모에 `display: grid`를 주면 **행과 열**을 함께 설계합니다.
- **2차원** 레이아웃: 가로·세로를 동시에 제어합니다.
- `grid-template-columns`로 열 개수와 비율을 정합니다.

### 핵심 코드

```css
.grid-wrap {
  display: grid;
  grid-template-columns: repeat(3, 1fr);  /* 3열, 같은 너비 */
  gap: 24px;
}

@media (max-width: 768px) {
  .grid-wrap {
    grid-template-columns: 1fr;  /* 모바일: 1열 */
  }
}
```

### 자주 쓰는 속성

| 속성 | 설명 |
|------|------|
| `display: grid` | Grid 컨테이너 만들기 |
| `grid-template-columns` | 열 구조 (`1fr 1fr 1fr`, `repeat(3, 1fr)` 등) |
| `grid-template-rows` | 행 구조 |
| `gap` | 행·열 간격 |
| `grid-column` / `grid-row` | 셀 합치기·위치 지정 |
| `place-items` | 셀 안 정렬 |

### 장단점

| 장점 | 단점 |
|------|------|
| 표처럼 칸을 나누기 좋음 | 단순한 한 줄에는 Flex가 더 간단할 수 있음 |
| 열 개수 변경이 쉬움 | |
| 복잡한 페이지 레이아웃에 적합 | |
| Clearfix 불필요 | |

### 언제 쓰나?

- 갤러리, 카드 격자
- 전체 페이지 골격 (헤더/사이드/본문)
- **행과 열을 동시에** 맞춰야 할 때

---

## 6. Float vs Flex vs Grid 비교표

| 비교 항목 | Float | Flex | Grid |
|-----------|-------|------|------|
| 차원 | 사실상 1차원(띄우기) | **1차원** (가로 또는 세로) | **2차원** (가로 + 세로) |
| 부모 높이 | Clearfix 필요 | 자동 | 자동 |
| 간격 | `margin`으로 직접 계산 | `gap` | `gap` |
| 균등 너비 | `width` 계산 | `flex: 1` | `1fr` / `repeat()` |
| 세로 정렬 | 어려움 | 쉬움 (`align-items`) | 쉬움 |
| 반응형 | 번거로움 | 쉬움 | 쉬움 |
| 현대 사용 | 거의 안 씀 (특수 경우) | 매우 많이 씀 | 많이 씀 |
| 난이도 | 중 (함정 많음) | 하~중 | 중 |

---

## 7. 한눈에 보는 선택 기준

```
카드/박스를 나란히 놓고 싶다
        │
        ├─ 한 줄(또는 한 열)만? ──────────► Flex
        │
        ├─ 행과 열을 동시에? ─────────────► Grid
        │
        └─ 예전 코드 / 글 옆 이미지? ─────► Float
```

| 상황 | 추천 |
|------|------|
| 헤더에 로고 + 메뉴 가로 정렬 | **Flex** |
| 상품 카드 3열 갤러리 | **Grid** (또는 Flex) |
| 전체 레이아웃(헤더·사이드·푸터) | **Grid** |
| 글 본문 옆 썸네일 | **Float** (또는 Flex) |
| 학습/자격증 기초 | Float → Flex → Grid 순서 |

---

## 8. 같은 카드, 세 가지 표현 (요약)

### Float

```css
.card { float: left; width: calc(33.333% - 16px); }
/* + Clearfix 필수 */
```

### Flex

```css
.wrap { display: flex; gap: 24px; }
.card { flex: 1; }
```

### Grid

```css
.wrap {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 24px;
}
```

→ **결과 화면은 비슷**해도,  
  **코드 길이·유지보수·반응형**에서는 Flex / Grid가 훨씬 유리합니다.

---

## 9. 실습에서 배운 포인트

1. **`box-sizing: border-box`**  
   - width에 padding·border를 포함해 계산이 편해짐

2. **Float는 Clearfix이 필수**  
   - `::after { content:""; display:block; clear:both; }`

3. **Flex는 `flex: 1` + `gap`**  
   - 너비 계산·간격이 단순해짐

4. **Grid는 `repeat(3, 1fr)`**  
   - 열 개수만 바꾸면 레이아웃이 바뀜

5. **반응형**  
   - Flex: `flex-direction: column`  
   - Grid: `grid-template-columns: 1fr`  
   - Float: `float: none; width: 100%`

---

## 10. 학습 순서 추천

1. Float + Clearfix 이해 (`clearfix.html`)
2. Flex로 같은 카드 다시 만들기 (`flex.html`, `cards-flex.html`)
3. Grid로 같은 카드 다시 만들기 (`cards-grid.html`)
4. 세 가지를 한 페이지에서 비교 (`cards-layout.html`)
5. “언제 무엇을 쓸지” 판단하기 (이 문서 6~7절)

---

## 11. 마무리

| 방식 | 기억할 한 문장 |
|------|----------------|
| **Float** | 띄워서 붙이지만, 부모 높이 관리가 필요함 |
| **Flex** | 한 줄 정렬의 정답 |
| **Grid** | 표처럼 칸을 나누는 정답 |

실무에서는 **Flex + Grid**를 주로 쓰고,  
Float는 개념만 알아두면 충분합니다.
