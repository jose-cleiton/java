package vetor;

import java.lang.Exception;

public class Vetor {

  private String[] elementos;
  private int size;

  public Vetor(int capacidade) {
    this.elementos = new String[capacidade];
    this.size = 0;
  }

  public void adiciona(String elemento) throws Exception {
    if (this.size < this.elementos.length) {
      this.elementos[size] = elemento;
      this.size++;
    }
    else {
      throw new Exception("Is already full");
    }
  }

}
