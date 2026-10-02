import { useState, useMemo } from "react";

const books = [
  { id: 1, title: "자바의 정석", author: "남궁성", genre: "IT" },
  { id: 2, title: "토비의 스프링", author: "이일민", genre: "IT" },
  { id: 3, title: "데미안", author: "헤르만 헤세", genre: "소설" },
  { id: 4, title: "어린 왕자", author: "생텍쥐페리", genre: "소설" },
  { id: 5, title: "클린 코드", author: "로버트 마틴", genre: "IT" },
];

function Practice03_1() {
  // 검색어 상태
  const [keyword, setKeyword] = useState("");

  // 장르 상태
  const [genre, setGenre] = useState("전체");

  // keyword 또는 genre가 변경될 때만 다시 필터링
  const filtered = useMemo(() => {
    console.log("📚 도서 필터링");

    return books.filter((item) => {
      // 제목에 검색어가 포함되어 있는지 확인
      const keywordMatch = item.title.includes(keyword);

      // 전체이거나 선택한 장르와 같은지 확인
      const genreMatch = genre === "전체" || item.genre === genre;

      // 두 조건을 모두 만족해야 출력
      return keywordMatch && genreMatch;
    });
  }, [keyword, genre]);
  
  return (
    <div>
      <h2>도서 검색 기능</h2>

      {/* 제목 검색 */}
      <div>
        <input
          type="text"
          value={keyword}
          onChange={(e) => setKeyword(e.target.value)}
          placeholder="도서 제목 검색"
        />
      </div>

      {/* 장르 선택 */}
      <div>
        <label htmlFor="genre">장르 </label>

        <select
          id="genre"
          value={genre}
          onChange={(e) => setGenre(e.target.value)}
        >
          <option value="전체">전체</option>
          <option value="IT">IT</option>
          <option value="소설">소설</option>
        </select>
      </div>

      {/* 검색 결과 */}
      {filtered.length === 0 ? (
        <p>검색 결과가 없습니다.</p>
      ) : (
        filtered.map((book) => (
          <div key={book.id}>
            <strong>{book.title}</strong>
            <div>{book.genre}</div>
            <span>{book.author}</span>
          </div>
        ))
      )}
    </div>
  );
}

export default Practice03_1;