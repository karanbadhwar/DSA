package Cloning;

public class Human implements Cloneable {

    int age;
    String name;
    int[] arr;

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//
//    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 7, 9};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        //This is a shallow Copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //This is a Deep Copy
        Human twin = (Human) super.clone(); // this is shallow copy part

        twin.arr = new int[twin.arr.length];

        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }
        return twin;
    }
}
