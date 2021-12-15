package assesment1;

import java.util.HashMap;

//Bussiness logic class 
public class Store {
	
	//Created two HashMap for unique value and count for the calls.
	HashMap<String,Integer>HashforCount = new HashMap<String, Integer>();
	HashMap<String,Integer>Hashforunique = new HashMap<String, Integer>();

	int unique = 0;
	
	//Generate random number in the range of 2 - 100;
	public int getrandom() {
		int rnumb = (int)(Math.random()*(100-2+1)+2);
		return rnumb;
	}
	//The command storeurl shall take a URL as a parameter and save that 
	//into a table with a unique short key and a count(usage count) initialized to 0.
	public void storeurl(String url) {
		unique = getrandom();
		Hashforunique.put(url, unique);
		HashforCount.put(url, 0);
	}

	//The command list should return all urls and counts. 
	public void list() {
		System.out.println(HashforCount);
	}

	//The command get shall take a URL as a parameter and
	//return the unique short key after incrementing the usage count.
	public Integer getunique(String url){
		updateValue(url);
		return Hashforunique.get(url);
	}

	//The command count shall take a URL as a parameter and should return the latest usage count.
	public Integer count(String url){
		return HashforCount.get(url);
	}

	//It is used to update the count value whenever a get call is happen.
	public void updateValue(String url) {
		int value = HashforCount.get(url);
		value = value+1;
		HashforCount.put(url, value);
	}

}
