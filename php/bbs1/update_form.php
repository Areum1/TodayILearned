<?php
include('db_conn.php');
$idx = $_GET['idx'];
$query = "select * from bbs where id = $idx";
$result = mysqli_query($conn,$query);
$re = mysqli_fetch_array($result);
?>
<form method = "post" action = "update.php">
    <input type="hidden" name="idx" value="<?=$bno?>" />
    <table>
        <tr>
            <td>ID: </td>
            <td><input type = "text" name = "user_id" value = <?=$re[1]?>></td>
        </tr>
    
        <tr>
            <td>Title: </td>
            <td><input type = "text" name = "user_title" value = <?=$re[3]?>></td>
        </tr>
        <tr>
            <td>Content: </td>
            <td> <textarea cols = "20" rows = "5" name = "user_text" ><?=$re[4]?></textarea> </td>
        </tr>
        <tr>
            <td>비밀번호 입력: </td>
            <td><input type = "password" name = "user_pw"></td>
        </tr>
    </table>
    <input type = "submit" value = "수정하기">
</form>