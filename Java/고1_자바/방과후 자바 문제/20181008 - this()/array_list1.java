//Arraylist, Hash map �� Collection Interface�� �ڽ�

import java.util.*;
class array_list1 {
	public static void main(String ar[]) {
		ArrayList<String> list = new ArrayList<String>(); //10ĭ���� ��������µ� ��� �þ
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //�⺻����(int) ��ü�� ���� �� ����

		//1. ���� (add(), add(index,e), addAll())
		list.add("apple");
		list.add("strawberry");
		list.add("melon");
		list.add("grape");
		list.add("peach");
		list.add(2,"banana");

		//System.out.println(list);

		/*for (String fruit: list){
			System.out.println(fruit);
		}*/

		/*for (int i = 0; i<list.size(); i++){
			System.out.println(list.get(i));
		}*/

		/*Iterator<String> it = list.iterator(); //Iterator�� ��ü it�� �����.
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s+"\t");
	}*/
	}
}