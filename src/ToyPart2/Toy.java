package ToyPart2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Toy
{
        
	private String name;
	private int count;

	public Toy()
	{
            this.name = "";
            this.count = 1;
	}

	public Toy( String nm )
	{
            this.name = nm;
            this.count = 2;
	}
	
	public int getCount()
	{
            
            return count;
	}
	
	public void setCount( int cnt )
	{
            this.count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
            this.name = nm;
	}

	public String toString()
	{
	   return name + " " + count;
	}

    Object getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}