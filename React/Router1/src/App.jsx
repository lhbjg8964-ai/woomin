import {BrowserRouter,Link,Routes,Route} from 'react-router-dom'
import Home from './pages/Home'
import About from './pages/About'
import Products from './pages/Products'
import Contact from './pages/Contact'
import ProductDetail from './pages/ProductDetail'

function App() {
  return (
    <BrowserRouter>
      <nav style={{display:'flex', gap:'15px',marginBottom:'20px',justifyContent:'center'}}>
        <Link to="/">홈</Link>
        <Link to="/about">소개</Link>
        <Link to="/products">상품</Link>
        <Link to="/contact">연락처</Link>
      </nav>
      <Routes>
        <Route path="/" element={<Home/>} />
        <Route path="/About" element={<About/>} />
        <Route path="/Products"element={<Products />}/>
        <Route path="/Products/:id"element={<ProductDetail />}/>

        <Route path="/Contact" element={<Contact />} />
      </Routes>

    </BrowserRouter>
  )
}

export default App
// BrowserRouter 라우터 환경을 만들어줌
//Routes 여러개의 Route를관리 
// <Route path="/contact" element={<Contact />} /> contact 주소로 들어오면 <Contact /> 컴포넌트를 보여줘
//Link 이동 Link to="/about"  /about 이동