package StaticExample;


//Outside classes cannot be static
public class InnerClasses {
    //Inner classes can be static or non-static
    static class TestClass {
        String name;

        public TestClass(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        //If the inner class is not static, an Object cannot be created of it, as It is dependent on the Outer Class's Object now!
//        TestClass a = new TestClass("Karan");
//        TestClass b = new TestClass("Badhwar");

        //Now static class is having Objects, but static mean TestCLass is not dependent on the Inner CLass Objects!1
        //Same way, if I have static variable inside Static class, that variable will be independent of static class's objects
        TestClass a = new TestClass("Karan");
        TestClass b = new TestClass("Badhwar");

        System.out.println(a);

    }
}
