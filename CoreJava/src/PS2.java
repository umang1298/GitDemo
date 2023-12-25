//lec - 147
public class PS2 {
	
	int a; // This is class variable
	public PS2(int a) { //Here int a is instance variable
		// TODO Auto-generated constructor stub
		
		this.a=a;
		
	}
	
	
	//default constructor
	public int increment() 
	{
		a=a+1;
		return a;
	}
	public int decrement()
	{
		a=a-1;
		return a;
	}
}
