
public class Cam {
	int id; 
	String name;
	
	Cam(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println("The id and name of the Cam is "+" "+id+""+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cam c1=new Cam(123,"Kanon");
		c1.display();

	}
}
