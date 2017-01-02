
public class Problem_1 {

	public static void main(String[] args)
	{
		System.out.println(calculate());
	}
	
	public static int calculate()
	{
		int return_val = 0;
		
		//arbitrary # of loops 
		for(int i = 0; i < 100000; i++)
		{
			//gets the current value it is on 
			int curr_val = i*3;
						
			//if the current value is greater than a 1000, out of for loop
			if(curr_val >= 1000){
				break;
			}
			return_val = return_val + curr_val;
		}
		
		//arbitrary # of loops 
		for(int j = 0; j < 100000; j++)
		{
			//gets the current value it is on 
			int curr_val = j*5;

			//if the current value is greater than a 1000, out of for loop
			if(curr_val >= 1000){
				break;
			}
			return_val = return_val + curr_val;
		}
		
		//arbitrary # of loops 
		for(int j = 0; j < 100000; j++)
		{
			//gets the current value it is on 
			int curr_val = j*15;
			
			//if the current value is greater than a 1000, out of for loop
			if(curr_val >= 1000){
				break;
			}
			return_val = return_val - curr_val;
		}
		return return_val; 
	}
}
