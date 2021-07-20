
public class AnimalMain {

	
	public static void main(String[] args) {
//		Ani_cow cow = new Ani_cow();
//		System.out.println(cow.name()+" "+cow.action()+' '+cow.eat() + " 먹음");
//		
//		Ani_lion lion = new Ani_lion();
//		System.out.println(lion.name()+" "+lion.action()+' '+lion.eat() + " 먹음");
//		
//		System.out.println("======별도의 클래스 사용======");
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

//abstract을 하는 이유
//>> 만약 내 아버지가 삼성 이건희다 근데 아버지가 꼭 불우이웃에게 5000억을 기부해야지 내 회사를 물려준다고 하고 아버지가 죽는다면
//기부를 할 지 안 할지 내가 알 수 잇을까? 아버지가 돌아가셔도 변호사를 고용해 내가 기부 했는지 안 했는지 알 수 있겠지 그 변호사 역할이 abstract