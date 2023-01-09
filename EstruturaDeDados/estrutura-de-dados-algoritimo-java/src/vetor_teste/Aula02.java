package vetor_teste;

import vetor.Vetor;

public class Aula02 {
  
  public static void main(String[] args) throws Exception {
    Vetor vetor = new Vetor(3);
    try {
      vetor.adiciona("elemento 1");
      vetor.adiciona("elemento 2");
      vetor.adiciona("elemento 3");
    } catch (Exception e) {
      e.printStackTrace();
    }  
      }
  
}
