package toys.ToyPart1;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import ToyPart2.Toy;
import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
            Toy test = new Toy();
            test.setName("gi joe");
            test.setCount(5);
            System.out.println(test.toString());
	}
}