
public class TV implements Volume {

	// �߻� Ŭ������ �� ����� ���ø���Ʈ�� ����� ���� ���߻��
	
	private int volLevel;
	
	public TV() {
		volLevel = 0;
	}
	
	@Override
	public void volumeUp(int level) {
		volLevel += level;
		if(volLevel >=100) volLevel = 100;
		System.out.println("TV ������ ���̸� "+volLevel);
	}

	@Override
	public void volumeDown(int level) {
		volLevel-=level;
		if(volLevel <0) volLevel=0;
		System.out.println("TV ������ ������ "+volLevel);
		
	}
	
	
	
}
