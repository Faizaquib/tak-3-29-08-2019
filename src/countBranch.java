
public class countBranch {

	public static void main(String[] args) {
		String[] rollnos = {"12554848","125487","348758748","347885254","56787854","7845525","78464587","784545454"};
		int CS=0;
		int IT=0;
		int MECH=0;
	    int CIVIL=0;
	    for(int i=0;i<rollnos.length;i++)
	    {
	    	if(rollnos[i].substring(0,2).equals("12"))
	    	{
	    		CS++;
	    	}
	    	if(rollnos[i].substring(0,2).equals("34"))
	    	{
	    		IT++;
	    	}
	    	if(rollnos[i].substring(0,2).equals("56"))
	    	{
	    		MECH++;
	    	}
	    	if(rollnos[i].substring(0,2).equals("78"))
	    	{
	    		CIVIL++;
	    	}
	    		
	    }
	    
	   // System.out.println(rollnos[1].substring(0, 2));
	    System.out.println("CS : "+CS);
		System.out.println("IT : "+IT);
		System.out.println("MECH : "+MECH);
		System.out.println("CIVIL : "+CIVIL);

	}

}
