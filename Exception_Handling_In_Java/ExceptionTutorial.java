package Exception_Handling_In_Java;

public class ExceptionTutorial {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if (i == 10){
                throw new IllegalStateException("This number is no allowed");
            }
        }
    }
}
