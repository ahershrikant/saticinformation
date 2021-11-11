package StaticVariable;

public class variableAll extends varInfo{
	static String school="GSG";
	int i,k,m,n;
	String j,l;
	
	variableAll(int id,String name,int rollno,String gender,int age,int totalmark){
		i=id;
		j=name;
		k=rollno;
		l=gender;
		m=age;
		n=totalmark;
	}
	
	
	void display() {
		
	
		System.out.println(i+" "+j+"  "+school+"      "+k+"     "+l+"   "+m+"    "+n);
	}
	
}
