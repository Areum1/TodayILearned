<?php
    include ('db_conn.php');
?>
<!DOCTYPE html >
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>

    <title>게시판 목록</title>
    <style type="text/css">
        * {font-size: 9pt;}
        p {width: 700px; text-align: right;}
        table thead tr th {background-color: salmon;}
        tr, td{border-bottom:1px dotted gray;}
        td{text-align:center;}
    </style>
    </head>

    <body>
        <form name="searchForm" action="search.php" method="post">
       <p>
            <select name="searchType">
                <option value="all">전체검색</option>
                <option value="sub">제목</option>
                <option value="name">작성자</option>
                <option value="cont">내용</option>\
           </select>
           <input type="text" name="searchText" value="" />
           <input type="submit" value="검색" />
       </p>
       </form>
       <table  width=700px summary="게시판 목록" cellpadding=2 cellspacing=0>
           <caption>게시판 목록</caption>
           <colgroup>
               <col width="50" />
               <col width="200" />
               <col width="80" />
               <col width="200" />
               <col width="90" />
           </colgroup>  
           <thead>
               <tr>
                    <th>번호</th>
                    <th>제목</th>
                    <th>작성자</th>
                    <th>등록 일시</th>
                    <th>조회수</th>
               </tr>
           </thead>
           <tbody>
           <tr>
                <?php
                    $query="select * from bbs order by id desc";
                    $result=mysqli_query($conn,$query);
                    $count=mysqli_num_rows($result);
                    for($i=0;$i<$count;$i++) {//while($row = mysql_fetch_array($result)) 
                    $re=mysqli_fetch_array($result);
                    $data2=substr($re[5], 13);
                    echo "<tr>
                    <td>".$re[0]."</td>
                    <td><a href='read.php?index=$re[0]'>".$re[3]."</a></td>
                    <td>".$re[1]."</td>


                    <td>".$re[5]."</td>
                    <td>".$re[6]."</td>
                    </tr>";
                    }
                ?>
            </tr>
        </tbody>
        <tfoot>
            <tr>
                <td align="center" colspan="6">1</td>
            </tr>
        </tfoot>
    </table>
</body>
</html>