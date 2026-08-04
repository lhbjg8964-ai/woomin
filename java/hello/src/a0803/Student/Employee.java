package a0803.Student;

public class Employee {

    // 필드
    private int empNo;          // 사원번호
    private String name;        // 이름
    private int salary;         // 기본급
    private int bonus;          // 보너스
    private int totalSalary;    // 총급여


    // 생성자
    public Employee(int empNo, String name, int salary, int bonus) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;

        // 객체를 만들 때 총급여 계산
        calcSalary();
    }


    // 총급여 계산
    public void calcSalary() {
        totalSalary = salary + bonus;
    }


    // 직원 정보 출력
    public void printInfo() {
        System.out.println(
                empNo + "\t" +
                name + "\t" +
                salary + "\t" +
                bonus + "\t" +
                totalSalary
        );
    }


    // Getter
    public int getEmpNo() {
        return empNo;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public int getBonus() {
        return bonus;
    }

    public int getTotalSalary() {
        return totalSalary;
    }


    // Setter
    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setName(String name) {
        this.name = name;
    }


    // 기본급이 변경되면 총급여도 다시 계산
    public void setSalary(int salary) {
        this.salary = salary;
        calcSalary();
    }


    // 보너스가 변경되면 총급여도 다시 계산
    public void setBonus(int bonus) {
        this.bonus = bonus;
        calcSalary();
    }
}