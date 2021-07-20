
public class InterRadio implements InterAdvanceVol1 {

	private int v = 0;
	
	@Override
	public void volUp(int v) {
		this.v += v;
	}

	@Override
	public void volDown(int v) {
		this.v -= v;
	}

	@Override
	public void volOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volResume() {
		// TODO Auto-generated method stub
		
	}
	
	public void show() {
		System.out.print("현재 볼륨은 ");
	}

}
