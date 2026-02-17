public class pascal {
    public static void main(String[] args) {
         int numRows = 5;
        int[][] arr = new int[numRows][numRows];
        
        for (int i = 0; i < numRows; i++) {
            
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i) {
                    arr[i][j] = 1;   
                } 
                else {
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }
        
        // Print triangle
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
