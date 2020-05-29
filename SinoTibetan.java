public class SinoTibetan extends Language {
  
  public SinoTibetan(String langName, int langSpeakers){
    super (langName, langSpeakers, "Asia", "subject-object-verb");
    if (this.name.indexOf("Chinese") >= 0) {
      wordOrder = "subject-verb-object";
    }
  }

}