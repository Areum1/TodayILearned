
public class Radio implements Volume {
	// �������̵� �� ���༭ ��������
	
	private int volLevel;
	
	public Radio() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		System.out.println("���� ������ �ø��� "+volLevel);
	} // volumeup

	@Override
	public void volumeDown(int level) {
		volLevel -= level;
		System.out.println("���� ������ ������ "+volLevel);
	} // volumedown

	
}
