class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int maxCol[] = new int[col];

        // find max element in the column
        for (int j = 0; j < col; j++) {
            int max = -1;
            for (int i = 0; i < row; i++) {
                max = Math.max(max, matrix[i][j]);
            }
            maxCol[j] = max;
        }

        // build answer mat where -1 is replaced with maxCol
        int answer[][] = new int[row][col];
        for(int i=0; i<row; i++) {
            for(int j=0; j<col; j++) {
                if(matrix[i][j] == -1 ) {
                    answer[i][j] = maxCol[j];
                } else {
                    answer[i][j] = matrix[i][j];
                }
            }
        }
        return answer;
    }
}