public class Problem_5 {
    public static void main(String[] args) {
        final long startTime = System.currentTimeMillis();

        int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20}; 

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
