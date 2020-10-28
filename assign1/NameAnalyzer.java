package assign1;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.io.*;

public class NameAnalyzer{

    private String dataPath;
    private String resPath;
    private int t1; //number of names to return

		HashMap<String, HashMap<String, Integer>> yearRecords = new HashMap<String, HashMap<String, Integer>>();
		//Create a hashmap of which keys are string and values are a hashmap of string and integer
    //....
    public NameAnalyzer(){

    }
  /**
   * NameAnalyzer constructor that initializes inPath and outPath
   *@param inPath path where the txt files are located (e.g. YOB1888)
   *@param outPath path where the txt file that holds the outputs of the program
   */
	    public NameAnalyzer(String inPath, String outPath)
        {
            resPath=outPath;
            dataPath=inPath;
        }
        /**
        * NameAnalyzer constructor that initializes inPath, outPath, and count
        *@param inPath path where the txt files are located (e.g. YOB1888)
        *@param outPath path where the txt file that holds the outputs of the program
        *@param count holds how many entries of files there is
         */
    	public NameAnalyzer(String inPath, String outPath, int count)
        {
            resPath=outPath;
            dataPath=inPath;
            t1=count;
        }
        /**
         * FileReader checks to see if a year is in the HashMap
         *@param year is the value identifier to a specific file (e.g. YOB1888)
         */
    	public void FileReader(String year) {

        if(yearRecords.containsKey(year))//the key is already in the hashmap)
        {
						System.out.println("In hashmap");
        }
        else
        {
            if(Analyzer(year) == true){
							Printer(year);
						}//call analyzer
            //if returned true
            else{
							System.out.println("Error");
						}    //call printer
            //else
                ///print a meaningful error message

            return;
        }
    }
    /**
     * Printer prints the contents of the HashMap
     *@param year is in the list of files
     */
    public void Printer(String year)
    {
        System.out.println("***********************************************");
        String tmp= "top "+ String.valueOf(t1) + " names in "+ year + ":";
        System.out.println(tmp);

        //print your results
        //......
        System.out.println("***********************************************");
    }
    /**
     * Analyzer populates nameCounter of how top 10 names by year
     * @param year checks to see if listFiles contains that years file
     *@return true or false if the file is in the HashMap of records
     */
    public boolean Analyzer(String year) {
        File[] files = new File(dataPath).listFiles();
        for (File file : files) {
            if (file.getName().contains(year)) {
                //create a hash map for top t1 (e.g. 10) names of this year
                HashMap<String, Integer> record = new HashMap<>(t1);

                //read the file line by line
                try {
                    //read files line by line and add related records to your hashmap
											throw new FileNotFoundException();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

               return(true);
            }

        }
        return(false);
    }
    /**
     * NameMain interface for finding popular names in united states
     *
     */
		public void Writer()
		{
				String[] Keys= yearRecords.keySet().toArray(new String[0]);
				for(String K1:Keys)
				{
						try {
								// write the result of each year in a seprated file in resPath directory
						} catch (Exception e) {
								System.out.println(e);
						}
						System.out.print("All results are saved in:");
						System.out.print(resPath);

				}

		}
    /**
     * NameMain interface for finding popular names in united states
     *
     */
    private HashMap<String,Integer> AddName(HashMap<String,Integer> nameMap, String name, String value)
    {
        //Hash map still has empty cells
        if(nameMap.size()<t1)
        {

        }
        else { //Hash map is full, maybe we need to replace one item

            //sort and get the lowest value of the hashmap
            //if the lowest value is still greater than new value, skip
            //otherwise, replace it with the new value
            //......
            }
            return nameMap;
        }


}
