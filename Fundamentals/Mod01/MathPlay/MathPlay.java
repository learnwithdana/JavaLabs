
public class MathPlay {
    
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 3;

        double answer1 = num1 / num2 * 1.0f;
        float answer2 = 1.0f * num1 / num2;
        float answer3 = num1 * 1.0f / num2;
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

        // the following generates a syntax error because it is a narrowing conversion (64-bit to 32-bit)
        // float x;
        // x = 3.5;   // 3.5 is a double because all literals with a decimal point are doubles

        // this works because widening conversions are okay 32-bit --> 64-bit
        long x;
        x = 121;   // 121 is an int because all whole number literals are ints
        System.out.println(x);

        float hrs = 46.5f;
        float pay = 44.55f;

        float OTHours = hrs - 40;
        float OTPay = (float)(OTHours * 1.5 * pay);

        float OTPaySquared = (float) Math.pow(OTPay, 2);

        float principal = 53000, intRate = 7.625f;
        int years = 15;        

        float pmt = (float)((principal * intRate / 1200) / ( 1 - Math.pow(1 + intRate / 1200, -years * 12))); 
        System.out.printf("Your $%.2f loan payment is $%.2f/month for %d years", principal, pmt, years);
    }
}
     


