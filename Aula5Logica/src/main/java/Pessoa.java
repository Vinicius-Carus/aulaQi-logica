public class Pessoa { //escopo

    //atributo(s)
    String nome;
    double peso;
    int idade;

    //metodos de açao ou de retorno
    //com ou sem passagens de paramentro
    public String falar1(String mensagem) {
        return mensagem;
    }

    public void falar2(String menssagem) {
        System.out.println(menssagem);
    }

    public String falarBomDia() {
        return "Bom dia";
    }

    public int calcularIdadeMeses() {
        return this.idade * 12;
    }

    public int idadeAoQuadrado() {
        return this.idade * this.idade;

    }

    public double idadeAoExpoente() {
        return Math.pow(this.idade, 2);

    }

    public double raizQuadradaDaIdade() {
        return Math.sqrt(this.idade);

    }

    public double adicionarDezPorCentoNoPeso() {
        return this.peso * 1.10;
    }

    public double calcularIdadeAoExpoente(double expoente) {
        return Math.pow(this.idade, expoente);

    }
}