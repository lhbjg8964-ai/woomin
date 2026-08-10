# HTML 태그 총정리

---

## 1. 문서 기본 구조

| 태그 | 설명 |
|------|------|
| `<!DOCTYPE html>` | HTML5 문서 선언 |
| `<html>` | HTML 문서의 시작과 끝 |
| `<head>` | 문서 정보(제목, CSS 등) |
| `<title>` | 브라우저 제목 |
| `<meta>` | 문자셋, 설명 등 |
| `<link>` | CSS 연결 |
| `<style>` | 내부 CSS |
| `<script>` | JavaScript 작성 |
| `<body>` | 화면에 표시되는 내용 |

```html
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>HTML 예제</title>
</head>
<body>

</body>
</html>
```

---

## 2. 제목 태그

| 태그 | 크기 |
|------|------|
| `<h1>` | 가장 큼 |
| `<h2>` | |
| `<h3>` | |
| `<h4>` | |
| `<h5>` | |
| `<h6>` | 가장 작음 |

```html
<h1>제목1</h1>
<h2>제목2</h2>
<h3>제목3</h3>
```

---

## 3. 문단 태그

| 태그 | 설명 |
|------|------|
| `<p>` | 문단 |
| `<br>` | 줄바꿈 |
| `<hr>` | 수평선 |
| `<pre>` | 입력한 그대로 출력 |

```html
<p>안녕하세요.</p>
<br>
<hr>

<pre>
줄바꿈
공백
그대로 출력
</pre>
```

---

## 4. 글자 꾸미기

| 태그 | 설명 |
|------|------|
| `<b>` | 굵게 |
| `<strong>` | 중요한 글씨 |
| `<i>` | 기울임 |
| `<em>` | 강조 |
| `<u>` | 밑줄 |
| `<mark>` | 형광펜 |
| `<small>` | 작은 글씨 |
| `<del>` | 취소선 |
| `<ins>` | 삽입 |
| `<sub>` | 아래첨자 |
| `<sup>` | 위첨자 |

```html
<b>굵게</b>
<strong>중요</strong>
<i>기울임</i>
<u>밑줄</u>
<mark>형광펜</mark>
<del>삭제</del>

H<sub>2</sub>O
2<sup>3</sup>
```

---

## 5. 링크

```html
<a href="https://google.com">구글</a>

<a href="https://google.com" target="_blank">
  새창 열기
</a>
```

| 속성 | 설명 |
|------|------|
| `href` | 이동할 주소 |
| `target="_blank"` | 새 창(탭)에서 열기 |

---

## 6. 이미지

```html
<img src="cat.jpg" alt="고양이" width="300">
```

| 속성 | 설명 |
|------|------|
| `src` | 이미지 위치 |
| `alt` | 이미지 설명 |
| `width` | 가로 |
| `height` | 세로 |

---

## 7. 목록 (List)

### 순서 없는 목록

```html
<ul>
    <li>사과</li>
    <li>배</li>
    <li>포도</li>
</ul>
```

### 순서 있는 목록

```html
<ol>
    <li>HTML</li>
    <li>CSS</li>
    <li>JavaScript</li>
</ol>
```

### 설명 목록

```html
<dl>
    <dt>HTML</dt>
    <dd>웹의 구조</dd>

    <dt>CSS</dt>
    <dd>디자인</dd>
</dl>
```

| 태그 | 설명 |
|------|------|
| `<ul>` | 순서 없는 목록 |
| `<ol>` | 순서 있는 목록 |
| `<li>` | 목록 항목 |
| `<dl>` | 설명 목록 |
| `<dt>` | 용어 |
| `<dd>` | 설명 |

---

## 8. 표 (Table)

```html
<table border="1">
  <tr>
    <th>이름</th>
    <th>나이</th>
  </tr>
  <tr>
    <td>홍길동</td>
    <td>20</td>
  </tr>
</table>
```

| 태그 | 설명 |
|------|------|
| `<table>` | 표 |
| `<tr>` | 행 |
| `<th>` | 제목 셀 |
| `<td>` | 데이터 셀 |
| `<caption>` | 표 제목 |
| `<thead>` | 머리글 영역 |
| `<tbody>` | 본문 영역 |
| `<tfoot>` | 바닥글 영역 |

---

## 9. 입력 (Form)

```html
<form>
  <input type="text">
  <input type="password">
  <input type="email">
  <input type="number">
  <input type="date">
  <input type="submit">
</form>
```

---

## 10. Input 종류

| type | 설명 |
|------|------|
| `text` | 문자 |
| `password` | 비밀번호 |
| `email` | 이메일 |
| `number` | 숫자 |
| `tel` | 전화번호 |
| `url` | URL |
| `search` | 검색 |
| `date` | 날짜 |
| `time` | 시간 |
| `datetime-local` | 날짜 + 시간 |
| `color` | 색상 |
| `range` | 슬라이더 |
| `checkbox` | 체크박스 |
| `radio` | 라디오 버튼 |
| `file` | 파일 |
| `hidden` | 숨김 |
| `submit` | 제출 |
| `reset` | 초기화 |
| `button` | 버튼 |

---

## 11. Form 태그

| 태그 | 설명 |
|------|------|
| `<form>` | 입력폼 |
| `<input>` | 입력 |
| `<label>` | 라벨 |
| `<textarea>` | 여러 줄 입력 |
| `<select>` | 목록 |
| `<option>` | 항목 |
| `<button>` | 버튼 |
| `<fieldset>` | 그룹 |
| `<legend>` | 제목 |
| `<datalist>` | 자동완성 |
| `<output>` | 결과 |

```html
<label>이름</label>
<input type="text">

<textarea></textarea>

<select>
  <option>HTML</option>
  <option>CSS</option>
</select>
```

---

## 12. div와 span

### div — 블록 요소

```html
<div>
  안녕하세요
</div>
```

### span — 인라인 요소

```html
<span>HTML</span>
```

| 태그 | 특징 |
|------|------|
| `<div>` | 블록 요소 (줄 전체를 차지) |
| `<span>` | 인라인 요소 (글자 흐름 안에 배치) |

---

## 13. 시맨틱 태그 (HTML5)

| 태그 | 설명 |
|------|------|
| `<header>` | 머리말 |
| `<nav>` | 메뉴 |
| `<main>` | 본문 |
| `<section>` | 구역 |
| `<article>` | 독립된 글 |
| `<aside>` | 사이드 |
| `<footer>` | 바닥글 |

```html
<header></header>
<nav></nav>
<main>
  <section>
    <article></article>
  </section>
</main>
<footer></footer>
```

---

## 14. 미디어

### 영상

```html
<video controls width="500">
  <source src="movie.mp4">
</video>
```

### 오디오

```html
<audio controls>
  <source src="music.mp3">
</audio>
```

---

## 15. iframe

```html
<iframe
  src="https://www.naver.com"
  width="500"
  height="300">
</iframe>
```

---

## 16. 자주 사용하는 속성

| 속성 | 설명 |
|------|------|
| `id` | 고유 이름 |
| `class` | 그룹 이름 |
| `style` | CSS |
| `title` | 설명 |
| `name` | 이름 |
| `value` | 값 |
| `placeholder` | 안내 문구 |
| `autofocus` | 자동 커서 |
| `required` | 필수 입력 |
| `readonly` | 읽기 전용 |
| `disabled` | 비활성화 |
| `checked` | 체크 |
| `selected` | 선택 |
| `multiple` | 다중 선택 |
| `maxlength` | 최대 길이 |
| `minlength` | 최소 길이 |
| `min` | 최소값 |
| `max` | 최대값 |
| `step` | 증가값 |

---

## 17. 자주 사용하는 HTML 엔티티

| 문자 | 코드 |
|------|------|
| `<` | `&lt;` |
| `>` | `&gt;` |
| `&` | `&amp;` |
| 공백 | `&nbsp;` |
| `"` | `&quot;` |
| `'` | `&apos;` |
| `©` | `&copy;` |

---

## 18. HTML 학습 순서

1. **HTML 기본 구조** — `html`, `head`, `body`
2. **제목과 문단** — `h1`~`h6`, `p`, `br`, `hr`
3. **글자 꾸미기** — `strong`, `em`, `mark` 등
4. **링크와 이미지** — `a`, `img`
5. **목록** — `ul`, `ol`, `dl`
6. **표** — `table`, `tr`, `th`, `td`
7. **폼** — `form`, `input`, `select`, `textarea`
8. **레이아웃** — `div`, `span`
9. **시맨틱 태그** — `header`, `nav`, `main`, `section`, `article`, `footer`
10. **미디어** — `video`, `audio`, `iframe`
