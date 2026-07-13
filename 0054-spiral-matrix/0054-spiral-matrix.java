class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top 
            for(int j = startCol; j<=endCol; j++) {
                // System.out.print(matrix[startRow][j] + " ");
                result.add(matrix[startRow][j]);
            }
            //right
            for(int i = startRow+1; i<=endRow; i++) {
                // System.out.print(matrix[i][endCol] + " ");
                result.add(matrix[i][endCol]);
            }
            //bottom
            for (int j = endCol-1; j>=startCol; j--) {
                if(startRow != endRow) {
                    result.add(matrix[endRow][j]);
                }
            }
            //left
            for (int i=endRow-1; i>=startRow+1; i--) {
                if(startCol != endCol) {
                    result.add(matrix[i][startCol]);
                }
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return result;
    }
}