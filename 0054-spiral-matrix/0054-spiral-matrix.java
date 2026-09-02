class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;

        while (startrow <= endrow && startcol <= endcol) {
            // Traverse Top Row (Left to Right)
            for (int j = startcol; j <= endcol; j++) {
                result.add(matrix[startrow][j]);
            }

            // Traverse Right Column (Top to Bottom)
            for (int i = startrow + 1; i <= endrow; i++) {
                result.add(matrix[i][endcol]);
            }

            // Traverse Bottom Row (Right to Left), only if more than 1 row
            if (startrow < endrow) {
                for (int j = endcol - 1; j >= startcol; j--) {
                    result.add(matrix[endrow][j]);
                }
            }

            // Traverse Left Column (Bottom to Top), only if more than 1 column
            if (startcol < endcol) {
                for (int i = endrow - 1; i > startrow; i--) {
                    result.add(matrix[i][startcol]);
                }
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;
        }

        return result;
    }
}
