Mirna Elizondo
CS3354 Section 6
Homework #6

Solution 1:

Main.java

  Exact same as Solution 2 which means that it will not compile.
  Objects are those of solution 2 assuming they are implemented in a different package and those two packages are two separate entities then an object would not be made.

NameAnalyzer.java

  Both of the constructors for NameAnalyzer fail to state their purpose in the comments
  The method loadDBYear should check if users input is valid, for example if they enter gggg instead of a year it should return a meaningful error message.

NameGuess.java

  The constructors of NameGuess do not specify what they would be used for.
  The method printRecords allows for the user to know if the name was in nameCounter by having it printed and if it was not an error message is displayed
  The method nameAnalyzer has an error in its javadoc in naming the method recordAnalyzer instead of nameAnalyzer aside from that there are no suggested improvements.

  Possible improvements that could be made to the method yearAnalyzer is the separation of males and females during the creation of the HashMap to allow for the user to be able to ask for males/females with a given name or year. When nameMap is being created in the method addFreqNames the hashMap should be sorted in either descending or ascending order in order to allow the updating of the hashMap to be easier when replacing or removing the sets. In Main.java the destination path for writing yearRecord results should be asked from the user or initialized by the programmer in order to check if the path is a valid one.

Solution 2

NamesApp.java
  When selection == 1 there should be a check to verify that the year entered is a valid one, for example uuuu instead of a number.
  When selection == 0 there a warning should be displayed in order to verify that the user wants to exit the program such as having them re-enter option 0

NamesDB.java
  The default constructor javadoc comment allows for another programmer to be able to understand the purpose of that specific constructor is given that there are three different ones, the other should also state their purpose in order for another individual to understand if code is being edited by more than one person.
  In the method loadDB there is a check to verify that only the text files are being read in and added to the files arrayList. This is in good practice since the number of files is large it could be possible that one of those files is not a text file. This allows for the compilation to run smoothly since the program would not crash due to inputting another file type.

NamesRecord.java

  The nameRecord class implements Comparable leading to it being assumed that another individual editing the code knows the purpose of Comparable. Although redundant since Comparable simply compares values or items, it would allow for unit testing to be made simpler if values are not in the right order(descending or ascending) or otherwise. 

  Possible improvements that could be made are a javadoc comment explaining what the Collections/Comparator class implements and does. This would allow another individual to be sure of what is happening instead of assuming the purpose of using Collections/Comparator. Compared to Solution 1 there are less javadocs which make it harder to understand the purpose of the method leading to the assumption of its purpose.
