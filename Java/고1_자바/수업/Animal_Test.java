class Animal_Test{
public static void main(String ar[]){
Animal dog = new Animal(); //객체생성
dog.name = "개";
dog.owner ="Mike";

System.out.println(dog.name);
System.out.println(dog.owner);

dog.bark();
dog.eat();

System.out.println("________________________________\n");

Animal cat = new Animal();
cat.name = "네로나비";
cat.owner = "나임 ㅎㅎ";

System.out.println(cat.name);
System.out.println(cat.owner);

cat.bark();
cat.eat();

}
}