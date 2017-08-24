Using object-oriented, tested code using the language that you feel most proficient in, please write a "pico y placa" 
predictor. The inputs should be a license plate number (the full number, not the last digit), a date (as a String), and 
a time, and the program will return whether or not that car can be on the road.

The Program was written in Java and in the Netbeans IDE.
User input is formatted, but it won't handle etreme error cases.
The arguments required by the program are a full string containing
-The licence plate 
-Blank space separation
-A date in the dd/MM/yyyy format
-Blank space separation
-And an hour in 00:00 format

How could Errors be prevented?
-Adding a GUI will enforce te type of input that the user can make.
-Adding a textbox to catch the licence plate
-Adding a calendar to get the given date or another textbox to get it as a string
-Adding a textbox for the time the user enquires 
-Adding regular expressions to the formatting process in each class will sort any kind of user input to the specific
format needed by the program

Features:
-The program works with any date of any year
-Weekends are categorized as free driving dates
-Time frames that are restricted for driving are the ranges between 7:00 to 9:30 and 16:00 to 19:30
-Output message is clearly understandable due to being localized for Spanish