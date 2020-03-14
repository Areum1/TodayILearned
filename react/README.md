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
