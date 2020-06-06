```javascript
function solution(x, n) {
    var answer = [];
    var answer_num = 0;
    for(let i=1; i<=n; i++){
        answer[answer_num] = i*x;
        answer_num++;
    }
    return answer;
}
```
https://programmers.co.kr/learn/courses/30/lessons/12954
