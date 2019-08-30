
public class sortCities {

	public static void main(String[] args) {
		String[] cities ={"bhopal","agra","mumbai","chennai","pune","delhi"};
		int size = cities.length;
		for(int i=0;i<size-1;i++)
		{
			for(int j = i+1;j<size;j++)
			{
				if(cities[i].compareTo(cities[j])>0)
				{
					String temp = cities[i];
					cities[i]=cities[j];
					cities[j] = temp;
				}
			}
		}
		for(int i=0;i<size-1;i++)
		{
				System.out.println(cities[i]);
		}
	}

}
