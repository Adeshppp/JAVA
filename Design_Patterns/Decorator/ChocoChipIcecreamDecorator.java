public class ChocoChipIcecreamDecorator extends IcecreamDecorator{
    Icecream icecream;
    ChocoChipIcecreamDecorator(Icecream icecream){
        this.icecream = icecream;
    }

    @Override
    String getDescription() {
        return icecream.getDescription()+" with Chocochips";
    }

    @Override
    int cost() {
        return icecream.cost()+10;
    }
}
