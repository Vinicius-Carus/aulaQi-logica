public class Principal {

    public static void main (String args[]) {

        System.out.println ("\f");

        //Instanciando objeto

        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Zé";
        pessoa.peso = 87;
        pessoa.idade = 36;

        System.out.println("\nSeu nome é " + pessoa.nome
                + "\nSeu idade é de " + pessoa.idade + " anos"
                + "\nSeu peso é " + pessoa.peso + " kilos");

        System.out.println(pessoa.falar1("Arroz"));
        System.out.println(pessoa.falarBomDia());
        System.out.println("Sua idade em meses" + pessoa.calcularIdadeMeses());
        System.out.println(pessoa.raizQuadradaDaIdade());
        System.out.println(pessoa.adicionarDezPorCentoNoPeso());
        System.out.println(pessoa.calcularIdadeAoExpoente(2));
    }

}