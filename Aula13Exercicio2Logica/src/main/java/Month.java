/**
 * @author  Vinicius Carus
 * @version 1.0
 * @since   30/05/2020 - 15:44
 */
public class Month {

    private int numberOfMonth;

    public Month() {
    }

    public int getNumberOfMonth() {
        return this.numberOfMonth;
    }

    public void setNumberOfMonth(int numberOfMonth) {
        this.numberOfMonth = numberOfMonth;
    }

    /**
     * @return Retorna o nome do mes referente ao numero colocado pelo usuario
     */
    public String chooseMonth() {
        if(this.numberOfMonth == 1) {
            return "January";
        } else if(this.numberOfMonth == 2) {
            return "February";
        } else if(this.numberOfMonth == 3) {
            return "March";
        } else if(this.numberOfMonth == 4) {
            return "April";
        } else if(this.numberOfMonth == 5) {
            return "May";
        } else if(this.numberOfMonth == 6) {
            return "June";
        } else if(this.numberOfMonth == 7) {
            return "July";
        } else if(this.numberOfMonth == 8) {
            return "August";
        } else if(this.numberOfMonth == 9) {
            return "September";
        } else if(this.numberOfMonth == 10) {
            return "October";
        } else if(this.numberOfMonth == 11) {
            return "November";
        } else if(this.numberOfMonth == 12) {
            return "December";
        }
        return "Numero invalido";
    }

    @Override
    public String toString() {
        return "Month name: " + this.chooseMonth();
    }
}