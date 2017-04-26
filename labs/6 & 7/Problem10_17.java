import java.math.BigInteger;
public class Problem10_17 {
    public static void main(String[] args) {
        long x = (long) Math.sqrt(Long.MAX_VALUE) + 1;
        for(long i = x; i < x + 10; i++) {
            BigInteger temp = new BigInteger(Long.toString(i));
            System.out.println(temp.pow(2));
        }
    }
}