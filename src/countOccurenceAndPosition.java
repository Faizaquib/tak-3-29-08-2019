
public class countOccurenceAndPosition {

	public static void main(String[] args) {
		String s="this is java and java is object oriented and java is powerful. I love java language";
		int index = s.indexOf("java");
		while(index>=0)
		{
			System.out.println("Index of java Occurence : "+index);
			index = s.indexOf("java",index+4);
		}
		
		String a[] = s.split(" ");
		int count = 0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase("java"))
			{
				count++;
			}
		}
		
		System.out.println("Total occurences of the word java are : "+count);


	}

}
