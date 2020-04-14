# Spring Study

### [스프링 이니셜라이즈](https://start.spring.io/) 용어들 정리
Group : com.example (회사 도메인)   
 artifact : demo (앱 이름) => DemoApplication   
 => 기본 패키지 이름 : com.example.demo   
    
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
