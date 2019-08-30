import java.util.*;

public class stringTokenizer {

	public static void main(String[] args) {
		 String s="1.java,2.oracle,3.python,4.php,5.linux.....";
		StringTokenizer st = new StringTokenizer(s,"0123456789.,");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
