package Introduction;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduction To OOPS");
        //Data of 5 Students (Roll Numbers)
        int[] rNumbers = new int[5];

        //Data of 5 Students (Student Name)
        String[] names = new String[5];

        //If we need to create a Data type with every Entity having Roll No, Name and marks
        //As these are separate, we cannot combine data for single student like this
//        int[] rNo = new int[5];
//        String[] name = new String[5];
//        float[] marks = new float[5];

        Student students;


        //Class is a template of an Object, while an Object is an Instance of the class
        //CLasses help us in defining the Custom Data type and being used by its Instances

        //Three Essential properties of an Object
//    State - Value
//    Identity - can be as address
//    Behaviour - Effect of Data Type Operations

    /*
        NEW keyword dynamically allocates memory at runtime and returns a reference to it!
        Student st1 = new Student();
     */

        //Creating an Instance of Student Class
        Student stu1 = new Student();
        Student stu2 = new Student(20, "KB", 87.4f);
        stu1.changeName("Karan Karan");

        /*
        1- Memory Allocation: The new keyword allocates memory for a new Student object on the heap.
        2- Constructor Call: The constructor Student() initializes the new object.
           It doesn't return anything; its job is to set up the initial state of the object.
        3-Reference Assignment: The memory address (reference) of the newly created Student object is
           returned by the new expression, not by the constructor, and this reference is assigned to the variable stu1.
         */

        //Passing value to the objects Instance Variable by DOT operator (.)
//        stu1.rNo = 7;
//        stu1.name = "Karan Badhwar";
//        stu1.marks = 99.0f;
//        stu1.address = "222dd"; // not available as not present in the template

//        System.out.println(stu2.rNo);
//        System.out.println(stu2.name);
//        System.out.println(stu2.marks);

        Student random = new Student(stu1);
        System.out.println(random.rNo);
        System.out.println(random.name);
        System.out.println(random.marks);
//        stu1.greet();

    }

    //Now Each Object created using this class will have these 3 properties
    static class Student {
        //Properties
        int rNo;
        String name; // Default value of Object is NULL
        float marks = 90f; // Giving Default value, if no value is passed

        //Methods
        void greet() {
            //Whenever we use any properties of the class, and we want to use the value associated to particular Object,
            // we use "this" as it will refer to Object reference
            System.out.println("Hello! My name is: " + this.name);
        }

        void changeName(String newName) {
            name = newName;
        }

        //Constructor
        Student() {
            //To add the value of the above properties Object by Object using "this"
            //"this" keyword is used to ref to individual Object
            //In order to use the Object Reference inside the Class (Template) we use "this"
//            this.rNo = 7;
//            this.name = "Karan Badhwar";
//            this.marks = 99f;

            //Calling another constructor from the inside of the current constructor,
            //i.e., when somebody did not pass any value, we call another constructor with generic values
            //In this case "this" is replaced with new Object creation (new Student())
            this(100, "Random Person", 70.5f);
        }

        //Constructor Overloading (This is called Polymorphism)
        Student(int rollNo, String name, float marks) {
            this.rNo = rollNo;
            this.name = name;
            this.marks = marks;
        }

        Student(Student other) {
            this.name = other.name;
            this.rNo = other.rNo;
            this.marks = other.marks;
        }
    }
}
