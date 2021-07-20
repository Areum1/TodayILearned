class Employee {
	private String name;
	private int salary;
	private String hiredate;

	Employee (String name,int salary,String hiredate) {
		this.name = name;
		this.salary = salary;
		this.hiredate = hiredate;
	}

	Employee (String name,int salary) {
		this.name = name;
		this.salary = salary;
	}

	Employee (String name,String hiredate) {
		this.name = name;
		this.hiredate = hiredate;
	}

	public void setHiredate(String hiredate){
		this.hiredate = hiredate;
	}
	public void setSalary(int salary){
		this.salary = salary;
	}
	public String getHiredate(){
		return hiredate;
	}
	public int getSalary(){
		return salary;
	}

  public static void main(String ar[]) {
    Employee e1=new Employee("mike",100,"2018-05-01");
	Employee e2=new Employee("alice",200);
	Employee e3=new Employee("Tom","2017-05-03");

	e2.setHiredate("2015-03-01");
	System.out.println(e2.getHiredate());
	e2.setSalary(500);
	System.out.println(e2.getSalary());
    }
}