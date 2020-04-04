# Css Study

### float:left를 썼을 때 height가 0이 되는 현상 없애기
```css
.side { float:left; width: 300px; height: 600px; background: #333; }
.contents { float:left; width: 700px; height: 600px; background: #444; }
.footer { clear:both; width: 1000px; height: 100px; background: #555; }
```
clear:both를 주면 사라짐!   
