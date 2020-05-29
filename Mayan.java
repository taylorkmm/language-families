public class Mayan extends Language {
  
  public Mayan (String langName, int langSpeakers) {
    super(langName, langSpeakers, "Central America", "verb-object-subject");
  }

  @Override
  public void getInfo() {
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "." + "\n" + "The language follows the word order: " + "\n" + wordOrder + "\n" + "Fun fact: " + name + " is an ergative language.");
  }
}
