class c_2 {
	public static void main(String ar[]){
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		char charValue  = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 =" +intValue);

		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
	}
	}