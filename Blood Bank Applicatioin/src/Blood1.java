import java.util.*;

import java.sql.*;

public class Blood1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String Name=sc.next();
		int Age=sc.nextInt();
		String Adress=sc.next();
		String EmailId=sc.next();
		int Mobile=sc.nextInt();	
		String BooodGroup=sc.next();
		String Gender=sc.next();
		
		
		/*
		*/
		try
		{
			//Connection to  mysql DataBase to the project with DataBase_Name and User and password	 
			
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://172.16.0.11:3306/Blood","root","mysql");
			//Creating Statement
			Statement s=con.createStatement();
			
			//Using the String to Udate Detalies into the DataBase
			//Example :String sql="Insert into Blood_Donor values('Sumathi',31,'Delhi','Barath@gmail.com',6666666,'AB','Female');"; 
		
			System.out.println("Enter the required Detail");
			String sql="Insert into Blood_Donor values("+"'"+Name+"'"+","+"Age"+","+"'"+"Adress"+"'"+","+"'"+EmailId+"'"+","+Mobile+","+"'"+BooodGroup+"'"+","+"'"+Gender+"');";
			//Executing the Query
			s.executeUpdate(sql);
			//After execution Udatig it
			System.out.println(" Details Updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
