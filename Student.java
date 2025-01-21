
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

class Reportcard{
	String[] info = new String[10];
	 static String reemark;
	
	static float getpercentage(String arr[]) {
		float sum=0;
  	  for(int i=4;i<=9;i++)
  	  {
           sum=sum+(float)Integer.parseInt(arr[i]);
  	  }
  	  return (sum*100)/600;
    }
	
	static String getresult(String arr[])
	{
		if(getpercentage(arr)>=33)
			return "PASS";
		else
			return "FAILED";
	}
	
	static String findGrade(String mark)
	{
		int marks=Integer.parseInt(mark);
		if(marks>=90)
			
			{
			reemark="Outstanding";
			return "O";
			}
		else if(marks>=80)
		{
			reemark="Exellent";
			return "A+";
			}
		else if(marks>=70)
		{
			reemark="Very Good";
			return "A";
			}
		else if(marks>=60)
		{
			reemark="Good";
			return "B+";
			}
		else if(marks>=50)
		{
			reemark="Work harder";
			return "B";
			}
		else if(marks>=40)
		{
			reemark="Work Harder";
			return "C";
			}
		else if(marks>33)
		{
			reemark="Need attention";
			return "D";
			}
		else {
			reemark="Failed";
			return "F";
			}
							
	}
	void getdata(String path,int roll) {
		
		
		
		try {
		      File myObj = new File(path);
		      Scanner myReader = new Scanner(myObj);
		      
		      int count=0;
		      
		      while (myReader.hasNextLine()) {
		      String data = myReader.nextLine();
		      if(count==roll)
		      {
		      
		    	  	String str="";
		        	int j=0;
		        	for(int i=0;i<data.length();i++)
		        	{
		        		if(data.charAt(i)!=',')
		        		{
		        			str=str+data.charAt(i);
		        		}
		        		else
		        		{
		        			this.info[j]=str;
		        			str="";
		        			j++;
		        		}
		        		
		        	}
		        	
		        	
		        	
		        }
		        count++;
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		//return info;
	}
	
	void printdata() {
		
		System.out.println("");
		for(int i=0;i<80;i++)
    	{
    		System.out.print('-');
    	}
    	System.out.println("");
    	System.out.println(" Roll:"+info[0]+"          FullName:"+info[1]+" "+info[2]+"           Father's Name:"+info[3]);
    	System.out.println("");System.out.println("");
    	for(int i=0;i<80;i++)
    	{
    		System.out.print('-');
    	}
    	System.out.println("");
    	System.out.println(" SUBJECT          MARKS OUT OF 100                GRADE             REMARK ");
    	System.out.println(" Math                      "+info[4]+"                      "+findGrade(info[4])+"               "+reemark);
    	System.out.println(" Science                   "+info[5]+"                      "+findGrade(info[5])+"               "+reemark);
    	System.out.println(" Hindi                     "+info[6]+"                      "+findGrade(info[6])+"               "+reemark);
    	System.out.println(" English                   "+info[7]+"                      "+findGrade(info[7])+"               "+reemark);
    	System.out.println(" Social Science            "+info[8]+"                      "+findGrade(info[8])+"               "+reemark);
    	System.out.println(" Sanskrit                  "+info[9]+"                      "+findGrade(info[9])+"               "+reemark);
    	System.out.println("");
    	System.out.println("");
    	System.out.println(" Result : "+getresult(info)+"               Percentage "+getpercentage(info) );
	}
}

public class Student {
	
  public static void main(String[] args) {
	  Reportcard card=new Reportcard();
	  String path="C:\\Users\\naman.jain3\\eclipse-workspace\\First\\src\\main\\java\\file.txt";
	  System.out.println("Enter Roll Number");
	  Scanner scn=new Scanner(System.in);
	  int roll=scn.nextInt();
	  card.getdata(path, roll);
	  card.printdata();
    
  }
}
