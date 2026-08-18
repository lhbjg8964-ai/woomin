package a0814;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class BookMain {

    public static void main(String[] args) {

        Author jkRowling = new Author("J.K. Rowling", "UK");
        Author georgeOrwell = new Author("George Orwell", "UK");
        Author harukiMurakami = new Author("Haruki Murakami", "Japan");
        Author stephenKing = new Author("Stephen King", "USA");
        Author leoTolstoy = new Author("Leo Tolstoy", "Russia");

        List<Book> books = Arrays.asList(
            new Book(jkRowling, 1997, 15000, "Harry Potter"),
            new Book(georgeOrwell, 1949, 12000, "1984"),
            new Book(harukiMurakami, 2002, 18000, "Kafka on the Shore"),
            new Book(stephenKing, 1977, 20000, "The Shining"),
            new Book(jkRowling, 1998, 15000, "Harry Potter 2"),
            new Book(georgeOrwell, 1945, 11000, "Animal Farm"),
            new Book(harukiMurakami, 2013, 19000, "Colorless Tsukuru"),
            new Book(stephenKing, 1986, 22000, "It"),
            new Book(leoTolstoy, 1869, 25000, "War and Peace")
        );

        System.out.println("문제 1");
        System.out.println(practice1(books));

        System.out.println("\n문제 2");
        System.out.println(practice2(books));

        System.out.println("\n문제 3");
        System.out.println(practice3(books));

        System.out.println("\n문제 4");
        System.out.println(practice4(books));

        System.out.println("\n문제 5");
        System.out.println(practice5(books));

        System.out.println("\n문제 6");
        System.out.println(practice6(books));

        System.out.println("\n문제 7");
        System.out.println(practice7(books));

        System.out.println("\n문제 8");
        System.out.println(practice8(books));

        System.out.println("\n문제 9");
        System.out.println(practice9(books));

        System.out.println("\n문제 10");
        OptionalDouble average = practice10(books);

        if (average.isPresent()) {
            System.out.printf("%.1f원\n", average.getAsDouble());
        } else {
            System.out.println("도서가 없습니다.");
        }
    }

    // 문제 1: 2000년 이후 출판된 도서를 가격 오름차순으로 정렬
    public static List<Book> practice1(List<Book> books) {

        return books.stream()
                .filter(book -> book.getYear() >= 2000)
                .sorted(Comparator.comparingInt(Book::getPrice))
                .collect(Collectors.toList());
    }

    // 문제 2: 도서가 출판된 국가를 중복 없이 나열
    public static List<String> practice2(List<Book> books) {

        return books.stream()
                .map(book -> book.getAuthor().getCountry())
                .distinct()
                .collect(Collectors.toList());
    }

    // 문제 3: UK 출신 저자의 도서를 제목순으로 정렬
    public static List<Book> practice3(List<Book> books) {

        return books.stream()
                .filter(book ->
                    book.getAuthor().getCountry().equals("UK"))
                .sorted(Comparator.comparing(Book::getTitle))
                .collect(Collectors.toList());
    }

    // 문제 4: Japan 출신 저자가 있는지 확인
    public static boolean practice4(List<Book> books) {

        return books.stream()
                .anyMatch(book ->
                    book.getAuthor().getCountry().equals("Japan"));
    }

    // 문제 5: USA 출신 저자의 모든 도서 가격
    public static List<Integer> practice5(List<Book> books) {

        return books.stream()
                .filter(book ->
                    book.getAuthor().getCountry().equals("USA"))
                .map(Book::getPrice)
                .collect(Collectors.toList());
    }

    // 문제 6: 저자 이름을 중복 없이 알파벳 순으로 정렬
    public static List<String> practice6(List<Book> books) {

        return books.stream()
                .map(book -> book.getAuthor().getName())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // 문제 7: 가장 비싼 도서 찾기
    public static Book practice7(List<Book> books) {

        return books.stream()
                .max(Comparator.comparingInt(Book::getPrice))
                .orElse(null);
    }

    // 문제 8: 가장 저렴한 도서의 가격 구하기
    public static int practice8(List<Book> books) {

        return books.stream()
                .min(Comparator.comparingInt(Book::getPrice))
                .map(Book::getPrice)
                .orElse(0);
    }

    // 문제 9: 국가별 도서 수 집계
    public static Map<String, Long> practice9(List<Book> books) {

        return books.stream()
                .collect(Collectors.groupingBy(
                    book -> book.getAuthor().getCountry(),
                    LinkedHashMap::new,
                    Collectors.counting()
                ));
    }

    // 문제 10: 모든 도서의 평균 가격 구하기
    public static OptionalDouble practice10(List<Book> books) {

        return books.stream()
                .mapToInt(Book::getPrice)
                .average();
    }
}