
public class Ani_lion extends Animal {

	@Override
	public String name() {
		return "����";
	}

	@Override
	public String eat() {
		return "����";
	}

	@Override
	public String action() {
		return "��";
	}
	
	public void eatOther() {
		System.out.println("������ ���� ����");
	}
}
