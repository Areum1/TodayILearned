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
	System.out.println("�뷡 ���� "+title);
	System.out.println("���� "+artist);
	System.out.println("�ٹ� ���� "+album);
	System.out.println("�۰ "+composer[0]);
	System.out.println("��ǥ�� ���� "+year);
	System.out.println("Ʈ����ȣ "+track);
}
	public static void main(String ar[]) {
		Song Song = new Song("Dancing Queen","ABBA","The albums","Stig Anderson",1992,1);
	Song.show();
	}
}