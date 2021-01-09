import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.io.*;

public class PF2CharacterCreator {

   // d6 randomizer that accepts an exception integer, preventing one roll
   public static int rollEx1(int ex1) {
   
      int randomizee = 0;
      Random randomizer = new Random();
      
      do {
         randomizee = randomizer.nextInt(6);
      }
      while(randomizee == ex1);
       
      return randomizee;      
   }
   
   // d6 randomizer that accepts two exception integers, preventing two rolls
   public static int rollEx2(int ex1, int ex2) {
   
      int randomizee = 0;
      Random randomizer = new Random();
      
      do {
         randomizee = randomizer.nextInt(6);
      }
      while(randomizee == ex1 || randomizee == ex2);
      
      return randomizee;      
   }
   
   // Method to sort 2 specific ability scores, increase the higher one, and increase another score
   public static void sortAble2(int[][] bigStat, int opt1, int opt2, boolean isBackground) {

      int randomizee = 0;
      Random randomizer = new Random();
      int garbage = 0; // putting the return from sortAble4 here because I don't need it for this.
   
      if(bigStat[2][opt1] > bigStat[2][opt2]) {
         bigStat[1][opt1]++;
         if(isBackground) {
            garbage = sortAble4(bigStat, opt1, -1, -1);
         }
      }
      else if(bigStat[2][opt2] > bigStat[2][opt1]) {
         bigStat[1][opt2]++;
         if(isBackground) {
            garbage = sortAble4(bigStat, opt2, -1, -1);
         }
      }
      else {
         randomizee = randomizer.nextInt(2);
         if(randomizee == 0) {
            bigStat[1][opt1]++;
            if(isBackground) {
               garbage = sortAble4(bigStat, opt1, -1, -1);
            }
         }
         else {
            bigStat[1][opt2]++;
            if(isBackground) {
               garbage = sortAble4(bigStat, opt2, -1, -1);
            }
         }
      }
   }
   
   // Method to sort and increment ability scores with up to 3 exclusions
   public static int sortAble4(int[][] bigStat, int ex1, int ex2, int ex3) {
   
      int highAble = 0; // highest ability score
      int indAble = 0; // index of highest ability score
      
      int randomizee = 0;
      Random randomizer = new Random();
          
      for(int j = 0; j < 6; j++) {
         if(j == ex1 || j == ex2 || j == ex3) {
         }
         else if(bigStat[2][j] == highAble) {
            randomizee = randomizer.nextInt(2);
            if(randomizee == 0) {
               indAble = j;
            }
         }
         else if(bigStat[2][j] > highAble) {
            highAble = bigStat[2][j];
            indAble = j;
         }
         else {
         }
      }
      
      bigStat[1][indAble]++;
      return indAble;                  
   }
   
   // Method that allows the user to pick 1-6 and returns the choice
   public static int pickSix() {

      Scanner keyboard = new Scanner(System.in);

      System.out.println("What is your choice? (1-6)");
      int choice = keyboard.nextInt();
      while(choice < 1 || choice > 6) {
         System.out.println("Invalid choice. What is your choice? (1-6)");
         choice = keyboard.nextInt();
      }
      return choice;
   }
   
   // Method that takes a number and alters the bigStat
   // Skill stats are very vestigal, but would take too much effort to remove from current buckets
   // As buckets are to be reworked anyway, this code is unaltered for now
   public static void matrix(int[][] bigStat, int[] rM) {

      for(int i = 0; i < 4; i++) {
         if(rM[i] >= 0) {  
            switch(rM[i]) {
               case 0: {
                  bigStat[2][0]++; // Str
                  break;
               }
               case 1: {
                  bigStat[2][1]++; // Dex
                  break;
               }
               case 2: {
                  bigStat[2][2]++; // Con
                  break;
               }
               case 3: {
                  bigStat[2][3]++; // Int
                  break;
               }
               case 4: {
                  bigStat[2][4]++; // Wis
                  break;
               }
               case 5: {
                  bigStat[2][5]++; // Cha
                  break;
               }
               case 6: {
                  bigStat[3][0]++; // Good
                  break;
               }
               case 7: {
                  bigStat[3][0] += 2; // Good
                  break;
               }
               case 8: {
                  bigStat[3][0]--; // Evil
                  break;
               }
               case 9: {
                  bigStat[3][0] -= 2; // Evil
                  break;
               }
               case 10: {
                  bigStat[3][1]++; // Law
                  break;
               }
               case 11: {
                  bigStat[3][1] += 2; // Law
                  break;
               }
               case 12: {
                  bigStat[3][1]--; // Chaos
                  break;
               }
               case 13: {
                  bigStat[3][1] -= 2; // Chaos
                  break;
               }
               case 14: {
                  bigStat[4][0]++; // Barbarian
                  break;
               }
               case 15: {
                  bigStat[4][1]++; // Rogue
                  break;
               }
               case 16: {
                  bigStat[0][0]++; // Acrobatics
                  break;
               }
               case 17: {
                  bigStat[0][1]++; // Arcana
                  break;
               }
               case 18: {
                  bigStat[0][2]++; // Athletics
                  break;
               }
               case 19: {
                  bigStat[0][3]++; // Crafting
                  break;
               }
               case 20: {
                  bigStat[0][4]++; // Deception
                  break;
               }
               case 21: {
                  bigStat[0][5]++; // Diplomacy
                  break;
               }
               case 22: {
                  bigStat[0][6]++; // Intimidation
                  break;
               }
               case 23: {
                  bigStat[0][7]++; // Lore
                  break;
               }
               case 24: {
                  bigStat[0][8]++; // Medicine
                  break;
               }
               case 25: {
                  bigStat[0][9]++; // Nature
                  break;
               }
               case 26: {
                  bigStat[0][10]++; // Occultism
                  break;
               }
               case 27: {
                  bigStat[0][11]++; // Performance
                  break;
               }
               case 28: {
                  bigStat[0][12]++; // Religion
                  break;
               }
               case 29: {
                  bigStat[0][13]++; // Society
                  break;
               }
               case 30: {
                  bigStat[0][14]++; // Stealth
                  break;
               }
               case 31: {
                  bigStat[0][15]++; // Survival
                  break;
               }
               case 32: {
                  bigStat[0][16]++; // Thievery
                  break;
               }
               case 33: {
                  bigStat[4][3]++; // Crime
                  break;
               }
            }
         }
      }
   } 
   
   public static void main(String[] args) throws IOException {
      
      // temp storage for user's 1-6 input, and 1-100 random
      int choice;
      Random randomizer = new Random();
      int randomizee = 0;
      
      // 2D ragged array for holding all stats that need be incremented
      int[][] bigStat = {
         // Skills (sadly not part of this release)
         new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
         // Actual Ability Scores
         new int[] { 0, 0, 0, 0, 0, 0 },
         // Ability Score Preferences
         new int[] { 0, 0, 0, 0, 0, 0 },
         // Alignments
         new int[] { 0, 0 },
         // Class Innateness
         new int[] { 0, 0, 0, 0 }         
      };
      int skillNeed = 0;
      
      String[] flags = new String[16];
      int flagCount = 1;
            
      String ancestry = ""; // Racial heritage
      String socialClass = ""; // Money at birth
      String background = ""; // The path you go on in life
      String superBackground = ""; // Categorizes background for easier class placement
      String jobClass = ""; // Character's Class (not to be confused with Java class)
      String alignment1 = ""; // Character's morality
      String alignment2 = ""; // Character's ethics
      String alignmentF = ""; // Character's full alignment
      String firstName = ""; // First Name
      String lastName = ""; // Last Name
      String fileName = ""; // Combines first and last name to make file name
            
      Scanner keyboard = new Scanner(System.in);

      System.out.println("The following is a demo. It only contains the event buckets for lower class, middle class, and jobs at the moment."); 
      System.out.println();     
      System.out.println("Welcome to the character creator. Your choices will help determine the kind of character you will play.");
      System.out.println("What is your character's first name?");
      firstName = keyboard.nextLine();
      System.out.println("What is your character's last name?");
      lastName = keyboard.nextLine();
      
      
      // This determines the user's racial ancestry and their starting stats
      randomizee = randomizer.nextInt(100);
      
      if(randomizee >= 90) {
         ancestry = "Dwarf";
         bigStat[1][2]++;
         bigStat[1][4]++;
         bigStat[1][5]--;
            
         randomizee = randomizer.nextInt(4);
         switch(randomizee) {
            case 0: {
               bigStat[1][0]++;
               break;
            }
            case 1: {
               bigStat[1][1]++;
               break;
            }
            case 2: {
               bigStat[1][3]++;
               break;
               }
            case 3: {
               bigStat[1][5]++;
               break;
            }
         }
      }
      else if(randomizee >= 80)  {
         ancestry = "Elf";
         bigStat[1][1]++;
         bigStat[1][3]++;
         bigStat[1][2]--;
            
         randomizee = randomizer.nextInt(4);
         switch(randomizee) {
            case 0: {
               bigStat[1][0]++;
               break;
            }
            case 1: {
               bigStat[1][2]++;
               break;
            }
            case 2: {
               bigStat[1][4]++;
               break;
            }
            case 3: {
               bigStat[1][5]++;
               break;
            }
         }
      }
      else if(randomizee >= 70) {
         ancestry = "Gnome";
         bigStat[1][2]++;
         bigStat[1][5]++;
         bigStat[1][0]--;
            
         randomizee = randomizer.nextInt(4);
         switch(randomizee) {
            case 0: {
               bigStat[1][0]++;
               break;
            }
            case 1: {
               bigStat[1][1]++;
               break;
            }
            case 2: {
               bigStat[1][3]++;
               break;
            }
            case 3: {
               bigStat[1][4]++;
               break;
            }
         }
      }
      else if (randomizee >= 60) {
         ancestry = "Goblin";
         bigStat[1][1]++;
         bigStat[1][5]++;
         bigStat[1][4]--;
            
         randomizee = randomizer.nextInt(4);
         switch(randomizee) {
            case 0: {
               bigStat[1][0]++;
               break;
            }
            case 1: {
               bigStat[1][2]++;
               break;
            }
            case 2: {
               bigStat[1][3]++;
               break;
            }
            case 3: {
               bigStat[1][4]++;
               break;
            }
         }
      }
      else if (randomizee >= 50) {
         ancestry = "Halfling";
         bigStat[1][1]++;
         bigStat[1][4]++;
         bigStat[1][0]--;
            
         randomizee = randomizer.nextInt(4);
         switch(randomizee) {
            case 0: {
               bigStat[1][0]++;
               break;
            }
            case 1: {
               bigStat[1][2]++;
               break;
            }
            case 2: {
               bigStat[1][3]++;
               break;
            }
            case 3: {
               bigStat[1][5]++;
               break;
            }
         }
      }
      else {
         randomizee = randomizer.nextInt(6);
         bigStat[1][randomizee]++;
            
         randomizee = rollEx1(randomizee);
         bigStat[1][randomizee]++;
         if(randomizee >= 40) {
            ancestry = "Half-Elf";
         }
         else if(randomizee >= 30) {
            ancestry = "Half-Orc";
         }
         else
            ancestry = "Human";
      }
      
      skillNeed += bigStat[1][3];

      int[] genericEvents = new int[20];
      // This determines the user's social class and runs corresponding childhood events. Of course, only Middle Class is available right now.
      randomizee = randomizer.nextInt(100);      
      if (randomizee >= 70) { // TEMP CHANGE, should be 85
         socialClass = "Middle Class"; // Should be Upper Class
         System.out.println("You are " + firstName + " " + lastName + ", a person of " + ancestry + " ancestry.");
         System.out.println("You were born to two middle class parents.");
         MiddleEvents childEvents = new MiddleEvents();
         for(int a = 1; a <= 6; a++) {
            childEvents.runEvent();
            choice = pickSix();
            int[] rM = childEvents.getMatrix(choice - 1);
            matrix(bigStat, rM);
         }
         System.out.println("Seasons change and you grow into young adulthood.");
         System.out.println("It is time to figure out what you are going to do with your life.");
         background = childEvents.determineBackground();
         genericEvents = childEvents.getEvents();     
      }
// So a lot of this looks messy because I want 5 paths here and could only feasibly do 2 for the final project.
// It is kept as is because a lot of it will be utilized going forward.
//      else if (randomizee >= 50) {
//         socialClass = "Middle Class";
//         MiddleEvents childEvents = new MiddleEvents();
//      }
      else if (randomizee >= 30) {
         socialClass = "Lower Class";
         System.out.println("You are " + firstName + " " + lastName + ", a person of " + ancestry + " ancestry.");
         System.out.println("You were born to two lower class parents.");
         LowerEvents childEvents = new LowerEvents();
         for(int a = 1; a <= 6; a++) {
            childEvents.runEvent();
            choice = pickSix();
            int[] rM = childEvents.getMatrix(choice - 1);
            matrix(bigStat, rM);
         }
         System.out.println("Seasons change and you grow into young adulthood.");
         System.out.println("It is time to figure out what you are going to do with your life.");
         background = childEvents.determineBackground();
         genericEvents = childEvents.getEvents();
      }
      else if (randomizee >= 0) {
         socialClass = "Orphan";
         System.out.println("You are " + firstName + " " + lastName + ", a person of " + ancestry + " ancestry.");
         System.out.println("You have never known your parents and live on the streets.");
         BucketHandler childEvents = new BucketHandler();
         childEvents.setFile("OrphanEvents.txt");
         childEvents.setEvents();
         childEvents.setEventCounters(3, 3, skillNeed);
         childEvents.setSkills(bigStat);
         int eventCounter = 6 + skillNeed;
         while(eventCounter > 0) {
            childEvents.runEvent();
            choice = pickSix();
            int[] rM = childEvents.getMatrix(choice - 1);
            matrix(bigStat, rM);
            eventCounter--;
         }
         if(bigStat[1][4] > 0 || bigStat[0][9] > 0 || bigStat[0][15] > 0) {
            flags[flagCount] = "NAT";
            flagCount++;
         }
         System.out.println("Seasons changes and you grow into young adulthood");
         randomizee = randomizer.nextInt(10);
         if(randomizee == 0) {
            System.out.println("But try as you might, life does not improve for you. Will you be forced to survive on the streets forever?");
            background = "Street Urchin";
         }
         else {
            randomizee = randomizer.nextInt(20);
            if(randomizee == 0) {
               System.out.println("In the middle of the night, strong people tie you up and secret you away. You don't know where you are when the bag comes off of your head, but it's clear you don't have any choice but to work.");
               background = "Prisoner";
            }
            else {
               childEvents.runTransition();
               choice = pickSix();
               String backgroundT = childEvents.getBackground(choice -1);
               int crimeWatch = 0;
               if(bigStat[3][1] < 0)
                  crimeWatch -= bigStat[3][1];
               if(backgroundT.equals("Charlatan") || backgroundT.equals("Criminal") || backgroundT.equals("Gambler"))
                  crimeWatch += 3;
               randomizee = randomizer.nextInt(100) +1;
               if(randomizee < crimeWatch) {
                  System.out.println("However, it isn't long before you are caught for your crimes and put in prison.");
                  background = "Prisoner";
               }
               else
                  background = backgroundT;
            }
         }
               
      }
      else {
         socialClass = "Tribal";
         MiddleEvents childEvents = new MiddleEvents();
         bigStat[4][0] = 2; // Sets Barbarian to 2
      }

      // Determines if user is a sorcerer      
      randomizee = randomizer.nextInt(100);
      if (randomizee >= 88) {
         bigStat[4][2] = 3;
      }
      
      // Add stats depending on background
      switch(background) {
         case "Artisan": {
            sortAble2(bigStat, 0, 3, true);
            break;
         }
         case "Artist":
         case "Entertainer":
         case "Gambler": {
            sortAble2(bigStat, 1, 5, true);
            break;
         }
         case "Barrister":
         case "Merchant":
         case "Fortune Teller":
         case "Charlatan": {
            sortAble2(bigStat, 3, 5, true);
            break;
         }
         case "Scholar":
         case "Acolyte": {
            sortAble2(bigStat, 3, 4, true);
            break;
         }
         case "Tinkerer": {
            sortAble2(bigStat, 1, 3, true);
            break;
         }
         case "Acrobat":
         case "Martial Disciple": {
            sortAble2(bigStat, 0, 1, true);
            break;
         }
         case "Barkeep": {
            sortAble2(bigStat, 2, 5, true);
            break;
         }
         case "Hunter": {
            sortAble2(bigStat, 1, 4, true);
            break;
         }
         case "Laborer":
         case "Warrior": {
            sortAble2(bigStat, 0, 2, true);
            break;
         }
         case "Miner":
         case "Criminal": {
            sortAble2(bigStat, 0, 4, true);
            break;
         }
         case "Street Urchin": {
            sortAble2(bigStat, 1, 2, true);
            break;
         }
         case "Animal Whisperer": {
            sortAble2(bigStat, 4, 5, true);
            break;
         }
         case "Herbalist":
         case "Nomad": {
            sortAble2(bigStat, 2, 4, true);
            break;
         }
         case "Hermit": {
            sortAble2(bigStat, 2, 3, true);
            break;
         }
      }
      //FIX THIS
      switch(background) {
         case "Acrobat":
         case "Artisan":
         case "Artist":
         case "Barkeep":
         case "Barrister":
         case "Emissary":
         case "Entertainer":
         case "Fortune Teller":
         case "Herbalist":
         case "Hunter":
         case "Laborer":
         case "Merchant":
         case "Miner":
         case "Scholar":
         case "Tinkerer": {
            JobEvents youngEvents = new JobEvents();
            youngEvents.setBackground(background);
            youngEvents.setEvents(genericEvents);
            for(int a = 1; a <= 6; a++) {
               youngEvents.runEvent();
               choice = pickSix();
               int[] rM = youngEvents.getMatrix(choice - 1);
               matrix(bigStat, rM);
            }
            break;
         }
         default: {
            System.out.println("The " + background + " background is not currently supported.");
         }
         
      }
      
      // Alignment determiner
      if(bigStat[3][0] > 3) {
         alignment1 = "Good";
      }
      else if(bigStat[3][0] < -3) {
         alignment1 = "Evil";
      }
      else {
         alignment1 = "Neutral";
      }
      
      if(bigStat[3][1] > 3) {
         alignment2 = "Lawful";
      }
      else if(bigStat[3][1] < -3) {
         alignment2 = "Chaotic";
      }
      else {
         alignment2 = "Neutral";
      }
      
      bigStat[4][1] += bigStat [4][3];
      
      // This is for demo purposes
      randomizee = randomizer.nextInt(3);
      switch(randomizee) {
         case 0: {
            System.out.println("Growing into adulthood, you find yourself overwhelmingly bored with job life. There must be broader horizons for you.");
            break;
         }
         case 1: {
            System.out.println("Your business has failed and you find yourself penniless. It's going to take a drastic shift in focus to succeed now.");
            break;
         }
         case 2: {
            System.out.println("Your parents have been murdered. You wish to find their killers and avenge them, but you're going to need to become stronger first.");
            break;
         }
      }
      
      
      // Method to pick a class
      ArrayList<String> resultimator = new ArrayList<String>();

      int i = 1;
      
      if((bigStat[1][3] >= 1 && (socialClass.equals("Upper Class") || socialClass.equals("Middle Class") || background.equals("Field Medic")))
          || bigStat[1][3] >= 2) {
         System.out.println(i + ". I meet a potion maker and accept their offer to learn their science.");
         resultimator.add("Alchemist");
         i++;
      }      
      if(bigStat[1][0] >= 1 && bigStat[4][0] >= 1) {
         System.out.println(i + ". I cast off the shackles of society and unleash my inner rage!");
         resultimator.add("Barbarian");
         i++;
      }
      if(bigStat[1][5] >= 1) {
         System.out.println(i + ". I become an entertainer who regails others with stories of adventures I have been on.");
         resultimator.add("Bard");
         i++;
      }
      if((bigStat[1][0] >= 1 || bigStat[1][1] >= 1) && alignment1.equals("Good")) {
         System.out.println(i + ". With far too much evil in the world, I set out to undo it all as a paragon of righteousness!");
         resultimator.add("Champion");
         i++;
      }
      if((bigStat[1][4] >= 1 && (superBackground.equals("Convent") || superBackground.equals("Prison"))) || bigStat[1][4] >= 2) {
         System.out.println(i + ". I become even closer to my god by joining their priesthood.");
         resultimator.add("Cleric");
         i++;
      }
      if((bigStat[1][4] >= 1 && superBackground.equals("Nature")) || bigStat[1][4] >= 2) {
         System.out.println(i + ". I meet a mysterious outdoorsman who indoctrinates me into their secret society.");
         resultimator.add("Druid");
         i++;
      }
      if(bigStat[1][0] >= 1 || bigStat[1][1] >= 1) {
         System.out.println(i + ". I devote my time into honing my skills with weapons and strategy.");
         resultimator.add("Fighter");
         i++;
      }
      if((bigStat[1][0] >= 1 || bigStat[1][1] >= 1) && (superBackground.equals("Convent") || superBackground.equals("Prison"))
           || (bigStat[1][0] >= 1 || bigStat[1][1] >= 1) && bigStat[1][4] >= 1) {
         System.out.println(i + ". I accept a guru's advice to rid myself of earthly desires.");
         resultimator.add("Monk");
         i++;
      }
      if(bigStat[1][0] >= 1 || bigStat[1][1] >= 1) {
         System.out.println(i + ". I steal away into the wilderness, hunting game for my living.");
         resultimator.add("Ranger");
         i++;
      }
      if((bigStat[1][1] >= 1 && bigStat[4][1] >= 1) || (superBackground.equals("Crime") || superBackground.equals("Prison"))) {
         System.out.println(i + ". I make my living by going against other's expectations and society's rules.");
         resultimator.add("Rogue");
         i++;
      }
      if(bigStat[1][5] >= 1 && bigStat[4][2] == 3) {
         System.out.println(i + ". I've had strange powers as long as I can remember. I want to explore them.");
         resultimator.add("Sorcerer");
         i++;
      }
      if((bigStat[1][3] >= 1 && (socialClass.equals("Upper Class") || socialClass.equals("Middle Class") || background.equals("Fortune Teller")))
          || bigStat[1][3] >= 2) {
         System.out.println(i + ". I enroll in a school to study arcane magic.");
         resultimator.add("Wizard");
      }
      System.out.println("What is your choice? (1-" + resultimator.size() + ")");
      choice = keyboard.nextInt();
      while(choice < 1 || choice > resultimator.size()) {
         System.out.println("Invalid choice. What is your choice? (1-" + resultimator.size() + ")");
         choice = keyboard.nextInt();
      }
      jobClass = resultimator.get(choice - 1);
      
      // Character Class effects method
      switch(jobClass) {
         case "Alchemist":
         case "Wizard": {
            bigStat[1][3]++;
            break;
         }
         case "Barbarian": {
            bigStat[1][0]++;
            break;
         }
         case "Bard":
         case "Sorcerer": {
            bigStat[1][5]++;
            break;
         }
         case "Cleric":
         case "Druid": {
            bigStat[1][4]++;
            break;
         }
         case "Champion":
         case "Fighter":
         case "Ranger":
         case "Monk": {
            sortAble2(bigStat, 0, 1, false);
            break;
         }
         case "Rogue": {
            bigStat[1][1]++;
            break;
         }
      }
      
      // Adds final free ability scores
      int firstFreePick = sortAble4(bigStat, -1, -1, -1);
      int secondFreePick = sortAble4(bigStat, firstFreePick, -1, -1);
      int thirdFreePick = sortAble4(bigStat, firstFreePick, secondFreePick, -1);
      int fourthFreePick = sortAble4(bigStat, firstFreePick, secondFreePick, thirdFreePick);
       
      // Alignment combiner
      if(alignment1.equals(alignment2)) {
         alignmentF = "True Neutral";
      }
      else {
         alignmentF = (alignment2 + " " + alignment1);
      }
      
      // Method to fill out the character sheet
      System.out.println("Name: " + firstName + " " + lastName);
      System.out.println("Ancestry: " + ancestry);
      System.out.println("Class: " + jobClass);
      System.out.println("Background: " + background);
      System.out.println("Alignment: " + alignmentF);
      System.out.print("Abilities: " + (bigStat[1][0] * 2 + 10) + " STR, ");
      System.out.print((bigStat[1][1] * 2 + 10) + " DEX, ");
      System.out.print((bigStat[1][2] * 2 + 10) + " CON, ");
      System.out.print((bigStat[1][3] * 2 + 10) + " INT, ");
      System.out.print((bigStat[1][4] * 2 + 10) + " WIS, ");
      System.out.print((bigStat[1][5] * 2 + 10) + " CHA");
      
      System.out.println();
      System.out.println("Enjoy your new character and good luck!");
      System.out.println("Thank you for trying the demo. Please look forward to the final product.");
   }
}