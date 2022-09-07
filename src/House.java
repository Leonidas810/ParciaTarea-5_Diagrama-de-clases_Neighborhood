public class House {
    //Attributes Private
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRoom;
    private BedRoom[] bedRoom;
    private Yard yard;

    //methods public's
    //Kitchen
    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
    //DiningRoom
    public DiningRoom getDiningRoom() {
        return diningRoom;
    }
    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }
    //LivingRoom
    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }
    //RestRoom
    public RestRoom[] getRestRoom() {
        return restRoom;
    }
    public void setRestRoom(RestRoom[] restRoom) {
        this.restRoom = restRoom;
    }
    //BedRoom
    public BedRoom[] getBedRoom() {
        return bedRoom;
    }
    public void setBedRoom(BedRoom[] bedRoom) {
        this.bedRoom = bedRoom;
    }
    //Yard
    public Yard getYard() {
        return yard;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }

    //Functionless
    public void addRoom(RestRoom restRoom){
        //this.RestRoom.add(restRoom);
    }
    public static void addRoom(BedRoom bedRoom){
        //this.BedRoom.add(bedRoom);
    }
}