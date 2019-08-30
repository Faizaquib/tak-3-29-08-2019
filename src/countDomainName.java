
public class countDomainName {

	public static void main(String[] args) {
		String[] emails = {"faizaquib@gmail.com","8574aman@gmail.com","laveenapavecha22@yahoo.com","@yahoo.com","lavinagaroliya112@hotmail.com"};
		int gmail=0;
		int hotmail=0;
		int yahoo=0;
		for(int i=0;i<emails.length;i++)
		{
			if(emails[i].contains("@gmail.com"))
			{
				gmail++;
			}
			if(emails[i].contains("@hotmail.com"))
			{
				hotmail++;
			}
			if(emails[i].contains("@yahoo.com"))
			{
				yahoo++;
			}
		}
		System.out.println(emails.length);
		System.out.println("Gmail : "+gmail);
		System.out.println("Hotmail : "+hotmail);
		System.out.println("Yahoo : "+yahoo);

	}

}
