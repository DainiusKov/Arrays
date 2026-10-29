public class Task5 {

    static void main(String[] args)
    {

        int[][] matrix = {
                {4, 8, 2, 9},
                {7, 3, 6, 1},
                {5, 0, 8, 4},
                {2, 6, 3, 7}
        };
        int sum=0;
        int max=matrix[0][0];
        int min=matrix[0][0];
        int sum1row=0,sum2row=0,sum3row=0,sum4row=0;
        int sum1col=0,sum2col=0,sum3col=0,sum4col=0;
        int sumofD=0;
        boolean square=false;

        for(int i=0;i<matrix.length;i++){
            sumofD+=matrix[i][i];
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i].length==matrix.length){square=true;}
                System.out.print(matrix[i][j]+" ");
                sum+=matrix[i][j];
                if(i!=0||j!=0){
                    if(max<matrix[i][j]){
                        max=matrix[i][j];
                    }
                    if(min>matrix[i][j]){
                        min=matrix[i][j];
                    }
                }
                if(i==0){sum1row+=matrix[i][j];} if(j==0){sum1col+=matrix[i][j];}
                if(i==1){sum2row+=matrix[i][j];} if(j==1){sum2col+=matrix[i][j];}
                if(i==2){sum3row+=matrix[i][j];} if(j==2){sum3col+=matrix[i][j];}
                if(i==3){sum4row+=matrix[i][j];} if(j==3){sum4col+=matrix[i][j];}
            }
            System.out.println();
        }
        System.out.println("Sum of all elements: "+sum);
        System.out.println("Largest element: "+max);
        System.out.println("Smallest element: "+min);
        System.out.println("Sum of rows: "+"1: "+sum1row+"; 2: "+sum2row+"; 3: "+sum3row+"; 4: "+sum4row);
        System.out.println("Sum of columns: "+"1: "+sum1col+"; 2: "+sum2col+"; 3: "+sum3col+"; 4: "+sum4col);
        System.out.println("Sum of the main diagonal: "+sumofD);
            if(square==true){System.out.println("It is a square matrix.");}
            else{System.out.println("It is not a square matrix.");}
    }
}
