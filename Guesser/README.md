# TheJavaGuesser

## Algorithm

### Menu
Print the three choices
Get the user's choice and return it

### Main Loop
Keep showing the menu until the user chooses 0
If they choose 1, run the human guesser
If they choose 2, run the computer guesser

### Human Guesser
Pick a random number from 1 to 100
Ask the user to guess and count each turn
Tell them if their guess is too high or too low
Keep going until they get the number

### Computer Guesser
Start with alow value of 1 and a high value of 100
Guess the middle of the range and count the turn 
Ask if the guess is too high, low, or correct
If its too highm move the high value below guess
If its too low, move the low value about guess
Repeat until the guess is correct or no numbers remain

## Compile and Run

javac Guesser.java
java Guesser

With make installed:

make run

