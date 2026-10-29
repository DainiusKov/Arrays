import java.util.Scanner;


    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type your number:");
        int nb = scanner.nextInt();

        int[] numbers = {5, 12, 8, 20, 15, 7, 30, 25};
        boolean found=false;
        for(int i=0;i<numbers.length;i++){
            if(nb==numbers[i]){
                System.out.println("Number at index= "+i);
                numbers[i]*=2;
                found=true;
            }
        }
        if(!found){System.out.println("Not found");}
    }
