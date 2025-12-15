public interface A {
    default void tes1(){
        System.out.println("A.tes1()");
    }
    static void display(){
        System.out.println("A.display()");
    }
}
