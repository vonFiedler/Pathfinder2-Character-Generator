import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;

public class Ancestry {

   private String ancestry = ""; public String getAncestry(){return ancestry;}
   private String heritage = ""; public String getHeritage(){return heritage;}
   private int hitPoints; public int getHP(){return hitPoints;}
   private String size = ""; public String getSize(){return size;}
   private int speed; public int getSpeed(){return speed;}
   private String vision = ""; public String getVision(){return vision;}
   
   private String feat1 = ""; public String getFeat1(){return feat1;}
   private String feat2 = ""; public String getFeat2(){return feat2;}
   
   private int flagCount = 0;
   private String flag1 = ""; public String getFlag1(){return flag1;}
   private String flag2 = ""; public String getFlag2(){return flag2;}
   
   private String abilityType = ""; public String getAbilityType(){return abilityType;}
   private int[] abilities = new int[3]; public int[] getAbilities(){return abilities;}
   
   private boolean alternateHeritage = false;
   private String socialClass = "";
   
   private boolean isSorcerer = false; public boolean getSorcerer(){return isSorcerer;}
   private String bloodline = ""; public String getBloodline(){return bloodline;}
   private String cantrip1 = ""; public String getCantrip1(){return cantrip1;}
   private String cantrip2 = ""; public String getCantrip2(){return cantrip2;}
   
   private int[] bigStart = new int[34]; public int[] getStart(){return bigStart;}
   
   private String[] dwarfLanguages = { "Gnomish", "Goblin", "Jotun", "Orcish", "Terran", "Undercommon" };
   private String[] elfLanguages = { "Celestial", "Draconic", "Gnoll", "Gnomish", "Goblin", "Orcish", "Sylvan" };
   private String[] gnomeLanguages = { "Draconic", "Dwarven", "Elven", "Goblin", "Jotun", "Orcish" };
   private String[] goblinLanguages = { "Draconic", "Dwarven", "Gnoll", "Gnomish", "Halfling", "Orcish" };
   private String[] halflingLanguages = { "Dwarven", "Elven", "Gnomish", "Goblin" };
   private String[] humanLanguages = { "Draconic", "Dwarven", "Elven", "Gnomish", "Goblin", "Halfling", "Jotun", "Orcish", "Sylvan", "Undercommon" };
   private String[] halfelfLanguages = { "Celestial", "Draconic", "Dwarven", "Elven", "Gnomish", "Goblin", "Halfling", "Jotun", "Orcish", "Sylvan", "Undercommon" };
   private String[] halforcLanguages = { "Draconic", "Dwarven", "Elven", "Gnomish", "Goblin", "Halfling", "Jotun", "Orcish", "Sylvan", "Terran", "Undercommon" };
   private String[] allLanguages = { "Draconic", "Dwarven", "Elven", "Gnomish", "Goblin", "Halfling", "Jotun", "Orcish", "Sylvan", "Undercommon", "Abyssal", "Aklo", "Aquan", "Auran", "Celestial", "Gnoll", "Hallit", "Ignan", "Infernal", "Kelish", "Mwangi", "Necril", "Osiriani", "Shadowtongue", "Shoanti", "Skald", "Terran", "Tien", "Varisian", "Vudrani" };
   
   private ArrayList<String> languages = new ArrayList<String>();
   
   private void flagHandler(String temp) {
   
      if(flagCount == 0) {
         flag1 = temp;
         flagCount++; }
      if(flagCount == 1) {
         flag2 = temp; }
   }      
   
   public void determineAncestry() {
      
      Random randomizer = new Random();
      int randomizee = randomizer.nextInt(10);
      switch(randomizee) {
         case 9: {
            setDwarf();
            break; }
         case 8: {
            setElf();
            break; }
         case 7: {
            setGnome();
            break; }
         case 6: {
            setGoblin();
            break; }
         case 5: {
            setHalfling();
            break; }
         case 4: {
            heritage = "Half-Elf";
            alternateHeritage = true;
            setHuman();
            break; }
         case 3: {
            heritage = "Half-Orc";
            alternateHeritage = true;
            setHuman();
            break; }
         default: {
            setHuman();
            break; }
      }
      if(cantrip1.equals("Summon Instrument"))
         flagHandler("PerfBias");
   }
   
   private void sorcererCheck(int chance, String bias) {
   
      Random randomizer = new Random();
      int randomizee = randomizer.nextInt(chance);
      if(randomizee == 0) {
         isSorcerer = true;
         if(bloodline.isEmpty()) {
            switch(bias) {
               case "Any":  {
                  String[] bloodlineList = { "Aberrant", "Angelic", "Demonic", "Diabolic", "Draconic", "Elemental", "Fey", "Hag", "Imperial", "Undead" };
                  randomizee = randomizer.nextInt(10);
                  bloodline = bloodlineList[randomizee];
                  break; }
               case "Fey": {
                  bloodline = "Fey";
                  break; }
               case "Arcane": {
                  String[] bloodlineList = { "Draconic", "Imperial" };
                  randomizee = randomizer.nextInt(2);
                  bloodline = bloodlineList[randomizee];
                  break; }
               case "Divine": {
                  String[] bloodlineList = { "Angelic", "Demonic", "Diabolic", "Undead" };
                  randomizee = randomizer.nextInt(4);
                  bloodline = bloodlineList[randomizee];
                  break; }
               case "Occult": {
                  String[] bloodlineList = { "Aberrant", "Hag" };
                  randomizee = randomizer.nextInt(2);
                  bloodline = bloodlineList[randomizee];
                  break; }
               case "Primal": {
                  String[] bloodlineList = { "Elemental", "Fey" };
                  randomizee = randomizer.nextInt(2);
                  bloodline = bloodlineList[randomizee];
                  break; }
               case "MaybeImperial": {
                  randomizee = randomizer.nextInt(2);
                  if(randomizee == 0)
                     bloodline = "Imperial";
                  else {
                     String[] bloodlineList = { "Aberrant", "Angelic", "Demonic", "Diabolic", "Draconic", "Elemental", "Fey", "Hag", "Imperial", "Undead" };
                     randomizee = randomizer.nextInt(10);
                     bloodline = bloodlineList[randomizee]; }
                  break; } } } }                                    
   }         
   
   private ArrayList languagesFinal(int intelligence) {
      
      Random randomizer = new Random();
      int i = intelligence;
      while(i > 0) {
         if(ancestry.equals("Dwarf")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(dwarfLanguages[randomizee])) {
               languages.add(dwarfLanguages[randomizee]);
               i--; } }
         else if(ancestry.equals("Elf")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(elfLanguages[randomizee])) {
               languages.add(elfLanguages[randomizee]);
               i--; } }
         else if(ancestry.equals("Gnome")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(gnomeLanguages[randomizee])) {
               languages.add(gnomeLanguages[randomizee]);
               i--; } }  
         else if(ancestry.equals("Goblin")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(goblinLanguages[randomizee])) {
               languages.add(goblinLanguages[randomizee]);
               i--; } }   
         else if(ancestry.equals("Halfling")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(halflingLanguages[randomizee])) {
               languages.add(halflingLanguages[randomizee]);
               i--; } }
         else if(ancestry.equals("Human") && heritage.equals("Half-Elf")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(halfelfLanguages[randomizee])) {
               languages.add(halfelfLanguages[randomizee]);
               i--; } }   
         else if(ancestry.equals("Human") && heritage.equals("Half-Orc")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(halforcLanguages[randomizee])) {
               languages.add(halforcLanguages[randomizee]);
               i--; } }
         else if(ancestry.equals("Human")) {
            int randomizee = randomizer.nextInt(6);
            if(!languages.contains(humanLanguages[randomizee])) {
               languages.add(humanLanguages[randomizee]);
               i--; } }
      }
      Collections.sort(languages);
      return languages;
   }                 
            
      

   private void setDwarf() {
      
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Dwarf"; hitPoints = 10; size = "Medium"; speed = 20; vision = "Darkvision";
      abilityType = "Complex"; abilities[0] = 2; abilities[1] = 4; abilities[2] = 5;
      languages.add("Dwarven");
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(5);
         switch(randomizee) {
            case 0: {
               heritage = "Ancient-Blooded Dwarf";
               break; }
            case 1: {
               heritage = "Death Warden Dwarf";
               break; }
            case 2: {
               heritage = "Forge Dwarf";
               break; }
            case 3: {
               heritage = "Rock Dwarf";
               break; }
            case 4: {
               heritage = "Strong-Blooded Dwarf";
               break; }
         }
      }
      String[] temp = dwarfFeats();
      feat1 = temp[0];
      if(temp[2].equals("true"))
         flagHandler(temp[1]);  
   }
   
   private void setElf() {
   
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Elf"; hitPoints = 6; size = "Medium"; speed = 30;
      abilityType = "Complex"; abilities[0] = 1; abilities[1] = 3; abilities[2] = 2;
      languages.add("Elven");
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(5);
         switch(randomizee) {
            case 0: {
               heritage = "Arctic Elf";
               break; }
            case 1: {
               heritage = "Cavern Elf";
               vision = "Darkvision";
               break; }
            case 2: {
               heritage = "Seer Elf";
               sorcererCheck(2, "MaybeImperial");
               break; }
            case 3: {
               heritage = "Whisper Elf";
               break; }
            case 4: {
               heritage = "Woodland Elf";
               flagHandler("AthlBias");
               break; }
         }
      }
      if(!vision.equals("Darkvision"))
         vision = "Low-Light Vision";
      String[] temp = elfFeats();
      feat1 = temp[0];
      if(temp[2].equals("true"))
         flagHandler(temp[1]);  
   }
   
   private void setGnome() {
      
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Gnome"; hitPoints = 8; size = "Small"; speed = 25;
      abilityType = "Complex"; abilities[0] = 2; abilities[1] = 5; abilities[2] = 0;
      languages.add("Gnomish");
      languages.add("Sylvan");
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(5);
         switch(randomizee) {
            case 0: {
               heritage = "Chameleon Gnome";
               flag1 = "SteaBias";
               break; }
            case 1: {
               heritage = "Fey-Touched Gnome";
               sorcererCheck(1, "Fey");
               String[] spellList = { "Acid Splash", "Dancing Lights", "Detect Magic", "Disrupt Undead", "Electric Arc", "Guidance", "Know Direction", "Light", "Prestidigitation", "Produce Flame", "Ray of Frost", "Read Aura", "Sigil", "Stabilize", "Tanglefoot" };
               randomizee = randomizer.nextInt(15);
               cantrip1 = spellList[randomizee];
               break; }
            case 2: {
               heritage = "Sensate Gnome";
               break; }
            case 3: {
               heritage = "Umbral Gnome";
               vision = "Darkvision";
               break; }
            case 4: {
               heritage = "Wellspring Gnome";
               randomizee = randomizer.nextInt(3);
               switch(randomizee) {
                  case 0: {
                     sorcererCheck(1, "Arcane");
                     String[] spellList = { "Acid Splash", "Chill Touch", "Dancing Lights", "Daze", "Detect Magic", "Electric Arc", "Ghost Sound", "Light", "Mage Hand", "Message", "Prestidigitation", "Produce Flame", "Ray of Frost", "Read Aura", "Shield", "Sigil", "Tanglefoot", "Telekinetic Projectile" };
                     randomizee = randomizer.nextInt(18);
                     cantrip1 = spellList[randomizee];
                     break; }
                  case 1: {
                     sorcererCheck(1, "Divine");
                     String[] spellList = { "Chill Touch", "Daze", "Detect Magic", "Disrupt Undead", "Divine Lance", "Forbidding Ward", "Guidance", "Know Direction", "Light", "Message", "Prestidigitation", "Read Aura", "Shield", "Sigil", "Stabilize", "Summon Instrument" };
                     randomizee = randomizer.nextInt(16);
                     cantrip1 = spellList[randomizee];
                     break; }
                  case 2: {
                     sorcererCheck(1, "Occult");
                     String[] spellList = { "Chill Touch", "Dancing Lights", "Daze", "Detect Magic", "Forbidding Ward", "Ghost Sound", "Guidance", "Guidance", "Know Direction", "Light", "Mage Hand", "Message", "Prestidigitation", "Read Aura", "Shield", "Sigil", "Summon Instrument", "Telekinetic Projectile" };
                     randomizee = randomizer.nextInt(18);
                     cantrip1 = spellList[randomizee];
                     break; } }            
               break; }
         }
      }
      if(!vision.equals("Darkvision"))
         vision = "Low-Light Vision";      
      String[] temp = gnomeFeats();
      feat1 = temp[0];
      if(temp[2].equals("true"))
         flagHandler(temp[1]);  
   }   
   
   private void setGoblin() {
      
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Goblin"; hitPoints = 6; size = "Small"; speed = 25; vision = "Darkvision";
      abilityType = "Complex"; abilities[0] = 1; abilities[1] = 5; abilities[2] = 4;
      languages.add("Goblin");
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(5);
         switch(randomizee) {
            case 0: {
               heritage = "Charhide Goblin";
               break; }
            case 1: {
               heritage = "Irongut Goblin";
               break; }
            case 2: {
               heritage = "Razortooth Goblin";
               break; }
            case 3: {
               heritage = "Snow Goblin";
               break; }
            case 4: {
               heritage = "Unbreakable Goblin";
               hitPoints += 4;
               break; }
         }
      }
      String[] temp = goblinFeats();
      feat1 = temp[0];
      
      if(temp[2].equals("true"))
         flagHandler(temp[1]);  
   }

   private void setHalfling() {
      
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Halfling"; hitPoints = 6; size = "Small"; speed = 25;
      abilityType = "Complex"; abilities[0] = 1; abilities[1] = 4; abilities[2] = 0;
      languages.add("Halfling");
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(5);
         switch(randomizee) {
            case 0: {
               heritage = "Gutsy Halfling";
               break; }
            case 1: {
               heritage = "Hillock Halfling";
               break; }
            case 2: {
               heritage = "Nomadic Halfling";
               int randomizee2;
               do {
                  randomizee = randomizer.nextInt(30);
                  randomizee2 = randomizer.nextInt(30); }
               while(randomizee == randomizee2 || randomizee == 5 || randomizee2 == 5);
               languages.add(allLanguages[randomizee]);
               languages.add(allLanguages[randomizee2]);
               flag1 = "NomadicHalfling";
               break; }
            case 3: {
               heritage = "Twilight Halfling";
               vision = "Low-Light Vision";
               break; }
            case 4: {
               heritage = "Wildwood Halfling";
               break; }
         }
      }
      String[] temp = halflingFeats();
      feat1 = temp[0];
      if(!temp[2].isEmpty()) {
      if(temp[2].equals("true"))
         flagHandler(temp[1]); }  
   }
   
   private void setHuman() {
      
      sorcererCheck(9, "Any");
      Random randomizer = new Random();
      ancestry = "Human"; hitPoints = 8; size = "Medium"; speed = 25;
      abilityType = "Simple";
      if(alternateHeritage == false) {
         int randomizee = randomizer.nextInt(2);
         switch(randomizee) {
            case 0: {
               flag1 = "SkilledHuman";
               randomizee = randomizer.nextInt(17) + 16;
               bigStart[randomizee]++;
               randomizee -= 16;
               String[] skills = { "Acrobatics", "Arcana", "Athletics", "Crafting", "Deception", "Diplomacy", "Intimidation", "Lore", "Medicine", "Nature", "Occultism", "Performance", "Religion", "Society", "Stealth", "Survival", "Thievery" };
               heritage = "Skilled Human(" + skills[randomizee] + ")";
               break; }
            case 1: {
               heritage = "Versatile Human";
               //String[] temp = generalFeats();
               //feat1 = temp[0];
               //if(temp[2].equals("true"))
               //   flagHandler(temp[1]); 
               break; }
         }
      }
      String[] temp = dwarfFeats();
      feat1 = temp[0];
      if(!temp[2].isEmpty()) {      
      if(temp[2].equals("true"))
         flagHandler(temp[1]); }  
   }   
      
   private String[] dwarfFeats() {
      
      Random randomizer = new Random();
      String[] feat = new String[3]; feat[2] = "";
      int i = 0;
      while(i == 0) {
         int randomizee = randomizer.nextInt(6);
         switch(randomizee) {
            case 0: {
               if(!feat1.equals("Dwarven Lore")) {
                  bigStart[19]++; bigStart[23]++; bigStart[28]++;
                  feat[0] = "Dwarven Lore";
                  feat[1] = "DwarvenLore";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 1: {
               if(!feat1.equals("Dwarven Weapon Familiarity")) {
                  feat[0] = "Dwarven Weapon Familiarity";
                  feat[1] = "DwarvenWeaponFamiliarity";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 2: {
               if(!feat1.equals("Rock Runner")) {
                  feat[0] = "Rock Runner";
                  feat[1] = "AcroBias";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 3: {
               if(!feat1.equals("Stonecutting")) {
                  feat[0] = "Stonecutting";
                  i++; 
                  break; } }
            case 4: {
               if(!feat1.equals("Unburdoned Iron")) {
                  feat[0] = "Unburdoned Iron";
                  i++; 
                  break; } }
            case 5: {
               if(!feat1.contains("Vengeful Hatred")) {
                  randomizee = randomizer.nextInt(4);
                  switch(randomizee) {
                     case 0: {
                        feat[0] = "Vengeful Hatred (Drow)";
                        break; }
                     case 1: {
                        feat[0] = "Vengeful Hatred (Duergar)";
                        break; }
                     case 2: {
                        feat[0] = "Vengeful Hatred (Giant)";
                        break; }
                     case 3: {
                        feat[0] = "Vengeful Hatred (Orc)";
                        break; }
                  }
                  feat[1] = "VengefulHatred";
                  feat[2] = "true";
                  i++; 
                  break; } }
         }
      }
      return feat;
   }

   private String[] elfFeats() {
      
      Random randomizer = new Random();
      String[] feat = new String[3]; feat[2] = "";
      int i = 0;
      while(i == 0) {
         int randomizee = randomizer.nextInt(7);
         switch(randomizee) {
            case 0: {
               if(!feat1.equals("Ancestral Longevity") && ancestry.equals("Elf")) {
                  feat[0] = "Ancestral Logevity";
                  i++; 
                  break; } }
            case 1: {
               if(!feat1.equals("Elven Lore")) {
                  bigStart[17]++; bigStart[23]++; bigStart[25]++;
                  feat[0] = "Elven Lore";
                  feat[1] = "ElvenLore";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 2: {
               if(!feat1.equals("Elven Weapon Familiarity")) {
                  feat[0] = "Elven Weapon Familiarity";
                  feat[1] = "ElvenWeaponFamiliarity";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 3: {
               if(!feat1.equals("Forlorn")) {
                  feat[0] = "Forlorn";
                  i++; 
                  break; } }
            case 4: {
               if(!feat1.equals("Nimble Elf")) {
                  feat[0] = "Nimble Elf";
                  speed += 5;
                  i++; 
                  break; } }
            case 5: {
               if(!feat1.contains("Otherworldly Magic")) {
                  sorcererCheck(2, "Arcane");
                  String[] spellList = { "Acid Splash", "Chill Touch", "Dancing Lights", "Daze", "Detect Magic", "Electric Arc", "Ghost Sound", "Light", "Mage Hand", "Message", "Prestidigitation", "Produce Flame", "Ray of Frost", "Read Aura", "Shield", "Sigil", "Tanglefoot", "Telekinetic Projectile" };
                  randomizee = randomizer.nextInt(18);
                  cantrip1 = spellList[randomizee];
                  feat[0] = "Otherworldly Magic(" + cantrip1 + ")";
                  i++; 
                  break; } }
            case 6: {
               if(!feat1.equals("Unwavering Mien")) {
                  feat[0] = "Unwavering Mien";
                  i++; 
                  break; } }                  
         }
      }
      return feat;
   }

   private String[] gnomeFeats() {
      
      Random randomizer = new Random();
      String[] feat = new String[3]; feat[2] = "";
      int i = 0;
      while(i == 0) {
         int randomizee = randomizer.nextInt(7);
         switch(randomizee) {
            case 0: {
               if(!feat1.equals("Animal Accomplice")) { // ADD A FAMILIAR HERE
                  feat[0] = "Animal Accomplice";
                  feat[1] = "FamiliarBurrow";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 1: {
               if(!feat1.equals("Burrow Elocutionist")) {
                  feat[0] = "Burrow Elocutionist";
                  feat[1] = "DiplBias";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 2: {
               if(!feat1.equals("Fey Fellowship")) {
                  feat[0] = "Fey Fellowship";
                  feat[1] = "DiplBias";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 3: {
               if(!feat1.contains("First World Magic")) {
                  sorcererCheck(2, "Primal");
                  String[] spellList = { "Acid Splash", "Dancing Lights", "Detect Magic", "Disrupt Undead", "Electric Arc", "Guidance", "Know Direction", "Light", "Prestidigitation", "Produce Flame", "Ray of Frost", "Read Aura", "Sigil", "Stabilize", "Tanglefoot" };
                  do
                     randomizee = randomizer.nextInt(15);
                  while(cantrip1.equals(spellList[randomizee]));
                  cantrip2 = spellList[randomizee];
                  feat[0] = "First World Magic(" + cantrip2 + ")";   
                  i++; 
                  break; } }
            case 4: {
               if(!feat1.equals("Gnome Obsession")) {
                  feat[0] = "Gnome Obsession";
                  feat[1] = "GnomeObsession";
                  feat[2] = "true";
                  bigStart[23]++;
                  i++; 
                  break; } }
            case 5: {
               if(!feat1.equals("Gnome Weapon Familiarity")) {
                  feat[0] = "Gnome Weapon Familiarity";
                  feat[1] = "GnomeWeaponFamiliarity";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 6: {
               if(!feat1.equals("Illusion Sense")) {
                  feat[0] = "Illusion Sense";
                  i++; 
                  break; } }                  
         }
      }
      return feat;
   }

   private String[] goblinFeats() {
      
      Random randomizer = new Random();
      String[] feat = new String[3]; feat[2] = "";
      int i = 0;
      while(i == 0) {
         int randomizee = randomizer.nextInt(9);
         switch(randomizee) {
            case 0: {
               if(!feat1.equals("Burn It!")) {
                  feat[0] = "Burn It!";
                  i++; 
                  break; } }
            case 1: {
               if(!feat1.equals("City Scavenger")) {
                  feat[0] = "City Scavenger";
                  feat[1] = "SociSurvBias";
                  feat[2] = "true";
                  i++; 
                  break;  } }
            case 2: {
               if(!feat1.equals("Goblin Lore")) {
                  feat[0] = "Goblin Lore";
                  feat[1] = "GoblinLore";
                  feat[2] = "true";
                  bigStart[23]++; bigStart[25]++; bigStart[30]++;
                  i++; 
                  break;  } }
            case 3: {
               if(!feat1.equals("Goblin Scuttle")) {
                  feat[0] = "Goblin Scuttle";
                  i++; 
                  break; } }
            case 4: {
               if(!feat1.equals("Goblin Song")) {
                  feat[0] = "Goblin Song";
                  feat[1] = "PerfBias";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 5: {
               if(!feat1.equals("Goblin Weapon Familiarity")) {
                  feat[0] = "Goblin Weapon Familiarity";
                  feat[1] = "GoblinWeaponFamiliarity";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 6: {
               if(!feat1.equals("Junk Tinker")) {
                  feat[0] = "Junk Tinker";
                  feat[1] = "CrafBias";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 7: {
               if(!feat1.equals("Rough Rider")) {
                  feat[0] = "Rough Rider";
                  feat[1] = "NatuBias";
                  feat[2] = "true";
                  feat2 = "Ride";
                  i++; 
                  break; } }
            case 8: {
               if(!feat1.equals("Very Sneaky")) {
                  feat[0] = "Very Sneaky";
                  feat[1] = "SteaBias";
                  feat[2] = "true";
                  i++; 
                  break; } }                    
         }
      }
      return feat;
   }

   private String[] halflingFeats() {
      
      Random randomizer = new Random();
      String[] feat = new String[3]; feat[2] = "";
      int i = 0;
      while(i == 0) {
         int randomizee = randomizer.nextInt(7);
         switch(randomizee) {
            case 0: {
               if(!feat1.equals("Distracting Shadows")) {
                  feat[0] = "Distracting Shadows";
                  feat[1] = "SteaBias";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 1: {
               if(!feat1.equals("Halfling Lore")) {
                  feat[0] = "Halfling Lore";
                  bigStart[16]++; bigStart[23]++; bigStart[30]++;
                  i++; 
                  break;  } }
            case 2: {
               if(!feat1.equals("Halfling Luck")) {
                  feat[0] = "Halfling Luck";
                  i++; 
                  break;  } }
            case 3: {
               if(!feat1.equals("Halfling Weapon Familiarity")) {
                  feat[0] = "Halfling Weapon Familiarity";
                  feat[1] = "HalflingWeaponFamiliarity";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 4: {
               if(!feat1.equals("Sure Feet")) {
                  feat[0] = "Sure Feet";
                  feat[1] = "AcroAthlBias";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 5: {
               if(!feat1.equals("Unfettered Halfling")) {
                  feat[0] = "Unfettered Halfling";
                  feat[1] = "AcroAthlThieBias";
                  feat[2] = "true";
                  i++; 
                  break; } }
            case 6: {
               if(!feat1.equals("Watchful Halfling")) {
                  feat[0] = "Watchful Halfling";
                  i++; 
                  break; } }                  
         }
      }
      return feat;
   }
       
}