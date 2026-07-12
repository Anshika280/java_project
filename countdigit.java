public class countdigit{
    static int countDigits(int n){
        int count = (int)(Math.log10(n) +1);
        return count;
    }
    public static void main(String[] args) {
        int N = 12345345;
        int digit = countDigits(N);
        System.out.println("number of digit in N:" +digit);
    }
}                    
