import java.util.Random;
import java.util.Scanner;

public class JobEvents {

   private String jobClass = "";
   private String background ="";
   // This is used to tell the driver class how to interact with the bigStat for any given choice
   private int[][] resultiMatrix = {
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 },
      new int[] { -1, -1, -1, -1 }
   };
   // This will be used in the future to prevent generic events from being repeated over different event buckets
   private int[] genericEventBools = { 0, 0, 0, 0, 0,
                                       0, 0, 0, 0, 0,
                                       0, 0, 0, 0, 0,
                                       0, 0, 0, 0, 0};
   // This is used to prevent bucket specific events from repeating
   private int[] nonGenericEventBools = new int[3];
   

   public String getJobClass() {
      return jobClass;
   }
   
   public int[] getMatrix(int choice) {
      return resultiMatrix[choice];
   }
   
   public void setBackground(String back) {
      background = back;
   }
   
   public void setEvents(int[] events) {
      genericEventBools = events;
   }
   
   public void runEvent() {
   
      Random randomizer = new Random();
   
      int i = 0;
      while(i < 1){
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               if(nonGenericEventBools[0] == 0) {
                  nonGenericEventBools[0]++;
                  i++;
                  embezzlement();
               }
               break;
            }
            case 1: {
               if(nonGenericEventBools[1] == 0) {
                  nonGenericEventBools[1]++;
                  i++;
                  salesFocus();
               }
               break;
            }
            case 2: {
               if(genericEventBools[0] == 0) {
                  genericEventBools[0]++;
                  i++;
                  fire();
               }
               break;
            }
            case 3: {
               if(genericEventBools[1] == 0) {
                  genericEventBools[1]++;
                  i++;
                  flood();
               }
               break;
            }
            case 4: {
               if(genericEventBools[6] == 0) {
                  genericEventBools[6]++;
                  i++;
                  yourAccident();
               }
               break;
            }
            case 5: {
               i++;
               freeDay();
               break;
            }
            case 6: {
               if(genericEventBools[7] == 0) {
                  genericEventBools[7]++;
                  i++;
                  otherAccident();
               }
               break;
            }
            case 7: {
               if(genericEventBools[10] == 0) {
                  genericEventBools[10]++;
                  i++;
                  famousRunin();
               }
               break;
            }
            case 8: {
               if(nonGenericEventBools[2] == 0) {
                  nonGenericEventBools[2]++;
                  i++;
                  rival();
               }
               break;
            }
         }
      }
   }
   
   public void embezzlement() { // Event 0, Non-Generic 0
      
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
      
      System.out.println("You caught a coworker you are on good terms with stealing money from the company.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". For their own good, I turn them into the boss.");
                  options[0]++;
                  resultiMatrix[i][0] = 7; // Good
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I convince them to confess their crime and seek redemption.");
                  options[1]++;
                  resultiMatrix[i][0] = 7; // Good
                  i++;
               }
               break;             
            }
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I tell them that they need to secretly return the money and never steal again.");
                  options[2]++;
                  resultiMatrix[i][0] = 7; // Good
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            }
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". They're breaking the law, I must go the authorities.");
                  options[3]++;
                  resultiMatrix[i][0] = 11; // Law
                  i++;
               }
               break;             
            }
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I can't approve, but I can't turn on my friend either.");
                  options[4]++;
                  i++;
               }
               break;             
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I don't see how I'm involved or should care.");
                  options[5]++;
                  resultiMatrix[i][0] = 13; // Chaos
                  i++;
               }
               break;             
            }
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I rat him out to the boss, thereby increasing my standing in the company.");
                  options[6]++;
                  resultiMatrix[i][0] = 9; // Evil
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            }
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I blackmail my coworker so the wealth may be shared.");
                  options[7]++;
                  resultiMatrix[i][0] = 9; // Evil
                  i++;
               }
               break;             
            }
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". Sounds like an opportunity. Let's make a plan to steal more.");
                  options[8]++;
                  resultiMatrix[i][0] = 9; // Evil
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            }           
         }
      }
   }
   
   public void salesFocus() { // Event 1, Non Generic 1
   
      int[] options = new int[36];
      Random randomizer = new Random();
      
      System.out.println("Business hasn't been very good lately. Everyone needs to up their game in the coming months.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(36);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I aid reduce logistics costs by carrying things from our suppliers to our storage.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1 && background.equals("Acrobat")) {
                  System.out.println((i + 1) + ". I perfect my still ring routine to wow the audience.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 2: {
               while(options[2] < 1 && background.equals("Artisan")) {
                  System.out.println((i + 1) + ". As a young person, I do all the hard work that the older crafters have trouble with.");
                  options[2]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 3: {
               while(options[3] < 1 && background.equals("Laborer")) {
                  System.out.println((i + 1) + ". I take some heavy lifting jobs that no one wanted to volunteer for.");
                  options[3]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 4: {
               while(options[4] < 1 && background.equals("Miner")) {
                  System.out.println((i + 1) + ". I fill minecarts twice as much before pushing them back.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I pick up the pace, keeping up with the demanding workload.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 6: {
               while(options[6] < 1 && background.equals("Acrobat")) {
                  System.out.println((i + 1) + ". I work on my backflip routine to impress the audience.");
                  options[6]++;
                  resultiMatrix[i][0] = 1; // Dex 
                  i++;
               }
               break;             
            }
            case 7: {
               while(options[7] < 1 && background.equals("Artist")) {
                  System.out.println((i + 1) + ". I spend hours practicing brushstrokes, perfecting my art.");
                  options[7]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 8: {
               while(options[8] < 1 && background.equals("Entertainer")) {
                  System.out.println((i + 1) + ". I practice the technical aspects of my art so that my audience will be stunned by my ability.");
                  options[8]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 9: {
               while(options[9] < 1 && background.equals("Hunter")) {
                  System.out.println((i + 1) + ". I get better at target practice, so that I may hunt more dangerous game.");
                  options[9]++;
                  resultiMatrix[i][0] = 1; // Dex 
                  i++;
               }
               break;             
            }
            case 10: {
               while(options[10] < 1 && background.equals("Tinkerer")) {
                  System.out.println((i + 1) + ". I get better at working with my hands, to reduce money spent on tools.");
                  options[10]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". I work overtime every day until we get back on track. ");
                  options[11]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 12: {
               while(options[12] < 1 && background.equals("Barkeep")) {
                  System.out.println((i + 1) + ". I volunteer for every rush hour shift.");
                  options[12]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 13: {
               while(options[13] < 1 && background.equals("Herbalist")) {
                  System.out.println((i + 1) + ". I collect rare plants from dangerous areas that my coworkers won't explore.");
                  options[13]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 14: {
               while(options[14] < 1 && background.equals("Laborer")) {
                  System.out.println((i + 1) + ". I work three jobs a day.");
                  options[14]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 15: {
               while(options[15] < 1) {
                  System.out.println((i + 1) + ". I brainstorm an efficiency plan for the business.");
                  options[15]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 16: {
               while(options[16] < 1 && background.equals("Artisan")) {
                  System.out.println((i + 1) + ". I revolutionize our assembly line, leading to more product output.");
                  options[16]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 17: {
               while(options[17] < 1 && background.equals("Barrister")) {
                  System.out.println((i + 1) + ". I study the law in my off hours.");
                  options[17]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 18: {
               while(options[18] < 1 && background.equals("Emissary")) {
                  System.out.println((i + 1) + ". I study international relations in my off hours.");
                  options[18]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 19: {
               while(options[19] < 1 && background.equals("Fortune Teller")) {
                  System.out.println((i + 1) + ". I study the occult in my off hours.");
                  options[19]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 20: {
               while(options[20] < 1 && background.equals("Merchant")) {
                  System.out.println((i + 1) + ". I study finances in my off hours.");
                  options[20]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 21: {
               while(options[0] < 1 && background.equals("Scholar")) {
                  System.out.println((i + 1) + ". I write an important research paper, hoping to increase my group's reputation.");
                  options[0]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 22: {
               while(options[0] < 1 && background.equals("Tinkerer")) {
                  System.out.println((i + 1) + ". I study unfamiliar machinery in my off hours.");
                  options[0]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 23: {
               while(options[23] < 1) {
                  System.out.println((i + 1) + ". I ask my an experienced senior coworker for advice on how to improve my work.");
                  options[23]++;
                  resultiMatrix[i][0] = 4; // Wis 
                  i++;
               }
               break;             
            }
            case 24: {
               while(options[24] < 1 && background.equals("Herbalist")) {
                  System.out.println((i + 1) + ". I learn to effectively sort the poisonous plants from the benign ones.");
                  options[24]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 25: {
               while(options[25] < 1 && background.equals("Hunter")) {
                  System.out.println((i + 1) + ". I learn to better stalk my prey.");
                  options[25]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 26: {
               while(options[26] < 1 && background.equals("Miner")) {
                  System.out.println((i + 1) + ". I join the safety team, always on the alert for gas leaks and other hazard.");
                  options[26]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 27: {
               while(options[27] < 1 && background.equals("Scholar")) {
                  System.out.println((i + 1) + ". I write a powerful philosophy paper, hoping to draw attention to my group.");
                  options[27]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 28: {
               while(options[28] < 1) {
                  System.out.println((i + 1) + ". I cheer up my coworkers to raise company morale.");
                  options[28]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 29: {
               while(options[29] < 1 && background.equals("Artist")) {
                  System.out.println((i + 1) + ". I come up with a radical new art style.");
                  options[29]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 30: {
               while(options[30] < 1 && background.equals("Barkeep")) {
                  System.out.println((i + 1) + ". I work on my customer service skills.");
                  options[30]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 31: {
               while(options[31] < 1 && background.equals("Barrister")) {
                  System.out.println((i + 1) + ". I spend on hour arguing at the mirror each night.");
                  options[31]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 32: {
               while(options[32] < 1 && background.equals("Emissary")) {
                  System.out.println((i + 1) + ". I spend my evenings by networking with important people, inviting them out for drinks and shows.");
                  options[32]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 33: {
               while(options[33] < 1 && background.equals("Entertainer")) {
                  System.out.println((i + 1) + ". I envision an avant-garde performance to catch people's attention.");
                  options[33]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 34: {
               while(options[34] < 1 && background.equals("Fortune Teller")) {
                  System.out.println((i + 1) + ". I add smoke and mirrors to my room, to really make the experience pop.");
                  options[34]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 35: {
               while(options[35] < 1 && background.equals("Merchant")) {
                  System.out.println((i + 1) + ". I try to haggle progressively better margins out of people.");
                  options[35]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
         }
      }
   }
   
   public void fire() { // Event 3, Generic 1
   
      int[] options = new int[9];
      Random randomizer = new Random();
      
      System.out.println("You are on your way to work when you come across a building on fire.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I organize the neighborhood in order to fight the fire together.");
                  options[0]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 7; // Good
                  resultiMatrix[i][2] = 11; // Law
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I begin carrying barrels of water to the scene.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            }
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I rush in, hoping to rescue anyone who might be trapped.");
                  options[2]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 7; // Good
                  resultiMatrix[i][2] = 13; // Chaos
                  i++;
               }
               break;             
            }
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I alert the local fire brigade.");
                  options[3]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            }
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I go on my way.");
                  options[4]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I set up a chair and watch.");
                  options[5]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            }
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I stop and consider the money that might be made off of my business's insurance if the same were to happen.");
                  options[6]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 9; // Evil
                  resultiMatrix[i][2] = 11; // Law
                  i++;
               }
               break;             
            }
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I quickly use the confusion to go in and steal anything not nailed down.");
                  options[7]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            }
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". That's what I told the guards anyway, when in reality I had started it.");
                  options[8]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 9; // Evil
                  resultiMatrix[i][2] = 13; // Chaos
                  i++;
               }
               break;             
            }
         }
      }
   }   

   public void flood() { // Event 4, Generic 2
   
      int[] options = new int[10];
      Random randomizer = new Random();
      
      System.out.println("Prolonged heavy rains are flooding the neighborhood. Everyone is working hard to pack up their things and protect their businesses.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(10);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I help our neighbors pack up their things.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            }   
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I help our neighbors plan the logistics for a temporary move.");
                  options[1]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            }   
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I organize local businesses to come up with a plan of action.");
                  options[2]++;
                  resultiMatrix[i][0] = 5; // Int
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            }   
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I join the local emergency committee and help them predict the weather.");
                  options[3]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            }   
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I create a gutter to divert as much water away from our business as possible.");
                  options[4]++;
                  resultiMatrix[i][0] = 3; //
                  i++;
               }
               break;             
            }   
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I get out of there as soon as possible!");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }   
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I tie myself down to my a post and continue to do my job as if nothing was happening.");
                  options[6]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            }   
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I go looting!");
                  options[7]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            }   
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I take note of which of our local competitors are failing to salvage their business, and adjust my future business plan accordingly.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            }   
            case 9: {
               while(options[9] < 1) {
                  System.out.println((i + 1) + ". I use the disorder to find one of my enemies and drown them.");
                  options[9]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            }
         }  
      }
   }
 
   public void yourAccident() { // Event 5, Generic 6
   
      int[] options = new int[14];
      Random randomizer = new Random();
      
      switch(background) {
         case "Acrobat":
         case "Entertainer": {
            System.out.println("You landed the wrong way during a performance, hurting yourself.");
            break;
         }
         case "Artisan":
         case "Tinkerer": {
            System.out.println("You got your hand caught in a machine at work.");
            break;
         }
         case "Barkeep": {
            System.out.println("You slip on some spilled mead during your shift, getting injured in the process.");
            break;
         }
         case "Herbalist": {
            System.out.println("You fall over and hit your head. It appears that you slightly poisoned yourself on accident.");
            break;
         }
         case "Hunter": {
            System.out.println("You get mauled during a hunt. Thankfully another hunter is able to rescue you before you are seriously hurt.");
            break;
         }
         case "Laborer": {
            System.out.println("You get injured during a dangerous job.");
            break;
         }
         case "Miner": {
            System.out.println("You get hit by shrapnel during a controlled explosion.");
            break;
         }
         default: {
            System.out.println("You got hurt due to an accident at work.");
            break;
         }
      }
         
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(14);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". Clearly there isn't enough workplace safety. I need to help them reform in the future, so that we may all be safer.");
                  options[0]++;
                  resultiMatrix[i][0] = 7; // Good
                  resultiMatrix[i][1] = 11; // Law 
                  i++;
               }
               break;
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". Instead of worrying about my injuries, I fix the problem that led to my accident, lest others are hurt as well.");
                  options[1]++;
                  resultiMatrix[i][0] = 7; // Good
                  i++;
               }
               break;
            }
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". Instead of worrying about my injuries, I go back to work so as not to inconvenience my coworkers.");
                  options[2]++;
                  resultiMatrix[i][0] = 7; // Good
                  resultiMatrix[i][1] = 13; // Chaos 
                  i++;
               }
               break;
            }
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I report it to my boss and go on with things.");
                  options[3]++;
                  resultiMatrix[i][0] = 11; // Law
                  i++;
               }
               break;
            }
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". Instead of worrying about my injuries, I go back to work. Gotta make that coin.");
                  options[4]++;
                  resultiMatrix[i][0] = 13; // Chaos
                  i++;
               }
               break;
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I blackmail my boss for a nice payout.");
                  options[5]++;
                  resultiMatrix[i][0] = 9; // Evil
                  resultiMatrix[i][1] = 11; // Law 
                  i++;
               }
               break;
            }
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I hide my injury to avoid getting in trouble.");
                  options[6]++;
                  resultiMatrix[i][0] = 9; // Evil
                  i++;
               }
               break;
            }
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I pretend to be fine, then curiously watch to see if others get hurt from the same problem.");
                  options[7]++;
                  resultiMatrix[i][0] = 9; // Evil 
                  resultiMatrix[i][1] = 13; // Chaos 
                  i++;
               }
               break;
            }
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I'm hurt, but more than capable enough to not worry about it.");
                  options[8]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 9: {
               while(options[9] < 1) {
                  System.out.println((i + 1) + ". My body is a precious instrument. I have to take the time to rest to protect it.");
                  options[9]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 10: {
               while(options[10] < 1) {
                  System.out.println((i + 1) + ". Ha, whatever. I shrug it off.");
                  options[10]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". Even if I have to take time off, I can still learn new things instead of wasting it.");
                  options[11]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;
            }
            case 12: {
               while(options[12] < 1) {
                  System.out.println((i + 1) + ". No matter how slight the injury, it's best to take care of myself.");
                  options[12]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 13: {
               while(options[13] < 1) {
                  System.out.println((i + 1) + ". I'm going to talk my boss into giving me some time off to recover.");
                  options[13]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
         }
      }
   }

   public void freeDay() { // Event 5
   
      int[] options = new int[20];
      Random randomizer = new Random();
      
      System.out.println("You have nothing to do today. How do you spend your time?");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(20);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I find a person in need of help.");
                  options[0]++;
                  resultiMatrix[i][0] = 7; // Good
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I do something nice for a coworker.");
                  options[1]++;
                  resultiMatrix[i][0] = 7; // Good
                  i++;
               }
               break;             
            } 
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I ask my boss if there is anything I can do for the business.");
                  options[2]++;
                  resultiMatrix[i][0] = 11; // Law 
                  i++;
               }
               break;             
            } 
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I participate in the neighborhood watch.");
                  options[3]++;
                  resultiMatrix[i][0] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I look for an employer that pays better.");
                  options[4]++;
                  resultiMatrix[i][0] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I go out for the night.");
                  options[5]++;
                  resultiMatrix[i][0] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I scheme a way to improve my station in life.");
                  options[6]++;
                  resultiMatrix[i][0] = 9; // Evil
                  i++;
               }
               break;             
            } 
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I make plans to get back at people who have wronged me.");
                  options[7]++;
                  resultiMatrix[i][0] = 9; // Evil
                  i++;
               }
               break;             
            } 
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I lift weights to work out.");
                  options[8]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            } 
            case 9: {
               while(options[9] < 1) {
                  System.out.println((i + 1) + ". I do melee weapon drills.");
                  options[9]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 10: {
               while(options[10] < 1) {
                  System.out.println((i + 1) + ". I start a project working with my hands.");
                  options[10]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". I do shooting drills.");
                  options[11]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 12: {
               while(options[12] < 1) {
                  System.out.println((i + 1) + ". I spend the day working my core.");
                  options[12]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 13: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I get beastly drunk.");
                  options[0]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 14: {
               while(options[14] < 1) {
                  System.out.println((i + 1) + ". I read a book.");
                  options[14]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 15: {
               while(options[15] < 1) {
                  System.out.println((i + 1) + ". I learn something new.");
                  options[15]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 16: {
               while(options[16] < 1) {
                  System.out.println((i + 1) + ". I take a breather, reflecting on my short life so far.");
                  options[16]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 17: {
               while(options[17] < 1) {
                  System.out.println((i + 1) + ". I people watch.");
                  options[17]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 18: {
               while(options[18] < 1) {
                  System.out.println((i + 1) + ". I hang out with some friends.");
                  options[18]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 19: {
               while(options[19] < 1) {
                  System.out.println((i + 1) + ". I try to find love.");
                  options[19]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
         }
      }
   }  

   public void otherAccident() { // Event 7, Generic 7
   
      int[] options = new int[9];
      Random randomizer = new Random();
      
      switch(background) {
         case "Acrobat": {
            System.out.println("A knife you were juggling flies out of your hand and injures a spectator.");
            break;
         }
         case "Artisan":
         case "Tinkerer": {
            System.out.println("After you fix up a machine, it blows up and hurts the next person working with it.");
            break;
         }
         case "Barkeep": {
            System.out.println("You fail to mop the floors during rush hour, so a patron slips and falls.");
            break;
         }
         case "Emissary": {
            System.out.println("You are taking a foreign visitor on a city tour when the carriage wheel breaks and they hit their head.");
            break;
         }
         case "Entertainer": {
            System.out.println("Your pyrotechniques backfire, injuring a member of the crowd.");
            break;
         }
         case "Fortune Teller": {
            System.out.println("One of your patrons returns, complaining that they followed your advice and were injured as a result.");
            break;
         }
         case "Herbalist": {
            System.out.println("You mislabeled a drug and a customer became sick as a result.");
            break;
         }
         case "Hunter": {
            System.out.println("A bit of carelessness on your part during a hunt leads to another hunter getting attacked by an animal.");
            break;
         }
         case "Merchant": {
            System.out.println("You sold someone a faulty product that led to an injury.");
            break;
         }
         case "Miner": {
            System.out.println("You accidently let go of a mine cart and it runs over a coworker's foot.");
            break;
         }
         default: {
            System.out.println("A coworker is hurt by your careless behavior on the job.");
            break;
         }
      }
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I vow to do anything I can for them to make the situation right.");
                  options[0]++;
                  resultiMatrix[i][0] = 7; // Good 
                  resultiMatrix[i][1] = 11; // Law 
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I personally take time off to make sure they get taken care of.");
                  options[1]++;
                  resultiMatrix[i][0] = 7; // Good 
                  i++;
               }
               break;             
            } 
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I send them a gift basket later, but hide my wrongdoing.");
                  options[2]++;
                  resultiMatrix[i][0] = 7; // Good 
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I pay the standard restitution.");
                  options[3]++;
                  resultiMatrix[i][0] = 11; // Law 
                  i++;
               }
               break;             
            } 
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I feel bad, but it was only an accident.");
                  options[4]++;
                  i++;
               }
               break;             
            } 
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I slink away from the responsibility.");
                  options[5]++;
                  resultiMatrix[i][0] = 13; // Chaos 
                  i++;
               }
               break;             
            } 
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I argue that this is actually the company's fault for their bad safety practices.");
                  options[6]++;
                  resultiMatrix[i][0] = 9; // Evil 
                  resultiMatrix[i][1] = 11; // Law 
                  i++;
               }
               break;             
            } 
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I threaten them to keep quiet.");
                  options[7]++;
                  resultiMatrix[i][0] = 9; // Evil 
                  i++;
               }
               break;             
            } 
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I later track them down at their home and silence them.");
                  options[8]++;
                  resultiMatrix[i][0] = 9; // Evil 
                  resultiMatrix[i][1] = 13; // Chaos 
                  i++;
               }
               break;             
            } 
         }
      }
   } 
   
   public void famousRunin() { // Event 8, Non Generic 10
   
      int[] options = new int[36];
      Random randomizer = new Random();
      
      switch(background) {
         case "Acrobat":
         case "Entertainer":
         case "Fortune Teller": {   
            System.out.println("You learn that an important VIP is coming to the next performance.");
            break;
         }
         case "Artist":
         case "Scholar":
         case "Tinkerer": {
            System.out.println("You learn that an important VIP is coming to look at your work.");
            break;
         }
         case "Barrister": {
            System.out.println("You learn that you are going to be representing an important VIP.");
            break;
         }
         case "Barkeep": {
            System.out.println("You learn that an important VIP is stopping by tonight for a drink.");
            break;
         }
         case "Emissary": {
            System.out.println("You learn that you are going to be liasing with an important VIP.");
            break;
         }
         default: {
            System.out.println("You learn that an important VIP is going to be inspecting the job site.");
            break;
         }
      }
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(36);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I gaily challenge them to an arm-wrestling competition.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1 && background.equals("Acrobat")) {
                  System.out.println((i + 1) + ". I try to impress them by breaking the record for single arm handstands.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 2: {
               while(options[2] < 1 && background.equals("Artisan")) {
                  System.out.println((i + 1) + ". I rearrange all the machinery myself so that the shop is more presentable.");
                  options[2]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 3: {
               while(options[3] < 1 && background.equals("Laborer")) {
                  System.out.println((i + 1) + ". I show off my worth by lifting the heaviest object I can find.");
                  options[3]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 4: {
               while(options[4] < 1 && background.equals("Miner")) {
                  System.out.println((i + 1) + ". I work ferociously, digging into the rock with my pick as much as possible while they are watching me.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;             
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I give them an amazing handshake.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 6: {
               while(options[6] < 1 && background.equals("Acrobat")) {
                  System.out.println((i + 1) + ". I try to perform a record number of mid-air spins.");
                  options[6]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 7: {
               while(options[7] < 1 && background.equals("Artist")) {
                  System.out.println((i + 1) + ". I show them my most technical work.");
                  options[7]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 8: {
               while(options[8] < 1 && background.equals("Entertainer")) {
                  System.out.println((i + 1) + ". I give a technically perfect performance.");
                  options[8]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 9: {
               while(options[9] < 1 && background.equals("Hunter")) {
                  System.out.println((i + 1) + ". I go out to shoot the most difficult game I can find and present them with the corpse.");
                  options[9]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 10: {
               while(options[10] < 1 && background.equals("Tinkerer")) {
                  System.out.println((i + 1) + ". I present them with an intricately detailed machine with many moving parts.");
                  options[10]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;             
            }
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". I buy us a few rounds of beer.");
                  options[11]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 12: {
               while(options[12] < 1 && background.equals("Barkeep")) {
                  System.out.println((i + 1) + ". I attend to their every need, making sure they get each order in a timely manner.");
                  options[12]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 13: {
               while(options[13] < 1 && background.equals("Herbalist")) {
                  System.out.println((i + 1) + ". I offer to smoke some of stranger herbs with them, if you know what I mean...");
                  options[13]++;
                  resultiMatrix[i][0] = 2; // Con 
                  i++;
               }
               break;             
            }
            case 14: {
               while(options[14] < 1 && background.equals("Laborer")) {
                  System.out.println((i + 1) + ". I work nonstop as long as they are watching.");
                  options[14]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;             
            }
            case 15: {
               while(options[15] < 1) {
                  System.out.println((i + 1) + ". I discuss with them detailed operations of our business.");
                  options[15]++;
                  resultiMatrix[i][0] = 3; // Int 
                  i++;
               }
               break;             
            }
            case 16: {
               while(options[16] < 1 && background.equals("Artisan")) {
                  System.out.println((i + 1) + ". I boast about our efficient work process.");
                  options[16]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 17: {
               while(options[17] < 1 && background.equals("Barrister")) {
                  System.out.println((i + 1) + ". I draw them into a friendly political debate.");
                  options[17]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 18: {
               while(options[18] < 1 && background.equals("Emissary")) {
                  System.out.println((i + 1) + ". I discuss in great detail about their homeland and culture.");
                  options[18]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 19: {
               while(options[19] < 1 && background.equals("Fortune Teller")) {
                  System.out.println((i + 1) + ". I read them as accurate a fortune as possible, hoping to be of service.");
                  options[19]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 20: {
               while(options[20] < 1 && background.equals("Merchant")) {
                  System.out.println((i + 1) + ". I draw them into a discussion on local market forces.");
                  options[20]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 21: {
               while(options[21] < 1 && background.equals("Scholar")) {
                  System.out.println((i + 1) + ". I prepare a research piece for them to read.");
                  options[21]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 22: {
               while(options[22] < 1 && background.equals("Tinkerer")) {
                  System.out.println((i + 1) + ". I present them with my most efficient machine.");
                  options[22]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;             
            }
            case 23: {
               while(options[23] < 1) {
                  System.out.println((i + 1) + ". I focus any conversation on them, after all, I can stand to learn a lot from them.");
                  options[23]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 24: {
               while(options[24] < 1 && background.equals("Herbalist")) {
                  System.out.println((i + 1) + ". I prepare a variety of curatives as a gift.");
                  options[24]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 25: {
               while(options[25] < 1 && background.equals("Hunter")) {
                  System.out.println((i + 1) + ". I track down the rarest game so that I may present them the corpse.");
                  options[25]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 26: {
               while(options[26] < 1 && background.equals("Miner")) {
                  System.out.println((i + 1) + ". I follow all proper protocols so that they can see it's a safe mine.");
                  options[26]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 27: {
               while(options[27] < 1 && background.equals("Scholar")) {
                  System.out.println((i + 1) + ". I prepare a philosophy paper for them to read.");
                  options[27]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;             
            }
            case 28: {
               while(options[28] < 1) {
                  System.out.println((i + 1) + ". I schmooze with them, building up the company in their eyes.");
                  options[28]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 29: {
               while(options[29] < 1 && background.equals("Artist")) {
                  System.out.println((i + 1) + ". I show them my most creative art.");
                  options[29]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 30: {
               while(options[30] < 1 && background.equals("Barkeep")) {
                  System.out.println((i + 1) + ". I share with them my best bartender stories.");
                  options[30]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 31: {
               while(options[31] < 1 && background.equals("Barrister")) {
                  System.out.println((i + 1) + ". I prepare a technically legal bribe and get ready to win them over.");
                  options[31]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 32: {
               while(options[32] < 1 && background.equals("Emissary")) {
                  System.out.println((i + 1) + ". I take them out for a wild night on the town.");
                  options[32]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 33: {
               while(options[33] < 1 && background.equals("Entertainer")) {
                  System.out.println((i + 1) + ". I show off one of my more creative performances.");
                  options[33]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 34: {
               while(options[34] < 1 && background.equals("Fortune Teller")) {
                  System.out.println((i + 1) + ". The fortune I give them is entirely positive, as I want them to have a good experience.");
                  options[34]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
            case 35: {
               while(options[35] < 1 && background.equals("Merchant")) {
                  System.out.println((i + 1) + ". I use the opportunity to make a huge sale.");
                  options[35]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;             
            }
         }
      }
   }
   
   public void rival() { // Event 9, Non-Generic 3
   
      int[] options = new int[24];
      Random randomizer = new Random();
      
      System.out.println("A business rival has vowed to run your company into the ground.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(24);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I carry my company through this on my shoulders.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 7; // Good 
                  i++;
               }
               break;             
            }
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I mind my own business, lifting weights to keep my mind off this negativity.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I break their windows.");
                  options[2]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 13; // Chaos 
                  i++;
               }
               break;             
            } 
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I break their knees.");
                  options[3]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 9; // Evil 
                  i++;
               }
               break;             
            } 
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I sneak them a gift to show I mean no ill will to them.");
                  options[4]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            } 
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I get absorbed by the work, trusting my business initiative to outdo them.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I sneak into their offices and steal their business plans.");
                  options[6]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 7: {
               while(options[7] < 1) {
                  System.out.println((i + 1) + ". I murder them in their sleep.");
                  options[7]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 9; // Evil 
                  i++;
               }
               break;             
            } 
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I show up with a keg of liquor as a show of good will.");
                  options[8]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 7; // Good 
                  i++;
               }
               break;             
            } 
            case 9: {
               while(options[9] < 1) {
                  System.out.println((i + 1) + ". I mind my own business, training my core to keep my mind off this negativity.");
                  options[9]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 10: {
               while(options[10] < 1) {
                  System.out.println((i + 1) + ". I challenge them to a fight!");
                  options[10]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". I show up with a keg of liquor as a show of good will. It's poisoned, but I've developed a tolerance.");
                  options[11]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            } 
            case 12: {
               while(options[12] < 1) {
                  System.out.println((i + 1) + ". I offer to help them make their business plan.");
                  options[12]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            } 
            case 13: {
               while(options[13] < 1) {
                  System.out.println((i + 1) + ". I file a legal complaint with the local guild.");
                  options[13]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 14: {
               while(options[14] < 1) {
                  System.out.println((i + 1) + ". I revise our business plan, hoping for a good competition.");
                  options[14]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 13; // Chaos 
                  i++;
               }
               break;             
            } 
            case 15: {
               while(options[15] < 1) {
                  System.out.println((i + 1) + ". I frame them for a heinous crime.");
                  options[15]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 9; // Evil 
                  i++;
               }
               break;             
            } 
            case 16: {
               while(options[16] < 1) {
                  System.out.println((i + 1) + ". They too must have a family to support. Whoever does best will win.");
                  options[16]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            } 
            case 17: {
               while(options[17] < 1) {
                  System.out.println((i + 1) + ". Each competitor in the market contributes to the greatness of our society. They can do as they please.");
                  options[17]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 18: {
               while(options[18] < 1) {
                  System.out.println((i + 1) + ". I keep a keen eye on how their business develops. If they have a good idea, we may wish to steal it.");
                  options[18]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 19: {
               while(options[19] < 1) {
                  System.out.println((i + 1) + ". I poison their food.");
                  options[19]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            } 
            case 20: {
               while(options[20] < 1) {
                  System.out.println((i + 1) + ". Why rivals? I try to make them my friend.");
                  options[20]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 7; // Good
                  i++;
               }
               break;             
            } 
            case 21: {
               while(options[21] < 1) {
                  System.out.println((i + 1) + ". I organize a local guild to block their unfair practices.");
                  options[21]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 11; // Law
                  i++;
               }
               break;             
            } 
            case 22: {
               while(options[22] < 1) {
                  System.out.println((i + 1) + ". I seduce their significant other.");
                  options[22]++;
                  resultiMatrix[i][0] = 5; // Cha 
                  resultiMatrix[i][1] = 13; // Chaos
                  i++;
               }
               break;             
            } 
            case 23: {
               while(options[23] < 1) {
                  System.out.println((i + 1) + ". I threaten to murder them if they don't get out of town.");
                  options[23]++;
                  resultiMatrix[i][0] = 5; // Cha 
                  resultiMatrix[i][1] = 9; // Evil
                  i++;
               }
               break;             
            }
         }
      }
   }       
}