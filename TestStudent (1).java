import java.util.Scanner;

 public class TestStudent{
  static String checkName(String name){
     if (name.length()==0){
        throw new NullPointerException("Name cannot be blank");
        }
        return "Name is valid";
      }
 static boolean checkMarks(double marks1,double marks2,double marks3) throws
  MarksNotFoundException
  {
   if (marks1==0 && marks2==0 && marks3==0){
      throw new MarksNotFoundException();
     }
   else if(marks1==0 || marks2==0 || marks3==0){
          return false;
        }return true;
  }
 static String buildResult(Student s ) throws
  StudentFailedException
   {
   double total=s.marks1+s.marks2+s.marks3;
   double percentage=total/3;
   if (percentage>=90){
       return "Grade : Outstanding";
     }
     else if(percentage>=80){
      return "Grade : Excellent";
      }
      else if(percentage>=70){
       return "Grade : Very Good";
       }
      else if(percentage>=60){
       return "Grade : Good";
      }
      else if(percentage>=50){
       return "Grade : Average";
      }
      else if(percentage<=50){
       throw new StudentFailedException();
       }
       return null;
   }
 public static void main(String args[]){
  try{
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter Name : ");
     String name=sc.nextLine();
     System.out.println(checkName(name));
     System.out.print("Enter Marks in Maths : ");
     double marks1=sc.nextDouble();
     System.out.print("Enter Marks in English : ");
     double marks2=sc.nextDouble();
     System.out.print("Enter Marks in Hindi : ");
     double marks3=sc.nextDouble();
     System.out.println(checkMarks(marks1,marks2,marks3));
     Student s=new Student();
     s.name=name;s.marks1=marks1;
     s.marks2=marks2;
     s.marks3=marks3;
     System.out.println(buildResult(s));
    }
     catch(NullPointerException e){
          System.out.println(e.getMessage());
        }
     catch(Exception e){
          System.out.println(e);
        }
    }
}
