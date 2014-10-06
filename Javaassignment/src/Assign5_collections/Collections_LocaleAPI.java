/* Description: Here, we learn about LocaleAPIs.
LOCALE : Is very important for localization and internalization l10n and i10n. Basically, you can convert
- How to print country IDs, languages.
- money to a country currenncy format
- numbers to a country number format
- dates to a country dateformat */

package Assign5_collections;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Collections_LocaleAPI {
	public static void main(String[] args) {


		System.out.println("***************************************************************");
		System.out.println("1: How to print countryIds, their languages + ISO countires/languages");
		System.out.println("***************************************************************"); 
		System.out.println("Canada country code is            : "+ Locale.CANADA);
		System.out.println("Italy country code is             : "+ Locale.ITALY);
		Locale l = Locale.getDefault();
		System.out.println("Get current country name is 	  : "+ l.getCountry());
		System.out.println("Get current countries language is : "+ l.getDisplayLanguage());
		String[] l1 = Locale.getISOCountries();
		String[] l2 = Locale.getISOLanguages();
		System.out.println("Below are the ISO languages codes are");
		for(int i = 0; i< l2.length; i++) {
		System.out.println("Number "+ i + " is: "+ l2[i]);
		}
		
		System.out.println("***************************************************************");
		System.out.println("2 : NUMBERFORMATTING FOR ANY NUMBERS LIKE POPULATION, COUNTS");
		System.out.println("***************************************************************");
		double d = 122333;
		NumberFormat n = NumberFormat.getInstance();
		NumberFormat n1 = NumberFormat.getInstance(Locale.getDefault());
		NumberFormat n2 = NumberFormat.getInstance(Locale.ITALY);
		System.out.println("CURRENT COUNTRY NUMBERING FORMAT IS      : "+ n.format(d));
		System.out.println("CURRENT COUNTRY NUMBERING FORMAT IS      : "+ n1.format(d));
		System.out.println("CURRENT COUNTRY/Italy NUMBERING FORMAT IS: "+ n2.format(d));
		
		System.out.println("***************************************************************");
		System.out.println("3 : CURRENCY FORMATTING FOR CURRENT COUNTREY + OTHER COUNTRIES ");
		System.out.println("***************************************************************");
		double d1 = 123.40;
		NumberFormat sdf1 = NumberFormat.getCurrencyInstance();
		System.out.println("DEFAULT COUNTRY CURRENCY FORMAT IS       : "+ sdf1.format(d1));
		NumberFormat sdf2 = NumberFormat.getCurrencyInstance(Locale.CHINESE);
		System.out.println("GIVEN COUNTRY/CHINEESE COUNTRY FORMAT IS : "+ sdf2.format(d1));
		
		
		System.out.println("***************************************************************");
		System.out.println("4 : DATE FORMATTING FOR CUURENT COUNTRY + OTHER COUNTRIES ");
		System.out.println("***************************************************************");
		Date date1 = new Date();
		DateFormat db = DateFormat.getDateInstance();
		System.out.println("Default country/US curreny format is: "+ db.format(date1));
		DateFormat db1 = DateFormat.getDateInstance(01/01/2000, Locale.CANADA);
		System.out.println("Default country/US curreny format is: "+ db1.format(date1));
		DateFormat time1 = DateFormat.getDateTimeInstance();
		System.out.println("Default country/US curreny format is: "+ time1.format(date1));
		
		
}
}




