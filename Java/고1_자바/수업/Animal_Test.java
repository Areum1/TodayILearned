class Animal_Test{
public static void main(String ar[]){
Animal dog = new Animal(); //��ü����
dog.name = "��";
dog.owner ="Mike";

System.out.println(dog.name);
System.out.println(dog.owner);

dog.bark();
dog.eat();

System.out.println("________________________________\n");

Animal cat = new Animal();
cat.name = "�׷γ���";
cat.owner = "���� ����";

System.out.println(cat.name);
System.out.println(cat.owner);

cat.bark();
cat.eat();

}
}