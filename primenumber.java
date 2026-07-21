import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter number is: "+n);
        if(n %2 == 0){
            System.out.println(n+" is prime number");
        }else{
            System.out.println(n+ " not a prime number");
        }
    }
    
}
