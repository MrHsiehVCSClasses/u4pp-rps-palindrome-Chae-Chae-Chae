# Unit 4 Programming Project

For this project, you will be completing the code for two classes: `RockPaperScissors` and `PalindromeTester`. Each of these classes have some code that has already been written for you. You should not change any of the provided code. Instead, you should add in your own code in order to fulfill the project requirements. You will also need to JavaDoc all your classes.

## Part A - RockPaperScissors.java - results()

The method `results` should accept player and computer input (`"R"`, `"P"` or `"S"`, lowercase or capital), and return an integer: `1` if the player wins, `0` if it is a tie, and `-1` if the player loses.

This part has one test - `doesRockPaperScissorLogicCorrectly`

## PART B - RockPaperScissors.java

For **Part B** you are going to complete the class `RockPaperScissors`. The class simulates a game of Rock-Paper-Scissors against a computer. In order to do so, you must:

1. Prompt the user to select *Rock*, *Paper*, or *Scissors*.
   - Users can choose *Rock* by inputting either *R* or *r*.
   - Users can choose *Paper* by inputting either *P* or *p*.
   - Users can choose *Scissors* by inputting either *S* or *s*.
   - Users can choose *Any* by inputting either *A* or *a*. If a user selects *Any* then a random selection is made for them, the same way it is done for the computer.
2. Have the computer secretly select one of the three options, randomly.
3. Output both selections and whether the user wins, loses or ties with the computer.
4. Keep track of and display how many times the user has won, lost and tied
5. Keep playing the game until the user chooses to stop.

Your output should look like the **Sample Run** below.

### PART B Sample Run

```java
Welcome to Rock Paper Scissors
Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: r
You both picked Rock. Its a tie!
You have 0 wins and 0 losses and 1 ties
Would you like to play again? (Y)es or (N)o: y
Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: a
You picked Rock, and the Computer picked Paper. You lose!
You have 0 wins and 1 losses and 1 ties
Would you like to play again? (Y)es or (N)o: Y
Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: S
You picked Scissors, and the Computer picked Rock. You lose!
You have 0 wins and 2 losses and 1 ties
Would you like to play again? (Y)es or (N)o: y
Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: asdfawefasdf
Invalid input, please try again
Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: p
You picked Paper, and the Computer picked Scissors. You lose!
You have 0 wins and 3 losses and 1 ties
Would you like to play again? (Y)es or (N)o: asdofjas;dfk
Invalid Input, please try again
Would you like to play again? (Y)es or (N)o: N
Thanks for playing! 
```

Hint: 
- You might want to make helper methods for contained bits of functionality. For example:
  - a helper method for getting a random choice between R/P/S
  - a helper method that displays/handles one full round of RPS

## PART C - PalindromeTester.java

For **PART C**, you need to complete the class `PalindromeTester`. The class tests whether or not a given `String` from the user is a palindrome.

For the sake of this project, a palindrome is defined as a `String` that reads the same forward and backwards when spaces, numbers, punctuation, and capitalization are all ignored.

The method `isPalindrome` should take in a string and return a boolean for whether or not the string is a palindrome, as defined in the paragraph above. The input string could have any number of spaces, punctuation, etc. Finishing this function should clear up 10 tests - all the ones starting with `isPalindrome_whenCalledWith...`.

After finishing `isPalindrome`, you will work on `execute()`. You should continually prompt the user for words to test until the user chooses to stop. Your output should look like the **Sample Run** below.

### Part C Sample Run

```java
Welcome to Palindrome Tester
Enter a phrase: racecar
racecar is a palindrome
Keep testing? (Y)es or (N)o: asdfhsa;g
Invalid Input, please try again
Keep testing? (Y)es or (N)o: Y
Enter a phrase: ra^124c8098  eCA@R
ra^124c8098  eCA@R is a palindrome
Keep testing? (Y)es or (N)o: y
Enter a phrase: isThisAPalindrome?
isThisAPalindrome? is not a palindrome
Keep testing? (Y)es or (N)o: N
```

## Grading Breakdown

- Code compiles & runs without errors: 1 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified: 2 point
- All code is DRY (Don't repeat yourself): 3 points
- Passes all test cases: 20 points
Total: 30 points
