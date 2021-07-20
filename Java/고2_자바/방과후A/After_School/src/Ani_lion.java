
public class Ani_lion extends Animal {

	@Override
	public String name() {
		return "»çÀÚ";
	}

	@Override
	public String eat() {
		return "µ¿¹É";
	}

	@Override
	public String action() {
		return "¹ã";
	}
	
	public void eatOther() {
		System.out.println("°¡²ûÀº ¹°µµ ¸¶½É");
	}
}
