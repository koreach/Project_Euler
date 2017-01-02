public class Problem_5 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        //You only have to check 11~20 because all of these values are divisible by numbers from 1~9. 
        //A lot of the value's factors made up the same number, and as long as their factors make up 
        //1~9, it would be the same.
        int[] nums = new int[]{11,13,14,15,16,17,18,19}; 

        boolean found = false;
        int num = 1;
        while(found == false) {
            boolean check = true;
            for(int i = 0; i < nums.length; i++) {
                boolean decimal = false; 
                double temp = num;
                temp = temp % nums[i];
                
                //checking for decimal value 
                if(temp != 0) { 
                    check = false;
                    break;
                }
            }
            if(check == true) { 
                found = true;
                System.out.println(num);
            }
            num++;
        }
        final long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
