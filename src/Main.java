import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int x,y;

        System.out.print("Number of Rows : ");
        x = scanner.nextInt();
        System.out.print("Number of Columns : ");
        y = scanner.nextInt();

        int[][] matrix = new int[x][y];
        int[][] matrixT = new int[y][x]; //Transposed matrix

        for (int i=0;i< matrix.length;i++){

            for (int j=0;j<matrix[i].length;j++){

                System.out.print("M["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();

            }

        }

        for (int i=0;i< matrixT.length;i++){

            for (int j=0;j<matrixT[i].length;j++){

                matrixT[i][j] = matrix[j][i];

            }

        }


        System.out.println("\n\tMatrix\n\t");
        for (int i=0;i< matrix.length;i++){

            for (int j=0;j<matrix[i].length;j++){

                System.out.print("\t" + matrix[i][j] + "\t");


            }

            System.out.println();

        }

        System.out.println("\n-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");


        System.out.println("\n\tTransposed Matrix\n\t");
        for (int i=0;i< matrixT.length;i++){

            for (int j=0;j<matrixT[i].length;j++){

                System.out.print("\t" + matrixT[i][j] + "\t");


            }

            System.out.println();

        }

    }
}
