
	import java.util.Scanner;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import javax.naming.InvalidNameException;
	
	
	class TestNameAndPassword {
	    static boolean checkName(String name) throws InvalidNameException, InvalidLengthException {
	        Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]+[a-zA-z0-9_.]+[a-z]$");
	        Matcher matcher = pattern.matcher(name);
	        if (name.length() == 0) {
	            throw new NullPointerException();
	        } else if (name.length() > 10) {
	            throw new InvalidLengthException();
	        } else if (matcher.find() == false) {
	            throw new InvalidNameException();
	        }
	        return true;
	    }




	    static boolean checkPassword(String pass) {
	        Pattern pattern = Pattern.compile("^[A-G]+[a-z0-9]+[$]$");
	        Matcher matcher = pattern.matcher(pass);
	        if (pass.length() >= 5 && pass.length() <= 10) {
	            if (matcher.find() == true) {
	                return true;
	            }
	        }
	        return false;
	    }




	    public static void main(String args[]) {
	        try {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter name : ");
	            String name = sc.nextLine();
	            System.out.println(checkName(name));
	            System.out.print("Enter Password : ");
	            String pass = sc.nextLine();
	            System.out.println(checkPassword(pass));
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

	}




	class InvalidLengthException extends Exception {
	    public String toString() {
	        return "Invalid Length Exception";
	    }

	}




