public class Language {

//global variables
protected String name;
protected int numSpeakers;
protected String regionsSpoken;
protected String wordOrder;

public Language (String langName, int langSpeakers, String langRegions, String langWOrder) {

name = langName;
numSpeakers = langSpeakers;
regionsSpoken = langRegions;
wordOrder = langWOrder;

}

public void getInfo() {
  System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + "." + "\n" + "The language follows the word order: " + "\n" + wordOrder);
}

  public static void main(String[] args) {

    Language japanese = new Language("Japanese", 128000000, "Japan", "subject-object-verb");
    japanese.getInfo();

    Language qanjobal = new Mayan("Q'anjob'al", 148340);
    qanjobal.getInfo();

    Language shanghainese = new SinoTibetan ("Chinese", 14000000);
    shanghainese.getInfo();

    Language burmese = new SinoTibetan ("Burmese", 33000000);
    burmese.getInfo();
  }
  
}