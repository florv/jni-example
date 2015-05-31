public class JNIExample {
    static {
        System.loadLibrary("JNIExample");
    }

    private native void hello(int id);

    public static void main(String[] args) {
        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            id = 42;
        }
        (new JNIExample()).hello(id);
    }
}
