<?php
$file_name = 'data.txt';
$new_file_name = 'data1.txt';
if(!copy($file_name, $new_file_name)){
    echo "복사 실패입니다.";
}
else{
    echo "복사되었습니다.";
}
unlink($new_file_name);
echo "<br>그리고 삭제";
?>
