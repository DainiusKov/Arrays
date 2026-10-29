import java.util.Arrays;

void main(String[] args){
    int[] numbers = {45, 12, 89, 3, 27, 61, 18, 100};
    System.out.println("Original array: " + Arrays.toString(numbers));
    int [] reversed = new int[numbers.length];
    for(int i=0;i<numbers.length;i++){
        reversed[i] = numbers[numbers.length-1-i];
    }
    System.out.println(Arrays.toString(reversed));
    Arrays.sort(numbers);
    System.out.println(Arrays.toString(numbers));
    System.out.println("Second largest number: " + numbers[numbers.length-2]);

}
