import java.util.Random;

public class RandomString {
    public String generate(int size) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < size; i++) {
            int value = 97 + (int)(26 * random.nextFloat());
            sb.append((char)value);
        }
        return sb.toString();
    }
}
