// const list = document.querySelectorAll("li");

// function print() {
//     // filter, includes, from을 사용해서 문자열 'e'가
//     // 포함된 배열을 만들어서 반환하기

//     const li =[];
//     const li2 =[];
//     // include
//     // for(var i=0; i<list.length; i++){
//     //     li[i] = list[i].innerText;
//     //     li2[i] = li.includes("e");
//     // }
    
//     // for(var i=0; i<list.length; i++){
//     //     li2[i] = li[i].includes("e");
//     // }
    

//     console.log(li2);
// }
// print();

function print(){
    let list = document.querySelectorAll("li");
    let listArray = Array.from(list); // li 노드로 구성된 배열

    let eArray = listArray.filter(function(v){
        return v.innerText.includes("e");
    });
    console.log(eArray);
}
print();