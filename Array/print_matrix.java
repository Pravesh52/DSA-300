//Print the matrix in spiral manner

public class print_matrix {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,},
                        {5,6,7,8},
                        {9,10,11,12},
                         {13,14,15,16}};

        //Output: [1, 2, 3, 4, 8, 12,
        //  16, 15, 14, 13, 9, 5, 6, 7, 11, 10]

       int n=matrix.length;
       int m=matrix[0].length;

        int srow=0, scol=0, erow=n-1,ecol=m-1;


        while(srow<=erow && scol<=ecol){
            //top 

            for(int i=scol;i<=ecol;i++){
                System.out.print(matrix[srow][i]+"");
            }
            
            //right
            for(int i=srow+1; i<=erow;i++){
                System.out.print(matrix[i][ecol]+"");
            }
            //buttom 

            for(int i=ecol-1;i>=scol;i--){
                System.out.print(matrix[erow][i]+"");
            }
            //left

            for(int i=erow-1;i>=srow+1;i--){
                System.out.print(matrix[i][scol]+"");
            }

            srow++; erow--; scol++; ecol--;
        }


    }
    
}
