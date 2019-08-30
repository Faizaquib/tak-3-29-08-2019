
public class countCharacter {

	public static void main(String[] args) {
		String s="hello user123, You can Mail me @ xyz4343@gmail.com with # tag java!";
		int upper=0;
		int lower=0;
		int number=0;
		int spaces=0;
		int special=0;
		
		for(int i =0;i<s.length();i++)
		{
			char ch = s.charAt(i);

            
            if (ch >= 'A' && ch <= 'Z') 
                upper++; 
            else if (ch >= 'a' && ch <= 'z') 
                lower++; 
            else if (ch >= '0' && ch <= '9') 
                number++; 
            else if(ch==32)
            	spaces++;
            else
                special++;
		}
		 System.out.println("Lower case letters : " + lower); 
	        System.out.println("Upper case letters : " + upper); 
	        System.out.println("Number : " + number); 
	        System.out.println("Special characters : " + special); 
	        System.out.println("Spaces  : " + spaces); 
	}

}
