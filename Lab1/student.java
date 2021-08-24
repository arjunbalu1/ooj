import java.util.*;
class student
{
	private String USN;
	private String name;
	private int n;
	private double SGPA = 0;
	private int totalCredits = 0;
        private int credits[];
        private double marks[];
	Scanner ss = new Scanner(System.in);

	void Details()
	{
	System.out.println("enter USN of the student");
	USN = ss.nextLine();
	System.out.println("enter Name of the student");
	name = ss.nextLine();
	System.out.println("enter no of subjects");
	n = ss.nextInt();
	credits = new int[n];
	marks = new double[n];
	System.out.println("enter details of the subjects:");
	for(int i=0;i<n;i++)
	{
		System.out.println("enter credits allotted to the subject "+(i+1));
		credits[i] = ss.nextInt();
		System.out.println("enter marks in the subject "+(i+1));
		marks[i] = ss.nextInt();
		Calculate(credits[i],marks[i],i);
	}
    }
    void Calculate(int credit,double mark,int j)
    {
		totalCredits = totalCredits + credit;
		if(mark>=90&&mark<=100)
			SGPA = SGPA + (10*credit);
		else if(mark>=80 && mark<=89)
			SGPA = SGPA + (9*credit);
		else if(mark>=70&&mark<=79)
			SGPA = SGPA + (8*credit);
		else if(mark>=60&&mark<=69)
			SGPA = SGPA + (7*credit);
		else if(mark>=50 && mark<=59)
			SGPA = SGPA + (6*credit);
		else if(mark>=40&&mark<=49)
			SGPA = SGPA + (5*credit);
		else
			System.out.println("failed in subject "+(j+1));
	}
	void Display()
	{
		System.out.println("details of the Student");
		System.out.println("name :"+name);
		System.out.println("USN: "+USN);
		System.out.println("SGPA of student "+(SGPA/totalCredits));
	}
}
class Main
{
	public static void main(String args[])
	{
		student s1 = new student();
		s1.Details();
		s1.Display();
	}
}