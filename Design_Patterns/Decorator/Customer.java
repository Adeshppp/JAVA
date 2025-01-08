public class Customer {
    public static void main(String[] args) {
        Icecream icecream = new ChocolateIcecream();
        icecream = new ChocolateSyrupIcecreamDecorator(new ChocoChipIcecreamDecorator(new RainbowIcecreamDecorator(icecream)));
        System.out.println(icecream.getDescription());
        System.out.println(icecream.cost());

    }
}
