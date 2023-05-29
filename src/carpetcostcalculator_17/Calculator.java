package carpetcostcalculator_17;

public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor floor,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;

    }
    public double getTotalCost(){
        return floor.grtArea() * carpet.getCost();
    }
}
