interface Sound {
	public int SoundUp(int level);
	public int SoundDown(int level);
}
class TV implements Sound {
	int SndLevel=0;
	public int SoundUp(int level){
		return SndLevel+=level;
	}
	public int SoundDown(int level){
		return SndLevel-=level;
	}
}
class Radio implements Sound {
	int SndLevel=0;
	public int SoundUp(int level){
		return SndLevel+=level;
	}
	public int SoundDown(int level){
		return SndLevel-=level;
	}
}
class SoundExam {
	public static void main (String ar[]) {
	Radio radio = new Radio();
	TV tv = new TV();
	System.out.println(radio.SoundUp(5));
	System.out.println(tv.SoundUp(5));
	}
}