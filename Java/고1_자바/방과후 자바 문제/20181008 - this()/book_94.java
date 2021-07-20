import java.util.*;
abstract class ShapeExam {
public static /*중요*/final double PI = 3.14; //상수명 대부분 대문자
public abstract double getArea(int x);
public abstract double getCircum(int y);
}
class count extends ShapeExam {
public double getArea(int x) {
return(x*x*PI); }
public double getCircum(int y){
return(y*2*PI); }
}
class book_94 {
public static void main(String ar[]) {
count c = new count();
Scanner sc = new Scanner(System.in);
int r = sc.nextInt();
System.out.println(c.getArea(r));
}
}
//final class << 상속 못 받음