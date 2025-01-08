public class RainbowIcecreamDecorator extends IcecreamDecorator{


    Icecream icecream;
    RainbowIcecreamDecorator(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    String getDescription() {
        return icecream.getDescription()+" with rainbow sprinkle";
    }

    @Override
    int cost() {
        return icecream.cost()+20;
    }
}
