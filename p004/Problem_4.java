public class Problem_4 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();
        
        int result = 0; 
        int num_2_bound = 900;
        for(int num_1 = 999; num_1 > 0; num_1--) {
            for(int num_2 = num_1; num_2 >= num_2_bound; num_2--) {
                int temp = num_1 * num_2;
                
                if(temp < result)
                    continue;

                char[] array = Integer.toString(temp).toCharArray();
                if(palindrome_checker(array) == true) { 
                    if(temp > result) 
                        result = temp;
                }
            }
        }
        System.out.println(result);
        
        final long endTime = System.currentTimeMillis(); 
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");    
    } 

    public static boolean palindrome_checker(char[] array) {
        boolean is_palindrome = true;
        
        int length_front = array.length/2;
        int length_back = array.length - 1;
        for(int i = 0; i < length_front; i++) {
            if(array[i] !=array[length_back]) {
                is_palindrome = false;
                break;
            }   
            length_back--; 
        }

        return is_palindrome;
    }
}
