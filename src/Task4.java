import java.util.Arrays;

public class Task4 {

    static void main(String[] args)

    {
        String[] students = {"Anna", "John", "Peter", "Maria", "James", "Laura"};
        double[] grades = {8.5, 6.7, 9.1, 7.8, 5.9, 9.4};
        int max=0;
        int min=0;
        int Maxdex=0;
        int Mindex=0;
        double sum=0;
        double avg=0;
        int count=0;
        int k=0;
        String[] passed = new String[6];
        for (int i=0; i < students.length; i++) {
            System.out.println(students[i] +" "+ grades[i]);
            if(grades[max]<grades[i]){Maxdex=i;}
            if(grades[min]>grades[i]){Mindex=i;}
            sum+=grades[i];
            avg=sum/grades.length;
            if(grades[i]>=8){count++;}
            if(grades[i]>=4){passed[k]=students[i]; k++;}
        }
        System.out.println("Highest "+students[Maxdex]);
        System.out.println("Lowest "+students[Mindex]);
        System.out.println("Average: "+avg);
        System.out.println("Greater or equal 8 = "+count);
        System.out.println("Students who passed: " + Arrays.toString(passed));


    }
}