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
		System.out.println("��ǰ ID >> "+id);
		System.out.println("��ǰ ���� >> "+info);
		System.out.println("������ >> "+consumer);
		System.out.println("���� >> "+price);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Book1 extends Product{
	String title;
	String author;
	int isbn; //���ڵ���
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
		System.out.println("��ǰ ID >> "+id);
		System.out.println("��ǰ ���� >> "+info);
		System.out.println("������ >> "+consumer);
		System.out.println("���� >> "+price);
		System.out.println("å���� >> "+title);
		System.out.println("���� >> "+author);
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
		System.out.println("��ǰ ID >> "+id);
		System.out.println("��ǰ ���� >> "+info);
		System.out.println("������ >> "+consumer);
		System.out.println("���� >> "+price);
		System.out.println("�ٹ� ���� >> "+albumtitle);
		System.out.println("���� >> "+singer);
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
		System.out.println("��ǰ ID >> "+id);
		System.out.println("��ǰ ���� >> "+info);
		System.out.println("������ >> "+consumer);
		System.out.println("���� >> "+price);
		System.out.println("��� >> "+language);
	}
}
///////////////////////////////////////////////////////////////////////////////
class Product1 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		Product p[] = new Product[10];
		int count = 0;
		while (true) {
			System.out.print("==  ��ǰ �߰� <1>, ��ǰ ��ȸ <2>, ������ <3>  == : ");
			int maincho = sc.nextInt();
			if (maincho == 3) {
				System.out.println("�ý����� �����մϴ�");
				System.exit(0);
			}//maincho == 3 if
			else if (maincho == 1) {
				System.out.print("== ��ǰ ���� : å <1>, ����CD <2>, ȸȭå <3> == : ");
				int typecho = sc.nextInt();
					System.out.print("��ǰ ID : ");
					String id = sc.next();
					System.out.print("��ǰ ���� : ");
					String info = sc.next();
					System.out.print("������ : ");
					String con = sc.next();
					System.out.print("���� : ");
					int price = sc.nextInt();
					switch(typecho) {
						case 1:
							System.out.print("å���� : ");
							String title = sc.next();
							System.out.print("���� : ");
							String author = sc.next();
							System.out.print("ISBN : ");
							int isbn = sc.nextInt();
							p[count] = new Book1(id,info,con,price,title,author,isbn);
							count++;
							break;
						case 2:
							System.out.print("�ٹ� ���� : ");
							String album = sc.next();
							System.out.print("���� : ");
							String singer = sc.next();
							p[count] = new Disc(id,info,con,price,album,singer);
							count++;
							break;
						case 3:
							System.out.print("��� : ");
							String lan = sc.next();
							p[count] = new Conversation_Book(id,info,con,price,lan);
							count++;
			}//typecho switch
		}//else if 	maincho == 1
	else if (maincho == 2){
			if (count == 0){
				System.out.println("����� ���� �����ϴ�.");
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