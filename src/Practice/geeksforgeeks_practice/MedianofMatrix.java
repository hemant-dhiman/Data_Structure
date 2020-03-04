package Practice.geeksforgeeks_practice;

public class MedianofMatrix {
    public static void main(String[] args) {
        int[][] data = {{1,3,5},
                        {2,6,9},
                        {3,6,9}};

        /*int [][] data2 = {{1,2,3},
                          {3,5,6},
                          {6,9,9}};

        int[][] data = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};*/

        System.out.println(median_of_matrix(data));

    }

    static double median_of_matrix(int[][] matrix){
        int length = matrix.length;
        if (length % 2 != 0 ){
            //odd length condition
            return matrix[length/2][length/2];
        }
        if(length % 2 == 0){
            //even length condition
            return (matrix[(length-2)/2][length-1] + matrix[length/2][0]) / (2.0);
        }
        return 0;
    }

    static int[][] narraySort(){
        return new int[][]{{1,2},{3,4}};
    }
}
