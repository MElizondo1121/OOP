package assign1;

import java.io.*;
public class NameMain{

    public static void main(String[] args) {
	     System.out.println("");

       String inPath ="/mnt/c/users/mirna/desktop/CS3354/data/names";
       File folder = new File(inPath);
       File[] listOfFiles = folder.listFiles();

       for (File file : listOfFiles) {
         if (file.isFile()) {
           System.out.println(file.getName());
    }
}
      }
    }
