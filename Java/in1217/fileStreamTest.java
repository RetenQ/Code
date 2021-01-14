package lecture13;
import java.io.*;
public class fileStreamTest {
    public static void main(String args[]) throws IOException {
    	File f = new File("C:/Users/zhang/eclipse-workspace/HelloWord/src/lecture13/a1.txt");
    	// Make sure the path is correct! 
    	// path coped from windows is C:\Users\zhang\eclipse-workspace\HelloWord\src\lecture13
        FileOutputStream fop = new FileOutputStream(f);
        // Create FileOutputStream object, a new file will be created if it does not exist.
 
        OutputStreamWriter writer = new OutputStreamWriter(fop, "gbk");
        // Create OutputStreamWriter object, second argument is data format, gbk for windows, UTF-8 for Linux
 
        writer.append("Hello");
        // Appends the specified character sequence to this writer. 
 
        writer.append("\n");
        // Appends a line return to this writer. 
 
        writer.append("CS161FZ");
        // Appends the specified character sequence to this writer. 
 
        writer.close();
        //Closes the stream, flushing it first. 
 
        fop.close();
        // Closes this file output stream and releases any system resources associated with this stream. 
 
        FileInputStream fip = new FileInputStream(f);
        // Create a FileInputStream¶Ô object
 
        InputStreamReader reader = new InputStreamReader(fip, "gbk");
        // Create a InputStreamReader object, same data format with the above
 
        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
            // convert to char, and add to StringBuffer object
        }
        System.out.println(sb.toString());
        reader.close();
        // close read stream
 
        fip.close();
        // Closes this file input stream and releases any system resources associated with the stream.
    }
    }