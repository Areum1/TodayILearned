## 4강~5강 (react 설치하기)

```react
npm -v
npm install -g create-react-app

// 원하는 폴더로 가기
create-react-app .
```

## 6강 (샘플 웹앱 실행)

Visual Studio Code > 보기 (View) > 모양 (Apperance) > 패널 표시 (Toggle Panel)

패널로 명령어 실행 가능

```react
npm run start
// ctrl + c로 실행 취소
```

## 7강 (JS 코딩하는 법)

scr 폴더 : 코딩할 때 거의 매번 사용할 폴더 (엔트리 파일 들어있음)

public 폴더 : index.html (실행하는 파일)이 들어있는 폴더

```react
import App from './App'; // App.js (js 생략), 파일 이름과 import 뒤 이름 같아야 함
<App/> // 사용자 정의 태그 (컴포넌트) 위에 있는 import의 파일을 실행
```

App.js

```react
import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        Hello, React!
      </div>
    );
  }
}

export default App;
```

## 8강 (CSS 코딩하는 법)

index.css

```css
body {
  background-color: aquamarine;
}
```

## 9강 (배포하는 법)

```react
npm run build
```

build 폴더 생김 (index.html 파일 들어가보면 불필요한 공백들 다 삭제)

```react
npx serve -s build
// npm install -g serve와 비슷함 하지만 한 번만 실행시키는 웹서버 완성
```

