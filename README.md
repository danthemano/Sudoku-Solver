# Sudoku-Solver
Function to determine if a 9x9 Sudoku board is valid

This function takes as an input a nxn array where n is an int that it's square root is also an int(9, 16, 25...).
This function detects if the board is valid, wether it is full or not. Any tile that is empty must be represented
by an ".". This function is mainly used for sudoku, but it is capable of identifying a valid board in any other
game that follows the rules of sudoku but on a bigger scale.

The time complexity of this program is O(n^2) where n is the size of a side of the board because we have iterate
throug every tile in the board. Given that a sudoku board is always 9x9, the time compexity of this program is O(1).

The space complexity of this program is O(n^2) where n is the size of a side of the board because we have to store
in a HashSet in the worst case every element in all of the tiles of the board.