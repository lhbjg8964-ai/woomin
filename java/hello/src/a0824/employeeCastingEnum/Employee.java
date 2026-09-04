package a0824.employeeCastingEnum;

// 직원관리시스템 (enum + equals 버전)
// 추상클래스 : Employee라는 개념은 있지만 "그냥 직원" 객체는 만들지 않는다.
abstract class Employee {
    protected String name;
    protected int id;
    protected double baseSalary;
    protected EmployeeType type; // 고용 형태 (enum)

    public Employee(String name, int id, double baseSalary, EmployeeType type) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
        this.type = type;
    }

    abstract double calculateSalary();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public EmployeeType getType() {
        return type;
    }

    void printInfo() {
        System.out.println("ID: " + id
                + ", 이름: " + name
                + ", 유형: " + type.getLabel()
                + ", 기본급: " + baseSalary
                + ", 실급여: " + calculateSalary());
    }

    // equals : "이 객체와 저 객체가 같은 직원인가?"
    // 이름이 같아도 사번(id)이 다르면 다른 사람.
    // 사번이 같으면 이름·급여가 달라도 같은 직원으로 본다.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {          // 같은 주소를 가리키면 무조건 같음
            return true;
        }
        if (!(obj instanceof Employee)) { // 직원이 아니면 다름
            return false;
        }
        Employee other = (Employee) obj;
        return this.id == other.id; // 사번이 같으면 같은 직원
    }

    // equals를 재정의하면 hashCode도 같이 재정의해야 한다.
    // HashSet, HashMap이 같은 직원인지 찾을 때 hashCode를 먼저 사용한다.
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
