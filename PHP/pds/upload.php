<?php

$use_file = $_FILES['user_file']['name'];

$upload_dir = '../pds/files/';
$upload_file = $upload_dir.basename($_FILES['user_file']['name']);

if(move_uploaded_file($_FILES['user_file']['tmp_name'],$upload_file)); 
// 서버에 올리면 이상한 곳에 이상한 이름으로 올라감 근데 우리쪽으로 옮기는걸 move_uploaded_file를 씀
echo "등록되었습니다."

?>