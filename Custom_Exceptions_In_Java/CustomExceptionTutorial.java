package Custom_Exceptions_In_Java;

public class CustomExceptionTutorial {

    public static void main(String[] args) throws AgeLessThanZeroException {
        validateAge(-1);

    }

    private static void validateAge(int age) throws AgeLessThanZeroException {
        if (age <0){
            throw new AgeLessThanZeroException();
        }
    }
}
