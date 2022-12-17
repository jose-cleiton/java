public class ListaLigada{
  private Elemento primeiro;
  private Elemento ultimo;
  private int tamanho;
  public ListaLigada(){
    
    this.tamanho = 0;
  }

  public Elemento getPrimeiro(){
    return primeiro;
  }

  public void setPrimeiro(Elemento primeiro){
    this.primeiro = primeiro;
  }

  public Elemento getUltimo(){
    return ultimo;
  }

  public void setUltimo(Elemento ultimo){
    this.ultimo = ultimo;
  }   


  public void adicionar(String valor){
    Elemento novElemento = new Elemento(valor);
    if(this.primeiro == null && this.ultimo == null){
      this.primeiro = novElemento;
      this.ultimo = novElemento;
    }else{
      this.ultimo.setProximo(novElemento);
      this.ultimo = novElemento;
    }
    this.tamanho++;

  }

  public void remover(String valor){}


  public Elemento get(int posicao){
    Elemento atual = this.primeiro;
    for(int i = 0; i < posicao; i++){
     if(atual.getProximo() != null){
       atual = atual.getProximo();
    }else{
      return null;
    }
    }
    return atual;
    
  }

  public int getTamanho() {
    return tamanho;
  }
  


}