package com.waterfall;
/**
 * @author asif
 * This is a practise problem for understanding of hash map
 * Hash map takes input from a input file and map it with a class
 * Put the values accordingly into the hash map
 * Print the values and comapre with a randomly generated number
 * Delete the matched number entry from the hash map and print the 
 * result of updated hash map value 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class WaterFallAdventure {

	public static void main(String[] args) throws IOException {
  
		//Hash map declaration
		HashMap<Integer, Location> hMap = new HashMap<Integer,Location>();
        // File reading code
		BufferedReader br=null;
		FileReader fr = null;

		fr = new FileReader("C:\\Users\\asif2\\Desktop\\Places.txt");
		br= new BufferedReader(fr);
		String line=null;
		Scanner sc=new Scanner(br);
		//Iterate through the file
		while(sc.hasNext()) {
            String locationDetails = sc.nextLine();
            String[] locationDetails1 = locationDetails.split(" ");
         // Putting values from file in the hash map
            hMap.put(Integer.parseInt(locationDetails1[0]), new Location(locationDetails1[1],
            		locationDetails1[2],Double.parseDouble(locationDetails1[3])));
		}
		//Iterate through the hash map and print the values
		Set set=hMap.entrySet();
		Iterator ite=set.iterator();
		while(ite.hasNext()) {
			Map.Entry mE = (Map.Entry)ite.next();
			Location location = (Location)mE.getValue();
			System.out.println("Key is: "+mE.getKey()+" Name: "+location.getName()+
					" Location: "+location.getName()+" Distance(km): "+location.getDistance());		
		}
		//Iterate through the hash map and delete the value if it 
		//matches with the randomly generated value
		//Random Number Generation 
		Random rn =new Random();
		int x=rn.nextInt(17);
		System.out.println("Random  number is: "+x);
		// Create the iterator for removing the element
		Iterator itDel=hMap.entrySet().iterator();
		while(itDel.hasNext()) {
			Map.Entry mE = (Map.Entry)itDel.next();
			Location location = (Location)mE.getValue();
			if(x == Integer.parseInt(mE.getKey().toString())) {
				itDel.remove();
			System.out.println("Deleted values is: "+" Key: "+mE.getKey());
			}
		}
		//After deleting print the rest of the values from hash map
		Set set2 = hMap.entrySet();
		Iterator it=set2.iterator();
		while(it.hasNext()) {			
			Map.Entry mp=(Map.Entry) it.next();
			Location ll=(Location)mp.getValue();
			System.out.println("Key is: "+mp.getKey()+" Name: "+ll.getName()+
					" Location: "+ll.getName()+" Distance(km): "+ll.getDistance());	
		}
	}

}

