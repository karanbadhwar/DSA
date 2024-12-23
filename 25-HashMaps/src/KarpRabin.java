//Rolling Hash Function Method
public class KarpRabin {

    private final int PRIME = 101;

    private long calculateHash(String str) {
        long hash = 0;
        for (int i = 0; i < str.length(); i++) {
            hash = (long) (hash + str.charAt(i) * Math.pow(101, i));
        }
        return hash;
    }

    //Moving the window to next Character in Main String
    private long updateHash(long prevHash, char oldChar, char newChar, int patternLength) {
        long newHash = (prevHash - oldChar) / PRIME; // Reducing the power of all the Chars  to make it start from Power of 0.
        newHash = (long) (newHash + newChar * Math.pow(PRIME, patternLength - 1));

        return newHash;
    }

    public void search(String text, String pattern) {
        int patternLength = pattern.length();
        long patternHash = calculateHash(pattern);
        long textHash = calculateHash(text.substring(0, patternLength));

        // Outer loop will go till the point where at least patternLength elements are present
        for (int i = 0; i < text.length() - patternLength; i++) {
            if(patternHash == textHash) {
                if(text.substring(i, i+patternLength).equals(pattern)) {
                    System.out.println("Pattern found at index "+i);
                }
            }

            if(i < text.length() - patternLength) {
                textHash = updateHash(textHash, text.charAt(i), text.charAt(i + patternLength), patternLength);
            }
        }
    }

    public static void main(String[] args) {
        String a = "Karan";

        String b = "BadhwarKaranBadhwar";

        KarpRabin kr = new KarpRabin();
        kr.search(b,a);
    }
}
