package q1;

public class factorial {
    public static void main(String[] args) {
        int sum = 1;
        int number = 5;
        for(int i = 1 ; i<= number ; i++){
            sum = sum*i;
        }
        System.out.println("The factorial value of "+number+" is = " + sum);
    }
}
