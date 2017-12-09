package junit;

public class CreditCard {

	public static String mask(String ccNumber){
		// return ccNumber;
		if(ccNumber == null)
			throw new IllegalArgumentException("Must provide a cc number");
		return "XXXXXXXXXXXX" + ccNumber.substring(ccNumber.length() - 4); 
	}

}
