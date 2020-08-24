<?php

$conn = mysqli_connect('localhost','test','1111','testdb');

$type = $_POST['searchType'];
$text = $_POST['searchText'];
$query = " ";

switch($type){
    case 'all': $query = "select * from bbs;"; break;
    case 'sub': $query = "select title from bbs where title = '$text';"; break;
    case 'name': $query = "select user_id from bbs where user_id = '$text';"; break;
    case 'cont': $query = "select content from bbs where content = '$text';";
}
$result=mysqli_query($conn,$query);
$num = mysqli_num_rows($result);
for($i = 0; $i <$num; $i++){
    $re = mysqli_fetch_array($result);
    echo $re[0];
    echo $re[1];
    echo $re[2];
    echo $re[3];
    echo $re[4];
    echo $re[5];
    echo $re[6];
}
mysqli_close($conn);
?>