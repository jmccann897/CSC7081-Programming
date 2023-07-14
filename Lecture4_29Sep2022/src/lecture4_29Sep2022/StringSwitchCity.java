package lecture4_29Sep2022;

import java.util.Scanner;

public class StringSwitchCity {

	public static void main(String[] args) {
		// Use of string switch case
		//can use string methods in conditional such as .toLowerCase
		//Challenge - if mixed case entered e.g. LiSbUrN, can the result be normal case Lisburn

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a city name: ");
		String city = sc.nextLine();
		String postcode;
		
		switch (city.toLowerCase()) {
		case "lisburn" : postcode = "Lisburns code";
		break;
		case "belfast" : postcode = "Belfasts code";
		break;
		case "newry" : postcode = "Newrys code";
		break;
		default: postcode = "Error";
		}
		
		//challenge approach
		//inputted city but in proper case
		String propercity;
		if (city.length()>=1) { //if statement handles input error of hitting enter without input
		
		String firstLetter = (""+city.charAt(0)).toUpperCase();
		//workaround for firstLetter- using an empty string to allow string methods operation on character
		//alternatively could have city.substring(0,1) compared to ""+city.charAt(0)
		propercity = firstLetter + city.substring(1).toLowerCase();
		
		System.out.printf("The code for %s is %s %n", propercity, postcode);
		}
		else System.out.println("Input error");
		
		sc.close();
	}
	

}
