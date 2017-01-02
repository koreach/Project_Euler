
public class Problem_4 {
    public static void main(String[] args) {
        int result = 0; 
        for(int num_1 = 100; num_1 < 1000; num_1++) {
            for(int num_2 = 100; num_2 < 1000; num_2++) {
                int temp = num_1 * num_2;
                boolean is_palindrome = true;
                char[] array = Integer.toString(temp).toCharArray();


                int length = 0;
                int length_2 = 0;
                //even
                if(array.length % 2 == 0) {
                    length = array.length/2;
                    length_2 = array.length - 1;
                    for(int i = 0; i < length; i++) {
                        if(array[i] !=array[length_2]) {
                            is_palindrome = false;
                            break;
                        }   
                        length_2--; 
                    }
                    if(is_palindrome == true) { 
                        if(temp > result)
                            result = temp;
                    }
                }

                //odd
                else {
                    length = array.length/2;
                    length_2 = array.length - 1;
                    for(int i = 0; i < length; i++) {
                        if(array[i] != array[length_2]) {
                            is_palindrome = false;
                            break;
                        }   
                        length_2--; 
                    }
                    if(is_palindrome == true) {
                        if(temp > result)
                            result = temp;
                    }

                }
            }
        }
        System.out.println(result);
    }
}
