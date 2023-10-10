import java.util.ArrayList;
import java.util.List;
import java.util.*;
public class SpiralMatrix {
    public static void main(String args[]) {
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and colums of the matrix:");
        m=sc.nextInt();
        n=sc.nextInt();
        int matrix[][]=new int[m][n];
        System.out.println("Enter the elements into the matrix:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            System.out.println(result);
        }
        
        int rows = matrix.length, cols = matrix[0].length;
        int left = 0, right = cols-1, top = 0, bottom = rows-1;
        
        while (left <= right && top <= bottom) {
            //first row
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
            }
            top++;
            //last column
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--;
            //last row
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //first column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        System.out.println("The spiral order of the matrix is:"+result);
    }
}
