import java.util.HashSet;
import java.util.Set;


public class UniqueSubsetsVariations {
    public static void main(String[] args) {
        String str = "aab";
        System.out.println( unqSubset(str));
    }

    private static Set<String> unqSubset(String str) {
        Set<String> opt = new HashSet<>();
        printUnq(str, "", opt);
        return opt;
    }

    private static void printUnq(String ip, String op, Set<String> set) {
        if (ip.isEmpty()){
             set.add(op);
             return;
        }
        char ch = ip.charAt(0);
        printUnq(ip.substring(1), op, set);
        printUnq(ip.substring(1), op+ch, set);
    }


}
