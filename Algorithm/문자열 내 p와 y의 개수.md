```javascript
function solution(s){
    var answer = true;
    var p_Count = 0, y_Count = 0;

    for(let i=0; i<s.length; i++){
        if(s[i] === 'p' || s[i] === 'P')
            p_Count++;
        else if (s[i] === 'y' || s[i] === 'Y')
            y_Count++;
    }
    
    if(p_Count !== y_Count)
        answer = false;
    return answer;
}

// 다른 분이 적으신 코드지만 정말 배워야 할 것 같아서 가져와봤습니다!
function numPY(s){
    return s.toUpperCase().split("P").length === s.toUpperCase().split("Y").length;
}
```
https://programmers.co.kr/learn/courses/30/lessons/12916
