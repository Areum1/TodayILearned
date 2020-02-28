<!doctype html>
<html>
<head><title></title>
<style>
    div{width:550px;height:300px;}
    tr, td{border-bottom: 1px solid gray;text-align:center}
    .ali{text-align:right;}
 body{
     margin-top:150px;
 }
 form {
    margin: 0 auto;
    width: 400px;
    border: 1px solid #CCC;
}

label {
    display: inline-block;
    width: 90px;
    text-align: right;
}

input, textarea {
    width: 300px;
    border: 1px solid #999;
}

textarea {
    vertical-align: top;

    height:9em;
    resize: vertical;
}
</style>
</style>
</head>


<?php

include('db_conn.php');

$idx=$_GET['index'];

// echo "<pre>";
// print_r($_SERVER);
// echo "</pre>";
$query="select * from bbs where id=$idx";
$result=mysqli_query($conn,$query);

$re=mysqli_fetch_array($result);

echo "<div><table width='550'><tr><td colspan='6' height='30px' style='background-color:rgb(204, 204, 204)'>".$re[3]."</td></tr><tr><td></td><td>글쓴이&nbsp;".$re[1]."</td><td><td>날짜&nbsp;".$re[5]."</td><td><td>조회수&nbsp;".$re[6]."</td></tr>";
echo "<tr><td colspan='6' height='150px'>IP".$re[4]."</td></tr>";
echo "<tr><td colspan='5'><td>IP".$_SERVER['REMOTE_ADDR']."</td></tr></table>";
$hit=$re[6]+1;
$query2="update bbs set hit=$hit where id=$re[0]";
mysqli_query($conn,$query2);
mysqli_close($conn);

?>
 <p class="ali" >

<a href=update_form.php?idx=<?=$re[0] ?>>수정</a>&nbsp;&nbsp;&nbsp;
<a href=delete_form.php?idx=<?=$re[0] ?>>삭제</a>&nbsp;&nbsp;&nbsp;
<a href=list.php>목록</a></div>



</p>
