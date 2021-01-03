import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;

public class FileTest {

   private static String fileName = "";
   
   public static void setFile(String file) throws IOException{
   
      fileName = file;
   }

   public static String lineFind(int line, String file) throws IOException{
   
      String tempLine = new String();
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         for (int i = 1; i < line; i++)
            br.readLine();
         tempLine = (br.readLine());
      }
      
      return tempLine;
   }   
   
   public static int[] eventSet(String file) throws IOException{
   
      String events = (lineFind(1, file));
      int eventLength = (((events.length() + 1) / 3) - 1);
      int[] eventArray = new int[eventLength];
      int p = 3;
      for(int i = 0; i < eventLength; i++) {
         String intS = new String();
         for(int j = 0; j < 3; j++, p++) {
            intS = intS.concat(events.substring(p, (p + 1)));
         }
         eventArray[i] = Integer.parseInt(intS);
      }
   
   return eventArray;   
   }
      

   public static void main(String[] args) throws IOException {
      
      setFile("OrphanEvents.txt");
      int[] eventList = eventSet(fileName);

   }
}