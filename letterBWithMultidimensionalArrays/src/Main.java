

public class Main {
    public static void main(String[] args) {
        String[][] bStars=new String[7][4];

        for (int i=0;i<bStars.length;i++){
            for (int j = 0; j < bStars[i].length; j++) {
                if (i==0|| i==3 || i==6){
                    bStars[i][j]="*";
                } else if (j==0 || j==3) {
                    bStars[i][j]="*";
                }else {
                    bStars[i][j]=" ";
                }
            }
        }

        for (String[] row:bStars) {
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}