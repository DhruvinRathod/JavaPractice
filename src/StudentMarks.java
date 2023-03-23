import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        System.out.println("Enter the total number");
         Scanner sc= new Scanner(System.in);
         int total= sc.nextInt();
         float b=0; 
         float per=0;
         for (int i=1;i<total;i++) {
        	 System.out.println("Enter "+ i+"th subject Mark:");
        	 float s1= sc.nextFloat();
        	b=b+s1;
         }
         per= (b/total);
         System.out.println("The percentage is:");
        System.out.println(per);
    }
}