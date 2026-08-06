# Java 객체 지향 문제集 (추상 클래스 · 인터페이스 포함)

> 클래스, 객체, 상속, 다형성, 추상 클래스, 인터페이스까지 학습한 내용을 점검하는 문제입니다.  
> 난이도: ★(기초) · ★★(중급) · ★★★(심화)

---

## 목차

1. [객체 지향 기본](#1-객체-지향-기본)
2. [상속과 다형성](#2-상속과-다형성)
3. [추상 클래스](#3-추상-클래스)
4. [인터페이스](#4-인터페이스)
5. [추상 클래스 + 인터페이스 통합](#5-추상-클래스--인터페이스-통합)
6. [코딩 실습 문제](#6-코딩-실습-문제)
7. [정답 및 해설](#7-정답-및-해설)

---

## 1. 객체 지향 기본

### 문제 1-1 ★
다음 중 **객체 지향 프로그래밍(OOP)** 의 4가지 특징이 **아닌** 것은?

- (1) 캡슐화 (Encapsulation)
- (2) 상속 (Inheritance)
- (3) 다형성 (Polymorphism)
- (4) 순차성 (Sequentiality)

---

### 문제 1-2 ★
클래스와 객체에 대한 설명으로 **올바른** 것은?

- (1) 클래스는 실제 메모리에 생성된 존재이다.
- (2) 객체는 클래스를 기반으로 만들어진 실체(instance)이다.
- (3) 하나의 클래스로 객체iz는 1개만 만들 수 있다.
- (4) 객체는 `class` 키워드로 선언한다.

---

### 문제 1-3 ★
다음 코드의 실행 결과는?

```java
public class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void printInfo() {
        System.out.println(name + " : " + score + "점");
    }
}

// main
Student s1 = new Student("김철수", 85);
Student s2 = new Student("이영희", 92);
s1.printInfo();
s2.printInfo();
```

---

### 문제 1-4 ★★
**캡슐화**를 위해 `private` 필드와 `public` getter/setter를 사용하는 이유로 가장 적절한 것은?

- (1) 코드를 길게 만들기 위해
- (2) 필드에 직접 접근하지 못하게 하고, 유효한 값만 설정하도록 제어하기 위해
- (3) 상속을 막기 위해
- (4) 객체 생성을 막기 위해

---

### 문제 1-5 ★★
다음 코드에서 컴파일 오류가 발생하는 이유는?

```java
public class Person {
    private String name;

    public Person(String name) {
        name = name;  // this.name = name; 이 아님
    }

    public String getName() {
        return name;
    }
}

// main
Person p = new Person("홍길동");
System.out.println(p.getName());
```

---

## 2. 상속과 다형성

### 문제 2-1 ★
다음 중 **상속**에 대한 설명으로 **틀린** 것은?

- (1) 자식 클래스는 부모 클래스의 멤버를 물려받는다.
- (2) Java에서 클래스는 여러 클래스를 동시에 상속(extends)할 수 있다.
- (3) `super()`는 부모 클래스의 생성자를 호출한다.
- (4) `@Override`는 부모 메서드를 재정의할 때 사용한다.

---

### 문제 2-2 ★
다음 코드의 실행 결과는?

```java
class Parent {
    void hello() {
        System.out.println("부모");
    }
}

class Child extends Parent {
    @Override
    void hello() {
        System.out.println("자식");
    }
}

// main
Parent p = new Child();
p.hello();
```

---

### 문제 2-3 ★★
**다형성(Polymorphism)** 이란?

- (1) 하나의 클래스에 여러 생성자를 만드는 것
- (2) 부모 타입 참조 변수로 자식 객체를 참조하는 것
- (3) private 필드를 public으로 바꾸는 것
- (4) interface를 class로 바꾸는 것

---

### 문제 2-4 ★★
다음 코드의 실행 결과는?

```java
class Shape {
    void draw() {
        System.out.println("도형");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("원");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("사각형");
    }
}

// main
Shape[] shapes = { new Circle(), new Rectangle(), new Shape() };
for (Shape s : shapes) {
    s.draw();
}
```

---

### 문제 2-5 ★★
`instanceof` 연산자에 대한 설명으로 **올바른** 것은?

- (1) 객체가 특정 클래스(또는 인터페이스)의 인스턴스인지 확인한다.
- (2) 두 객체의 값이 같은지 비교한다.
- (3) 객체를 다른 타입으로 강제 변환한다.
- (4) 객체를 삭제한다.

---

## 3. 추상 클래스

### 문제 3-1 ★
**추상 클래스(abstract class)** 에 대한 설명으로 **올바른** 것은?

- (1) `new` 키워드로 바로 객체를 생성할 수 있다.
- (2) 추상 메서드와 일반 메서드를 모두 가질 수 있다.
- (3) Java에서 여러 추상 클래스를 동시에 상속할 수 있다.
- (4) 생성자를 가질 수 없다.

---

### 문제 3-2 ★
다음 중 **추상 메서드** 선언이 **올바른** 것은?

- (1) `public void run() { }`
- (2) `abstract public void run();`
- (3) `public abstract void run() { }`
- (4) `abstract void run() = null;`

---

### 문제 3-3 ★★
`abstract1` 패키지의 `Animal` 클래스를 참고할 때, 다음 코드 중 **컴파일 오류**가 나는 것은?

```java
// Animal: abstract class, abstract void makeSound();
```

- (1) `Animal dog = new Dog("뽀삐");`
- (2) `Dog dog = new Dog("뽀삐");`
- (3) `Animal animal = new Animal("동물");`
- (4) `dog.eat();`

---

### 문제 3-4 ★★
다음 코드의 실행 결과는?

```java
abstract class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    abstract void start();

    public void info() {
        System.out.println("브랜드: " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    void start() {
        System.out.println(brand + " 자동차 시동");
    }
}

// main
Vehicle v = new Car("현대");
v.info();
v.start();
```

---

### 문제 3-5 ★★
`abstract2` 패키지의 `Employee` 예제를 기반으로, `Intern`(인턴) 클래스를 추가한다면 **반드시 구현해야 하는** 메서드는?

```java
abstract class Employee {
    String name;
    public Employee(String name) { this.name = name; }
    public void work() { System.out.println(name + "이(가) 근무 중입니다."); }
    public abstract int getSalary();
}
```

---

### 문제 3-6 ★★★
다음 설명 중 **틀린** 것은?

- (1) 추상 클래스는 미완성 설계도이다.
- (2) 자식 클래스에서 추상 메서드를 반드시 `@Override`로 구현해야 한다.
- (3) 추상 클래스 안에 일반 메서드도 작성할 수 있다.
- (4) 추상 클래스를 상속받은 자식은 반드시 abstract로 선언해야 한다.

---

## 4. 인터페이스

### 문제 4-1 ★
**인터페이스(interface)** 에 대한 설명으로 **올바른** 것은?

- (1) `extends` 키워드로 구현한다.
- (2) 필드는 기본적으로 `public static final`이다.
- (3) 객체를 직접 생성할 수 있다.
- (4) 한 클래스는 하나의 인터페이스만 구현할 수 있다.

---

### 문제 4-2 ★
다음 중 인터페이스 선언이 **올바른** 것은?

- (1) `abstract interface Flyable { void fly(); }`
- (2) `class Flyable { abstract void fly(); }`
- (3) `interface Flyable { void fly(); }`
- (4) `interface Flyable { public void fly() { } }`

---

### 문제 4-3 ★★
`interface1` 패키지를 참고할 때, `Bird`와 `AirPlane`의 공통점은?

- (1) 둘 다 `Animal`을 상속한다.
- (2) 둘 다 `Flayable` 인터페이스를 `implements`한다.
- (3) 둘 다 추상 클래스이다.
- (4) 둘 다 생성자가 없다.

---

### 문제 4-4 ★★
다음 코드의 실행 결과는?

```java
interface Printable {
    void print();
}

class Book implements Printable {
    @Override
    public void print() {
        System.out.println("책 출력");
    }
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("보고서 출력");
    }
}

// main
Printable[] items = { new Book(), new Report() };
for (Printable item : items) {
    item.print();
}
```

---

### 문제 4-5 ★★
**추상 클래스 vs 인터페이스** 비교표에서 **올바르게 짝지어진** 것은?

| 구분 | 추상 클래스 | 인터페이스 |
|------|------------|-----------|
| (1) | `implements` | `extends` |
| (2) | 다중 상속 가능 | 단일 상속만 |
| (3) | 생성자 있음 | 생성자 없음 |
| (4) | 필드: 상수만 | 필드: 일반 변수 |

---

### 문제 4-6 ★★★
한 클래스가 **추상 클래스를 상속**하면서 **여러 인터페이스를 구현**할 수 있는 선언은?

- (1) `class Duck extends Animal, Flyable, Swimmable`
- (2) `class Duck implements Animal extends Flyable, Swimmable`
- (3) `class Duck extends Animal implements Flyable, Swimmable`
- (4) `class Duck implements Animal, Flyable extends Swimmable`

---

## 5. 추상 클래스 + 인터페이스 통합

### 문제 5-1 ★★
`interab` 패키지에서 `Duck` 클래스가 구현(상속)하는 것을 **모두** 고르시오.

- (1) `Animal` (추상 클래스)
- (2) `Flyable` (인터페이스)
- (3) `Swimmable` (인터페이스)
- (4) `Bird` (클래스)

---

### 문제 5-2 ★★
다음 중 `interab` 패키지의 `Fish` 클래스가 **구현하지 않는** 메서드는?

- (1) `swim()`
- (2) `fly()`
- (3) `makeSound()`
- (4) `move()`

---

### 문제 5-3 ★★
다음 코드의 실행 결과는?

```java
abstract class Animal {
    String name;
    public Animal(String name) { this.name = name; }
    public abstract void makeSound();
}

interface Runnable {
    void run();
}

class Dog extends Animal implements Runnable {
    public Dog(String name) { super(name); }
    @Override public void makeSound() { System.out.println("멍멍"); }
    @Override public void run() { System.out.println(name + " 달린다"); }
}

// main
Animal a = new Dog("바둑");
a.makeSound();
((Runnable) a).run();
```

---

### 문제 5-4 ★★★
다음 배열 선언 중 **컴파일 오류**가 발생하는 것은?

```java
Bird bird = new Bird("짹짹", 1, "참새");
Fish fish = new Fish("니모", 2, "바다");
Duck duck = new Duck("도날드", 3, "노란색");
```

- (1) `Animal[] animals = { bird, fish, duck };`
- (2) `Flyable[] flyables = { bird, duck };`
- (3) `Swimmable[] swimmables = { fish, duck };`
- (4) `Flyable[] flyables = { bird, fish, duck };`

---

### 문제 5-5 ★★★
인터페이스를 사용하는 **주된 목적**으로 가장 적절한 것은?

- (1) 공통 필드를 많이 저장하기 위해
- (2) 서로 다른 클래스들이 같은 행동(규칙)을 반드시 갖도록 강제하기 위해
- (3) 객체 생성을 막기 위해
- (4) main 메서드를 대체하기 위해

---

## 6. 코딩 실습 문제

> 아래 문제는 `a0804` 폴더에 새 패키지를 만들어 직접 코드를 작성해 보세요.

---

### 실습 6-1 ★ — 도형 클래스 만들기

**요구사항**

1. `Shape` 추상 클래스를 만든다.
   - 필드: `color` (String)
   - 일반 메서드: `info()` → `"색상: " + color` 출력
   - 추상 메서드: `area()` → 넓이 반환 (double)

2. `Circle`(반지름 `radius`), `Rectangle`(가로 `width`, 세로 `height`) 클래스를 만든다.

3. `Main`에서 다형성 배열로 넓이를 출력한다.

**예상 출력**
```
색상: 빨강
원 넓이: 78.5
색상: 파랑
사각형 넓이: 24.0
```

> 원 넓이: `Math.PI * radius * radius`  
> 사각형 넓이: `width * height`

---

### 실습 6-2 ★★ — 결제 시스템

**요구사항**

1. `Payable` 인터페이스
   - `void pay(int amount);`

2. `CreditCard`, `KakaoPay` 클래스가 `Payable`을 구현한다.
   - CreditCard: `"카드 결제: " + amount + "원"`
   - KakaoPay: `"카카오페이 결제: " + amount + "원"`

3. `Main`에서 `Payable[]` 배열로 3000원, 15000원 결제를 순서대로 출력한다.

---

### 실습 6-3 ★★ — 게임 캐릭터

**요구사항**

1. `Character` 추상 클래스
   - 필드: `name`, `hp`
   - 생성자, `attack()` 추상 메서드, `status()` 일반 메서드 (`"HP: " + hp` 출력)

2. `Warrior` — `attack()`: `"검으로 공격!"`, `hp = 100`
3. `Mage` — `attack()`: `"마법 공격!"`, `hp = 60`

3. `Main`에서 `Character[]`로 각 캐릭터의 `status()`와 `attack()` 호출

**예상 출력**
```
HP: 100
검으로 공격!
HP: 60
마법 공격!
```

---

### 실습 6-4 ★★★ — 스마트 기기 (추상 + 인터페이스)

**요구사항**

1. `Device` 추상 클래스
   - 필드: `name`
   - 추상 메서드: `turnOn()`
   - 일반 메서드: `info()` → `"기기: " + name`

2. `Connectable` 인터페이스 — `void connect()`

3. `SmartTV` — `Device` 상속 + `Connectable` 구현
   - `turnOn()`: `"TV 켜짐"`
   - `connect()`: `"Wi-Fi 연결"`

4. `RobotVacuum` — `Device` 상속 + `Connectable` 구현
   - `turnOn()`: `"청소기 작동"`
   - `connect()`: `"앱 연결"`

5. `Main`에서
   - `Device[]`로 `turnOn()` 호출
   - `Connectable[]`로 `connect()` 호출

---

### 실습 6-5 ★★★ — 오개념 수정하기

아래 코드에는 **3가지 오류**가 있다. 찾아서 수정하고 실행 결과를 적으시오.

```java
abstract class Animal {
    abstract void makeSound();
}

interface Walkable {
    void walk();
}

class Rabbit extends Walkable {
    @Override void makeSound() {
        System.out.println("토끼");
    }
    void walk() {
        System.out.println("깡충");
    }
}

public class Main {
    public static void main(String[] args) {
        Walkable w = new Rabbit();
        w.makeSound();
        w.walk();
    }
}
```

---

## 7. 정답 및 해설

<details>
<summary><strong>1. 객체 지향 기본 — 정답</strong></summary>

| 문제 | 정답 | 해설 |
|------|------|------|
| 1-1 | (4) | OOP 4대 특징: 캡슐화, 상속, 다형성, **추상화** |
| 1-2 | (2) | 클래스=설계도, 객체=실체(instance) |
| 1-3 | `김철수 : 85점` / `이영희 : 92점` | 각 객체가 독립적인 필드 값을 가짐 |
| 1-4 | (2) | private + getter/setter로 데이터 무결성 보호 |
| 1-5 | `this.name = name;` 미사용 | 매개변수 `name`이 필드 `name`을 가림. `this` 필요 |

</details>

<details>
<summary><strong>2. 상속과 다형성 — 정답</strong></summary>

| 문제 | 정답 | 해설 |
|------|------|------|
| 2-1 | (2) | Java 클래스는 **단일 상속**만 가능 |
| 2-2 | `자식` | 다형성: 부모 참조 → 실제 객체(Child)의 메서드 실행 |
| 2-3 | (2) | 같은 타입 참조로 다양한 객체를 다루는 것 |
| 2-4 | `원` / `사각형` / `도형` | 향상된 for + 오버라이딩 |
| 2-5 | (1) | `obj instanceof Type` 형태로 사용 |

</details>

<details>
<summary><strong>3. 추상 클래스 — 정답</strong></summary>

| 문제 | 정답 | 해설 |
|------|------|------|
| 3-1 | (2) | 추상 클래스는 직접 생성 불가, 일반+추상 메서드 가능 |
| 3-2 | (2) | 추상 메서드는 선언만, `{}` 몸체 없음 |
| 3-3 | (3) | 추상 클래스는 `new`로 생성 불가 |
| 3-4 | `브랜드: 현대` / `현대 자동차 시동` | 다형성 + 추상 메서드 구현 |
| 3-5 | `getSalary()` | 추상 메서드는 자식에서 반드시 구현 |
| 3-6 | (4) | 추상 메서드를 모두 구현하면 **일반 클래스** 가능 |

</details>

<details>
<summary><strong>4. 인터페이스 — 정답</strong></summary>

| 문제 | 정답 | 해설 |
|------|------|------|
| 4-1 | (2) | 인터페이스 필드는 public static final |
| 4-2 | (3) | interface 키워드, 메서드는 abstract (Java 8+ default 제외) |
| 4-3 | (2) | 서로 다른 클래스가 같은 fly() 규칙 공유 |
| 4-4 | `책 출력` / `보고서 출력` | 인터페이스 타입 배열 + 다형성 |
| 4-5 | (3) | 추상 클래스=생성자 O, 인터페이스=생성자 X |
| 4-6 | (3) | extends 1개 + implements 여러 개 |

</details>

<details>
<summary><strong>5. 추상 + 인터페이스 통합 — 정답</strong></summary>

| 문제 | 정답 | 해설 |
|------|------|------|
| 5-1 | (1)(2)(3) | Duck = Animal + Flyable + Swimmable |
| 5-2 | (2) | Fish는 Swimmable만, fly() 없음 |
| 5-3 | `멍멍` / `바둑 달린다` | Animal 참조 + Runnable 캐스팅 |
| 5-4 | (4) | Fish는 Flyable이 아님 |
| 5-5 | (2) | 인터페이스 = 행동(규칙) 표준화 |

</details>

<details>
<summary><strong>6. 코딩 실습 — 참고 답안</strong></summary>

### 실습 6-5 오류 3가지

1. `extends Walkable` → **`implements Walkable`** (인터페이스는 implements)
2. `makeSound()` 접근 제어자 → **`public`** (부모보다 좁게 줄 수 없음)
3. `w.makeSound()` → **`Animal`/`Rabbit` 타입으로 참조**하거나, Walkable에는 makeSound() 없음

**수정 예시**
```java
class Rabbit extends Animal implements Walkable {
    @Override public void makeSound() { System.out.println("토끼"); }
    @Override public void walk() { System.out.println("깡충"); }
}

Animal a = new Rabbit();
a.makeSound();
((Walkable) a).walk();
```

**실행 결과**
```
토끼
깡충
```

</details>

---

## 학습 체크리스트

- [ ] 클래스와 객체의 차이를 설명할 수 있다.
- [ ] `extends`, `@Override`, `super()`를 사용할 수 있다.
- [ ] 다형성과 `instanceof`를 이해했다.
- [ ] 추상 클래스와 추상 메서드를 작성할 수 있다.
- [ ] 인터페이스를 선언하고 `implements`할 수 있다.
- [ ] 추상 클래스 1개 + 인터페이스 여러 개를 조합할 수 있다.
- [ ] 부모 타입 / 인터페이스 타입 배열로 객체를 관리할 수 있다.

---

> 💡 **풀이 팁**: 객관식은 `abstract1` ~ `interab` 예제 코드를 직접 실행해 보면서 확인하면 더 잘 기억됩니다.
