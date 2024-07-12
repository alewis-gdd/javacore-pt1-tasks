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

A directory with 10 test cases is present within the ordertest directory

```
$java OrderArray ordertest/test06.txt
```

### Running Task 2

ReverseString takes a string as argument in the command line. If this string has spaces it must be enclosed within quotations.

```
$javac ReverseOrder.java
$java ReverseOrder "This is a string with spaces"

$java ReverseOrder Thisisastringwithnospaces
```

### Running Task 3

Compiling the task 3 .java file (ChangeIdentity.java) will result in multiple class files being created. to execute the program, run the MakingChanges.class file.

```
$javac ChangeIdentity.java
$java MakingChanges
```
Two person objects are instantiated within the code to demonstrate the swap.

#### Running Task 4

