class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0, col = 0;
        for(int i=0; i<commands.size(); i++) {
            switch (commands.get(i)) {
                case "UP":
                    row--;
                    break;
                case "DOWN":
                    row++;
                    break;
                case "RIGHT":
                    col++;
                    break;
                case "LEFT":
                    col--;
                    break;
                default:
                    break;
            }
        }

        return row * n + col;
    }
}