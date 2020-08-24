<?php
$id = $_POST['user_id'];
$pw = $_POST['user_pw'];
$pw_ch = $_POST['user_pw_check'];
$name = $_POST['user_name'];
$sex = $_POST['user_sex'];
$home = $_POST['user_home'];
$phone = $_POST['user_phone'];
$email = $_POST['user_email'];
$code = $_POST['user_code'];
$road = $_POST['user_road'];
$other = $_POST['user_other'];
$hobbys = " ";

echo $id."<br>";
echo $pw."<br>";
echo $pw_ch."<br>";
echo $name."<br>";
echo $sex."<br>";
echo $home."<br>";
echo $phone."<br>";
echo $email."<br>";
echo $code."<br>";
echo $road."<br>";
echo $other."<br>";
$arr = $_POST['list1'];
for($i = 0;$i <count($arr); $i++){
    echo $arr[$i];
}

for($i = 0; $i<count($_POST['hobby']); $i++){
    $a = $_POST['hobby'];
    echo $a[$i];
    $hobbys.=$hobby;
}
echo "<br>";

$conn = mysqli_connect('localhost','test','1111','testdb');
$query = "insert into join_mem (user_id, passwd, name, gender,hp, email, addr, hobby, know) values ('$id','$pw','$name','$sex','$home','$email','$code','$hobbys','$arr');";
echo "등록되었습니다.";
?>