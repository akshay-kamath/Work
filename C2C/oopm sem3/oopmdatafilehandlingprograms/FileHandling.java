import java.io.*;

public class FileHandling {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "sample\\sample.txt";
		String fileName2="sample\\temp.txt";
        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);
 
             FileWriter fileWriter = new FileWriter(fileName2);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader =  new BufferedReader(fileReader);
           
           
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
				bufferedWriter.write(line);//+"\n");
				bufferedWriter.newLine();
            }   

            // Always close files.
            bufferedReader.close();
            bufferedWriter.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or
            // ex.printStackTrace();
        }
    }
}
