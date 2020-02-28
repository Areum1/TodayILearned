<?php
$user_id = $_POST['user_id'];
$passwd = $_POST['user_passwd'];

$conn = mysqli_connect('localhost','test','1111','testdb');

$query = "select * from login where user_id = '$user_id';";
$result = mysqli_query($conn,$query);
$num = mysqli_num_rows($result);
$re = mysqli_fetch_array($result);
?>
<!doctype html>
<html>
    <head>
        <title>결과</title>
        <style>
        .result{
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            /*가운데로 보내줌*/
            width: 450px;
            height: 450px;
            border: 2px black solid;
            text-align:center;
        }
        h1{
            padding-top:90px;
        }
        </style>
    </head>
    <body>
        <div class="result">
            <?php
            if($num == 0){
                echo "<h1>가입된 회원이 아닙니다</h1>"."<br>";
                echo "<h2><a href = 'join.html'>회원가입하기</a></h2>";
            }
            else{
                if($passwd == $re[2]){
                    echo "<h1>로그인 되었습니다.</h1>";
                }
            }
            mysqli_close($conn);
            ?>
        </div>
    </body>
</html>

