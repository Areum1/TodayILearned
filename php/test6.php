<?php

$new_file = 'newfile.txt';
$fp = fopen($new_file,'w');
fwrite($fp, 'John Doe');
fwrite($fp, 'Jane Doe');
fclose($fp);

?>