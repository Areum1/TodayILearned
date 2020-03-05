var name = "global var";

function home(){
    var homevar = "homevar";
    for(let i=1; i<100; i++){
        console.log(i);
    }
    // let은 블록 단위임
}
home();

//////////////////////////////////////////////////////

var list = document.querySelectorAll("li");
for(let i=0; i<list.length; i++){
    list[i].addEventListener("click",function(){
        console.log(`${i+1}번째 리스트입니다.`);
    });
}

//////////////////////////////////////////////////////

function home(){
    const homename = 'my house';
    // homename = "your house";
    console.log(homename);

    //const를 기본으로 사용
    //변경이 될 변수는 let, var는 거의 사용 x

}
home();

//////////////////////////////////////////////////////

function home(){
    const list = ["apple","orange","watermelon"];
    list.push("banana");
    console.log(list);
}

const list = ["apple","orange","watermelon"];
list2 = [].concat(list,"banana");
console.log(list === list2);

//////////////////////////////////////////////////////

// ES2015 string에 새로운 메서드들

let str = "hello world ! ^^ ~~";
let matchstr = "^ ~~";
console.log(str.startsWith(matchstr));
console.log(str.endsWith(matchstr));
console.log(str.includes("world"));

//////////////////////////////////////////////////////

var data = [1,2,undefined,NaN,null,""];
// data.forEach(function(value){
//     console.log(value);
// })

// for(let idx in data){
//     console.log(data[idx]);
// }

// for(let value of data){
//     console.log(value);
// }

var str = "hello world!!!!!";

for(value of str){ //문자열 돌 때
    console.log(value);
}

//////////////////////////////////////////////////////

// spread operator, 펼침 연산자
let pre =["apple", "orange",100];
let newData = [...pre];
console.log(pre,newData);

//////////////////////////////////////////////////////

let pre = [100,200,"hello",null];
let newData = [0,1,2,3, ...pre,4];
console.log(newData);

//////////////////////////////////////////////////////

function sum(a,b,c){
    return a+b+c;
}

let pre = [100,200,300];


console.log(sum.apply(null, pre));
console.log(sum(...pre));

//////////////////////////////////////////////////////

// ES2015 from method
function addMark(){
    let newArray = Array.from(arguments);
    // for(let i=0; i<arguments.length; i++){ //인자값을 가지고 옴 (argument)
    //     newData.push(arguments[i]+"!");
    // }

    let newData = newArray.map(function(value){
        return value+"!";
    })
    console.log(newData);
}
addMark(1,2,3,4,5);

//////////////////////////////////////////////////////

// const name = "crong";
// const age = 33;

// const obj = {
//     name : name,
//     age : age
// };

// console.log(obj);

function getObj(){
    const name = "crong";
    const getName = function(){
        return name;
    }

    const setName = function(newname){
        name = newname;
    }

    const printName = function(){
        console.log(name);
    }

    return {
        getName : getName,
        setName : setName
    };
}

var obj = getObj();
console.log(obj)

//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////