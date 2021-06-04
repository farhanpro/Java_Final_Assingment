import java.util.Scanner;
class StudentDemo
{
    
	int rollno, marks1, marks2, marks3, total;
	String name,course;
	float percent; //instance variable

	void setValue(int r_no,int sub1, int sub2, int sub3, String stud_name,String stud_course)
	{
		rollno=r_no;
		name=stud_name;
		course=stud_course;
		marks1=sub1;
        marks2=sub2;
        marks3=sub3;
	}

    void caltotal()
    {
        total=marks1+marks2+marks3;
        System.out.println("Total marks of student are : "+total);
    }

    void calpercent()
    {
        percent=total/3;
        System.out.println("Percentage of student is : "+percent);
    }

    void calgrade()
    {
        System.out.print("The calculated student Grade is: ");
        if(percent>=70)
        {
            System.out.print("Distinction");
        }
        else if(percent>=60 && percent<=69)
        {
           System.out.print("First class");
        } 
        else if(percent>=55 && percent<=59)
        {
            System.out.print("Higher Second class");
        }
        else if(percent>=35 && percent<=49)
        {
            System.out.print("Pass class");
        }
        else
        {
            System.out.print("Fail");
        }

    }
	
}

class StudentMain
{
	public static void main(String args[])
	{
		StudentDemo stud1=new StudentDemo();
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter RollNo : ");
		int r=scan.nextInt();
	
		System.out.println("Enter Name : ");
		String n=scan.next();

		System.out.println("Enter Course : ");
		String c=scan.next();

		System.out.println("Enter marks of 3 subjects : ");
		int sub_1=scan.nextInt();
        int sub_2=scan.nextInt();
        int sub_3=scan.nextInt();
		
		stud1.setValue(r,sub_1,sub_2,sub_3,n,c);
        stud1.caltotal();
        stud1.calpercent();
        stud1.calgrade();
	}
}