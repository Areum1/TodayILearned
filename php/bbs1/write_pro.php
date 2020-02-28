<?php
include('db_conn.php');
$id = $_POST['user_id'];
$pw = $_POST['user_pw'];
$title = $_POST['user_title'];
$text = $_POST['user_text'];
$hit_num = 0;

$query = "insert into bbs (user_id, passwd, title,content, reg_date,hit) values ('$id','$pw','$title','$text',now(),'$hit_num');";
$result = mysqli_query($conn,$query);
echo "등록되었습니다.";
mysqli_close($conn);
echo "<a href = 'list.php'>리스트 확인</a>"
?>

<meta http-equiv = "refresh" content = "0; URL='write.php'"