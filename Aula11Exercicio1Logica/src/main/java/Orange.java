public class Orange extends Fruit {

    public Orange() {

    }

    @Override
    public String eat() {
        return "Can go from slightly acidic to sweet";
    }

    @Override
    public String removePeel() {
        return "To peel a orange, you need a knife";
    }

    @Override
    public String toString() {
        return "\nOrange"
                + "\nColor: " + this.color + "\n"
                + "\nHow is orange taste?" + "\n" + this.eat() + "\n"
                + "\nHow do i remove the orange peel?" + "\n" + this.removePeel();
    }

}