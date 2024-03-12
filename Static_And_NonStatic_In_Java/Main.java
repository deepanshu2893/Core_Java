package Static_And_NonStatic_In_Java;

public class Main {

    public static void main(String[] args) {

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;


        System.out.println(Cat.getCatCount());
    }
}
