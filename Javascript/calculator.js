var calculator = {
  plus : function(a,b) {
    return `a+b의 결과값은 ${a+b}`;
  },
  minus : function(a,b){
    return `a-b의 결과값은 ${a-b}`;
  },
  divide : function(a,b){
    return `a/b의 결과값은 ${a/b}`;
  },
  times : function(a,b){
    return `a*b의 결과값은 ${a*b}`;
  }
}

var val = calculator.plus(5,5);
console.log(val);

val = calculator.minus(8,5);
console.log(val);

val = calculator.divide(10,5);
console.log(val);

val = calculator.times(8,5);
console.log(val);
