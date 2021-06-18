package krithika.task2;





import java.io.*;

import java.util.*;
public class Vowels {

public void readFile(String infName, String opfName) { 
	char[] vowels = {'a', 'e', 'i', 'o', 'u'};

try {
	
	File myObj= new File(infName);
	FileWriter opobj= new FileWriter (opfName);
	Scanner myReader = new Scanner (myObj);

	while (myReader. hasNextLine()) {
	
		String data = myReader.nextLine();
		 String[] inputArray=data.split(" ");
		 for(String s:inputArray)
			 if(s.length()>1) {
		for(int i = 0;i<vowels.length; i++) 
		{
			if(s.charAt(1)==vowels[i]) {
				opobj.write(s +" "); 
				}
			}
		}}
	
		myReader.close(); 
		opobj.close();
	
		} catch (Exception e) { 
		System.out.println("An error occurred.");
		e.printStackTrace();
	}
}

public static void main(String[] args) { 
	Vowels v= new Vowels();
	v.readFile("C:\\Users\\krithika\\Desktop\\sampleInput.txt", "C:\\Users\\krithika\\Desktop\\sampleOutput.txt");
}
}
