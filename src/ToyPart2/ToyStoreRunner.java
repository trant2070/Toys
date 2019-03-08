package ToyPart2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
//            ArrayList<ToyStore> toys = new ArrayList<ToyStore>();
            ToyStore list = new ToyStore("sorry, bat, sorry, sorry, sorry, train, train, teddy, teddy, ball, ball");
           
            System.out.println("sorry, bat, sorry, sorry, sorry, train, train, teddy, teddy, ball, ball");
            System.out.println(list);
            System.out.println("Most Frequent Toy: " + list.getMostFrequentToy());
   
            
            
	}
}