public class Main {
    public static void main(String[] args) {
        int [][] matrix ={{4,6,8},{5,7,9}};
        int matrixRow= matrix.length;
        int matrixColumn= matrix[0].length;
        int[][] transpoze = new int[matrixColumn][matrixRow];
        for (int i=0; i<transpoze.length;i++){
            for (int j =0; j<transpoze[0].length;j++){
                transpoze[i][j]= matrix[j][i];
            }
        }
        for (int [] a :transpoze){
            for (int i:a){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}