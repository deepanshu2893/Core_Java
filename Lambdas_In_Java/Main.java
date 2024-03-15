package Lambdas_In_Java;

public class Main {
    public static void main(String[] args) {
        helloPrint(
                () -> {
                    System.out.println("hello World!");
                }
        );
    }
    public static void helloPrint(Printable hello){
        hello.print();
    }






}
