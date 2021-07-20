public class EmployeeMain {

	public static void main(String[] args) {
		// 방법 1 : Employee 클래스를 사용 안 한 경우
		/*Programmer programmer = new Programmer("박찬호", "P1234", 3);
		Designer designer = new Designer("안정환", "P2213", "플래쉬");
		Chief chief = new Chief("홍길동", "P4421", "윈도우 개발팀");
		
		designer.gotoOffice();
		designer.startJob();
		
		chief.gotoOffice();
		chief.startJob();
		
		designer.gotoHome();
		chief.gotoHome();*/
		
		// 방법 2 : Employee 클래스 사용
		/*Employee p1 = new Programmer("박찬호", "P1234", 3); // 업캐스팅
		Employee d1 = new Designer("안정환", "P2213", "플래쉬");
		Employee pc1 = new Cheif("홍길동", "P4421", "윈도우 개발팀");
		
		p1.gotoOffice();
		p1.startJob();
		
		d1.gotoOffice();
		d1.startJob();
		
		pc1.gotoOffice();
		pc1.startJob();
		
		System.out.println();
		
		p1.gotoHome();
		d1.gotoHome();
		pc1.gotoHome();*/
		
		// 방법 3 : 배열을 사용
		/*Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Cheif("홍길동", "P4421", "윈도우 개발팀");
		
		for(int i = 0; i<employee.length; i++) {
			employee[i].gotoOffice();
			employee[i].startJob();
		} //for
		
		System.out.println();
		
		// 향상된 for문
		for(Employee emp : employee) {
			emp.gotoHome();
		}*/
		
		// 방법4 : instanceOf 이용 upcasting
		/*Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Cheif("홍길동", "P4421", "윈도우 개발팀");
		
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
			}
			else if(emp instanceof Cheif) {
				System.out.print("관리자인 ");
			}
			emp.startJob();
			System.out.println();
		}*/
		
		// 방법 5 : instanceOf 이용 DownCastion
		/*Employee employee[] = new Employee[3];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Cheif("홍길동", "P4421", "윈도우 개발팀");
		
		// 향상된 for문 (자료구조 때 사용)
		for(Employee emp : employee) {
			//emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
				Programmer programmer = (Programmer)emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
				Designer designer = (Designer)emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof Cheif) {
				System.out.print("관리자인 ");
				Cheif cheif = (Cheif)emp;
				cheif.dispPart();
			}
		}*/
		
		Employee employee[] = new Employee[4];
		employee[0] = new Programmer("박찬호", "P1234", 3);
		employee[1] = new Designer("안정환", "P2213", "플래쉬");
		employee[2] = new Cheif("홍길동", "P4421", "윈도우 개발팀");
		employee[3] = new DBAnalyst("류현진","P3840","오라클");
		
		for(Employee emp : employee) {
			emp.gotoOffice();
			
			if(emp instanceof Programmer) {
				System.out.print("개발자인 ");
				Programmer programmer = (Programmer)emp;
				programmer.dispGrade();
			}
			else if(emp instanceof Designer) {
				System.out.print("디자이너인 ");
				Designer designer = (Designer)emp;
				designer.dispMajorTech();
			}
			else if(emp instanceof Cheif) {
				System.out.print("팀장인 ");
				Cheif cheif = (Cheif)emp;
				cheif.dispPart();
			}
			else if (emp instanceof DBAnalyst) {
				System.out.print("데이터베이스 관리자인 ");
				DBAnalyst dbanalyst = (DBAnalyst)emp;
				dbanalyst.dbAdmin();
			}
		} //for
		System.out.println();
		for(Employee emp : employee) {
			emp.gotoHome();
		}
	} //main
}