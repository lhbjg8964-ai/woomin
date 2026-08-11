package a0811.movie;

import java.util.ArrayList;

public class MovieManager {

    // 전체 영화 목록
    private ArrayList<Movie> movies = new ArrayList<>();

    // 대여한 영화 목록
    private ArrayList<Movie> rentedList = new ArrayList<>();

    // 생성자
    public MovieManager() {

        // 더미 데이터 3개
        this.movies.add(new Movie("Inception", "Nolan", "SF", "12"));
        this.movies.add(new Movie("Parasite", "Bong", "Drama", "15"));
        this.movies.add(new Movie("Toy Story", "Lasseter", "Animation", "All"));
    }

    // 1. 대여 가능한 영화 보기
    public void showAvailableMovies() {

        boolean found = false;

        for (Movie movie : movies) {

            if (movie.isAvailable()) {
                System.out.println(movie);
                found = true;
            }
        }

        if (!found) {
            System.out.println("대여 가능한 영화가 없습니다.");
        }
    }

    // 2. 영화 대여하기
    public boolean rent(String title) {

        for (Movie movie : movies) {

            // 영화 제목을 대소문자 구분 없이 비교
            if (movie.getTitle().equalsIgnoreCase(title)) {

                // 대여 가능한 상태라면
                if (movie.isAvailable()) {

                    // 대여 불가능 상태로 변경
                    movie.setAvailable(false);

                    // 대여 목록에 추가
                    rentedList.add(movie);

                    return true;
                }
            }
        }

        return false;
    }

    // 3. 대여한 영화 보기
    // rent(String title)과 이름은 같지만 매개변수가 다름
    // 메서드 오버로딩
    public void rent() {

        if (rentedList.isEmpty()) {
            System.out.println("대여한 영화가 없습니다.");
            return;
        }

        for (Movie movie : rentedList) {
            System.out.println(movie);
        }
    }

    // 4. 영화 추가하기
    public void addMovie(
            String title,
            String director,
            String genre,
            String rating) {

        Movie movie = new Movie(
                title,
                director,
                genre,
                rating
        );

        this.movies.add(movie);
    }

    // 5. 영화 삭제하기
    public boolean deleteMovie(String title) {

        for (int i = 0; i < movies.size(); i++) {

            Movie movie = movies.get(i);

            if (movie.getTitle().equalsIgnoreCase(title)) {

                // 대여 중이면 삭제 불가능
                if (!movie.isAvailable()) {
                    return false;
                }

                movies.remove(i);

                return true;
            }
        }

        return false;
    }

    // 6. 영화 정보 수정하기
    public boolean updateMovie(
            String title,
            int choice,
            String value) {

        for (Movie movie : movies) {

            if (movie.getTitle().equalsIgnoreCase(title)) {

                switch (choice) {

                    case 1:
                        movie.setTitle(value);
                        break;

                    case 2:
                        movie.setDirector(value);
                        break;

                    case 3:
                        movie.setGenre(value);
                        break;

                    case 4:
                        movie.setRating(value);
                        break;

                    default:
                        return false;
                }

                return true;
            }
        }

        return false;
    }

    // 7. 영화 내용 보기
    public void searchMovie(String title) {

        for (Movie movie : movies) {

            if (movie.getTitle().equalsIgnoreCase(title)) {

                System.out.println(movie);

                return;
            }
        }

        System.out.println("해당 영화를 찾을 수 없습니다.");
    }
}