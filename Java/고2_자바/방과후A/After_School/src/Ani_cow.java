
public class Ani_cow extends Animal {

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return "소";
	}

	@Override
	public String eat() {
		// TODO Auto-generated method stub
		return "풀";
	}

	@Override
	public String action() {
		// TODO Auto-generated method stub
		return "낮";
	}

	public void likeEat() {
		System.out.println("사료도 좋아함");
	}
	
}
