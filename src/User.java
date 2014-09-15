import java.util.Scanner;
import javax.swing.*;


public class User {

	private String username;
	private String password;
	
	 public User() 
	 {
		  createUser();
	 }
	public void createUser() 
	{
		 
		  username = JOptionPane.showInputDialog(null, "Please enter a username");
		  password = JOptionPane.showInputDialog(null, "Please enter a password");
		  System.out.println(username + " " + password);
		  
		 }
	}

