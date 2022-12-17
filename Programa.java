public class Programa{
  public static void main(String[] args){

    ListaLigada lista = new ListaLigada();
    lista.adicionar("AC");
    lista.adicionar("BA");
    lista.adicionar("CE");
    lista.adicionar("DF");
    System.out.println("Tamanho: " + lista.getTamanho());
    System.out.println("Primeiro: " + lista.getPrimeiro().getValor());
    System.out.println("Ultimo: " + lista.getUltimo().getValor());
    System.out.println("Elemento 0: " + lista.get(0).getValor());
    System.out.println("Elemento 1: " + lista.get(1).getValor());
    System.out.println("Elemento 2: " + lista.get(2).getValor());

  }

}