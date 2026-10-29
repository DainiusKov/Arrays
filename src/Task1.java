void main(String[] args) {

    int[] numbers = {12, 45, 7, 23, 89, 34, 56, 18, 91, 5};
    int sum=0;
    for(int number=0;number<numbers.length;number++){
        sum+=numbers[number];}
    double avg=(double)sum/numbers.length;
    int min=numbers[0];
    for(int i=1;i<numbers.length;i++){
        if(numbers[i]<min){
            min=numbers[i];
        }
    }
    int max=numbers[0];
    for(int i=1;i<numbers.length;i++){
        if(numbers[i]>max){
            max=numbers[i];
        }
    }
    int countgr=0;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]>50){
            countgr++;
        }
    }
    int counteven=0;
    int countodd=0;
    for(int i=0;i<numbers.length;i++){
        if(numbers[i]%2==0){
            counteven++;
        }else {countodd++;}
    }
    System.out.println("Sum= " + sum + ", " + "Average= "+ avg + ", " + "Minimum= " + min + ", " + "Maximum= " + max + ", " + "Greater than 50= " + countgr);
    System.out.println("Even= "+counteven + ", " + "Odd=" + countodd);
}


