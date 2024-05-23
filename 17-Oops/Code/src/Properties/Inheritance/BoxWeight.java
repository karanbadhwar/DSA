package Properties.Inheritance;

//Subclass will not be able to access members of Parent class that are private
public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
//        this.w = 5555; // Can use only if it is not private
    }

    public BoxWeight(double l, double w, double h, double weight) {
        //Super - calls Parent class's constructor, to initialize values in Parent Class
        super(l, w, h); //Super is passing values to the Original constructor, it is not accessing private members itself;
        System.out.println(this.weight); // giving property of Subclass
        System.out.println(super.weight); // Giving weight property of Parent class
        this.weight = weight;
//        super(l, w, h); ?? Super class needs to be initialized First
    }

    public BoxWeight(double weight) {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        /* Above same as this below: -
          The Type of the reference variable determines what members can be accessed!!
          Reference variable in stack of Box and Object in Heap of Box Weight
          Box mixBox = new BoxWeight(2, 4, 6, 8);
         */
        this.weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
