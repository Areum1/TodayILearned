
public class HandPhone implements Volume {

	private int vol;
	
	public HandPhone() {
		vol = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		vol += level;
		System.out.println("�ڵ��� ���� : "+vol);
	}

	@Override
	public void volumeDown(int level) {
		vol -= level;
		System.out.println("�ڵ��� ���� : "+vol);
	}

	public void handshow() {
		System.out.println("�ڵ����� ���� ������ s8+");
	}
}
