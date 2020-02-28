<?php
//1. fgetc()로 파일읽기
// $fp = fopen('data.txt','r');
// while($result=fgetc($fp)){
//     echo $result."<br>";
// }
// fclose($fp);
// echo "파일읽기가 완료";

// 2. fgets()로 파일읽기
// $fp = fopen('data.txt','r');
// while($result = fgets($fp)){
//     echo $result."<br>";
// }
// fclose($fp);
// echo "파일읽기가 완료";

// 3. fread()로 파일읽기
// $data = 'data.txt';
// $fp = fopen($data,'r');
// $result = fread($fp,filesize($data)
// close($fp);
// echo "파일읽기가 완료";

// 4. file_get_contents()
echo file_get_contents('data.txt');
?>