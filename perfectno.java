import java.util.*;
public class perfectno {
    public static void main(String args[]){
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int number=sc.nextInt();
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum=sum+i;
                System.out.println("sum is"+sum);
            }
            
        }
        if(sum==number){
            System.out.println(number+"is perfect no");

        }else{
            System.out.println(number+"is not perfect no");
        }
        sc.close();

    }
}
