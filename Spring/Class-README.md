# Spring Study

### [스프링 이니셜라이즈](https://start.spring.io/) 용어들 정리
Group : com.example (회사 도메인)   
artifact : demo (앱 이름) => DemoApplication   
기본 패키지 이름 : com.example.demo   
    
 Dependencies (의존성)   
 Web, Devtools <= 거의 100% 써야 할 모듈    

### 만든 spring 프로젝트 가져오는 방법
import... 클릭 > maven > existing maven project > demo폴더 선택 (/pom.xml떠야함)    

### spring 프로젝트 실행하는법
demo 오른쪽 클릭 run as > demo 쳐서 demo app실행    

### @RequestMapping 어노테이션이란?
특정 주소에 대한 응답을 해 줄 메소드 정의   
이 메소드를 핸들러라고도 부름   
```java
@RequestMapping("/hello") // () 안에 주소값을 주는거임  
```

### jar이란?
사용할 자바 클래스의 정보를 담고있는 압축파일   
maven(안드로이드의 gradle과 비슷)이 자동으로 필요한 dependency의 jar파일을 다운받아줌 (demo/pom.xml에 적으면 알아서 다운받고 하드에 저장됨)   
 
### ip주소 / port 란?
ip주소 : 컴퓨터를 구분 (0.0.0.0 ~ 255.255.255.255)    
localhost (127.0.0.1)    
포트번호 : 프로세스를 구분 (0~65535) => 포트번호는 겹칠 수 없음    
     
80 : http쓴다고 인증받음 (암호화 안하고 걍 감, 평문이 감)    
443 : https쓴다고 인증받음    

### 프로세스 죽이는 방법
1. 이클립스에서 빨간 버튼 눌러서 죽이기
2. 작업 관리자 프로세스 탭에서 javaw 프로세스 죽이기

### 템플릿(template, 틀) 엔진 이란?
html 내용을 동적으로 생성   
템플릿 받아서 값 끼워서 최종 결과물을 만들어주는 애(틀을 받아서 모델을 이용하여 최종 html 문서 생성 후 반환)    
```javascript
<p> {{ person.name }} </p>
```
많이 쓰는 템플릿 엔진 : jsp, thymeleaf, tiles, ....    

템플릿 받아서 값 끼워서 최종 결과물 만들어주는 애 => 템플릿 엔진   

틀(html) 받아서 모델 (객체 혹은 변수)를 이용하여 최종 html 문서 생성 후 반환   

resources/templates 폴더 안에 템플릿 파일 저장   

### 모델의 역할
동적 웹 페이지에 사용할 재료(데이터) 보관   
모델도 키를 통하여 값을 저장함   

### 맵(Map) 자료구조의 특징
키를 통해서 값을 저장 (파이썬의 dict)   

### 일반적으로 자주 사용하는 메소드
GET, POST, PUT, DELETE   

### spring에서 메소드 활용하기
```java
@RequestMapping(value="/bye", method=RequestMethod.GET) // GetMapping("bye")
	public String bye() {
		return "<h1>Bye Areum</h1>";
	}
```

### 템플릿 엔진 활용하여 Hello World 띄우기
```java
@Controller
public class MyController {	
	@GetMapping("/hello2")
	public String hello2() {
		return "hello"; //hello.html 뷰(템플릿)을 사용함
	}
}
```

### @RestController vs @Controller
@RestController를 붙이고 return "hello"를 한다면 hello글씨가 나옴 (@ResponseBody랑 비슷한 역할)    
@Controller를 붙이고 return "hello"를 한다면 템플릿 파일 안에 있는 hello.html이라는 파일을 실행함   

참고1) @Controller는 요청을 받아들일 핸들러가 있다고 알려주는 것 -> 지우면 요청 처리 안해줌   
참고2) @RequestMapping은 뒤에 오는 주소로 들어가겠다. ("hello")에 주소값을 주는 것임~    

### 정적 웹 페이지 / 동적 웹 페이지
- 정적 웹페이지 : 내용 변경 없음 (회사 소개 페이지, 뉴스 페이지, 포털 메인화면 생각해보기)
  회사가 이사를 가거나 상호를 바꿈 => 내용 변경 필요
- 동적 웹페이지 : 내용이 실시간으로 변경될 수 있음 (게시판, 댓글창)
  내용 변경이 실시간으로 일어나고 거의 매번 바뀜

## 문제
1. 템플릿 엔진은 동적 웹페이지 생성에 특화되어 있다. (O/X)
<details>
<summary>정답</summary>
<div markdown="1">
O, 내용을 잘 출력하기 위한 템플릿 문법 제공(기초 반복문, 조건문 등등)
</div>
</details>
   
2. 템플릿 엔진은 정적인 웹페이지를 제공할 수 없다. (O/X)
<details>
<summary>정답</summary>
<div markdown="1">
X, 동적인 웹페이지를 생성할 수 있다 => 당연히 정적인 웹 가능 / 틀이 아니고 그냥 아예 내용이 다 차있는 HTML 문서 그대로 주면 됨
</div>
</details>   

### 맵(Map) 자료구조의 특징
키를 통하여 값을 저장한다.    
ex) <이름,주민번호> => 이름은 없는데 주민번호 있는 건 불가능 => 이름은 있는데 주민번호 없는 건 가능    

### 모델 (Model, 클래스)
동적 웹 페이지에 사용할 재료 (데이터) 보관 (키를 이용하여 값을 저장함)   
스프링에서는 핸들러 메소드에 파라미터를 정의하면 알아서 호출하는 측에서 파라미터에 필요한 값을 넣어줌   
```java
@GetMapping("model")
public String model(Model m) { //파라미터에 Model 타입 값 받음 (객체로 만들어서 쓴 듯)
	// addAttribute(string, object)
	m.addAttribute("title", "Hello World 1234"); // 뷰(템플릿) 내부에 필요한 내용 채우기
	m.addAttribute("content", "Content 1234");
		
	return "with_model"; // 역시 템플릿 이름 리턴
}
```
Model 클래스 ModelandView 클래스 둘 다 템플릿에 자료 보내려고 객체로 만들어서 쓰는 클래스    
   
모델 값만 채워놓으면 알아서 템플릿 엔진쪽으로 전달됨   
```thymeleaf
<h1 th:text="${title}"></h1>
<h1 th:text="${content}"></h1>
```
th: 로 시작하는 속성이랑 달러, 중괄호($, {})로 표시된 부분은 Thymeleaf 문법

#### TMI 
보통 키를 object로 하는 경우도 있음   
Object 타입의 의미 => 모든 타입 다 됨 (업캐스팅 가능)   
키가 Obejct라는 말은 키에 모든 종류의 객체를 쓸 수 있다는 의미 => String으로 쓰는 경우가 제일 많음   
    
키에 날짜(Date) 객체를 저장 (만약 키가 Obejct 타입이라면) => 키를 String 타입으로 하면 문제가 생기나? 아님   
모든 종류의 데이터는 String으로 치환 가능 => object타입으로 설정할 수 있다고 해도 문자열 쓰기    
그러나 값은 반드시 Object여야 함 (특별한 이유 없는 이상) => 값의 성질상, 어떤 값이 들어올 지 모르니까 Obejct여야 함   
### 모델 앤 뷰 (ModelAndView)
모델 + 뷰 이름 정보   
```java
@GetMapping("model_and_view")
public ModelAndView modelAndView() {
	ModelAndView m = new ModelAndView("with_model");
	m.addObject("title", "Hello World 1234"); // 뷰(템플릿) 이름 지정
	m.addObject("content", "Content 1234");
		
	return m;
}
```
하지만 문자열, 단순 숫자말고 객체를 돌려줄 확률이 높음
1. 학생 정보를 볼 수 있는 페이지 => Student타입 객체를 모델에 저장
2. 학생 정보를 볼 수 있는 페이지 => Student타입의 이름 정보, 나이, 주소, 학번 등등 전부 addAttribute해서 저장
   
임의의 객체를 넘기고 싶은데 그냥 공짜로 할 수는 없음
=> 클래스를 자바 빈(Bean) 클래스로 만들어야 함

## 자바 빈 클래스가 될 수 있는 조건 (중요)
- 모든 필드의 접근 제어자는 private (해당 필드에 접근할 수 있는 게터, 세터 메소드를 제공) => 캡슐화
- 외부에서 접근 가능한 (public) 기본 생성자(인자 없는 생성자(no-arg constructor))를 제공
- Serializable 인터페이스를 구현
어떤 라이브러리에서 클래스가 자바 빈 클래스이기를 요구한다.(내부적으로 직렬화를 진행할 수도 있음)

#### 자바 빈은 camelCase 작명법 사용해야 함   
setHelloMirimSw 세터 이름    
getHelloMirimSw 게터 이름    
안 지키면 에러 남 (빈의 조건, 게터 세터 메소드 이름을 카멜케이스로)    
private boolean rich (불리언 값 게터만 특수 취급, getRich도 상관없음)
boolean isRich() (게터의 경우 is로 시작 가능)
setRich(boolean rich) (세터는 똑같음)

#### 문제
1. 생성자(생성자 메소드)를 접근 제어자를 private로 정할 수 있는가?
<details>
<summary>정답</summary>
<div markdown="1">
private의 의미 => 외부에서 호출 불가 => 생성자 호출 불가 => 싱글턴 패턴에서 주로 활용, 내부에서는 생성자 만들 수 있음 but, 바깥에서 만들 수 없음
</div>
</details>
    
```java
class MyClass {
	private int a;
	getA() return a;
	setA(int a) this.a = a;
	
	// 생성자 만듬
	public MyClass(int a) {
		// 어쩌구
	}
}
```
2. 위 코드에서 기본 생성자가 있나? (이유는?)

<details>
<summary>정답</summary>
<div markdown="1">
없음, 이미 생성자가 있어서 기본 생성자가 만들어지지 않음 / 생성자를 아마 99% 확률로 새로 정의할테니 인위적으로 기본 생성자 만들어줘야 빈이 됨 => 기본 생성자는 블록 안에 코드의 내용이 반드시 없어야 한다? (X)
</div>
</details>
   
### Serializable 인터페이스 (객체 직렬화)
객체를 파일이나 네트워크에 저장(IO)하기 위해서 사용하는 인터페이스   
추상메서드를 반드시 정의해줘야 한다. >> 근데 왜 Serializable은 정의를 하지 않아도 에러가 안날까? >> 안에 아무것도 없음 (Marker 인터페이스 => 내용이 없는 인터페이스)   
근데 왜 써요? >> 타입 확인용으로 사용 (캐스팅 가능 혹은 instanceof 같은 거 사용 가능), 약속용 (Serializable 인터페이스를 구현한 타입만 파일 혹은 네트워크로 저장하기로 합시다.)
ex) Cloneable은 clone 메소드를 구현하고 있다는 걸 알려주려고 인터페이스 구현   
```java
class Student implements Serializable{
}
```

### 
