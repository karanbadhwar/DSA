package AccessModifier;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        super();
        this.num = num;
        this.gpa = gpa;
    }

    // It gives number representation of an object, random integer value not ADDRESS
    @Override
    public int hashCode() {
        return super.hashCode();
//        return num; //Modified
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo) obj).num; // Modified
    }


//    @Override
//    public String toString() {
//        return super.toString();
//    }


    //Finalize hits, when garbage collection hits
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34, 56.76f);
        ObjectDemo obj2 = new ObjectDemo(24, 78.9f);

        ObjectDemo obj3 = obj2;

        // == is checking, if these two variables are pointing to the same variable or not
//        if (obj == obj2) {
//            System.out.println("Obj is equal to Obj2");
//        }

        // .equals check for the content, in the object's case it comes as Address only, as ref var holds the addresses
        if (obj.equals(obj2)) {
            System.out.println("Obj is equal to Obj2");
        }

        //Different values for both the values below, if not modified;
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
//        System.out.println(obj3.hashCode());

        //From getClass(), we can get the data about the class!!! like name and etc.....
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getName());
    }
}
