# phpStudy
😎 php로 개발한 방과후 공부 (1/6 ~ 1/8)

### 이론   
탐색기에서는 c:\ 이지만 php에서는 htdocs\ 경로

|환경| 웹서버 | 언어 | 데이터베이스 | 합친 것 |
|:--------------------:|:----:|:-------:|:-------:|:-------:|
| Linux | Apache | php |  mysql (oracle)| APM, Bitnami |
| Node.js | Tomcat or Node.js | php | mysql (oracle) |  |

Tomcat이 컨테이너 겸 웹서버인데 test.jsp -> test.java -> compile -> 실행 순   

1. 사용 환경과 파일 : vscode, bitnami    
2. 가상의 웹서버   
Domain : localhost   
ip : 127.0.0.1 (임의로 지은 것)    
3. http://localhost/test.php    

### 문법
```
 1. <?php 로 시작하고 ?> 로 끝남
 2. echo : 출력 print, printf 상관 없음
 3. 한 줄이 끝나면 ; 찍는다
 4. 주석 : //, /* */
 5. 변수 선언시 타입 선언 안함 String s; 안함 -> s
 6. 변수 앞에 $ 붙음 -> $name = 'kim';
 7. 연결연산자 : . (점)
 8. 태그를 섞어 사용할 때는 echo와 " "로 둘러싸야 한다.
 9. 배열
 $arr = array('a','b','c','d','e');
 $arr2 = ['a','b','c','d','e'];
 
 + floor($score) // 자기보다 작은 수 중에서 가장 큰 자연수
 + php.ini // php 설정파일
 ```
### 파일 다루기
|          |파일읽기| 파일쓰기 |
|:-------:|:-------:|:--------:|
| 파일 불러오기 | fopen(파일이름, "r") | fopen(파일이름, "w") |
| 한 글자 | fgetc() | | 
| 줄 | fgets() | fwrite(), fputs() |
| 파일 전체 | fread($fp, 파일 사이즈), file_get_contents() | file_get_contents() |
| 파일 닫기 | fclose() | fclose() |


### form 태그
- 사용자가 입력할 수 있는 폼을 제공하는 태그
```
<form method = "post/get" action = "(처리해줘야하는 파일의 이름)">

1. 한 줄 텍스트 입력
<input type = "text" name = "txt" value = "123" size = 12 maxlength = 20>

2. 비밀번호 입력
<input type = "password" name = "txt" value = "123">

3. 여러 줄 입력
<textarea rows = "30" cols= "20">초기값</textarea>

4. 선택하기
<input type = "checkbox" name = "" value="">
<input type = "radio" name = "1" value="">
<input type = "radio" name = "1" value="">
* radio에서는 name이 동일해야함
<select name = "sel">
    <option value = "">서울</option>
    <option value = "">부산</option> 
    <option value = "">대전</option>
</select>

5. 파일 업로드시 / 파일 선택시
<input type = "file" name = "">

6. 숨겨서 입력
<input type = "hidden" value = "값">
```

### DB
사용자 -> DBMS (사용자와 DB의 중간, ORACLE,MYSQL,MONGO DB) -> DB   

- 접속 및 db 생성 : mysql -u아이디 -p패스워드 사용할 디비명
- 계정 추가 방법
  - 사용할 데이터베이스 생성(testdb)
  * 계정 생성 (test/1111)
  + 권한 부여 (grant 모든 권한 부여)

### mysql 문법
```
1. 데이터 수정 : update
update 테이블명 set 변경필드 = 변경할 값; // 서울인 사람 다 부산으로 바뀜
update 테이블명 set 변경필드 = 변경할 값 where 조건; // 조건에 서울인 사람 다 부산으로 바뀜

2. 테이블의 구조를 변경 : alter (필드 변경, 추가, 삭제, 변경)
1) 테이블 이름 변경
alter table 원래 테이블명 rename 바꿀 테이블명;
2) 컬럼추가
alter table 테이블명 add column 이름 타입;
alter table login1 add column hobby varchar(20) after name;
3) 컬럼 타입 변경
alter table 테이블명 modify column 컬럼이름 변경할 타입;
4) 컬럼 이름 변경
alter table 테이블명 change column 원래컬럼이름 바꿀 컬럼이름 타입;
5) 컬럼 삭제
alter table 테이블명 drop column 이름;

3. 검색 : select
1) 모든 데이터 검색
select * from login1;
2) 아이디가 2인 아이 검색
 select * from login1 where id = '2';
3) 이름이 kim 이거나 seoul에 사는 애 검색
select * from login1 where id = '2' OR addr = 'seoul';
4) 이름이 kim이고 seoul에 사는애
 select * from login1 where id = '2' AND addr = 'seoul';
5) 이름이 k로 시작
select * from login where name like 'k%';
6) 이름이 m으로 끝나는 데이터
select * from login where name like '%m';
7) 이름에 i가 들어가는 애
select * from login where name like '%i%';
8) 이름의 글자수가 3개
select * from login where name like '___';
9) 서울에 사는애 
select * from login where addr = 'seoul';
10) id 기준으로 내림차순 정렬 //게시판
select * from login order by id desc;
11) 서울애 사는 애 인원수 구하기
select count(*) from login where addr = 'seoul' OR addr like '서울%';

delete : 내용 삭제
drop : 테이블 전체 삭제
```
### 실습 과정1
```
1. use mysql;
2. show tables;
3. create database testdb;
4. create user 'test'@'localhost' identified by '1111' password expire never;
// 계정 생성하는 코드(expire user는 계속 1111을 사용하겠다는 의미)
5. grant all privileges on testdb.* to 'test'@'localhost'; 
'localhost' >> 내 컴퓨터 내에서만 
'%' >> 외부 접속하는 아이
6. select * from user where user = 'test';
7. create table login(
    -> id int primary key,
    -> user_id char(20),
    -> name char(10),
    -> passwd char(20),
    -> addr char(80));
8. show tables;
9. desc login;
10. insert into login values ();
11. alter table login modify name varchar(10); //컬럼 타입 바꿈
```

### php에서 할 일
1. mysql 에 접속 mysqli_connect()
2. login에 접근

### php에서 mysql 연동하기
```
1. php에서 mysql에 접속
$conn = mysqli_connect('localhost','test','1111','testdb');
  		==> 호스트이름, 아이디, 비번, 사용할 디비
2. 쿼리 사용하기
mysqli_query(쿼리, $conn);
insert into login(user_id, passwd) values('$user_id','$passwd');
$query = 'insert into login(user_id, passwd) values('$user_id','$passwd');'
mysqli_query$query, $conn);

3. 목록 가져오기
1) select 해서 데이터 가져오기 (mysql_query())
	$result = mysqli_query($conn,'select * from login order by id desc');
2. 데이터 갯수 구하기 (mysqli_num_rows())
	$num = mysqli_num_rows($result); == > 5
3. 한 줄씩 가져오기 (mysqli_fetch_array()>>필드이름으로 가능 / mysqli_fetch_row())
	$re = mysqli_fetch_array($result);==> 1 a a / 2 b b / 3 c c ~~~

	for($i = 0; $i<$num; $i++){
		$re = mysqli_fetch_array($result);
		echo $re[0]; //echo $re[user_id];
	}

mysqli_close($conn);
```
### 실습 과정2
```
create table login(
    -> id int(10) not null auto_increment,
    -> user_id varchar(20),
    -> passwd varchar(20),
    -> primary key(id));
```

### 실습 과정3
```
create table join(
id int(10) auto_increment primary key not null,
user_id varchar(15),
passwd varchar(15),
name varchar(5),
gender varchar(7),
hp varchar(15),
email varchar(30),
addr varchar(60),
hobby varchar(10),
know varchar(20));
```

##### 게시판 변수 정리
bbs   
id auto_increment   
user_id   
passwd   
title   
content text   
reg_date date   
hit(조회수)   
primary key(id)   

### 실습 과정4
```
create table bbs(
    -> id int(10) not null auto_increment,
    -> user_id varchar(30),
    -> passwd varchar(50),
    -> title varchar(100),
    -> content text,
    -> reg_date date,
    -> hit int(5),
    -> primary key(id)
    -> );
 ```

- write_pro.php
```
1) 입력한 값들이 bbs 테이블에 들어가야함
-> insert 쿼리 사용
- 현재 시각 구하는 함수 : now()

insert into bbs now(), $hit_num);
등록되었습니다
<meta http-equiv = "refresh" content = "0;url='list.php'">
content 옆은 초임

<a hrerf = 'ead.php'? idx = $re[0]></a>
$idx = $_GET['idx'];
ip주소 : $_SERVER['REMOTE_ADDR']
```
- update.php
```
1. 비밀번호 체크
<input type = hidden name = "idx" value = <?$re[0];>
	1) id 에 맞는 데이터 select
	입력한 비번하고 table에서 가져온 비번
2. update
alert "수정되었습니다"
<meta>
```

#### 앞으로 해야할 것 : 결론 쇼핑몰 페이지 만들자
- 파일 업로드 ($FILES['user_file']['name']['type']['size'])
- 이미지 저장 (blob 이용 했었음 >> 서버 주소를 테이블에 넣기)
- 다운로드(down.php)
- 엑셀파일로 다운로드
- 쇼핑몰 제작
- 페이징 알고리즘
- 답글달기
