class Movie {
	String title;
	String supervisior;
	String production;
	Movie (String title, String supervisior, String production){
		this.title = title;
		this.supervisior = supervisior;
		this.production = production;
	}
	Movie (String title){
		this.title = title;
	}
	Movie (String title, String supervisior){
		this.title = title;
		this.supervisior = supervisior;
	}
}