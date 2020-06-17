public class Bergamot extends Fruit {

    public Bergamot() {

    }

    @Override
    public String eat() {
        return "More sweet taste";
    }

    @Override
    public String removePeel() {
        return "You can remove the peel with your hands";
    }

    @Override
    public String toString() {
        return "\nBergamot"
                + "\nColor: " + this.color + "\n"
                + "\nHow is bergamot taste? " + "\n" + this.eat() + "\n"
                + "\nHow do i remove the bergamot peel? " + "\n" + this.removePeel();
    }

}