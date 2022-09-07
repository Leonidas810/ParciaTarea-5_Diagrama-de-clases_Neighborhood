import java.util.List;

public class Street {
    //Attributes Private
    private String name;
    private List<House> houses;

    //methods public's
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Functionless
    public void addHouse(int number, House house){
        this.houses.add(house);
    }
}
