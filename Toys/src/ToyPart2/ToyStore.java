package ToyPart2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import ToyPart2.Toy;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
            toyList = new ArrayList<Toy>();
	}
        public ToyStore(String toy)
        {
            loadToys(t);
        }

	public void loadToys( String toys )
	{
            toyList = new ArrayList<Toy>();
            ArrayList<String> toy
                    = new ArrayList <>(Array.asList(toys.split(", ")));
            for ( int i = 0; i < toy.size(); i += 2)
            {
                
            }
	}
  
  	public Toy getThatToy( String nm )
  	{
            return null;
  	}
  
  	public String getMostFrequentToy()
  	{
            for (int i = 0; i < toyList.size(); i++)
            {
                
            }
            return "max == " ;
  	}  
  
  	public void sortToysByCount()
  	{
            
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}