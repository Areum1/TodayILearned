
public class AnimalFind {

//	public void Find(Ani_cow cow) {
//		System.out.println("���Ӿ��� �ϸ� �ϴ�");
//		System.out.println(cow.name()+" "+cow.action()+' '+cow.eat() + " ����");
//		cow.likeEat();
//	}
//	
//	public void Find(Ani_lion lion) {
//		System.out.println("�糪�� �̻��� ����");
//		System.out.println(lion.name()+" "+lion.action()+' '+lion.eat() + " ����");
//		lion.eatOther();
//	}
//	
//	public void find(Ani_Dog_Wolf dog) {
//		System.out.println("�Ϳ��� �ֱ� ����");
//		System.out.println(dog.name()+" "+dog.action()+' '+dog.eat() + " ����");
//		dog.special();
//	}
	
	public void Find(Animal animal) {
		if(animal instanceof Ani_cow) {
			System.out.println("���Ӿ��� �ϸ��ϴ�");
			Ani_cow cow = (Ani_cow)animal;
			cow.likeEat();
		}
		else if(animal instanceof Ani_lion) {
			System.out.println("�糪�� �̻��� ����");
			Ani_lion lion = (Ani_lion)animal;
			lion.eatOther();
		}
		else if(animal instanceof Ani_Dog_Wolf) {
			System.out.println("�ֱ����� �Ϳ���");
			Ani_Dog_Wolf dog = (Ani_Dog_Wolf)animal;
			dog.special();
		}
		
		System.out.println(animal.name()+" "+animal.action()+' '+animal.eat() + " ����");
	}
	
}

//9�� 10��
// �Ȱ��� �̸��� ���� �޼��尡 ������ �޼��� �����ε� (Ÿ���� �޶����)