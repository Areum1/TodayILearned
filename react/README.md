# 리액트 스터디 

### 단축키
Ctrl + Shift + L => 여러줄에 있는 단어 한번에 선택 후 수정가능
Ctrl + Alt + (방향키) => 여러줄 같은 위치 단어 수정가능

### component란?
```javascript
function App() {
  return <div>Hello!!!</div>;
}
```
component는 HTML을 반환하는 함수

### jsx란?
```javascript
ReactDOM.render(<App />, document.getElementById('root'));
<Food fav="kimchi" /> // child가 father에게 정보보냄

```
javascript와 HTML의 이러한 조합(<App />)을 JSX라고 부른다

### map이란?
```javascript
friend.map(function(friend){
    return friend+" ❤";
})
결과 : (4) ["dal ❤", "lynn ❤", "girl ❤", "boy ❤"]
```
조건을 취하고 그 조건에 맞게 array를 return 해줌

### class component VS Function component
Function component => function으로 무언가를 return 후 screen에 표시   
class component => react component로부터 확장된 뒤 screen에 표시 (무조건 render() 안에 넣어야함) + state라는 object가 있음 (바뀔 data 저장소 같은 느낌?)   
[참고](https://overreacted.io/ko/how-are-function-components-different-from-classes/)   

### Mounting
=> 태어나는 것?
- constructor   
먼저 호출되는 function이 하나 있는 constructor(class 만들 때 호출되는 것)
- render 
- componentDidMount()

### Updating
=> 나로 인해 업데이트가 일어남 (state를 변경할 때 등)
- render
- componentDidUpdate()    
setstate()가 변경되어서 일어남

### Unmounting
=> component가 죽을 때
- componentWillUnmount()

### 15.2강 - State 사용

component가 실행될 때 render라는 함수보다 더 먼저 실행되게 하는 코드는 constructor에 작성한다.

```js
constructor(props){
    super(props);
    this.state = {
        subject: {title:'WEB', sub:'World Wide Web!!'}
    }
 }

<Subject title={this.state.subject.title} sub={this.state.subject.sub}></Subject>
```

state를 사용하는 타이밍 : App이 내부적으로 밖에서 보이지 않게 값을 사용하고 싶을 때 사용한다.

### 16.1강 - 이벤트 state props 그리고 render 함수

state의 값이 바뀌면 그 state를 가지고 있는 component의 render함수가 다시 호출된다 -> render 함수 하위에 있는 render 함수도 다시 호출된다.

> props나 state가 바뀌면 화면이 다시 그려진다 !

### 16.2강 - 이벤트 설치

```js
onclick="hello()"
onClick={function(){
    // 코드 작성
}}
```

### 16.4강 - 이벤트 bind 함수 이해하기

```js
var obj = {name:'areum'};
function bindTest() {
    console.log(this.name);
}

var bindTest2 = bindTest.bind(obj);
```
