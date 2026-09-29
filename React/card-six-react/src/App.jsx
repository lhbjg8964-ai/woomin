import ServiceCard from "./ServiceCard";

const cards = [
  {
    id: 1,
    title: "웹 개발",
    text: "HTML · CSS · Bootstrap으로 반응형 사이트를 만듭니다.",
    img: "https://images.unsplash.com/photo-1498050108023-c5249f4df085?w=600&q=80",
    btn: "outline-primary",
  },
  {
    id: 2,
    title: "모바일 UI",
    text: "작은 화면 우선 Mobile First 레이아웃.",
    img: "https://images.unsplash.com/photo-1512941937669-90a1b58e7e9c?w=600&q=80",
    btn: "outline-success",
  },
  {
    id: 3,
    title: "쇼핑몰",
    text: "상품 카드 · Modal · Navbar 구성 예제.",
    img: "https://images.unsplash.com/photo-1460925895917-afdab827c52f?w=600&q=80",
    btn: "outline-danger",
  },
  {
    id: 4,
    title: "포트폴리오",
    text: "원페이지 · 탭 · 아코디언 활용.",
    img: "https://images.unsplash.com/photo-1524758631624-e2822e304c36?w=600&q=80",
    btn: "outline-secondary",
  },
  {
    id: 5,
    title: "JavaScript",
    text: "이벤트 · DOM · 인터랙션 기초.",
    img: "https://images.unsplash.com/photo-1555066931-4365d14bab8c?w=600&q=80",
    btn: "outline-warning",
  },
  {
    id: 6,
    title: "React",
    text: "컴포넌트 · Props · map 렌더링.",
    img: "https://images.unsplash.com/photo-1633356122544-f134324a6cee?w=600&q=80",
    btn: "outline-info",
  },
];

function App() {
  return (
    <>
      {/* 상단 네비게이션 */}
      <nav className="navbar navbar-dark bg-dark">
        <div className="container custom-container">
          <span className="navbar-brand mb-0 fs-6 fw-bold">
            ← Bootstrap 예제
          </span>

          <span className="navbar-text text-white-50 small">
            Card × 6 · 사진 포함
          </span>
        </div>
      </nav>

      {/* 메인 */}
      <main className="container custom-container py-5">

        {/* 제목 */}
        <div className="text-center mb-4">
          <h1 className="main-title">
            Bootstrap 카드 6장 (사진)
          </h1>

          <p className="main-desc">
            <code>card-img-top</code> +{" "}
            <code>col-12 col-md-6 col-lg-4</code>
            {" "}→ PC 3열 × 2행
          </p>
        </div>

        {/* 카드 */}
        <div className="row g-4">
          {cards.map((card) => (
            <div
              className="col-12 col-md-6 col-lg-4"
              key={card.id}
            >
              <ServiceCard card={card} />
            </div>
          ))}
        </div>

      </main>
    </>
  );
}

export default App;