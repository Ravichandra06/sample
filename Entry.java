package com.school.registration.student;
import java.util.regex.*;
import java.util.*;
class Student
{
	public static boolean isAlphaf(String s)
	{
	return s != null && s.chars().allMatch(Character::isLetter);
	}
	
	public static boolean isAlphal(String s)
	{
	return s != null && s.chars().allMatch(Character::isLetter);
	}
	private static final String EMAIL_REGEX = "(^\\w+@[a-zA-Z_]+?\\.[a-zA-Z]{2,3}$)";

	private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

	public static boolean emailValidator(String email) {

		if (email == null) {
			return false;
		}

		Matcher matcher = EMAIL_PATTERN.matcher(email);
		return matcher.matches();
	}
	public static boolean isValid(String s)
	{
		String regex="[789]\\d{9}";
		return s.matches(regex);
	}
	}
	public class Entry
	{
		public static void main(String[] args)
		{
			Scanner in=new Scanner(System.in);
			while(true){
				System.out.println("Enetr the FirstName:");
			     String FirstName=in.next();
				 if(Student.isAlphaf(FirstName))
				 {
					 break;
				 }
				 System.out.println("INVALID INPUT");
			}
			while(true){
				System.out.println("Enetr the LastName:");
			     String LastName=in.next();
				 if(Student.isAlphal(LastName))
				 {
					 break;
				 }
				 System.out.println("INVALID INPUT");
			}
			while(true){
			System.out.println("Enetr EmailAddress");
			String EmailAddress=in.next();
			if (Student.emailValidator(EmailAddress))
			{
			break;
			}
			System.out.println("The email address  is invalid");
		}
		while(true){
			System.out.println("Enter PhoneNumber");
			String PhoneNumber=in.next();
			if(Student.isValid(PhoneNumber)){
				break;
			}
			System.out.println("Invalid PhoneNumber");
		}
		}
	}
	