import { Link } from "react-router-dom";

export default function NotFound() {
  return (
    <article className="page page--center">
      <h1>HTTP Status 404 – Not Found</h1>
      <p>
        페이지를 찾을 수 없습니다. 요청하신 페이지가 존재하지 않거나 주소가 변경
        또는 삭제되었습니다. 입력하신 주소가 정확한지 다시 한번 확인해 주세요.
      </p>
      <Link to="/" className="btn-primary">
        홈으로 돌아가기
      </Link>
    </article>
  );
}
