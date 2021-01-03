import java.util.Random;
import java.util.Scanner;

public class LowerEvents {

   private String background = "";
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
   private int[] genericEventBools = new int[20];

   // This is used to prevent bucket specific events from repeating
   private int[] nonGenericEventBools = new int[6];   

   public String getBackground() {
      return background;
   }
   
   public int[] getMatrix(int choice) {
      return resultiMatrix[choice];
   }
   
   // Prevents generic events from being run twice across buckets   
   public int[] getEvents() {
   
      return genericEventBools;
   }

   // The "main" method of the bucket, picks an event to run   
   public void runEvent() {
   
      Random randomizer = new Random();
   
      int i = 0;
      while(i < 1){
         int randomizee = randomizer.nextInt(13);
         switch(randomizee) {
            case 0: {
               if(genericEventBools[0] == 0) {
                  genericEventBools[0]++;
                  i++;
                  fire();
               }
               break;
            }
            case 1: {
               if(genericEventBools[1] == 0) {
                  genericEventBools[1]++;
                  i++;
                  flood();
               }
               break;
            }
            case 2: {
               if(genericEventBools[5] == 0) {
                  genericEventBools[5]++;
                  i++;
                  yourAccident();
               }
               break;
            }    
            case 3: {
               if(genericEventBools[6] == 0) {
                  genericEventBools[6]++;
                  i++;
                  otherAccident();
               }
               break;
            }        
            case 4: {
               if(genericEventBools[9] == 0) {
                  genericEventBools[9]++;
                  i++;
                  famousRunin();
               }
               break;
            }
            case 5: {
               if(nonGenericEventBools[0] == 0) {
                  nonGenericEventBools[0]++;
                  i++;
                  rival();
               }
               break;
            }
            case 6: {
               if(genericEventBools[12] == 0) {
                  genericEventBools[12]++;
                  i++;
                  youSick();
               }
               break;
            }
            case 7: {
               if(genericEventBools[13] == 0) {
                  genericEventBools[13]++;
                  i++;
                  otherSick();
               }
               break;
            }
            case 8: {
               if(nonGenericEventBools[1] == 0) {
                  nonGenericEventBools[1]++;
                  i++;
                  rightWrong();
               }
               break;
            }
            case 9: {
               if(nonGenericEventBools[2] == 0) {
                  nonGenericEventBools[2]++;
                  i++;
                  yourFuture();
               }
               break;
            }
            case 10: {
               if(nonGenericEventBools[3] == 0) {
                  nonGenericEventBools[3]++;
                  i++;
                  bully();
               }
               break;
            }
            case 11: {
               if(nonGenericEventBools[4] == 0) {
                  nonGenericEventBools[4]++;
                  i++;
                  hobby();
               }
               break;
            }
            case 12: {
               i++;
               freeDay();
            }
         }
      }
   }
   
   public void fire() { // Event 0, Generic 0
      
      int[] options = new int[17];
      Random randomizer = new Random();
      
      System.out.println("A spark from the cooking fire catches on the mat and your parents aren't around.");
      
      int i = 0;
      while(i <= 5){
         int randomizee = randomizer.nextInt(17);
         switch(randomizee) {
            case 0: {
               while(options[0] < 1) {
                  System.out.println((i + 1) + ". I jump through the window and run outside to save myself.");
                  options[0]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 16; // Acro
                  i++;
               }
               break;             
            }  
            case 1: {
               while(options[1] < 1) {
                  System.out.println((i + 1) + ". I'm fascinated by the fire and carefully study it.");
                  options[1]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 17; // Arcana
                  i++;
               }
               break;
            }
            case 2: {
               while(options[2] < 1) {
                  System.out.println((i + 1) + ". I lift a barrel of drinking water and throw it onto the rug.");
                  options[2]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 14; // Barb
                  resultiMatrix[i][2] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 3: {
               while(options[3] < 1) {
                  System.out.println((i + 1) + ". I run as far and fast as I can to find and alert my parents.");
                  options[3]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 4: {
               while(options[4] < 1) {
                  System.out.println((i + 1) + ". I consider which local authority I could go to for aid.");
                  options[4]++;
                  resultiMatrix[i][0] = 4; // Int
                  resultiMatrix[i][1] = 29; // Society
                  i++;
               }
               break;
            }
            case 5: {
               while(options[5] < 1) {
                  System.out.println((i + 1) + ". I plead with the nearest adult outside to help me with the fire.");
                  options[5]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 6: {
               while(options[6] < 1) {
                  System.out.println((i + 1) + ". I threaten to throw a rock through my neighbor's window if they don't help me.");
                  options[6]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 22; // Intimidate
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 7: { // Removed case
               break;
            }
            case 8: {
               while(options[8] < 1) {
                  System.out.println((i + 1) + ". I'm badly burned in my attempt to throw the mat outside, but I know how to use herbal medicine.");
                  options[8]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 9: {
               while(options[9] < 1) {
                  System.out.println((i + 1) + ". We don't have a lot to lose in a fire anyway.");
                  options[9]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 10: {
               while(options[10] < 1) {
                  System.out.println((i + 1) + ". Huzzah! My ritual of malice has come to fruition! All other mortals will bow before the firebringer in time!");
                  options[10]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 26; // Occultism
                  i++;
               }
               break;
            }
            case 11: {
               while(options[11] < 1) {
                  System.out.println((i + 1) + ". I sneak away, hoping not to be blamed for this.");
                  options[11]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 30; // Stealth
                  i++;
               }
               break;
            }
            case 12: {
               while(options[12] < 1) {
                  System.out.println((i + 1) + ". I carry my sibling out of the house.");
                  options[12]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 13: {
               break;
               
            }
            case 14: {
               while(options[14] < 1) {
                  System.out.println((i + 1) + ". I secretly set my neighbor's house on fire to get the attention of the fire brigade.");
                  options[14]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 30; // Stealth
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 15: {
               while(options[15] < 1) {
                  System.out.println((i + 1) + ". Protected by my only blanket, I leap onto the fire to smother it.");
                  options[15]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 31; // Survival
                  i++;
               }
               break;
            }
            case 16: {
               while(options[16] < 1) {
                  System.out.println((i + 1) + ". I calmly kneel and pray to my god for help.");
                  options[16]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 28; // Religion
                  i++;
               }
               break;
            }
         }      
      }  
   }
   
   public void flood() { // Event 1, Generic 1
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("Prolonged heavy rains are flooding the neighborhood. Everyone is working hard to pack up their things and protect their homes.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(11);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I swim through the water until I reach high ground.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". Things are bound to go missing during the move. I know something another kid has that I might want...");
                  options[1]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 32; // Thievery
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I help my neighbors with their things and carry weight for two on my shoulders.");
                  options[2]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". Sounds fun. I use an old broken table to make a raft.");
                  options[3]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 19; // Crafting
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I sacrifice a stray cat to any entity willing to help.");
                  options[4]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 26; // Occultism
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I calm the neighborhood dog.");
                  options[5]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 25; // Nature
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I collect some healing herbs, as we don't know who will be injured.");
                  options[6]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I gather as many kids as possible so that a headcount can be made.");
                  options[7]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I pretend to have hurt my leg, thus getting out of helping.");
                  options[8]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 20; // Deception
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I find a bunch of stacked crates to stay out of the flood. When other kids try to crowd onto them, I push them away. \"These are my crates!\" I bellow.");
                  options[9]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 14; // Barb
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I throw a tantrum and run away. I barely survive being swept away.");
                  options[10]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 12; // Chaos
                  i++;
               }
               break;
            }
         }    
      }
   }
   
   public void yourAccident() { // Event 2, Generic 5
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
     
      System.out.println("You are playing on carts with a group of kids when you roll down a steep hill and crash, hurting your knee.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(14);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I push the remains of the cart off of myself. ");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". My injuries might have been worse, but I jumped off at the last minute.");
                  options[1]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 16; // Acro
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". Not only was that fun, now I can brag about a fresh injury!");
                  options[2]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 14; // Barb
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I could learn from this if I ever need to drive horse carts when I'm older.");
                  options[3]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 23; // Lore
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I better find a healer's kit.");
                  options[4]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". Finding myself stuck under the broken cart, I call for help.");
                  options[5]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". When my parent's ask how I hurt myself, I lie to cover for my friends.");
                  options[6]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 20; // Deception
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". When a guard comes to help, I lie and say my friend forced me to do it.");
                  options[7]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 20; // Deception
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". Others might have learned not to ride carts down hills. I learned to make better carts.");
                  options[8]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 19; // Crafting
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". And what's worse, this wasn't even my cart.");
                  options[9]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 32; // Thievery
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I lift up what remains of the cart and angrily launch them at the kid who pushed me down the hill.");
                  options[10]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 14; // Barb
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". I carry the remains of the cart back to its owner and apologize profusely.");
                  options[11]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 12: {
               if(options[12] == 0) {
                  System.out.println((i + 1) + ". I only hit the wall because I veered out of the way of a neighborhood cat, so I'm not too bothered.");
                  options[12]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 25; // Nature
                  i++;
               }
               break;
            }
            case 13: {
               if(options[13] == 0) {
                  System.out.println((i + 1) + ". I'm worried that I broke a law. I'll check with a guard.");
                  options[13]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 29; // Society
                  i++;
               }
               break;
            }
         }
      }        
   }
   
   public void otherAccident() { // Event 3, Generic 6
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
      
      System.out.println("You are playfighting with your friend when your wooden sword cuts them on the arm.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(11);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I press the advantage, hitting them as hard as I can!");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 14; // Barb
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I carry them on my back to their house.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". \"Hit me as hard as you can\" I say to them. It's only fair.");
                  options[2]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 14; // Barb
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I run away.");
                  options[3]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I'm just a kid, it's not like I'll get in trouble or anything.");
                  options[4]++;
                  resultiMatrix[i][0] = 3; // Int 
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 29; // Society
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I throw the sword over a nearby fence, getting rid of the evidence.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 15; // Rogue
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I tear off part of my shirt to dress their wound, like I saw a soldier do once.");
                  options[6]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". \"If you tell on me\" I threathen, \"I'll do worse.\"");
                  options[7]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 22; // Intimidate
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I drop to my knees and cry, asking that they don't tell on me.");
                  options[8]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I apologize and ask them for their forgiveness.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I find the closest guard and tell them what happened.");
                  options[10]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 29; // Society
                  i++;
               }
               break;
            }
         }
      }          
   }
   
   public void famousRunin() { // Event 4, Generic 9
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("At the farmer's market, you bump into a local crime lord, who smiles at you and pats your head.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(12);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I curiously ask them some questions about their organization.");
                  options[0]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 29; // Society
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I try to impress them by chugging a nearby mug of mead.");
                  options[1]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 14; // Barb
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I try to impress them by lifting a whole table.");
                  options[2]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I try to impress them by running a lap as fast as I can. I can't find them by the time I get back.");
                  options[3]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". My parents are mortified as I yell, \"Rawr!\" and punch them below the belt.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 14; // Barb
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". As they turn away, I see what they might have in their pockets.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 32; // Thievery
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I tell them that I've been a good child for my parents' sake.");
                  options[6]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I ask them which god they follow.");
                  options[7]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 28; // Religion
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I show off my the brilliant face-painting job I did all by myself.");
                  options[8]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 20; // Deception
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I toss up a thief sign.");
                  options[9]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 13; // Chaos
                  resultiMatrix[i][2] = 26; // Occult
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I later slip some laxative into their drink. This should be funny.");
                  options[10]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 24; // Medicine
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". I try to impress them by doing a somersault.");
                  options[11]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 16; // Acro
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void rival() { // Event 5, Non 0
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("The mean kid down the street throws a firecracker through your window.");
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(16);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I challenge them to a duel. The loser becomes the winner's servant.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I challenge them to arm wrestle.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I sneak up on them and hit them in shins with a club.");
                  options[2]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 30; // Stealth
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I hide behind some boxes and push them ontop of them when they pass by.");
                  options[3]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 30; // Stealth
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I challenge them to a slingshot contest.");
                  options[4]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I steal their only toy.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 32; // Thievery
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I pray for them to learn to be a better person.");
                  options[6]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 28; // Religion
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I pray for them to get hurt.");
                  options[7]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 28; // Religion
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I give them a gift and try to become friends.");
                  options[8]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I turn the other cheek.");
                  options[9]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I challenge them to a sit-ups contests.");
                  options[10]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". I can build even better fireworks and return the favor.");
                  options[11]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 19; // Crafting
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 12: {
               if(options[12] == 0) {
                  System.out.println((i + 1) + ". I find evidence and report them to a guard.");
                  options[12]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 23; // Lore
                  i++;
               }
               break;
            }
            case 13: {
               if(options[13] == 0) {
                  System.out.println((i + 1) + ". I know the kid who they got the firecracker from. I bully them into confessing to the guard.");
                  options[13]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 22; // Intimidate
                  i++;
               }
               break;
            }
            case 14: {
               if(options[14] == 0) {
                  System.out.println((i + 1) + ". I challenge them to a dance contest.");
                  options[14]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 27; // Performance
                  i++;
               }
               break;
            }
            case 15: {
               if(options[15] == 0) {
                  System.out.println((i + 1) + ". I make a voodoo doll in their likeness.");
                  options[15]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 26; // Occultism
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void youSick() { // Event 6, Generic 12
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("You become very ill for the first time in your life.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(11);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". Ill? I feel completely fine.");
                  options[0]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". Thinking it's the end, I apologize to my parents for all the times I've lied to them. ");
                  options[1]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 20; // Deception
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I vow to sell my soul to whatever entity will save my life.");
                  options[2]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 26; // Occult
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I use a traditional family medicine to ease my symptoms.");
                  options[3]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I use an alternative medicine to easy my symptoms.");
                  options[4]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I promise to be a good kid from now on if my god helps me through this.");
                  options[5]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 28; // Religion
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". Thinking it's the end, I apologize to my parents for having stolen copper from them once.");
                  options[6]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 32; // Thievery
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I go for a swim to keep the fever down.");
                  options[7]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I cough in a napkin and save it for later. There's a kid I need to get back at.");
                  options[8]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 19; // Crafting
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I hate being cooped up at home, so I sneak out.");
                  options[9]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 30; // Stealth
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". Knowing better, I ask my parents if we can afford any healing magic.");
                  options[10]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 17; // Arcana
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void otherSick() { // Event 7, Generic 13
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("Your friend down the road is ill.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(14);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I sit by their bedside and hold their hand.");
                  options[0]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I create a remedy for their health.");
                  options[1]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". Fearing for them, I apologize for all the times I lied to them.");
                  options[2]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 20; // Deception
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". We probably shouldn't have stayed out all night goofing off.");
                  options[3]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". Fearing for them, I apologize for the time I borrowed their toy without asking.");
                  options[4]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 6; // Good
                  resultiMatrix[i][2] = 32; // Thievery
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". They helped me out recently, so it's only fair that I return the favor by making some feel-good food for them.");
                  options[5]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 19; // Craft
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I cook up some feel-good food for them.");
                  options[6]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 10; // Good
                  resultiMatrix[i][2] = 19; // Craft
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". That's too bad. I avoid them so I don't get sick either.");
                  options[7]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". Illness fascinates me. I observe them as they get better.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I offer to carry them to a doctor.");
                  options[9]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 6; // Good
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I attend a community religious mass and pray for them.");
                  options[10]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 10; // Law
                  resultiMatrix[i][2] = 28; // Religion
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". I sacrifice a neighborhood cat for their health.");
                  options[11]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 26; // Occult
                  resultiMatrix[i][3] = 33; // Crime
                  i++;
               }
               break;
            }
            case 12: {
               if(options[12] == 0) {
                  System.out.println((i + 1) + ". I want to play some more. I sneak them out of bed.");
                  options[12]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 30; // Stealth
                  i++;
               }
               break;
            }
            case 13: {
               if(options[13] == 0) {
                  System.out.println((i + 1) + ". I tell them that I hope they get better, but I honestly don't care.");
                  options[13]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 8; // Evil
                  resultiMatrix[i][2] = 20; // Deception
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void rightWrong() { // Event 8, Non 1
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, };
      Random randomizer = new Random();
   
      System.out.println("After you accidentally send a ball through a shop window, the store owner asks \"Didn't your parents ever teach you right from wrong?\"");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". \"Uh, yeah, but it was an accident.\"");
                  options[0]++;
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". \"I'm really sorry. I hope you can forgive me.\"");
                  options[1]++;
                  resultiMatrix[i][0] = 6; // Good
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". \"Why are you hassling me?\"");
                  options[2]++;
                  resultiMatrix[i][0] = 8; // Evil
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". \"I wasn't doing anything wrong, just playing.\"");
                  options[3]++;
                  resultiMatrix[i][0] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". \"I don't know if my parents can pay for it.\"");
                  options[4]++;
                  resultiMatrix[i][0] = 10; // Law
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". \"How can I make this up to you? I could work in your store for free.\"");
                  options[5]++;
                  resultiMatrix[i][0] = 6; // Good
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". \"What are you going to do, tell a guard? You'll never find me again.\"");
                  options[6]++;
                  resultiMatrix[i][0] = 8; // Evil
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". \"Would you like to play a game of ball with me?\"");
                  options[7]++;
                  resultiMatrix[i][0] = 6; // Good
                  resultiMatrix[i][1] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I throw the ball through another window and use the opportunity to run away.");
                  options[8]++;
                  resultiMatrix[i][0] = 8; // Evil
                  resultiMatrix[i][1] = 12; // Chaos
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void yourFuture() { // Event 9, Non 2
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, };
      Random randomizer = new Random();
   
      System.out.println("After taking an interest in where your parents work for the first time, they ask you how you want to live your life when you grow up.");
      
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". \"Uh, I don't know. I'm just a kid.\"");
                  options[0]++;
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". \"I want to be a hero who saves others!\"");
                  options[1]++;
                  resultiMatrix[i][0] = 6; // Good
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". \"Shouldn't I carry on the family business?\"");
                  options[2]++;
                  resultiMatrix[i][0] = 10; // Law
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". \"Whatever gets me filthy rich.\"");
                  options[3]++;
                  resultiMatrix[i][0] = 8; // Evil
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". \"Work sounds boring. I just want to have fun forever.\"");
                  options[4]++;
                  resultiMatrix[i][0] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". \"I want to help our community through charity.\"");
                  options[5]++;
                  resultiMatrix[i][0] = 6; // Good
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". \"I want to go on heroic adventures!\"");
                  options[6]++;
                  resultiMatrix[i][0] = 6; // Good
                  resultiMatrix[i][1] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". \"I'm going to make our family rich.\"");
                  options[7]++;
                  resultiMatrix[i][0] = 8; // Evil
                  resultiMatrix[i][1] = 10; // Law
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". \"I'm going to conquer the world!\"");
                  options[8]++;
                  resultiMatrix[i][0] = 8; // Evil
                  resultiMatrix[i][1] = 12; // Chaos
                  resultiMatrix[i][2] = 14; // Barb
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void bully() { // Event 10, Non 3
   
      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("You hear a kid on the street talking behind your back, proclaiming that they are better than you in every way.");
     
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(12);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". \"You want to say that to my face? I'll beat the stuffing out of you.\"");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 14; // Barb
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". \"Oh yeah? Who can do more push-ups?\"");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I sneak him a note, \"I heard what you said twitlord.\"");
                  options[2]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 15; // Rogue
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". \"Oh yeah? I bet you can't beat me at ring toss.\"");
                  options[3]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". \"Oh yeah? Who can do more sit-ups?\"");
                  options[4]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". Who cares. Nothing they can do can hurt me. ");
                  options[5]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". \"Like I should care what an idiot like you thinks.\"");
                  options[6]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". \"Says the bozo who can't even read.\"");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". \"Oh yeah? But you can't beat me at a game of hide and seek.\"");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I refuse to be a part of anything so childish.");
                  options[9]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". \"Okay buster, too cowardly to talk about me to my face? Please, we all know who is at the bottom here.\"");
                  options[10]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". \"Why would you say these things about me? I've done nothing to you. Shouldn't we be friends?\"");
                  options[11]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
         }
      }    
   }
   
   public void hobby() {

      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("With what little free time you have, you're thinking about starting a hobby.");
     
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(12);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I get involved in a neighborhood sport.");
                  options[0]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I join a sparring group.");
                  options[1]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I get good at climbing across rooftops.");
                  options[2]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I start working on projects with my hands.");
                  options[3]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". Actually, it might be better if I find work.");
                  options[4]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I go jogging for fun.");
                  options[5]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I start a collection of borrowed books.");
                  options[6]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;
            }
            case 7: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I study for my future.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  i++;
               }
               break;
            }
            case 8: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I find a stray and take them in.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 9: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I get to know the city by watching people. ");
                  options[9]++;
                  resultiMatrix[i][0] = 4; // Wis
                  i++;
               }
               break;
            }
            case 10: {
               if(options[10] == 0) {
                  System.out.println((i + 1) + ". I start a neighborhood club.");
                  options[10]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
            case 11: {
               if(options[11] == 0) {
                  System.out.println((i + 1) + ". I get to know strangers.");
                  options[11]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
         }
      }  
   }
   
   public void freeDay() {

      int[] options = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
      Random randomizer = new Random();
   
      System.out.println("You have nothing to do today. How do you spend your time?");
     
      int i = 0;
      while(i <= 5) {
         int randomizee = randomizer.nextInt(36);
         switch(randomizee) {
            case 0: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I find a neighbor in need of help.");
                  options[0]++;
                  resultiMatrix[i][0] = 6; // Good
                  i++;
               }
               break;
            }
            case 1: {
               if(options[0] == 0) {
                  System.out.println((i + 1) + ". I do something nice for a friend.");
                  options[0]++;
                  resultiMatrix[i][0] = 6; // Good
                  i++;
               }
               break;
            }
            case 2: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I ask my parents if there are any chores for me to do.");
                  options[1]++;
                  resultiMatrix[i][0] = 10; // Law
                  i++;
               }
               break;
            }
            case 3: {
               if(options[1] == 0) {
                  System.out.println((i + 1) + ". I hang around the adults on my street.");
                  options[1]++;
                  resultiMatrix[i][0] = 10; // Law
                  i++;
               }
               break;
            }
            case 4: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I play pranks on other kids.");
                  options[2]++;
                  resultiMatrix[i][0] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 5: {
               if(options[2] == 0) {
                  System.out.println((i + 1) + ". I goof off.");
                  options[2]++;
                  resultiMatrix[i][0] = 12; // Chaos
                  i++;
               }
               break;
            }
            case 6: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I find someone weak to bully.");
                  options[3]++;
                  resultiMatrix[i][0] = 8; // Evil
                  i++;
               }
               break;
            }
            case 7: {
               if(options[3] == 0) {
                  System.out.println((i + 1) + ". I make plans to get back at kids who have wronged me.");
                  options[3]++;
                  resultiMatrix[i][0] = 8; // Evil
                  i++;
               }
               break;
            }
            case 8: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I practice my long jump.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 9: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I wrestle with another kid.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 10: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I lift buckets of water to build my muscle.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 11: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I practice swings with my wooden sword.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 12: {
               if(options[4] == 0) {
                  System.out.println((i + 1) + ". I spar with another kid.");
                  options[4]++;
                  resultiMatrix[i][0] = 0; // Str
                  i++;
               }
               break;
            }
            case 13: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I practice tumbling.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 16; // Acro
                  i++;
               }
               break;
            }
            case 14: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I sneak out of the house.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 30; // Stealth
                  i++;
               }
               break;
            }
            case 15: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I try opening a toy puzzle.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  resultiMatrix[i][1] = 32; // Thievery
                  i++;
               }
               break;
            }
            case 16: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I do target practice with my slingshot.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 17: {
               if(options[5] == 0) {
                  System.out.println((i + 1) + ". I play a ball game.");
                  options[5]++;
                  resultiMatrix[i][0] = 1; // Dex
                  i++;
               }
               break;
            }
            case 18: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I go swimming.");
                  options[6]++;
                  resultiMatrix[i][0] = 2; // Con
                  resultiMatrix[i][1] = 18; // Athletics
                  i++;
               }
               break;
            }
            case 19: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I spend the day working my core.");
                  options[6]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 20: {
               if(options[6] == 0) {
                  System.out.println((i + 1) + ". I work for some spare change.");
                  options[6]++;
                  resultiMatrix[i][0] = 2; // Con
                  i++;
               }
               break;
            }
            case 21: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I read a book about magic.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 17; // Arcana
                  i++;
               }
               break;
            }
            case 22: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I build something.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 19; // Craft
                  i++;
               }
               break;
            }
            case 23: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I learn something new.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 23; // Lore
                  i++;
               }
               break;
            }
            case 24: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I read a book about secret societies.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 26; // Occult
                  i++;
               }
               break;
            }
            case 25: {
               if(options[7] == 0) {
                  System.out.println((i + 1) + ". I read a book about the city I live in.");
                  options[7]++;
                  resultiMatrix[i][0] = 3; // Int
                  resultiMatrix[i][1] = 29; // Society
                  i++;
               }
               break;
            }
            case 26: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I read a book about the body.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 24; // Medicine
                  i++;
               }
               break;
            }
            case 27: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I start a garden.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 25; // Nature
                  i++;
               }
               break;
            }
            case 28: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I go to the house of my god.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][1] = 28; // Religion
                  i++;
               }
               break;
            }
            case 29: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I go camping.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; // Wis
                  resultiMatrix[i][0] = 31; // Survival
                  i++;
               }
               break;
            }
            case 30: {
               if(options[8] == 0) {
                  System.out.println((i + 1) + ". I people watch.");
                  options[8]++;
                  resultiMatrix[i][0] = 4; //
                  i++;
               }
               break;
            }
            case 31: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I experiment with make-up.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 20; // Deception
                  i++;
               }
               break;
            }
            case 32: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I make scary faces in the mirror.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 22; // Intimidate
                  i++;
               }
               break;
            }
            case 33: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I try to make new friends.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 21; // Diplomacy
                  i++;
               }
               break;
            }
            case 34: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I play an instrument.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  resultiMatrix[i][1] = 27; // Performance
                  i++;
               }
               break;
            }
            case 35: {
               if(options[9] == 0) {
                  System.out.println((i + 1) + ". I spend the day looking at myself in the mirror.");
                  options[9]++;
                  resultiMatrix[i][0] = 5; // Cha
                  i++;
               }
               break;
            }
         }
      }
   }

   // Allows the player to choose a background from a random list
   public String determineBackground() {
   
      String background = "";
      Random randomizer = new Random();
      int randomizee = 0;
      
      // Note, there should be a lot more options here, but for demo purposes, only job events will be ready
      int[] options = { 0, 0, 0, 0, 0, 0, 0 };
      int[] resultinator = { 0, 0, 7 };
      
      String artisanType = "";
      randomizee = randomizer.nextInt(3);
      switch(randomizee) {
         case 0: {
            artisanType = "blacksmith";
            break;
         }
         case 1: {
            artisanType = "tailor";
            break;
         }
         case 2: {
            artisanType = "shipwright";
            break;
         }
      }
      
      String entertainerType = "";
      randomizee = randomizer.nextInt(4);
      switch(randomizee) {
         case 0: {
            entertainerType = "n actor";
            break;
         }
         case 1: {
            entertainerType = " dancer";
            break;
         }
         case 2: {
            entertainerType = " musician";
            break;
         }
         case 3: {
            entertainerType = " street magician";
            break;
         }
      }
      
      int i = 0;
      while(i < 2) {
         randomizee = randomizer.nextInt(7);
         switch(randomizee) {
            case 0: {         
               if(options[0] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a " + artisanType + ".");
                  }
                  else {
                     System.out.println((i + 1) + ". You know a " + artisanType + " that might take you as an apprentice.");
                  }
                  resultinator[i] = 0;
                  options[0]++;
                  i++;
               }
               break;
            }
            case 1: {
               if(options[1] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as an acrobat.");
                  }
                  else {
                     System.out.println((i + 1) + ". You know an acrobat that might take you as an apprentice.");
                  }
                  resultinator[i] = 1;
                  options[1]++;
                  i++;
               }
               break;
            }
            case 2: {
               if(options[2] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a barkeep.");
                  }
                  else {
                     System.out.println((i + 1) + ". It's cheap work, but you know that a bar that is hiring.");
                  }
                  resultinator[i] = 2;
                  options[2]++;
                  i++;
               }
               break;
            }
            case 3: {
               if(options[3] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a" + entertainerType + ".");
                  }
                  else {
                     System.out.println((i + 1) + ". You know a" + entertainerType + " that might take you as an apprentice.");
                  }
                  resultinator[i] = 3;
                  options[3]++;
                  i++;
               }
               break;
            }
            case 4: {
               if(options[4] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a fortune teller.");
                  }
                  else {
                     System.out.println((i + 1) + ". You know a fortune teller that might take you as an apprentice.");
                  }
                  resultinator[i] = 4;
                  options[4]++;
                  i++;
               }
               break;
            }
            case 5: {
               if(options[5] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a hunter.");
                  }
                  else {
                     System.out.println((i + 1) + ". You know a hunter that might take you as an apprentice.");
                  }
                  resultinator[i] = 5;
                  options[5]++;
                  i++;
               }
               break;
            }
            case 6: {
               if(options[6] == 0) {
                  if(i == 0) {
                     System.out.println("1. You follow in your parent's footsteps as a miner.");
                  }
                  else {
                     System.out.println((i + 1) + ". It's dangerous work, but you know that a mine that is hiring.");
                  }
                  resultinator[i] = 6;
                  options[6]++;
                  i++;
               }
               break;
            }
         }  
      }
      while(i == 2) {
         System.out.println("3. You don't have many other options. You'll have to look for odd jobs wherever they can be found.");
         i++;
      }
   
      Scanner keyboard = new Scanner(System.in);

      System.out.println("What is your choice? (1-3)");
      int choice = keyboard.nextInt();
      while(choice < 1 || choice > 3) {
         System.out.println("Invalid choice. What is your choice? (1-3)");
         choice = keyboard.nextInt();
      }
      
      switch(resultinator[choice - 1]) {
         case 0: {
            background = "Artisan";
            break;
         }
         case 1: {
            background = "Acrobat";
            break;
         }
         case 2: {
            background = "Barkeep";
            break;
         }
         case 3: {
            background = "Entertainer";
            break;
         }
         case 4: {
            background = "Fortune Teller";
            break;
         }
         case 5: {
            background = "Hunter";
            break;
         }
         case 6: {
            background = "Miner";
            break;
         }
         case 7: {
            background = "Laborer";
            break;
         }
      }   
        
      return background;   
   }

}