
public class alphaNumeric {

	public static void main(String[] args) {
		String s="ad3daddfd5443dfsfss";
		String str="";
		/*for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(!(ch>=0 && ch<=9))
				str = str + ch;
		}*/
		
		System.out.println(s.replaceAll("[0-9]",""));
	}

}
