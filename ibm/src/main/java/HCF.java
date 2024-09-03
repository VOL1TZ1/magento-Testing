import java.util.Scanner;

public class HCF {
    
    static void Main(){
        int n1,n2,answer = 1;
        Scanner nunmer =new Scanner(System.in);
        System.out.println("Enter the first no.:");
        n1=nunmer.nextInt();
        System.out.println("Enter the second no.:");
        n2=nunmer.nextInt();
        
        int min =Math.min(n1,n2);
        for(int i =min ;i>0;i--){
            if(n1%i==0 && n2%i ==0){answer=i;}
        }
        System.out.println("Answer is: "+answer);


    }
}
