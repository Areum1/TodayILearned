import java.util.*;
class Rect {
private int width,height;
public void rect1 (int width, int height) {
	this.width = width;
	this.height = height;
}
public int getArea() {
	return width*height; }
public static void main(String ar[]) {
	Rect [] r= new Rect[4];
	int sum = 0;
	Scanner sc = new Scanner (System.in);
	for (int i = 0; i<4; i++) {
		r[i].width = sc.nextInt();
		r[i].height = sc.nextInt();
		sum =r[i].getArea();
	}
	System.out.println("�簢���� ��ü ������ ���� "+sum);
	}
}