# 221005-IntelliJ-gitpush-constructor-list

# 1. IntelliJ에서 git push하기
## 1. IntelliJ에서 git push하기
 1) github에 Repository만들기
 2) IntelliJ에 자바 프로젝트 생성 후 코드 작성
 3) IntelliJ 상단 VCS탭에 Create Git Repository 클릭
 4) 왼쪽 프로젝트이름이 빨갛게 변했는지 확인
 5) 왼쪽 탭에 Commit 클릭
 6) 커밋메세지 작성후 commit 클릭
 7) IntelliJ의 Git 탭에 Manage Remotes클릭
 8) +버튼 클릭해서 github Repository 주소 넣어서 추가하기
 9) git 탭에 push 클릭

## 2. 메인 branches에 Repository 만들기
 1) 1번의 1)~8)까지 그대로하고 오른쪽 밑에 master 브런치 클릭 후 main브런치 새로 생성
 2) push클릭

## 3. IntelliJ에 ignore파일 생성하는 방법
 - IntelliJ에 ignore파일 생성 플러그인 설치후 생성
 - 소스트리에서 생성
 - 파일 커밋해서 빨간색으로 변했을때 파일 우클릭 > git > add to ignore
 
# 2. Class
## 1. java에서 할수 있는 실수
 ```java
 public class Hello {
    public void plus(int first, int second){
        System.out.println(first + second);
    }
    
    public static void main(String[] args){
        plus(10, 20); //오류
    }
}
 ```
- static 메소드는 클래스 영역에 올라가서 공유되기 때문에, 객체를 생성하지 않고도 사용할 수 있다.
- 그러나, non-static 한 메소드인 plus()는 객체가 생성되는 경우에, heap에 생성되므로객체를 생성한 후에 사용할 수 있다.
- 따라서, static 메소드에는 non-static한 메소드가 올 수 없다.

*클래스를 만들었을때 보통 main클래스를 따로 만들어서 사용함
 
## 2. 생성자를 사용하는 이유
- 문제(1)-Calculator
```
Calculator클래스를 만들고 plus,minus,multiple,divide 4개의 메소드를 만들어보세요
각 메소드 기능은 + - * /이고 파라메터는 int a, int b 를 받습니다.
Calculator클래스는 psvm만들지 않습니다.
CalculatorMain 클래스에서 실행 해보세요.
실행은 CalculatorMain에서 합니다.
```

 - 문제(2)-Calculator2
 ```
위 Calculator(1)의 예제를 생성자를 사용해 작성하시오.
```
- 위 문제1과 문제2를 비교해보면 문제2의 코드는 변수를 private으로 따로 지정하고 생성자를 만들었다. Main 메소드를 보면 매개변수가 문제 1에서는 매소드마다 들어가지만 문제 2에서는 객체를 생성할때 딱 한번만 들어가는 것을 볼 수 있다.
- 생성자를 작성하는 이유: 같은 변수가 반복적으로 들어가는 경우에 생성자를 작성하게 되면 한번만 작성해도 되기 때문이다.

## 3. RandomCalculator 만들기
- 문제(1)-RandomCalculator
```
RandomCalculator를 만들어 보세요
메소드: plus, minus, multiple, divide
각 메소드는 parameter를 int형 하나만 받습니다.
ex) a + random한 정수 숫자
randomNumber는 0~9사이의 정수
divide의 경우 0으로 나누면 Error가 납니다. <-에러처리하기
랜덤한 숫자가 0으로 생성이 되면 “랜덤하게 생성된 숫자가 0입니다.”를 출력하기
```
- 문제(2)-Calculator3
```
randomNumber생성하는 로직은 interface를 이용해 DI하기
![](https://velog.velcdn.com/images/lyj1023/post/23f2799d-d3be-459c-a4ea-95cccc1c2d88/image.PNG)
```

## 4. 자바의 원칙들(SOLID)
- OOP(Object Oriented Programming) <-> 함수형(Functional) 프로그래밍
   :객체 지향 프로그래밍, class = object, 모든것을 클래스 기반으로 만듦
- DI(Dependency Injection): 의존성 역전
  :DI한다 -> constructor를 이용해 interface 구현체를 넘겨서 초기화 시킨다
- Pojo(Plain Old Java Object)
  :extends -> EJB
- IoC(Inversion of Control)
  :DI랑 비슷

# 3. Java Collection
## 1. collection 이란?
- 컬렉션 -> 수집
![](https://velog.velcdn.com/images/lyj1023/post/1b44224b-1dfd-427c-b94e-fb8c6bb77c1c/image.png)
- verctor는 현재 잘 사용하지 않는다.

## 2. List
- 문제(1)-ListPractice
```
사람 이름이 들어있는 list를 return 하는 method 만들기
```
