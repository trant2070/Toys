package ToyPart2;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import ToyPart2.Toy;
import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
    public ToyStore(){
        toyList = new ArrayList<Toy>();
    }
    public ToyStore(String t){
        loadToys(t);
    }
    public void loadToys(String toys){
        toyList = new ArrayList<Toy>();
		String[] toy = toys.split(", ");
		for(int i = 0; i < toy.length; i += 2)
		{
			String name = toy[i];
			
			Toy t = getThatToy(name);
			
			if(t == null)
			{
				if (name.equals("sorry"))
				{
					toyList.add(new Toy(name));
				}
				if(name.equals("bat"))
				{
					toyList.add(new Toy(name));
				}
                                if(name.equals("ball"))
				{
					toyList.add(new Toy(name));
				}
                                if(name.equals("train"))
				{
					toyList.add(new Toy(name));
				}
                                if(name.equals("teddy"))
				{
					toyList.add(new Toy(name));
				}
			}
			else 
			{
				t.setCount(t.getCount()+1);
			}
		}
	}
    public Toy getThatToy(String nm){
        for(Toy i : toyList){
            if(i.getName().equals(nm))
            return i;
        }
        return null;
    }
    
    public String getMostFrequentToy(){
        String name = "";
        int max = Integer.MIN_VALUE;
        for(Toy i : toyList){
            if(max < i.getCount()){
                max = i.getCount();
                name = i.getName();
            }
        }
    return name;
  }
 
    public String toString(){
        return toyList.toString();
    }
}