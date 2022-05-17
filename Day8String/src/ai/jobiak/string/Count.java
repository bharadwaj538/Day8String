package ai.jobiak.string;

public class Count {
	static String word="MISSISSIPPI";
	static String reverse="";
	static int let=word.length();
	public static void main(String args[])
	{
		System.out.println("\nLength of the word : "+let);
		System.out.println("\n\nword in UpperCase : "+word.toUpperCase());
		System.out.println("\n\nword in LowerCase : "+word.toLowerCase());
		char letters[]=new char[word.length()];
		word.getChars(0,let,letters, 0);
		System.out.print("\n\nThe reverse word : ");
		
		for(int i=(let-1);i>=0;i--)
		{
			reverse=reverse+word.charAt(i);
			System.out.print(word.charAt(i));
		}
		System.out.println("\n Check palindrome : "+word.equals(reverse));
		System.out.println("\n word in char type : ");
		
		for(char i:letters)
		{
			System.out.println(i);
		}
		
	}

}
