import java.io.*;
public class Task {
  public static void main(String[] args) {
    String inFile = "input.log";
    String text = "";
    String line = null;
    try {
      FileReader fileReader =new FileReader(inFile);
      BufferedReader bufferedReader =new BufferedReader(fileReader);

      while((line = bufferedReader.readLine()) != null) {
        text = text.concat(line).concat("\n");
      }
      bufferedReader.close();
    }
    catch(FileNotFoundException ex) {
      System.out.println("Unable to open file");
    }
    catch(IOException ex) {
      System.out.println("Error reading file");
    }
    String out = "out.log";
    try {
      FileWriter fileWriter =new FileWriter(out);
      BufferedWriter bufferedWriter =new BufferedWriter(fileWriter);
      String result = text
                        .replaceAll(" 0 ", " null ")
                        .replaceAll(" 0,0 ", " null ");

      bufferedWriter.write(result);
      bufferedWriter.close();
    }
    catch(IOException ex) {
      System.out.println("Error writing to file");
    }
  }
}
