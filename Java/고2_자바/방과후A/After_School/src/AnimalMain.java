
public class AnimalMain {

	
	public static void main(String[] args) {
//		Ani_cow cow = new Ani_cow();
//		System.out.println(cow.name()+" "+cow.action()+' '+cow.eat() + " ����");
//		
//		Ani_lion lion = new Ani_lion();
//		System.out.println(lion.name()+" "+lion.action()+' '+lion.eat() + " ����");
//		
//		System.out.println("======������ Ŭ���� ���======");
//		
//		AnimalFind af = new AnimalFind();
//		af.Find(cow);
//		
//		Ani_Dog_Wolf dog = new Ani_Dog_Wolf();
//		af.Find(dog);
		
		Ani_cow cow = new Ani_cow();
		AnimalFind af = new AnimalFind();
		af.Find(cow);
		
		Ani_lion lion = new Ani_lion();
		af.Find(lion);
		
		Ani_Dog_Wolf dog = new Ani_Dog_Wolf();
		af.Find(dog);
	}
	
}

//abstract�� �ϴ� ����
//>> ���� �� �ƹ����� �Ｚ �̰���� �ٵ� �ƹ����� �� �ҿ��̿����� 5000���� ����ؾ��� �� ȸ�縦 �����شٰ� �ϰ� �ƹ����� �״´ٸ�
//��θ� �� �� �� ���� ���� �� �� ������? �ƹ����� ���ư��ŵ� ��ȣ�縦 ����� ���� ��� �ߴ��� �� �ߴ��� �� �� �ְ��� �� ��ȣ�� ������ abstract