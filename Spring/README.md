# 강의
이 readme는 김영한님의 [스프링 입문 스프링부트](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8)를 듣고 필요한 부분들만 적었습니다.

## 라이브러리 살펴보기

### 스프링 부트 라이브러리

- spring-boot-starter-web
  - spring-boot-starter-tomcat : 톰캣 (웹서버)
  - spring-webmvc : 스프링 웹 MVC
- spring-boot-starter(공통) : 스프링 부트 + 스프링 코어 + 로깅

### 테스트 라이브러리

- spring-boot-starter-test
  - junit : 테스트 프레임워크
  - mockito : 목 라이브러리
  - assertj : 테스트 코드를 좀 더 편하게 작성하게 도와주는 라이브러리
  - spring-test : 스프링 통합 테스트 지원



## View 환경설정

```java
<!DOCTYPE HTML>
<html xmlns:th="<http://www.thymeleaf.org>"> // 이 코드 쓰면 thymeleaf 쓸 수 있음
<head>
    <title>Hello</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p th:text="'안녕하세요.'+${data}">안녕하세요 손님</p>
</body> 
</html>
```

- 컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버가 화면을 찾아서 처리
  - 스프링 부트 템플릿엔진 기본 viewName 매핑

> 참고 : spring-boot-devtools 라이브러리 추가하면 html 파일을 컴파일만 해주면 서버 재시작 없이 View 파일 변경이 가능하다!



## Spring Build 하는 방법

1. 스프링 파일이 있는 폴더로 이동한다.
2. `gradlew.bat build`
3. `/build/libs` 로 들어간다
4. `java -jar [생긴 jar 파일 이름]`

서버 배포시에는 jar 파일만 넣고, 실행시키기

> build 폴더 지우기 : `./gradlew clean`



## 정적 컨텐츠

1. 웹 브라우저가 `localhost:8080/hello-static.html`이라는 호출을 받는다.

2. 내장 톰캣 서버가 2가지 방법을 이용하여 파일이 있는지 찾는다.

   - 스프링 컨테이너 안에 hello-static 관련 컨트롤러가 있나?
   - resources/static 안에 hello-static 관련 파일이 있나?

   

## MVC와 템플릿 엔진

1. 웹 브라우저가 `localhost:8080/hello-mvc`라는 호출을 받는다.
2. 내장 톰캣 서버가 스프링 컨테이너에 들어가서 `hello-mvc`를 받아줄 Controller를 찾는다.
3. Controller에서 작업을 한 뒤 return 값, model에 들어간 값을 들고 viewResolver에 간다.
4. viewResolver가 templates/`파일명.확장자`를 찾는다.
5. Thymeleaf에서 템플릿 엔진 처리를 한다.
6. 웹브라우저에 띄운다.

