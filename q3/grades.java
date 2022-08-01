package q3;

public class grades {
    public static void main(String[] args) {
        int grade = 63;
        if((grade%5)<=2){
            System.out.println(grade);
        }else{
            if((grade%5)>=3){
                System.out.println(grade+2);
            }
        }
    }
}
