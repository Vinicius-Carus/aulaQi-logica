/**
 * @author Vinicius Carus
 * @version 1.0
 * @since 27/05/2020 - 20:38
 */
public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double totalDeAulas;
    private int numeroDePresencas;

    public Aluno () {

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        if (this.nota1 >= 0 && this.nota1 <= 10) {
            return this.nota1;
        } else {
            return 0;
        }
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        if (this.nota2 >= 0 && this.nota2 <= 10) {
            return this.nota2;
        } else {
            return 0;
        }
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getTotalDeAulas() {
        if(this.totalDeAulas > 0) {
            return this.totalDeAulas;
        } else{
            return 0;
        }
    }

    public void setTotalDeAulas(int totalDeAulas) {
        this.totalDeAulas = totalDeAulas;
    }

    public int getNumeroDePresencas() {
        if (this.numeroDePresencas < 0) {
            return 0;
        } else {
            return this.numeroDePresencas;
        }
    }

    public void setNumeroDePresencas(int numeroDePresencas) {
        this.numeroDePresencas = numeroDePresencas;
    }

    /**
     * @return Retorna a porcentagem de frequencia do aluno
     */
    public double calcularFrequencia() {
        return this.getNumeroDePresencas() * 100 / this.totalDeAulas;
    }

    /**
     * @return Retorna a media aritimetica do aluno. com 2 notas
     */
    public double calcularMediaAritimetica() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * @return Retorna se o aluno esta aprovado ou reprovado
     */
    public String checarSeEstaAprovado() {
        if(calcularMediaAritimetica() >= 6) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    /**
     * @return Retorna se o aluno foi reprovado por faltas e nota ou se foi
     * reprovado só por falta ou só por notar ou se ele foi aprovado
     */
    public String verificarSeEstaAprovado() {
        if(calcularMediaAritimetica() >= 6 && calcularFrequencia() >= 75) {
            return "Aprovado";
        } else if (calcularMediaAritimetica() <= 6 && calcularFrequencia() >= 75){
            return "Reprovado por nota";
        } else if (calcularMediaAritimetica() >= 6 && calcularFrequencia() <= 75){
            return "Reprovado por falta";
        } else {
            return "Reprovado";
        }
    }

    /**
     * @return Retorna o contexto do aluno
     */
    public String verificarContexto() {
        if(calcularMediaAritimetica() >= 9) {
            return "A";
        } else if (calcularMediaAritimetica() >= 7) {
            return "B";
        } else if (calcularMediaAritimetica() >= 6) {
            return "C";
        } else {
            return "D";
        }
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome
                + "\nPrimeira nota: " + this.getNota1()
                + "\nSegunda nota: " + this.getNota2()
                + "\nTotal de aulas: " + this.totalDeAulas
                + "\nNumero de presenças: " + this.getNumeroDePresencas()
                + "\nFrequencia: " + this.calcularFrequencia() + "%"
                + "\nMedia: " + this.calcularMediaAritimetica()
                + "\n" + this.verificarSeEstaAprovado()
                + "\nContexto: " + this.verificarContexto();
    }

}