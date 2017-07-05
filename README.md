# Magic-Square
SER216 assignment
Objectives:
1. Follow software specifications provided to design and implement a program
2. Design your program using a flowchart and identify list of modules/methods/functions
3. Conduct design review (self)
4. Implement the program with appropriate JavaDoc Documentation
5. Test case generation and testing
Program Specification:
An n x n matrix that is filled with the whole numbers 1, 2, 3, .. n2 is a magic square if the sum of the
elements in each row, in each column, and in the two diagonals is the same value.
Here is a magic square where n = 3:
8 1 6
3 5 7
4 9 2
Write a program that reads n2 numbers from standard input and tests whether they form a magic square
when put into matrix form. The value of n is NOT an input to the program; n must be determined from
the number of inputs.
For example, the input that creates the example matrix above is 8 1 6 3 5 7 4 9 2.
The output is a single word, "true" if the input produces a magic square, "false" otherwise. Your program
may assume that each input token is a whole number.
The program must verify:
1. The proper number of input values was provided.
2. Each of the numbers between 1 and n2 occurs exactly once in the input.
3. When the numbers are arranged in a matrix,
• the sum of the rows,
• columns,
• and diagonals
must be the same value.
