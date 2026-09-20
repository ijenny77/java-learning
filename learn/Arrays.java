public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {3,10,1,4,6};
        int length = numbers.length;
        int sum = 0;

        for(int i = 0; i < length; i ++ ) {
            System.out.println(numbers[i]);
            sum += numbers[i];  
        }
        double average = (double) sum / (double) length;
        System.out.println(average);
    }
}