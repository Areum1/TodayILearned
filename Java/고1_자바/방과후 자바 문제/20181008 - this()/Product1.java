import java.util.*;
class Product {
	String id;
	String info;
	String consumer;
	int price;
	Product(String i, String inf, String con, int pri) {
		this.id = i;
		this.info = inf;
		this.consumer = con;
		this.price = pri;
	}
	public void setId(String i) {
		this.id = i; }
	public String getId() {
		return id; }

	public void setInf(String inf) {
		this.info = inf; }
	public String getInf() {
		return info; }

	public void setCon(String con) {
		this.consumer = con; }
	public String getCon() {
		return consumer; }

	public void setPri(int pri) {
		this.price = pri; }
	public int getPri() {
		return price; }

	public void show() {
		System.out.println("상품 ID >> "+id);
		System.out.println("상품 설명 >> "+info);
		System.out.println("생산자 >> "+consumer);
		System.out.println("가격 >> "+price);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Book1 extends Product{
	String title;
	String author;
	int isbn; //바코드임
	Book1(String i, String inf, String con, int pri,String t, String a, int is){
		super(i,inf,con,pri);
		this.title = t;
		this.author = a;
		this.isbn = is;
	}
	public void setIsbn(int is) {
		this.isbn = is; }
	public int getIsbn() {
		return isbn; }

	public void setTitle(String t) {
		this.title = t; }
	public String getTitle() {
		return title; }

	public void setAuthor(String aut) {
		this.author = aut; }
	public String getAuthor() {
		return author; }

	public void show() {
		System.out.println("상품 ID >> "+id);
		System.out.println("상품 설명 >> "+info);
		System.out.println("생산자 >> "+consumer);
		System.out.println("가격 >> "+price);
		System.out.println("책제목 >> "+title);
		System.out.println("저자 >> "+author);
		System.out.println("ISBN >> "+isbn);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Disc extends Product{
	String albumtitle;
	String singer;
	Disc(String i, String inf, String con, int pri,String a, String s){
		super(i,inf,con,pri);
		this.albumtitle = a;
		this.singer = s;
	}
	public void setAlbumtitle(String a) {
		this.albumtitle = a; }
	public String getAlbumtitle() {
		return albumtitle; }

	public void setSinger(String s) {
		this.singer = s; }
	public String getSinger() {
		return singer; }

	public void show() {
		System.out.println("상품 ID >> "+id);
		System.out.println("상품 설명 >> "+info);
		System.out.println("생산자 >> "+consumer);
		System.out.println("가격 >> "+price);
		System.out.println("앨범 제목 >> "+albumtitle);
		System.out.println("가수 >> "+singer);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Conversation_Book extends Product{
	String language;
	Conversation_Book(String i, String inf, String con, int pri,String l){
		super(i,inf,con,pri);
		this.language = l;
	}
	public void setLanguage(String l) {
		this.language = l; }
	public String getLanguage() {
		return language; }
	public void show() {
		System.out.println("상품 ID >> "+id);
		System.out.println("상품 설명 >> "+info);
		System.out.println("생산자 >> "+consumer);
		System.out.println("가격 >> "+price);
		System.out.println("언어 >> "+language);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Product1 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[10];
		int count = 0;
		while (true) {
			System.out.print("==  상품 추가 <1>, 상품 조회 <2>, 끝내기 <3>  == : ");
			int maincho = sc.nextInt();
			if (maincho == 3) {
				System.out.println("시스템을 종료합니다");
				System.exit(0);
			}//maincho == 3 if
			else if (maincho == 1) {
				System.out.print("== 상품 종류 : 책 <1>, 음악CD <2>, 회화책 <3> == : ");
				int typecho = sc.nextInt();
					System.out.print("상품 ID : ");
					String id = sc.next();
					System.out.print("상품 설명 : ");
					String info = sc.next();
					System.out.print("생산자 : ");
					String con = sc.next();
					System.out.print("가격 : ");
					int price = sc.nextInt();
					switch(typecho) {
						case 1:
							System.out.print("책제목 : ");
							String title = sc.next();
							System.out.print("저자 : ");
							String author = sc.next();
							System.out.print("ISBN : ");
							int isbn = sc.nextInt();
							p[count] = new Book1(id,info,con,price,title,author,isbn);
							count++;
							break;
						case 2:
							System.out.print("앨범 제목 : ");
							String album = sc.next();
							System.out.print("가수 : ");
							String singer = sc.next();
							p[count] = new Disc(id,info,con,price,album,singer);
							count++;
							break;
						case 3:
							System.out.print("언어 : ");
							String lan = sc.next();
							p[count] = new Conversation_Book(id,info,con,price,lan);
							count++;
			}//typecho switch
		}//else if 	maincho == 1
	else if (maincho == 2){
			if (count == 0){
				System.out.println("출력할 값이 없습니다.");
			}//count if
			else{
				for (int i = 0; i<count; i++){
					System.out.println("-------------------------------------------");
					p[i].show();
				}
			}
		}
	}//while
}//class
}