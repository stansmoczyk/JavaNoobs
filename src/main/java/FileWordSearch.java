import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
include fileReader.AdminPanel.java;

//This is to be used for searching the file with all files merged into input.txt !!!NEED TO BE ABLE TO SUBMIT WORD TO SEARCH!!!!
public class FileWordSearch
{
        {
        File InputFile=new File(AdminPanel.fileReader); //Creation of File Descriptor for input file
        String[] words=null;  //Initialize the word Array
        FileReader fileReader = new FileReader(InputFile);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fileReader); //Creation of BufferedReader object
        String s;
        String SearchWord="Java";   // Input word to be searched !!!NEEDS TO BE CHANGED TO ALLOW USER INPUT FOR SEARCH!!!!!
        int count=0;   //Initialize the word to zero
        while((s=br.readLine())!=null)   //Reading Content from the file
        {
            words=s.split(" ");  //Split the word using space
            for (String word : words)
            {
                if (word.equals(SearchWord))   //Search for the given word
                {
                    count++;    //If Present increase the count by one
                }
            }
        }
        if(count!=0)  //Check for count not equal to zero
        {
            System.out.println("The given word "+ SearchWord+ " is present for "+count+ " Times in the file");
        }
        else
        {
            System.out.println("The given word "+ SearchWord+ " is not present in the file");
        }

        fileReader.close();
    }
    /*Boolean search Logic would go here.
    * If
    * word1 and word2 are found
    * return locations
    *
    * if word1 or word2 are found
    * return locations
    *
    * else
    * return Nothing to found*/

    /*Phrase search logic goes here
    * Search string for match
    * If found
    * return location
    * else
    * return Nothing found */

}