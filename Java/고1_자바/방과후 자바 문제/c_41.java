class c_41 {
	byte byteField;
	short shortField;
	int intField;
	long longField;

	boolean booleanField;
	char charField;

	float floatField;
	double doubleField;

	int[] arrField = new int[2];
	String referenceField;

public static void main(String ar[]){
		c_41 hw = new c_41();
		System.out.println(hw.byteField);
		System.out.println(hw.shortField);
		System.out.println(hw.intField);
		System.out.println(hw.longField);
		System.out.println(hw.booleanField);
		System.out.println(hw.charField);
		System.out.println(hw.floatField);
		System.out.println(hw.doubleField);
		System.out.println(hw.arrField);
		System.out.println(hw.referenceField);

	}
}