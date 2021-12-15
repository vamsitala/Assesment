package assesment1;

import java.util.Scanner;

public class TestFile {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Please enter a valid selection. \n1.storeurl \n2.get \n3.count \n4.list \n5.exit");
		Store obj = new Store();
		System.out.println("Please enter a valid string from the above list and press enter, then enter the url string");
		while(true) {
			String x = sn.nextLine();
			switch(x) {
			case "storeurl":
				String url = sn.nextLine();
				obj.storeurl(url);
				break;
			case "get":
				String url1 = sn.nextLine();
				Integer unique = obj.getunique(url1);
				System.out.println(unique);
				break;
			case "count":
				String url2 = sn.nextLine();
				Integer countvalue =obj.count(url2);
				System.out.println(countvalue);
				break;
			case "list": 
				obj.list();
				break;
			case "exit":
				System.out.println("GoodBye!!!");
				return;
			}
			
		}
		
	}

}
