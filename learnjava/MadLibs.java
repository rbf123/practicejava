public class MadLibs {
  /*
  This program generates a mad libbed story based from a project in Codecademy.
  Author: Romina
  Date: 6/16/2024
  */
  	public static void main(String[] args){
      String name1 = "Sabrina";
      String adjective1 = "cold";
      String adjective2 = "musical";
      String adjective3 = "woozy";
      String verb1 = "run";
      String noun1 = "song";
      String noun2 = "playlist";
      String noun3 = "cello";
      String noun4 = "marimba";
      String noun5 = "drum";
      String noun6 = "guitar";
      String name2 = "Rose";
      int number = 120;
      String place1 = "America";
      

      
      //The template for the story
      String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

      System.out.println(story);
    }       
}
