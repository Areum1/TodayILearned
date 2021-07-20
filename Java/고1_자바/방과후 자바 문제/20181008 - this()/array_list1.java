//Arraylist, Hash map 은 Collection Interface의 자식

import java.util.*;
class array_list1 {
	public static void main(String ar[]) {
		ArrayList<String> list = new ArrayList<String>(); //10칸으로 만들어지는데 계속 늘어남
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //기본형은(int) 객체를 만들 수 없음

		//1. 삽입 (add(), add(index,e), addAll())
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

		/*Iterator<String> it = list.iterator(); //Iterator의 객체 it를 만든다.
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s+"\t");
	}*/
	}
}