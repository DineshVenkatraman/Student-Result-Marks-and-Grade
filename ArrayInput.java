import java.util.Scanner;
import java.io.DataInputStream;
public class ArrayInput {
    int sum=0;

    public void ArrayIn()
    {
        try {
            Scanner sc = new Scanner(System.in);
            DataInputStream da = new DataInputStream(System.in);
            System.out.print("Enter The no of limit : ");
            int n = sc.nextInt();
            int Sno[] = new int[n];
            String subs[] = new String[n];
            int marks[] = new int[n];
            System.out.println("Enter The Sub Index :");
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the " +(i + 1)+ " Serial No : ");
                Sno[i] = sc.nextInt();
                System.out.println(Sno[i] + " The Subs");
                subs[i] = da.readLine();
                System.out.println(Sno[i] + " " + subs[i] + " the marks");
                marks[i] = sc.nextInt();

            }
            for(int i=0;i<n;i++)
            {
                System.out.println(Sno[i] + " " + subs[i] + " "+marks[i]);
                sum=sum+marks[i];
            }
            System.out.println("The Total Marks : "+sum);
            if (sum>400)
            {
                System.out.println("A Grade");
            }
            else if(sum>300)
            {
                System.out.println("B Grade");
            }
            else if(sum>200)
            {
                System.out.println("C Grade");
            }
            else if(sum>150)
            {
                System.out.println("D Grade");
            }
            else
            {
                System.out.println("E Grade");
            }
            System.out.println("Enter The Grade if any you have in A TO E");
            String Grade= da.readLine();
            switch (Grade)
            {
                case "A":
                    System.out.println("Excellent");
                    break;
                case "B":
                    System.out.println("Good");
                    break;
                case "C":
                    System.out.println("Well Done");
                    break;
                case "D":
                    System.out.println("Passed");
                    break;
                case "E":
                    System.out.println("Better Try Again");
                    break;
                default:
                    System.out.println("invalid String Try correct character ");
            }
        }catch (Exception l){}
    }
}
