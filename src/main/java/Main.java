// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;
class Writer_Reader{
  void write(String filename, String content) throws IOException{
    File file = new File(filename);
    FileWriter fw = new FileWriter(file);
    fw.write(content);
    fw.close();
  }
  void read(String filename) throws IOException{
    File file = new File(filename);
    FileReader Fr = new FileReader(file);
    int ch;
    while((ch = Fr.read()) != -1){
      System.out.print((char)ch);
    }
    System.out.println();
    Fr.close();
  }
}
public class Main {
  public static void main(String[] args) {
    try{
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Conetent to be written");
      String content = sc.nextLine();
      Writer_Reader wr = new Writer_Reader();
      wr.write("demo.txt", content);
      wr.read("demo.txt");
    }
    catch(IOException e){
      System.out.println(e);
    }finally{
      
      System.out.println("File is closed");
    }
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}