package StaticVariable;

public class varInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		variableAll info=new variableAll(202,"shri",19,"male",21,450);
		variableAll info1=new variableAll(204,"sakshi",20,"female",21,550);
		variableAll info2=new variableAll(201,"Akash",1,"male",21,450);
		System.out.println("All details of student is:");
		System.out.println("ID"+"  "+"Name"+"  "+"School"+"  "+"Roll No"+"  "+"Gender"+"   "+"Age"+"   "+"Total Mark");
		info.display();
		info1.display();
		info2.display();

	}

}
