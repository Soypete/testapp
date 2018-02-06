import java.util.*; 
import java.time.*;
import java.text.*;

public class sorting_script{  

	public static void main(String args[]){  

		
	     String input = "Enter your list of dates in the form 'DD-MM-YYYY,DD-MM-YYYY':";  
	     //reading asks for list and intakes data
	     System.out.println(input);  
	     Scanner scan = new Scanner(System.in);
	     String s = scan.nextLine();
	     scan.close();   
	     //converts list string into arraylist of dates
	     List<Date> dateList = new ArrayList<Date>();
	     for (String dates: s.split(",")) {
	     	try{
	     		DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        		 Date date = df.parse(dates);
        		 dateList.add(date);
        		 //System.out.println(dates);
	     	}catch(Exception e){	//parse exceptio
	     		System.out.printf("error %s is not of correct format",dates);
	     	}
      	}
      	//sorts the dates
      	 Collections.sort(dateList);
      	 //prints out date string
      	 for (Date str: dateList){
      	 	DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
      	 	System.out.println(df.format(str));	
      	 }
	}
}	
