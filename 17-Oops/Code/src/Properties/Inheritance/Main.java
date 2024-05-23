package Properties.Inheritance;

public class Main {
    public static void main(String[] args) {
        //Parent Class Box
//        Box box = new Box(4, 7, 8);
//        System.out.println(box.l);

        //Child class BoxWeight
//        BoxWeight bW = new BoxWeight();
//        System.out.println(bW.w);
//        BoxWeight bW1 = new BoxWeight(2, 4, 6, 8);
//        System.out.println(bW1.h);

        //The Type of the reference variable determines what members can be accessed!!
        //Reference variable in stack of Box and Object in Heap of Box Weight
//        Box mixBox = new BoxWeight(2, 4, 6, 8);


//        Multiple Inherited Class
        BoxPrice bP = new BoxPrice();

        System.out.println(bP.h);

    }
}
