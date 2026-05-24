interface A {
    default void show() {
        System.out.println("A show()");
    }
}

interface B {
    default void show() {
        System.out.println("B show()");
    }
}

class C implements A, B {
    // Must override because both interfaces provide show()
    @Override
    public void show() {
        System.out.println("Resolving diamond problem");
        // explicitly calling one interface
        A.super.show();
        // optionally calling another
        B.super.show();
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}