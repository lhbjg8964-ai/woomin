// ProfileCard 컴포넌트를 불러옴
// components 폴더 안의 ProfileCard.jsx 파일을 가져오는 것
import ProfileCard from "./components/ProfileCard";

// src/image 폴더 안에 있는 이미지 3개를 불러옴
// 파일 확장자가 jpg라면 이렇게 작성
import image1 from "./image/1.jpg";
import image2 from "./image/2.jpg";
import image3 from "./image/3.jpg";

// App 컴포넌트 시작
function App() {
  return (
    // 전체 내용을 감싸는 div
    // padding은 화면 가장자리와 내용 사이의 여백
    <div style={{ padding: "30px" }}>

      {/* 페이지 제목 */}
      <h1>프로필 카드</h1>

      {/* 프로필 카드들을 감싸는 영역 */}
      <div
        style={{
          display: "flex", // 카드들을 가로 방향으로 배치
          gap: "20px", // 카드 사이 간격
          flexWrap: "wrap", // 화면이 좁아지면 다음 줄로 내려가도록 설정
        }}
      >

        {/* 첫 번째 프로필 카드 */}
        <ProfileCard
          name="홍길동" // 이름을 ProfileCard로 전달
          age={25} // 나이를 숫자로 전달
          job="프론트엔드 개발자" // 직업 전달
          image={image1} // 1번 이미지 전달
        />

        {/* 두 번째 프로필 카드 */}
        <ProfileCard
          name="김철수" // 이름
          age={28} // 나이
          job="백엔드 개발자" // 직업
          image={image2} // 2번 이미지
        />

        {/* 세 번째 프로필 카드 */}
        <ProfileCard
          name="이영희" // 이름
          age={24} // 나이
          job="웹 디자이너" // 직업
          image={image3} // 3번 이미지
        />

      </div>
    </div>
  );
}

// 다른 파일에서 App 컴포넌트를 사용할 수 있도록 내보냄
export default App;