class Movie {
	String title;
	String supervisior;
	String production;
	
	public Movie (String title, String supervisior, String production){
		this.title = title;
		this.supervisior = supervisior;
		this.production = production;
	}
	public Movie (String title){
		this.title = title;
	}
	public Movie (String title, String supervisior){
		this.title = title;
		this.supervisior = supervisior;
	}
}
class Moive2 {
	public static void main(String ar[]) {
	Movie m1 = new Movie("아바타","제임스 카메론");
	Movie m2 = new Movie("신과 함께");
	Movie m3 = new Movie("센과 치히로의 행방불명","미야자키 하야오","지브리");
	}
}