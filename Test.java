

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new RuntimeException().getStackTrace();
        String str;
        if (stackTraceElements.length == 2) {
            str = "null";
        } else {
            str = stackTraceElements[stackTraceElements.length - 1].toString();
        }
        return str;
    }
}