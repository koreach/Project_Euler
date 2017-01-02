public class Problem_34 {
    public static void main(String[] args) {
        int[] factorial_val = new int[10];
        int max_val = 0;

        for(int i = 0; i < factorial_val.length; i++) {
            factorial_val[i] = factorial(i);
            max_val += factorial_val[i];
        }

        int sum_end = 0;
        int sum = 0; 
        //skips 1! and 2!
        for(int i = 10; i <= max_val; i++) {
            int temp = i;

            //way to split the value into individual digits
            while(temp > 0) {
                sum += factorial_val[temp % 10];
                temp = temp / 10; 
            }

            if(sum == i) {
                sum_end += i;
            }
            
            sum = 0;
        } 
        System.out.println(sum_end);
    }

    public static int factorial(int value) {
        int fact_value = 1;
        if(value == 0) {}
        else {
            for(int i = 1; i <= value; i++) {
                fact_value *= i; 
            }
        }
        return fact_value;
    }
}
