
public class Radio implements Volume {
	// 오버라이딩 안 해줘서 에러생김
	
	private int volLevel;
	
	public Radio() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("라디오 볼륨을 올리면 "+volLevel);
	} // volumeup

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("라디오 볼륨을 내리면 "+volLevel);
	} // volumedown

	
}
