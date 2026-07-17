public class palindrome {
    public boolean palin(int n){
        int revnum = 0;
        int dup = n;
        while(n>0){
            int ld = n % 10;
            revnum = (revnum * 10)  + ld;
            n = n/10;
        }
        return dup == revnum;
    }
    public static void main(String[] args) {
        int number = 4554; // Example number
        palindrome obj = new palindrome();
        if (obj.palin(number)) { // Check if the number is a palindrome
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
    
}
