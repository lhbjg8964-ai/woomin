public class Student {

    // 학생 정보 필드
    private String studentId; // 학번
    private String name;      // 이름
    private int age;          // 나이
    private int score;        // 점수

    // 생성자
    public Student(String studentId, String name, int age, int score) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // Getter
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }

    // Setter
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // 학생 정보를 문자열로 반환
    @Override
    public String toString() {
        return "학번: " + studentId
                + ", 이름: " + name
                + ", 나이: " + age
                + ", 점수: " + score;
    }
}