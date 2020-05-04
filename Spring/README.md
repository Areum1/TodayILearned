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

