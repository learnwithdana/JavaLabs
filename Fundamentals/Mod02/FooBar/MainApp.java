public class MainApp {
    public static void main(String[] args) {
        foo();
        moo();
    }

    public static void foo() {
        moo();
        System.out.println("Foo");
        moo();
    }

    public static void moo() {
        System.out.println("Moo");
    }
}