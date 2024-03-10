public class Main {
    public static void main(String[] args)
    {
        //If Conditions

        int salary = 25_000;

        if(salary > 10_000 && salary < 20_000)
        {
            salary+= 2000;
        } else if (salary >= 20_000 ) {
            salary += 3000;
        } else {
            salary += 1000;
        }
    }
}
