public class armstrong {
    public boolean Armstrong(int n){
        int sum = 0;
        int dup = n;
        while(n>0){
             int lastdigit = n % 10;
             sum = sum +(lastdigit * lastdigit * lastdigit);
             n = n/10;

        }
        return sum == dup;

    }
    public static void main(String[] args) {
        int n = 371;
        armstrong obj = new armstrong();
        if(obj.Armstrong(n)){
            System.out.println(n+"  is armstrong");
        }else{
            System.out.println(n+ "not armstrong");
        }
    }
    
}
