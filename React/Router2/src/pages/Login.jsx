import { useNavigate } from "react-router-dom";

function Login() {
  const navigate = useNavigate();

  const handleLogin = () => {
    // 로그인 처리
    navigate("/");
  };

  return (
    <button onClick={handleLogin}>로그인</button>
  );
}

export default Login;