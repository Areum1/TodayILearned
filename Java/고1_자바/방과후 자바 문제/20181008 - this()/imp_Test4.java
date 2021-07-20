import java.util.*;
class imp_Test4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner (System.in);
		String id = "Test";
		String pw = "hansegae";
		System.out.print("아이디를 입력하세요 : ");
		String id_t = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw_t = sc.next();
		
		if (id.equals(id_t) && pw.equals(pw_t))
			System.out.println("로그인되었습니다");
		else if (!id.equals(id_t) || !pw.equals(pw_t)){
			while (true){
				System.out.println("---------------------------------------");
				System.out.println("아이디 또는 비밀번호를 다시 확인하세요. \n등록되지 않은 아이디거나 잘못 입력하셨습니다.");
				System.out.print("아이디를 다시 입력하세요 : ");
				id_t = sc.next();
				System.out.print("비밀번호를 다시 입력하세요 : ");
				pw_t = sc.next();
				if(id.equals(id_t) && pw.equals(pw_t)){
					System.out.println("---------------------------------------");
					System.out.println("로그인되었습니다");
					break;
					}
			}//while
		}//else if 
	}//main
}//class