package callexceptionmethods;

public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            // show error information with e.getMessage()
            // 显示带有 e.getMessage() 的错误信息
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            // show stack trace of the error with e.printStackTrace();
            // 显示错误的堆栈跟踪信息
            e.printStackTrace();
        }
    }
}