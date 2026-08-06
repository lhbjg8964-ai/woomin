# a0804 — 추상 클래스 & 인터페이스 학습

Java **추상 클래스(abstract class)** 와 **인터페이스(interface)** 개념을 단계별로 학습하는 예제 모음입니다.

---

## 폴더 구조

```
a0804/
├── abstract1/      # 추상 클래스 기초 (동물 예제)
├── abstract2/      # 추상 클래스 활용 (직원 급여 예제)
├── interface1/     # 인터페이스 기초 (날기 예제)
├── interface2/     # 인터페이스 활용 (리모컨 예제)
└── interab/        # 추상 클래스 + 인터페이스 통합 (동물 생태계)
```

---

## 1. abstract1 — 추상 클래스 기초

> 동물 소리를 추상 메서드로 정의하고, 자식 클래스에서 구현하는 예제

| 파일 | 설명 |
|------|------|
| `Animal.java` | 추상 클래스. `makeSound()` 추상 메서드 + `eat()` 일반 메서드 |
| `Dog.java` | `Animal` 상속. `makeSound()` → "멍멍" |
| `Cat.java` | `Animal` 상속. `makeSound()` → "야옹" |
| `MainAni1.java` | 실행 클래스. 다형성으로 `Animal` 타입 참조 |

**핵심 개념**
- 추상 클래스는 **객체 생성 불가** (미완성 설계도)
- **상속(extends)** 으로 완성 후 사용
- **추상 메서드** + **일반 메서드** 모두 가질 수 있음

**실행 예시**
```
뽀삐이(가) 먹습니다.
뽀삐이(가) 멍멍 짖습니다.
나비이(가) 먹습니다.
나비이(가) 야옹 웁니다.
```

---

## 2. abstract2 — 추상 클래스 활용 (급여 계산)

> 직원 공통 행동은 부모에, 급여 계산은 자식마다 다르게 구현

| 파일 | 설명 |
|------|------|
| `Employee.java` | 추상 클래스. `work()` 일반 메서드 + `getSalary()` 추상 메서드 |
| `FullTime.java` | 정규직. 급여 3,500,000원 |
| `PartTime.java` | 파트타임. 급여 1,800,000원 |
| `Main.java` | 실행 클래스 |

**실행 예시**
```
홍길동이(가) 근무 중입니다.
급여 : 3500000
이순신이(가) 근무 중입니다.
급여 : 1800000
```

---

## 3. interface1 — 인터페이스 기초

> `Flyable` 인터페이스를 구현하는 서로 다른 클래스 예제

| 파일 | 설명 |
|------|------|
| `Flayable.java` | 인터페이스. `fly()` 메서드 선언 |
| `Bird.java` | "새가 날아갑니다." |
| `AirPlane.java` | "비행기가 이륙합니다." |
| `Main.java` | 실행 클래스 + **추상 vs 인터페이스 비교표** 주석 |

**핵심 개념**
- `interface` 키워드 사용, **객체 생성 불가**
- 필드는 `public static final`(상수)만 가능
- 메서드는 기본적으로 `public abstract`
- **한 클래스가 여러 인터페이스 구현 가능**

### 추상 클래스 vs 인터페이스

| 구분 | 추상 클래스 | 인터페이스 |
|------|------------|-----------|
| 키워드 | `abstract` | `interface` |
| 상속/구현 | `extends` | `implements` |
| 다중 상속 | 1개만 | 여러 개 가능 |
| 필드 | 일반 변수 | `public static final` 상수 |
| 메서드 | 일반 + 추상 | 추상 메서드 |
| 생성자 | 있음 | 없음 |
| 목적 | 기능 + 규칙 | 규칙(표준) |

---

## 4. interface2 — 인터페이스 활용 (리모컨)

> 공통 인터페이스 `RemoteControl`로 TV와 에어컨을 통일된 방식으로 제어

| 파일 | 설명 |
|------|------|
| `RemoteControl.java` | 인터페이스. `powerOn()`, `powerOff()` |
| `TV.java` | TV 전원 ON/OFF |
| `AirConditioner.java` | 에어컨 ON/OFF |
| `Main.java` | 실행 클래스 |

**실행 예시**
```
TV 전원 ON
에어컨 ON
```

---

## 5. interab — 추상 클래스 + 인터페이스 통합

> 동물 생태계를 통해 **상속**, **다중 인터페이스 구현**, **다형성**을 종합 학습

| 파일 | 설명 |
|------|------|
| `Animal.java` | 추상 클래스. `name`, `age` + `eat()`, `sleep()` + 추상 `makeSound()`, `move()` |
| `Flyable.java` | 인터페이스. `fly()` |
| `Swimmable.java` | 인터페이스. `swim()` |
| `Bird.java` | `Animal` 상속 + `Flyable` 구현 (참새) |
| `Fish.java` | `Animal` 상속 + `Swimmable` 구현 (바다 물고기) |
| `Duck.java` | `Animal` 상속 + `Flyable`, `Swimmable` **동시 구현** (오리) |
| `Main.java` | 실행 클래스. 다형성 + 인터페이스 배열 활용 |

### 클래스 관계도

```
        Animal (abstract)
       /   |   \
    Bird  Fish  Duck
      |     |    / \
  Flyable  Swimmable
              Flyable
```

### 다형성 예시 (Main.java)

```java
// 부모 타입으로 자식 객체 관리
Animal[] animals = {bird, fish, duck};

// 같은 기능(날기)을 가진 객체를 하나로 관리
Flyable[] flyables = {bird, duck};

// 같은 기능(수영)을 가진 객체를 하나로 관리
Swimmable[] swimmables = {fish, duck};
```

---

## 학습 순서 권장

1. **abstract1** → 추상 클래스 기본 개념
2. **abstract2** → 추상 메서드 실무 활용
3. **interface1** → 인터페이스 기본 + 추상과 비교
4. **interface2** → 인터페이스 실무 활용
5. **interab** → 추상 + 인터페이스 + 다형성 종합

---

## 실행 방법

각 패키지의 `Main` (또는 `MainAni1`) 클래스를 실행합니다.

```bash
# 예: abstract1 실행
javac a0804/abstract1/*.java
java a0804.abstract1.MainAni1

# 예: interab 실행
javac a0804/interab/*.java
java a0804.interab.Main
```

> IDE에서 해당 Main 클래스를 우클릭 → Run 으로 실행해도 됩니다.
