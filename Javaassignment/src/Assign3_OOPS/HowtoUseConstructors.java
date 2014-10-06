package Assign3_OOPS;
public class HowtoUseConstructors {
	public static void  main(String[] args) throws ClassNotFoundException {
		Class c = Class.forName("HowtoUseConstructors");
			System.out.println(c.getPackage());
			String abc = c.getName();
			System.out.println(abc);
			}
	}
