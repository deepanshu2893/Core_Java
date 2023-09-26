package Static_And_NonStatic_In_Java;

public class Cat {

//    When to make something static or non static?
//    If something has to be at the class level which shares value
//    between objects then make it static otherwise not. 
    public static final int MAX_LIVES = 9;

    private static int catCount = 0;


    String name;
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }

    public Cat() {
        catCount++;
        livesRemaining = MAX_LIVES;
    }

    public static int getCatCount(){
        return catCount;
    }

}


