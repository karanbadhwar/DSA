public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Karan";
        char target = 'u';

        System.out.println("Character Exists: "+search(name,target));
    }

    static boolean search2(String str, char t)
    {
        if(str.isEmpty()) // str.length == 0
            return false;

        for(char ch: str.toCharArray())
        {
            if(ch == t)
                return true;
        }

        return false;
    }

    static boolean search(String str, char t)
    {
        if(str.isEmpty()) // str.length == 0
            return false;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == t)
                return true;
        }
        return false;
    }
}
