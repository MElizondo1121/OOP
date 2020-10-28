# CS3354.006 Fall 2019 assignment 3
## December 8th 2019

## Task 1 30 pt

  * AnimationTester.java
    * line 40 to 52
      - Two anonymous classes are made when action listeners are added to stepButton and runButton of the Gui. The design pattern used in this part of the java file is the observer design pattern since action listeners wait for notification of the state of an object/button being changed such as a choice decision being changed in a JComboBox.

  * ArrayComponent.java
    * lines 23 and 25
      - The functionality of this part of java file shows a composite design pattern since it shows the creation of a structure (Graphics2D g2) that consists of an object (Rectangle2D bar) which when formatted by draw or fill the objects of Rectangle2D also get formatted showing part-whole hierarchy.

  * MergeSorter.java
    * lines 56 and 67 to 76
      - In line 56 an object array is created using a prior object array in order to merge both arrays into a temporary array. Lines 67 to 76 dictates what specific loop is used based on the positions in order to copy over the entries to merge. The design pattern shown here is the adapter pattern. Since the temp object array is used as an adapter for object array b and object array n.
    * line 49
      - Even though a small part it does show the observer design pattern since it is used to prevent notification to the programmer of a compilation error, since it notifies the computer that the method below it will actually run.

  * Sorter.java
    * line 20 to 38
      - The design pattern I believe is being used in this java file is MVC through strategy since the controller uses its strategy (compare) to notify the model to change its state. When this is done the model notifies the view or the view request the state of the model to update itself. The view then interacts with the user through the panel. Line 32 is where the view is updates with the values.

## Task 3  30 pt
  * From command line: Must be in the specific directory where the jar file is found
    * Running the jar file: java -jar assign3.jar
    * Viewing contents of the jar file: jar tf assign3
    * Extracting the jar file: jar xf assign3.jar
