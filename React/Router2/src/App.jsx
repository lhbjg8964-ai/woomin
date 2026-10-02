import { BrowerRouter, Link, Routes, Route } from "react-router-dom";
import Home from "./pages/Home";
import About from "./pages/About";
import Products from "./pages/Products";
import Contact from "./pages/Contact";
import ProductDetail from "./pages/ProductDetail";

function App() {
  return (
    <BrowerRouter>
      <nav>
        <Link to="/">홈</Link>
        <Link to="/About">소개</Link>
        <Link to="/Products">상품</Link>
        <Link to="/Contact">연락처</Link>
      </nav>

      <Routes>
        <Route path="/" element={<Home />}></Route>
        <Route path="/About" element={<About />}></Route>
        <Route path="/Product" element={<Products />}></Route>
        <Route path="/Products/:id" element={<ProductDetail />} />
        <Route path="/Contact" element={<Contact />}></Route>
      </Routes>
    </BrowerRouter>
  );
}

export default App;
