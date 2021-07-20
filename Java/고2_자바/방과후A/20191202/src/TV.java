
public class TV implements Volume {

	// 추상 클래스로 안 만들고 임플리먼트로 만드는 이유 다중상속
	
	private int volLevel;
	
	public TV() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		if(volLevel >=100) volLevel = 100;
		System.out.println("TV 볼륨을 높이면 "+volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel-=level;
		if(volLevel <0) volLevel=0;
		System.out.println("TV 볼륨을 내리면 "+volLevel);
		
	}
	
	
	
}
