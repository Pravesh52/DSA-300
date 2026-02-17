//Leetcode: 119. Pascal's Triangle II

public class pascal1 {
    public static void main(String[] args) {
        int n=4;

        int matrix[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    matrix[i][j]=1;
                }else{
                    matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
                }
            }
        }

        for(int i=0;i<=3;i++){
           System.out.print(matrix[3][i]+" ");
        }
    }
}
