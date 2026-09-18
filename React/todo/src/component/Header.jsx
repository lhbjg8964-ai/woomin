import "./Header.css";

function Header() {
  return (
    <div className="Header">
      <h1>{new Date().toDateString()}</h1>
      <h3>오늘은 📆</h3>
    </div>
  );
}

export default Header;
