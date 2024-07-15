# javacore-pt1-tasks

## Running Java Files

- cd into directory where java files are saved
- Compile files with javac
```
$javac <JavaFile>.java
```
- After compilation run .class files with java
```
$java <ClassFile> <arguments>
```

### Running Task 1

```
$javac OrderArray.java
$java OrderArray <textfile.txt>
```

Order array takes a text file as an argument. Format of the text file is as follows:


The first line contains the size of an array.
The second line contains elements of the array separated by spaces.

Output data format:
Only a single value: true or false.

Sample Text File:
```
4
1 2 3 4
```

A directory with 10 test cases is present within the ordertest directory. To run the program with a given test case, pass the path to the test case .txt file as an argument.

```
java OrderArray ordertest/test06.txt
```

### Running Task 2

ReverseString takes a string as argument in the command line. If this string has spaces it must be enclosed within quotations.

```
javac ReverseOrder.java
java ReverseOrder "This is a string with spaces"

java ReverseOrder Thisisastringwithnospaces
```

### Running Task 3

Compiling the task 3 .java file (ChangeIdentity.java) will result in multiple class files being created. To execute the program, run the MakingChanges.class file.

```
javac ChangeIdentity.java
java MakingChanges
```
Two person objects are instantiated within the code to demonstrate the swap.

### Running Task 4

Compiling the task 4 .java file (AccountService.java) will result in the creation of multiple class files. To execute the program run the AccountDriver.class file.

The program takes two arguments, an ID and a balance value to showcase the functionality of findAccountByOwnerID and countAccountsWithBalanceGreaterThan. Arguments should be given as a single string separated by a comma (,) eg 134244,1345334 (\<idNumber>,\<balance>).

```
javac AccountService.java
java AccountDriver 123456,1000000
```

Dummy data for 10 users and 10 user accounts have been hard coded into the program.

**Table Showing Hardcoded Data**

| Name  |  User ID | Account ID  |  Account Balance |
|---|---|---|---:|
| Noah Calhoun | 123456  | 270485196  | 1446129  |
| Allie Hamilton | 234567  | 516492380  | 983835  |
| Jack Dawson | 345678   | 450829317  | 1362881  |
| Rose DeWitt |  456789 | 263057489  | 1174917  |
| Tim Lake |  567890 | 516708423  | 1759729  |
| Mary Hollis | 678901  |386915407   | 1799210  |
| Connell Waldron  | 789012  | 358917462  | 860747  |
| Marianne Sheridan  |  890123 | 198316427  | 1308262  |
| Oliver Parker  | 901234  | 218730965  | 1600240  |
| Hadley Sullivan  | 912345  | 234324543  | 1353718  |




