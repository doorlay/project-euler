public class one {
        /* 

        If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. 
        The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000. 

        */
        public static void main(String[] args){
                int sumOfMultiples = 0;
                for (int i = 0; i < 1000; i++){
                        if (isMultipleOfThreeOrFive(i)){
                                sumOfMultiples += i;
                        }
                }
                System.out.printf("Sum is %d\n", sumOfMultiples);
        }

        private static boolean isMultipleOfThreeOrFive(int number){
                if (number % 3 == 0 || number % 5 == 0){
                        return true;
                }
                else {
                        return false;
                }
        }
}