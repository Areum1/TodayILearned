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

let data = ["crong", "honux", "jinny"];
let [jisu,,jung] =data;
console.log(jisu, jung);

//////////////////////////////////////////////////////

let obj = {
    name : "crong",
    address : "Korea",
    age : 10
}

// let {name, age} = obj;
// console.log(name,age);

let {name:myName, age:myAge} =obj;
console.log(myName);

//////////////////////////////////////////////////////

var news = [
    {
        "title" : "sbs",
        "imgurl" : "https://naver.com",
        "newslist" : [
            "가상경주",
            "자동차도 만들고",
            "ㄴㅁㅇㄻㄴㄹ",
            "ㅁㄴㅇㄻㅇㄻ",
            "ㅁㄴㄹㄴㄹㄴㅁㄹㅇㅁ"
        ]
    },
    {
        "title" : "mbc",
        "imgurl" : "https://daum.net",
        "newslist" : [
            "가나다라",
            "ㅁ넝ㄹ마머라널 만들고",
            "ㄴㄴㅁㅇㄻㄴㅇㄻㄴㄹ",
            "ㅇㄴㄻㄻㄴㄻㅋ",
            "ㅁㄴㄹㄴㄹㄴㅁㄹㅇㅁ"
        ]
    }
];

let [,mbc] = news;
console.log(mbc);

//////////////////////////////////////////////////////

var news = [
    {
        "title" : "sbs",
        "imgurl" : "https://naver.com",
        "newslist" : [
            "가상경주",
            "자동차도 만들고",
            "ㄴㅁㅇㄻㄴㄹ",
            "ㅁㄴㅇㄻㅇㄻ",
            "ㅁㄴㄹㄴㄹㄴㅁㄹㅇㅁ"
        ]
    },
    {
        "title" : "mbc",
        "imgurl" : "https://daum.net",
        "newslist" : [
            "가나다라",
            "ㅁ넝ㄹ마머라널 만들고",
            "ㄴㄴㅁㅇㄻㄴㅇㄻㄴㄹ",
            "ㅇㄴㄻㄻㄴㄻㅋ",
            "ㅁㄴㄹㄴㄹㄴㅁㄹㅇㅁ"
        ]
    }
];

function getNewsList([,newslist]){
    console.log(newslist);
}

getNewsList(news);

//////////////////////////////////////////////////////

document.querySelector("div").addEventListener("click",function(evt){
    console.log("hi");
})

//////////////////////////////////////////////////////

let mySet = new Set();
console.log(toString.call(mySet));

// set : 중복없이 유일한 값을 저장하려고 할 떄, 이미 존재하는 지 체크할 때 유용

mySet.add("crong");
mySet.add("hary");
mySet.add("crong");

console.log(mySet.has("crong"));

mySet.delete("crong");
mySet.forEach(function(v){
    console.log(v);
})

//////////////////////////////////////////////////////

// weakset
// 참조를 가지고 있는 객체만 저장 가능
// 객체 형태를 중복없이 저장하려고 할 때 유용하다.

let arr = [1,2,3,4];
let arr2 = [5,6,7,8];
let obj = {arr,arr2};
let ws = new WeakSet();

ws.add(arr);
ws.add(arr2);
ws.add(obj);

arr = null;

console.log(ws);
console.log(ws.has(arr));

//////////////////////////////////////////////////////

// map & weakmap
// array -> set, weackset
// objext -> map, weackmap

// map은 key/value

let wm = new WeakMap();
let myfun = function(){};
// 이 함수가 얼마나 실행됐지?를 알려고 할때

wm.set(myfun,0);


let count = 0;
for(let i = 0; i<10; i++){
    count = wm.get(myfun); //get value
    count++;
    wm.set(myfun,count);
}

console.log(wm);


//////////////////////////////////////////////////////

// WeakMap 활용

// const wm = new WeakMap();

const obj = {};

// function Area(height, width){
//     wm.set(this, {height,width});
// }
function Area(height, width){
    obj.height = height;
    obj.width = width;
}

Area.prototype.getArea = function(){
    return obj.height*obj.width;
}

let myarea = new Area(10,20);
console.log(myarea.getArea());

//////////////////////////////////////////////////////

//json으로 응답을 받고
// javascript object로 변환한 후에어떠한 데이터처리 조작 한 뒤 dom에 추가
// 데이터 + HTML 문자열의 결합이 필요하기 때문에

const data = [
    {
        name : 'coffee-bean',
        order : true,
        item : ['americano', 'milk','green-tea']
    },
    {
        name : 'starbucks',
        order : false
    },
    {
        name : 'coffee-king',
        order : true,
        item : ['americano', 'latte']
    }     
];

//Tagged template literals

function fn(tags,name,items){
    console.log(tags);
    if(typeof items === "undefined"){
        items = "<span style = 'color:red'>주문가능한 상품이 없습니다.</span>";
    }
    return (tags[0] + name + tags[1]+ items + tags[2]);
}

data.forEach((v)=> {
    let template = fn`<h2>welcome ${v.name} !!</h2>
<h4>주문가능항목</h4><div>${v.item}</div>`;

    document.querySelector("#message").innerHTML += (template);
});

//////////////////////////////////////////////////////

// arrow function 

// setTimeout(()=>{ //콜백함수
//     console.log("settimeout");
// },1000);

let newArr = [1,2,3,4,5].map((v)=> v*2 );

console.log("arrow newArr", newArr);

//////////////////////////////////////////////////////

const myObj = {
    runTimeout(){
        setTimeout(()=>{
            console.log(this === window);
            this.printData();
        },200);
    },
    printData(){
        console.log("hi codesquad");
    }
}

myObj.runTimeout();

//////////////////////////////////////////////////////

// this context of Arrow function

const el = document.querySelector("p");

const myObj = {
    register(){
        el.addEventListener("click",(event)=>{
            this.printData(event.target);
        });
    },
    printData(el){
        console.log("clicked!",el.innerText);
    }
}

myObj.register();

//////////////////////////////////////////////////////

// default prameters

function sum(value, size={value:1}){
    return value*size.value;
}

console.log(sum(3,{value:0}));

//////////////////////////////////////////////////////

// rest prameters

function checkNum(...argArray){
    console.log(toString.call(argArray));
    // const argArray = Array.prototype.slice.call(arguments);
    // console.log(toString.call(argArray));
    const result = argArray.every((v)=> typeof v ==="number");
    console.log(result);
}

// const result = checkNum(10,2,"55");
const result = checkNum(10,2,3,4,5,"55");

//////////////////////////////////////////////////////

// ES6 class
function Health(name){
    this.name = name;
}

Health.prototype.showHealth = function(){
    console.log(this.name+"님 안녕하세요");
}

const h = new Health("crong");
h.showHealth();

class Health {
    constructor(name, lastTime){
        this.name = name;
        this.lastTime = lastTime;
    }

    showHealth(){
        console.log("안녕하세요"+this.name);
    }
}

const myHealth = new Health("crong");
myHealth.showHealth();

//////////////////////////////////////////////////////

// Object assign 메서드

var healthObj = {
    showHealth : function(){
        console.log("오늘 운동시간 : "+this.healthTime);
    }
}

const myHealth = Object.assign(Object.create(healthObj),{
    name : "crong",
    lastTime : "11:20"
});

// myHealth.healthTime = "11:20";
// myHealth.name = "crong"; //값 추가해야해서 귀찮

console.log("myHealth is "+myHealth);

//////////////////////////////////////////////////////

// Object assign 메서드

const previousObj = {
    name : "crong",
    lastTime : "11:20"
};

const myHealth = Object.assign({}, previousObj, {
    "lastTime":"12:30",
    "name" : "honux",
    "age" : 99
});

console.log(myHealth);

//////////////////////////////////////////////////////

// setPrototypeOf

var healthObj = {
    showHealth : function(){
        console.log("오늘 운동시간 : "+this.healthTime);
    },
    setHealth : function(newTime){
        this.healthTime = newTime;
    }
}

// const myHealth = {
//     name : "crong",
//     lastTime : "11:20"
// };

const newobj = Object.setPrototypeOf({
    name : "crong",
    lastTime : "11:20"
}, healthObj);

console.log("my health is",newobj);

//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////
//////////////////////////////////////////////////////