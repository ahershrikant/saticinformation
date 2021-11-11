package StaticVariable;
import java.util.*;
public class villageInfo extends pepoleInfo {
	
	Scanner sc=new Scanner(System.in);
	   int adharno=sc.nextInt();
	 static  int AdharNo =1234534;
	 villageInfo(){
		AdharNo=AdharNo+1;
	  if(adharno==AdharNo)
	  {
		
	     String name="shrikant Suresh Aher";
	     String gender="male";
	     int age=21;
	     int rollno=19;
	     String dob="24/12/2000";
	     System.out.println(name+"\n"+gender+"\n"+age+"\n"+rollno+"\n"+dob);
	  }
	
	 }
	

}
