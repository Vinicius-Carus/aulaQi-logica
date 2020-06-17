public class Apple extends Fruit {

    public Apple() {
    }

    @Override
    public String eat() {
        return "somewhat sweet and spicy";
    }

    @Override
    public String removePeel() {
        return "To peel a apple, you need a knife";
    }

    @Override
    public String toString() {
        return "\nApple"
                + "\nColor: " + this.color + "\n"
                + "\nHow is apple taste?" + "\n" + this.eat() + "\n"
                + "\nHow do i remove the apple peel?" + "\n" + this.removePeel();
    }

}