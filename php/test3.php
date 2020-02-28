<?php
$fp = fopen('data.txt','w');
fwrite($fp,'1');
fwrite($fp,'23');
echo "파일의 내용이 성공적으로 작성되었습니다";

fclose($fp);
?>