import java.util.Scanner;

public class Armstrong {

    public static void armstrongNum(int a){
        for(int num = 0; num <= a; num++){
            int sum = 0;
            int temp = num;
            int digits = String.valueOf(num).length();
            while(temp > 0){
                int lastdigit = temp % 10;
                int power = (int)Math.pow(lastdigit,digits);
                sum+=power;
                temp/=10;
            }
            if(num == sum){
                System.out.println(num+" ");
            }
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Armstrong obj = new Armstrong();
    System.out.print("Enter number: ");
    int range = sc.nextInt();
    System.out.print("Armstrong numbers are: ");
    obj.armstrongNum(range);
    
    }
}
    




