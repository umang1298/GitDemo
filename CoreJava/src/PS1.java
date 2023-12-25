import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PS1 extends PS{

	
@Test
	public void testRun()
	{
	PS2 Ps2 = new PS2(3); //parametrized constructor
	int a=3;
	doThis();
	System.out.println(Ps2.increment());
	System.out.println(Ps2.decrement());
	}


	}


