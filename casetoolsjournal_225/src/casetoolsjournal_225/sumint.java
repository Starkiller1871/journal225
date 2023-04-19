package casetoolsjournal_225;

public class sumint {
	int a,b,sum=0;
	sumint(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
	void sum()
	{
		 sum=a+b;
	}
	
	void display() {
		System.out.println("the sum of two integers is "+sum);
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumint sum=new sumint(4,6);
		sum.sum();
		sum.display();
		

	}

}
