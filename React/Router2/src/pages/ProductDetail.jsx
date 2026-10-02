import { useParams } from "react-router-dom";

function ProductDetail() {
  const { id } = useParams();

  return (
    <div>
      <h1>상품 상세</h1>
      <p>상품 번호 : {id}</p>
    </div>
  );
}

export default ProductDetail;