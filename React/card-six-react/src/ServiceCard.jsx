function ServiceCard({ card }) {
  return (
    <div className="card h-100 shadow-sm border-0">

      {/* 이미지 */}
      <img
        src={card.img}
        className="card-img-top"
        alt={card.title}
      />

      {/* 카드 내용 */}
      <div className="card-body">

        <h5 className="card-title">
          {card.title}
        </h5>

        <p className="card-text text-muted small">
          {card.text}
        </p>

        <a
          href="#"
          className={`btn btn-sm btn-${card.btn}`}
        >
          자세히
        </a>

      </div>
    </div>
  );
}

export default ServiceCard;