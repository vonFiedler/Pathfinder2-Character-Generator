import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;

public class BucketHandler {

   private String fileName = "";
   private int abilityEventCounter;
   private int alignmentEventCounter;
   private int skillEventCounter;
   
   private int[][] resultiMatrix = {
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 }
   };
   private String[] transitionMatrix = new String [6];
   
   private ArrayList<Integer> eventList = new ArrayList<Integer>();
   private int eventCount = 0;
   private int eventQuantity;
   private String[] flags = { "ANY", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" };
   private int[] skillBlock = new int[17];
   private int[] eventBlock = new int[16];
   
   public void setFile(String file) throws IOException{
   
      fileName = file;
   }
   
   public void setEventCounters(int ab, int al, int sk) {
   
      abilityEventCounter = ab;
      alignmentEventCounter = al;
      skillEventCounter = sk;
   }
   
   public int[] getMatrix(int choice) {
      
      return resultiMatrix[choice];
   }
   
   public String getBackground(int choice) {
   
      return transitionMatrix[choice];
   }

   public String lineFind(int line, String file) throws IOException{
   
      String tempLine = new String();
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         for (int i = 1; i < line; i++)
            br.readLine();
         tempLine = (br.readLine());
      }
      
      return tempLine;
   }
   
   public void setFlags(String[] flagsIn) {
   
      for(int i = 1; i < 16; i++)
         flags[i] = flagsIn[i];
   }
   
   public void setSkills(int[][] bigStat) {
   
      for(int i = 0; i < 17; i++) {
         if(bigStat[0][i] > 0) {
            skillBlock[i] = i + 17;
         }
      }
      skillBlock[7] = 0;
   }   
   
   public void setEvents() throws IOException{
   
      String events = (lineFind(1, fileName));
      String[] tokens = events.split("\\*");
      
      for(String i : tokens)
         eventList.add(Integer.parseInt(i));
         
      eventQuantity = eventList.size() -1;
   }
   
   public void runEvent() throws IOException{
   
      Random randomizer = new Random();
      
      int c = 0;
      while(c < 1) {
         int randomizee = randomizer.nextInt(eventQuantity) +1;
         boolean flagFound = false;
         for(int b : eventBlock) {
            int g = (eventList.get(randomizee));
            if(b == g) {
               flagFound = true;
            }
         }
         if(flagFound == false) {   
            String flagger = lineFind(eventList.get(randomizee), fileName);
            String[] tokens = flagger.split("\\*");
            switch(tokens[0]) {
               case "0": {
                  if(abilityEventCounter == 0) {
                     flagFound = true;
                  }
                  else {
                     abilityEventCounter--;
                     eventBlock[eventCount] = eventList.get(randomizee);
                  }
                  break;
               }
               case "1": {
                  if(alignmentEventCounter == 0) {
                     flagFound = true;
                  }
                  else {
                     alignmentEventCounter--;
                     eventBlock[eventCount] = eventList.get(randomizee);
                  }
                  break;
               }
               case "2": {
                  if(skillEventCounter == 0) {
                     flagFound = true;
                  }
                  else {
                     skillEventCounter--;
                     eventBlock[eventCount] = eventList.get(randomizee);
                  }
                  break;
               }
            }
            if(flagFound == false) {
               System.out.println(tokens[3]);
               int choicesBegin = Integer.parseInt(tokens[1]);
               int choicesEnd = Integer.parseInt(tokens[2]);
               int choicesRange = choicesEnd - choicesBegin + 1;
               int d = 1;
               int[] choiceBlock = new int[6];
               while(d < 7) {
                  flagFound = false;
                  randomizee = randomizer.nextInt(choicesRange) + choicesBegin;
                  for(int e : choiceBlock) {
                     if(randomizee == e) {
                        flagFound = true;
                     }
                  }
                  if(flagFound == false) {
                     choiceBlock[(d-1)] = randomizee;
                     String flagger2 = lineFind(randomizee, fileName);
                     String[] tokens2 = flagger2.split("\\*");
                     for(String flag : flags) {
                        if(tokens2[0].equals(flag))
                           flagFound = true;
                     }
                     boolean skillFound = false;
                     for(int s : skillBlock) {
                        if(tokens2[1].equals(s))
                           skillFound = true;
                     }    
                     if(flagFound == true && skillFound == false) {
                        System.out.println(d + ". " + tokens2[4]);
                        resultiMatrix[(d-1)][0] = Integer.parseInt(tokens2[1]);
                        resultiMatrix[(d-1)][1] = Integer.parseInt(tokens2[2]);
                        resultiMatrix[(d-1)][2] = Integer.parseInt(tokens2[3]);
                        d++;
                     }
                  }
               }
               c++;
               eventCount++;             
            }
         }
      }
   }
   
   public void runTransition() throws IOException {
   
      Random randomizer = new Random();
      String background = new String();
      String flagger = lineFind(eventList.get(0), fileName);
      String[] tokens = flagger.split("\\*");
      System.out.println(tokens[2]);
      int choicesBegin = Integer.parseInt(tokens[0]);
      int choicesEnd = Integer.parseInt(tokens[1]);
      int choicesRange = choicesEnd - choicesBegin + 1;
      
      int d = 1;
      int[] choiceBlock = new int[6];
      while(d < 7) {
         boolean flagFound = false;
         int randomizee = randomizer.nextInt(choicesRange) + choicesBegin;
         for(int e : choiceBlock) {
            if(randomizee == e) {
               flagFound = true;
            }
         }
         if(flagFound == false) {
            choiceBlock[(d-1)] = randomizee;
            String flagger2 = lineFind(randomizee, fileName);
            String[] tokens2 = flagger2.split("\\*");
            for(String flag : flags) {
               if(tokens2[0].equals(flag))
                  flagFound = true;
            }
            if(flagFound == true) {
               System.out.println(d + ". " + tokens2[2]);
               transitionMatrix[(d-1)] = tokens2[1];
               d++;
            }
         }         
      }
   }
}