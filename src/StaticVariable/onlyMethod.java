package StaticVariable;

public class onlyMethod extends staticMethod {
	  String N,g;
	  int a;
	  static  void college() {
		   String clgname="GSG";
			System.out.println(clgname);
		 }
	  
	  onlyMethod(String name,int age,String gender){
		  N=name;
		  a=age;
		  g=gender;
		  System.out.println("Name"+" "+"Age"+" "+"Gender");
		  System.out.println(N+" "+a+" "+g);
		  
	  }

}
