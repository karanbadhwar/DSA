public class StrBuilder {
    public static void main(String[] args) {

        //StringBuilder is Mutable, not like Strings

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            sb.append(ch);
            //O(N) time and space Complexity
        }

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

    }
}
