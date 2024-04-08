public class Performance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            series += ch; //Over Here a new String is being created using the old String and new Character
            //Thus it wastes a lot of memory
            //O(N^2) time and space Complexity
        }
        System.out.println(series);
    }
}
