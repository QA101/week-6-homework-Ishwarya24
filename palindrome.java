import java.util.Scanner;

public class palindrome {
	public static void main(String[] args)
	{
		String word,rev_word;
		System.out.print("Enter the word ");
		Scanner console=new Scanner(System.in);
		word=console.nextLine();
		rev_word=new StringBuffer(word).reverse().toString();
		if(word.equals(rev_word))
		{
			System.out.println(word+" is a Palindrome");
		}
		else
		{
			System.out.println(word+" is not a Palindrome");
		}
	}

}
