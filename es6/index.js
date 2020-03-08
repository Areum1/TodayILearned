// Proxy.
// const myObj = {name : 'crong', changedValue : 0};
const proxy = new Proxy({name : 'crong', changedValue : 0}, {
    get : function(target,property,receiver){
        // console.log('get value');
        // return target[property];
        // return Reflect.get(target,property);
        return (property in target) ? target[property] : "anonymous";
    },
    set : function(target,property,value){
        console.log('change value');
        target['changedValue']++;
        target[property] = value;
    }
});