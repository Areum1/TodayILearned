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
