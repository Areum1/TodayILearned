class Song {
	String title;
	String artist;
	String album;
	String composer[] = new String[2]; 
	int year;
	int track;

public Song () {} 
public Song (String title, String artist, String album, String composer,int year,int track) {
	this.title = title;
	this.artist = artist;
	this.album = album;
	this.composer[0] = composer;
	this.year = year;
	this.track = track;
}
public void show() {
	System.out.println("노래 제목 "+title);
	System.out.println("가수 "+artist);
	System.out.println("앨범 제목 "+album);
	System.out.println("작곡가 "+composer[0]);
	System.out.println("발표된 연도 "+year);
	System.out.println("트랙번호 "+track);
}
	public static void main(String ar[]) {
		Song Song = new Song("Dancing Queen","ABBA","The albums","Stig Anderson",1992,1);
	Song.show();
	}
}