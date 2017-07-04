import java.io.*;

public class BinaryFileHandling {
    public static void main(String [] args) {

        // The name of the file to open.
        String fileName = "sample\\sample.txt";
		String fileName2 = "sample\\sample1.txt";
        try {
            // Use this for reading the data.
            

            FileInputStream inputStream = new FileInputStream(fileName);
            int size = inputStream.available();
            byte[] buffer = new byte[size];
             FileOutputStream outputStream =new FileOutputStream(fileName2);
            // read fills buffer with data and returns
            // the number of bytes read (which of course
            // may be less than the buffer size, but
            // it will never be more).
            int total = 0;
            int nRead = 0;
            while((nRead = inputStream.read(buffer)) != -1) {
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(new String(buffer));
                outputStream.write(buffer);
               // total += nRead;
            }   

            // Always close files.
            inputStream.close(); 
            outputStream.close();         

            System.out.println("Read " + total + " bytes");
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
            // Or we could just do this: 
            // ex.printStackTrace();
        }
     
    }
}
