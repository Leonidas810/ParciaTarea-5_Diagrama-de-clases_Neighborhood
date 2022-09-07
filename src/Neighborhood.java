import java.util.List;

public class Neighborhood {
    //Attributes Private
    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    //methods public's
    //List<Street> streets
    public List<Street> getStreets() {return streets;}
    public void setStreets(List<Street> streets) {this.streets = streets;}

    //gardens
    public int getGardens() {
        return gardens;
    }
    public void setGardens(int gardens) {
        this.gardens = gardens;
    }

    //basketballCourt
    public boolean isBasketballCourt() {
        return basketballCourt;
    }
    public void setBasketballCourt(boolean basketballCourt) {
        this.basketballCourt = basketballCourt;
    }

    //footballCourt
    public boolean isFootballCourt() {
        return footballCourt;
    }
    public void setFootballCourt(boolean footballCourt) {
        this.footballCourt = footballCourt;
    }

    //swimmingPool
    public boolean isSwimmingPool() {
        return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }
}
