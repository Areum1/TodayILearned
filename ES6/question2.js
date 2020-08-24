const SETTING = {
    name : "LUCKY LOTTO!",
    count : 6,
    maxNumber : 45
}

let newSet = new Set();
let {count, maxNumber} = SETTING;

function getRandomNumber(maxNumber){
    while(newSet.size < count){
        const randNum = Math.floor(Math.random()*(1, maxNumber)+1);
        console.log(randNum);
        if(!newSet.has(randNum)){
            newSet.add(randNum);
        }
    }

    return [...Array.from(newSet)];
}

console.log(getRandomNumber(maxNumber));