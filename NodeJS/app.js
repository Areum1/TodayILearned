const express = require('express');
const bodyParser = require('body-parser');
const app = express();
const port = 3000;

app.set('views', './views');
app.set('view engine', 'pug');

app.use(bodyParser.urlencoded({
    extended:false
}))

app.get('/subject', (req,res) =>{
    const a = req.query.a;
    const b = req.query.b;
    const c = req.query.c;

    const output = 
    `
        <h1>a=${a}</h1>
        <h1>b=${b}</h1>
        <h1>c=${c}</h1>
    `
    console.log(a,b,c);
    res.send(output);
})

// localhost:3000/100/200/300
app.get('/subject/:a/:b/:c',(req,res)=>{
    const a = req.params.a;
    const b = req.params.b;
    const c = req.params.c;

    const output = 
    `
        <h1>a=${a}</h1>
        <h1>b=${b}</h1>
        <h1>c=${c}</h1>
    `
    console.log(a,b,c);
    res.send(output);
})

app.get('/form', (req,res) =>{
    const output =
    `
        <form method="post" action="/form">
            <input type="text" placeholder="아이디를 입력하세요" name="id">
            <p></p>
            <input type="password" placeholder="비밀번호를 입력하세요" name="pw">
            <br>
            <button type="submit">입력하기</button>
        </form>
    `
    res.send(output);
})

app.post('/form', (req,res) =>{
    const id = req.body.id;
    const pw = req.body.pw;

    const output =
    `
    <br>
        id는 ${id}
        pw는 ${pw}
    `

    res.send(output);
})

app.listen(port, (req, res)=> {
    console.log('Connected Express server...');
})

app.get('/',(req,res)=> {
    res.send("<h1>hello world</h1>");
})

app.get('/hello',(req,res)=> {
    res.render("index");
})