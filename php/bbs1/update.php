<?php

$conn = mysqli_connect('localhost','test','1111','testdb');

$idx = $_POST['idx'];
$id = $_POST['user_id'];
$title = $_POST['user_title'];
$text = $_POST['user_text'];
$pw = $_POST['user_pw'];

$query =  "select passwd from bbs where id = $idx";
$result = mysqli_query($conn, $query);
if($pw == $result[0]){
    echo "우이";
}
else{
    echo "ㅠㅠ";
}
// $re = mysqli_fetch_array($result);
// $query_up = "update bbs set user_id = '$id', title = '$title', content = '$text' where id = $idx;";


?>
<!-- <script type="text/javascript">alert("수정되었습니다.");</script>
    <meta http-equiv="refresh" content="0 url=/page/board/read.php?idx=<?php echo $bno; ?>"> -->