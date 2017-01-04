public class Problem_7 {
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        while(count != 10001) {
            if(prime(i) == true) {
                count++;
            }

            if(count == 10001)
                System.out.println(i);
            i++;
        } 
    }   

    public static boolean prime(int number) {
        //checks if even numbers
        if(number % 2 == 0 && number != 2) return false;

        //else checks for odd numbers
        else {
            for(int i = 3; i < number + 1; i+=2) {
                if(number % i == 0 && i != number) return false;
            }
        }

        return true;
    }
}
