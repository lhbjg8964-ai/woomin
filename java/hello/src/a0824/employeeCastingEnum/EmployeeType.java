package a0824.employeeCastingEnum;

// enum(열거형) : 미리 정해 둔 값만 사용할 수 있는 타입
// 직원 종류는 "정규직 / 파트타임 / 매니저" 세 가지만 존재한다.
// String으로 "정규직", "정규", "fulltime" 처럼 제각각 쓰면 오타·비교가 어려워진다.
public enum EmployeeType {
    FULL_TIME("정규직"),
    PART_TIME("파트타임"),
    MANAGER("매니저");

    private final String label; // 화면/출력용 한글 이름

    EmployeeType(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
