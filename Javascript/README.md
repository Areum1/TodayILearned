# Javascript (Vanilla JS)
[노마드 코더스 강좌](https://academy.nomadcoders.co/courses/enrolled/435558)를 듣고 알게된 부분을 적습니다.

### Vanilla JS란?
자바스크립트의 수 많은 framework, library 사용하지 않고 순수하게 javascript만 사용하는 것   
[바닐라 자바스크립트의 속도 차이 보기](http://vanilla-js.com/)

### var-let-const의 차이
| |var|let|const|
|-|--|----|-----|
|재할당|O|O||
|재선언|O|O|X|
|다시 변수 선언시|값이 유동적으로 변경됨|에러||
```javascript
var name = "양아름";
console.log(name);

var name = "아름";
console.log(name);

output: 양아름
output: 아름
```
```javascript
let name = "양아름";
console.log(name); 

let name = "아름";
console.log(name);
output: Identifier 'name' has already been declared
```

### array, object 선언 방법
array를 선언할 때는 []   
object를 선언할 때는 {}   
```javascript
const areumInfo = {
  name : "Areum", // 변수임, 접근하려면 areumInfo.name 사용
  age : 393940,
  job : "student"
}
```
+ console.log할때 console도 object이다.

### 함수란?
같은 작업을 반복해주는 것

### console.log로 프린트 하는 방법
```javascript
function sayHello (name, age){
  console.log("Hello", name, " you are ", age, " years old ";
  console.log(`Hello ${name} you are ${age} years old`);
}
```

### js에서 아이디가 title인 h1 부르는 방법
```javascript
const title = document.querySelector("#title");
const title = document.getElementsById("title");
```

### js에서 event 받는 방법
```javascript
function handleResize(){
    console.log("I have been resized");
}

window.addEventListener("resize", handleResize); 
//handleResize에 ()를 붙이면 이 곳에서 즉시 실행해달라는 뜻, 안 붙이면 resize라는 이벤트가 생길 시 실행
```
