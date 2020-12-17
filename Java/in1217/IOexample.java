package lecture13;
import java.io.*;
public class IOexample {
	public static void main(String[] args) throws IOException {
		File f = new File("C:/Users/zhang/eclipse-workspace/HelloWord/src/lecture13/test.txt");
        FileOutputStream fop = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fop, "gbk");
        int datatoWrite[] = {11, 21, 3, 40, 5, 74, 89};
        for (int i = 0; i < datatoWrite.length; i++) {
            writer.append(Integer.toString(datatoWrite[i])); // writes the ints
            writer.append("\n");
        }
        writer.close();  
        // If you forget to close the writer, YOU CAN  NOT SUCESSFULLY WRITER!
        fop.close();
        
        FileInputStream fip = new FileInputStream(f);
        BufferedReader br = new BufferedReader(new InputStreamReader(fip, "gbk"));
        while(br.ready()) {
        	System.out.println(br.readLine());
        }
        br.close();
        fip.close();
	}
}
