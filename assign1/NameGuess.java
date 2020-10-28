/**
 * Iterates through a set of files and displays the possible years that a name
 * was used to name a child.
 *@author Mirna Elizondo
 */
package assign1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.*;

public class NameGuess{

    private String dataPath;
    private String resPath;
    private int t1;
    HashMap<String, HashMap<String, Integer>> nameCounter = new HashMap<String, HashMap<String, Integer>>();
    /**
     * NameGuess constructor that initializes the dataPath and resPath
     *@param inPath path where the txt files are located (e.g. YOB1888)
     *@param outPath path where the txt file that holds the outputs of the program
     */
    public NameGuess(String inPath, String outPath)
    {
        resPath=outPath;
        dataPath=inPath;
    }
    /**
    * NameGuess constructor that initializes the dataPath, resPath, and t1
    *@param inPath path where the txt files are located (e.g. YOB1888)
    *@param outPath path where the txt file that holds the outputs of the program
    *@param count number of file in the folder/directory
     */
    public NameGuess(String inPath, String outPath, int count)
    {
        resPath=outPath;
        dataPath=inPath;
        t1=count;
    }
    /**
     * Guess checks to see if a key is in the hashmap if true it is printed
     * else an error message is outputted
     *@param name key in the HashMap
     */
    public void Guess(String name) {
        if (nameCounter.containsKey(name)) {
            Printer(name);//call Printer and return
            //.....


        } else {
            boolean value = Analyzer(name);//call file analyzer
            //if returned true
            if(value == true){
              Printer(name);
            }
            else{
              System.out.println("Error");
            }
            //call Printer
            //else
            //print a meaningful error

        }
        return;
    }
    /**
     * Printer prints the contents of the HashMap
     *@param name is the key in the hashmap searched for
     */
    private void Printer(String name) {
        System.out.println("***********************************************");
        String tmp = "I guess you were born in one of these" + String.valueOf(t1) + " years: ";
        System.out.println(tmp);
        //print values
        //.....
        System.out.println(nameCounter);
        System.out.println("***********************************************");
        return;
    }

    /**
     * Analyzer populates nameCounter of how top 10 names by year
     * @param name checked to see if in the hashmap in order to replace it if empty
     *@return res which will be true is it is a Path
     */
    public boolean Analyzer(String name) {

        File[] files = new File(dataPath).listFiles();
        boolean res=false;
        HashMap<String, Integer> record = new HashMap<String, Integer>();
        //create a hash map for t1 (e.g. 5) years with highest probability
        //.....

        for (File file : files) {
            //read the file line by line
              System.out.println(file.getName());
            try {
                  throw new FileNotFoundException("Wrong");
                }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        if(!nameCounter.isEmpty()){
          nameCounter.put(name, record);
        }//your created Hashmap is not empty)
            //add your hashmap to namecouter

        return(res);
    }
    /**
     * Hashmap method that adds values to the HashMap
     *@param hashmap yearMap gets populated with year and value
     *@param year the key added to yearMap
     *@param value the value added to yearMap
     */
    private HashMap<String,Integer> AddName(HashMap<String,Integer> yearMap, String year, String value)
    {
        //Hash map still has empty cells
        if(yearMap.size()<t1)
        {

        }
        else { //Hash map is full, maybe we need to replace one item

            //Sort the hash map and get the lowest value,
            //if all values are greater than the new value, do nothing
            //otherwise, replace the lowest value with the new value
          }return yearMap;
    }
}
