import java.util.Scanner;

public class duplicate {
public static void main(String[] args)
{
	String word;
	int count = 1,i,j;
	String temp = "";
	System.out.print("Enter the word ");
	Scanner console = new Scanner(System.in);
	word=console.nextLine(); 
	for(i=0;i<word.length()-1;i++)
	{
		for(j=i+1;j<word.length();j++)
		{
			if(word.charAt(i) == word.charAt(j) && !temp.contains(word.charAt(j) + ""))
			{				
				count++;	
			}
		}		
		if(count > 1)
		{
			temp = temp + word.charAt(i);
			System.out.println(word.charAt(i) + " " + count);
		}
		count = 1;
	}	
	console.close();
}
}




