public class ChocolateSyrupIcecreamDecorator extends IcecreamDecorator{
    Icecream icecream;
    ChocolateSyrupIcecreamDecorator(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    String getDescription() {
        return icecream.getDescription()+" with Chocolate syrup";
    }

    @Override
    int cost() {
        return icecream.cost()+30;
    }

}
