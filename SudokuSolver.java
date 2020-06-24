class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<String>();
        int boxSize = (int)Math.sqrt(board.length)
        //checks each row for a copy of an element
        for(int i = 0; i < board.length; i++){

            //checks each column for a copy of an element
            for(int j = 0; j < board[i].length; j++){

                //adds the element in each row, col, and box with a specific string
                //to indetify if the element is reapeated in that specific row, col, or box
                if( board[i][j] != '.'){
                    if(!seen.add(board[i][j] + "row" + i) ||
                            !seen.add(board[i][j] + "col" + j) ||
                            !seen.add(board[i][j] + "box" + i/boxSize + "-" + j/boxSize))
                        return false;
                }
            }
        }

        return true;
    }
}