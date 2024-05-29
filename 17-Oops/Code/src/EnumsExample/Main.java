package EnumsExample;

public class Main {
    enum Week implements A {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        Week() {
            System.out.println("Constructor called for " + this);
        }

//        void display(); Abstract Methods are not allowed, a body should be there in Enum.

        public void hello() {
            System.out.println("hey, how are you ?");
        }
        //This is not public or protected, instead only private or default.

        //Internally: public static final Week Monday = new Week(); -> It calls Constructors Internally
    }

    public static void main(String[] args) {
        /*
            Enums: - Enum is a special Class. It has set Number of Constants.
                Syntax -
                    enum Week{
                    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
                    // these are enum constants.
                    // public, static and final.
                    // since its final you cannot create a child enums.
                    // type is Week.

                    Enum and Constructor
                        Enum can contain a constructor,
                         and it is executed separately for each enum constant at the time of the enum class loading.
                        We can’t create enum objects explicitly, and hence we can’t invoke the enum constructor directly.
         */

        //Printing all Constants of Week.
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

        /*
        When you assign Week.Monday to day, day references the Monday instance in the heap.
         */
        Week day;
        day = Week.Monday;
        day.hello();

        //Ordinal -> Position of the enum declared at.
//        System.out.println(day.ordinal());

        System.out.println(Week.valueOf("Monday"));
    }

}
