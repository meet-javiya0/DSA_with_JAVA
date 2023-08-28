public class Fast_Exponentiation_12_11 {
    public static int fastExpo(int num, int pow) {
        int ans = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) {
                ans = ans * num;
            }
            num *= num;
            pow = pow >> 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        System.out.println(fastExpo(3, 5));
        System.out.println(fastExpo(5, 3));
    }
}