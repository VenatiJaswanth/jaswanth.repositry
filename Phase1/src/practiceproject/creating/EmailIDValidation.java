package practiceproject.creating;
import java.util.regex.Pattern;
	public class EmailIDValidation {
	 public static boolean isValid(String emailid)
	 {
	 String emailidRegex = "^[a-zA-Z0-8_+&*-]+(?:\\.[a-zA-Z0-8_+&*-]+)*@" +
	 "(?:[a-zA-Z0-8-]+\\.)+[a-zA-Z]{1,9}$";
	 Pattern pat = Pattern.compile(emailidRegex);
	 if (emailid == null)
	 return false;
	 return pat.matcher(emailid).matches();
	 }
	 public static void main(String[] args) {
	 String emailid1 = "venati@gmail.com";
	String emailid2 = "jaswanth@gmail.com";
	String emailid3 = "venatijaswanth2021@gmail.com";
	 String[] emailids= {emailid1,emailid2,emailid3};
	 for (int i = 0; i < emailids.length; i++) {
	 String emailid=emailids[i];
	if (isValid(emailid))
	 System.out.print(emailid+" is valid Email ID");
	 else
	 System.out.print(emailid+" is invalid Email ID");
	System.out.println();
	 }
	 }
	}
