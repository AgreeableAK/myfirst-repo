import java.util.Scanner;



public class classdetails 
{
    public static void main(String[] args)
    {   int n;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of student:");
        n=sc.nextInt();

        student[] stu=new student[n];

        for (int i=0;i<n;i++)
        {
            stu[i]=new student();
            System.out.print("\nEnter Student Number:"+(i+1)+"\n");
            System.out.print("Enter USN:");
            stu[i].USN=sc.next();

            System.out.print("Enter student Name:");
            stu[i].Name=sc.next();

            System.out.print("Enter Branch:");
            stu[i].Branch=sc.next();

            System.out.print("Enter phone Number:");
            stu[i].Phoneno=sc.next();

            System.out.print("Enter percentage:");
            stu[i].Percentage=sc.nextDouble();
            
        }
    
    for (int i=0;i<n;i++)
    {
        System.out.println("\nEntered Student Details "+(i+1)+"\n");

        System.out.print("USN:"+stu[i].USN);
        System.out.print("\nName:"+stu[i].Name);
        System.out.print("\nBranch:"+stu[i].Branch);
        System.out.print("\nPhoneno:"+stu[i].Phoneno);
        System.out.println("\nPercentage:"+stu[i].Percentage);
    }
    sc.close();
    }
}
