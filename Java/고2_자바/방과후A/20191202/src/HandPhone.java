
public class HandPhone implements Volume {

	private int vol;
	
	public HandPhone() {
		vol = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		vol += level;
		System.out.println("핸드폰 볼륨 : "+vol);
	}

	@Override
	public void volumeDown(int level) {
		vol -= level;
		System.out.println("핸드폰 볼륨 : "+vol);
	}

	public void handshow() {
		System.out.println("핸드폰은 역시 갤럭시 s8+");
	}
}
