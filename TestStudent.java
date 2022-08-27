//Deepanjali's code

public class TestStudent {
   
     public static void main(String args[]){
         
         String name="Deesh";

         double marks1=76;
         double marks2=86;
         double marks3=67;
         
         StudentDetails sd=new StudentDetails();
         
         sd.setName(name);

         sd.setMarks1(marks1);
         sd.setMarks2(marks2);
         sd.setMarks3(marks3);
        
        String nResult=sd.checkName(name);
                  
        if(nResult.equals(" Name is valid")) {
              
        boolean flag=sd.checkMarks(marks1,marks2,marks3);

        if(flag==true){
        
        double result =    sd.buildResult(marks1,marks2,marks3);

        System.out.println("Name of the Student :"+name);

        System.out.println("Result in % : " +result);
        
        if(result>=90)
            System.out.println("Grade : Outstanding");

        else if(result>=80)
            System.out.println("Grade : Excellent");

        else if(result>=70)
            System.out.println("Grade : Very Good");

        else if(result>=60)
            System.out.println("Grade : Good");

        else if(result>=50)
            System.out.println("Grade : Average");
        
        try{

            if(result<50)
        throw new StudentFailedException("Student Failed");

        }
        catch(StudentFailedException e){
            } 
        }

        else 
             System.out.println("Marks are not valid");}
           
       else

            System.out.println(nResult+" We can not proceed next!!!");
     }
}

   class StudentFailedException extends Exception {
    
         public StudentFailedException( String msg){
        
    System.out.println(msg);
    }
}

   class StudentDetails {
        
    String name;

    double marks1;
    double marks2;
    double marks3;
    double marks4;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }
    public double getMarks1() {
        return marks1;

    }
    public void setMarks1(double marks1) {
        this.marks1 = marks1;

    }
    public double getMarks2() {
        return marks2;

    }
    public void setMarks2(double marks2) {
        this.marks2 = marks2;

    }
    public double getMarks3() {
        return marks3;
    }
    public void setMarks3(double marks3) {
        this.marks3 = marks3;
    }

    public double getMarks4() {
        return marks4;
    }

    public void setMarks4(double marks4) {
        this.marks4 = marks4;
    }   
    
    public String checkName(String name){

  try{

     if(name.equals(null))
            throw new NullPointerException();
  }

       catch(NullPointerException e){
           return "Name can not be blank";
       }
 
        return " Name is valid";
        }  
    
    public boolean checkMarks(double marks1,double marks2,double marks3){
        
        if(marks1==0||marks2==0||marks3==0)
            return false;
          
        else return true;
    }

    public double buildResult(double marks1,double marks2,double marks3){

       double total=marks1+marks2+marks3;
       double percent=total/3;
        
        return percent;
       
}
     }
