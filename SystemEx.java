package labexercise;
/*Lab Exercise 3: Create a class which displays the following about the JVM.
Version of Java
Vendor for Java
Class Path
Installed home directory
OS name on which it is installed with version
 */
public class SystemEx 
{

	public static void main(String[] args) 
	{
		System.out.println("Version of JAVA : "+System.getProperty("java.specification.version"));
		System.out.println ("JVM Vendor : " + System.getProperty("java.vendor") );
		System.out.println ("Class Path : " +System.getProperty( "java.class.path"));
		System.out.println ("Installed Home Directory : "+System.getProperty("user.home"));
		System.out.println ("OS Name : "+System.getProperty("os.name"));
		System.out.println ("OS Version : "+System.getProperty("os.version"));
	}

}
