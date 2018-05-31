import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class NumbersSpiral {
    public static void main(String[] args) {

        System.out.println("Insert a nunber: ");
        Scanner scanner = new Scanner(System.in);

        int arraySize = 3;
        int number =1;

        int[][] array = new int[arraySize][arraySize];

        int midlleX=0;
        int midlleJ=0;
        if ( arraySize%2 == 0){
            midlleX = arraySize/2-1;
            midlleJ = arraySize/2-1;
        } else{
            midlleX = arraySize/2;
            midlleJ = arraySize/2;
        }
        System.out.println("midlle: " + midlleX);

        array [midlleX][midlleJ] = number;
        number++;
        midlleJ++;
        array [midlleX][midlleJ] = number;
        midlleX--;
        number++;
        array [midlleX][midlleJ] = number;
        midlleJ--;
        number++;
        array [midlleX][midlleJ] = number;

        do {
            array [midlleX][midlleJ] = number;
            number++;
            if (midlleJ + 1 == 0 && midlleJ > array.length){
                number++;
                midlleJ++;
            }




        }while(number<=arraySize*arraySize);




       printArray(array);

    }
    public static void printArray(int array [][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j]);
                if (j == array.length - 1) {
                    System.out.println();
                }
            }
        }

    }
}
