// ProfileCard 컴포넌트
// App.jsx에서 전달한 값을 Props로 받아옴
//
// name  = 이름
// age   = 나이
// job   = 직업
// image = 이미지
function ProfileCard({ name, age, job, image }) {
  return (
    <div
      style={{
        width: "300px",
        border: "1px solid #ddd",
        borderRadius: "12px",
        boxShadow: "0 2px 8px rgba(0,0,0,0.1)",
      }}
    >

      {/* 프로필 이미지 */}
      <img
        src={image}
        // App.jsx에서 전달받은 이미지를 화면에 표시

        alt={name}
        // 이미지가 나오지 않을 경우 대신 표시되는 설명
        // 현재는 이름이 표시됨

        style={{
          width: "100%",
          height: "250px",
          objectFit: "cover",
          // 이미지 비율을 유지하면서
          // 지정된 영역을 꽉 채움
          // 이미지 일부가 잘릴 수 있음
          borderRadius: "8px",
        }}
      />

      {/* 이름 출력 */}
      <h2>{name}</h2>

      {/* 나이 출력 */}
      <p>나이: {age}세</p>

      {/* 직업 출력 */}
      <p>직업: {job}</p>

    </div>
  );
}
export default ProfileCard;