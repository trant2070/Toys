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
            
	}

	public void loadToys( String toys )
	{
            toyList.add(new Toy(toys));
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