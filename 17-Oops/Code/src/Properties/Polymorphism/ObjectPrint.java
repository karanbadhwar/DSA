package Properties.Polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        Object obj = new ObjectPrint(5); // Dynamic Polymorphism via Dynamic Method Dispatch
        System.out.println(obj);
    }
}
