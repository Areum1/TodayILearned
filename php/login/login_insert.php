<?php

$id = $_POST['user_id'];
$passwd = $_POST['user_passwd'];

$conn = mysqli_connect('localhost','test','1111','testdb');
if($conn){
    echo "연결되었습니다";
}

echo "사용자가 입력한 아이디는 ".$id." 이고"."<br>"."비밀번호는 ".$passwd." 입니다"."<br>";

if($id =='test'&& $passwd == '1234'){
    echo "로그인 성공"."<br>";
}
else if($id =='test'|| $passwd == '1234'){
    echo "가입하지 않은 아이디이거나 비밀번호를 잘못 입력하셨습니다"."<br>";
}
else{
    echo "회원가입 추천"."<br>";
}

?>