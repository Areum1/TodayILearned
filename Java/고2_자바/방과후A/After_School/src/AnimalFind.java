
public class AnimalFind {

//	public void Find(Ani_cow cow) {
//		System.out.println("끊임없이 일만 하는");
//		System.out.println(cow.name()+" "+cow.action()+' '+cow.eat() + " 먹음");
//		cow.likeEat();
//	}
//	
//	public void Find(Ani_lion lion) {
//		System.out.println("사나운 이빨을 가진");
//		System.out.println(lion.name()+" "+lion.action()+' '+lion.eat() + " 먹음");
//		lion.eatOther();
//	}
//	
//	public void find(Ani_Dog_Wolf dog) {
//		System.out.println("귀엽고 애교 많은");
//		System.out.println(dog.name()+" "+dog.action()+' '+dog.eat() + " 먹음");
//		dog.special();
//	}
	
	public void Find(Animal animal) {
		if(animal instanceof Ani_cow) {
			System.out.println("끊임없이 일만하는");
			Ani_cow cow = (Ani_cow)animal;
			cow.likeEat();
		}
		else if(animal instanceof Ani_lion) {
			System.out.println("사나운 이빨을 가진");
			Ani_lion lion = (Ani_lion)animal;
			lion.eatOther();
		}
		else if(animal instanceof Ani_Dog_Wolf) {
			System.out.println("애교많고 귀여운");
			Ani_Dog_Wolf dog = (Ani_Dog_Wolf)animal;
			dog.special();
		}
		
		System.out.println(animal.name()+" "+animal.action()+' '+animal.eat() + " 먹음");
	}
	
}

//9월 10일
// 똑같은 이름을 가진 메서드가 있으면 메서드 오버로딩 (타입이 달라야함)