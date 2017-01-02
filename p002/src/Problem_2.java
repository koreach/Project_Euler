
public class Problem_2 {

	public static void main(String[] args)
	{
		System.out.println(calculate());
	}
	
	public static int calculate()
	{
		int return_val = 0;
		
		int[] array = new int[40000000];
		array[0] = 0;
		array[1] = 1;
		
		for(int i = 2; i < 40000000; i++)
		{
			int val = array[i-1] + array[i-2];
			array[i] = val;
			if(val > 4000000)
			{
				break; 
			}
			
			if((val%2)==0)
			{
				return_val = return_val + val; 
			}
		}
		
		return return_val; 
	}
}
