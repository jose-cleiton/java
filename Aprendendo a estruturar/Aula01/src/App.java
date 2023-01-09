public class App {
    public static void main(String[] args) throws Exception {

        Celular c1 = new Celular();
        c1.nome = "Samsung Galaxy S20";
        c1.sistemaOeracional = "Android";
        c1.capacidade = 128;
        c1.tela = 6.2f;

        Celular c2 = new Celular();
        c2.nome = "iPhone 11";
        c2.sistemaOeracional = "iOS";
        c2.capacidade = 64;
        c2.tela = 6.1f;

        System.out.format("Celular %s com tela %.1f, com %d e SO %s ",  c1.nome, c1.tela, c1.capacidade, c1.sistemaOeracional);
       
        
    }
}