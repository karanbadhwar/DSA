package Strings;

public class SkipAChar {
    public static void main(String[] args) {
        skip("", "baccdah");
        String ans = skip("baccdah");
        System.out.println(ans);

        System.out.println(skip2("bcaaappledssh"));

        System.out.println(skipString("bcappappleafddf"));
    }

    /* Method with Processed and Unprocessed Strings
        1 - String Pro - Processed String
        2 - String unPro - Un-processed String
     */
    static void skip(String pro, String unPro)
    {

        //Base Condition
        if(unPro.isEmpty())
        {
            System.out.println(pro);
            return ;
        }
        char ch = unPro.charAt(0);
        if(ch == 'a')
        {
            skip(pro, unPro.substring(1)); // Substring creates a new copy
        } else {
            skip(pro + ch, unPro.substring(1));
        }
    }

    //With returning a String
    static String skip(String unPro)
    {

        //Base Condition
        if(unPro.isEmpty())
        {
            return "";
        }
        char ch = unPro.charAt(0);
        if(ch == 'a')
        {
            return skip(unPro.substring(1));
        } else {
            return ch+skip(unPro.substring(1));
        }
    }

    //Skipping a Subset String
    static String skip2(String unPro)
    {

        //Base Condition
        if(unPro.isEmpty())
        {
            return "";
        }
        if(unPro.startsWith("apple"))
        {
            return skip2(unPro.substring(5));
        } else {
            return unPro.charAt(0)+skip2(unPro.substring(1));
        }
    }

    //Skipping another String, if not required
    static String skipString(String unPro)
    {

        //Base Condition
        if(unPro.isEmpty())
        {
            return "";
        }
        if(unPro.startsWith("app")&& !unPro.startsWith("apple"))
        {
            return skipString(unPro.substring(3));
        } else {
            return unPro.charAt(0)+skipString(unPro.substring(1));
        }
    }
}
