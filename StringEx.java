package labexercise;
/* LAB EXERCISE 1*/
public class StringEx 
{
	

	public static void main(String[] args) 
	{
		String s="The quick brown fox jumps over the lazy dog";
		System.out.println(s);
		System.out.println("Character at 12th index is:"+(s.charAt(12)));
		System.out.println("String contains the word 'is'="+s.contains("is"));
		System.out.println("Adding String 'and killed' to the existing string:"+(s+"and killed it"));
		System.out.println("Checking whether string ends with dog="+s.endsWith("dog"));
		System.out.println("Chechinkg whether equal to 'The quick brown Fox jumps over the lazy Dog' ="+s.equals("The quick brown Fox jumps over the lazy Dog"));
		System.out.println("Chechinkg whether equal to 'THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG' ="+s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
		System.out.println("Finding index position of 'a'"+s.indexOf('a'));
		System.out.println("Finding last index of 'e'="+s.lastIndexOf('e'));
		System.out.println("Length of the string="+s.length());
		System.out.println("Replacing 'A' with 'The'="+s.replace("A", "The"));
		
		String st[]=s.split("fox",2);
		System.out.println("Splitting the string=");
		for(int i=0;i<st.length;i++)
		System.out.println("s= "+st[i]);
		System.out.println(s);
		System.out.println();
		System.out.println("Printing the animal names alone");
		if(s.contains("fox")&& s.contains("dog"))
		{
			System.out.println("Fox Dog");
		}
		System.out.println("String in lower case = "+s.toLowerCase());
		System.out.println("String in upper case = "+s.toUpperCase());
		
	}

}
