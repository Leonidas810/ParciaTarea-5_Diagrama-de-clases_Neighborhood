public class Kitchen {
    //Attributes Private
    private boolean stove;
    private boolean sink;
    private int windows;
    private boolean refrigerator;
    private boolean oven;
    private int width;
    private int height;
    private String color;

    //methods public's
    //Stove
    public boolean getStove() {
        return stove;
    }
    public void setStove(boolean stove) {
        this.stove = stove;
    }
    //sink
    public boolean getSink(){
        return  sink;
    }
    public void setSink(boolean sink) {
        this.sink = sink;
    }
    //windows
    public int getWindows() {
        return windows;
    }
    public void setWindows(int windows) { //setters
        if(windows >0 && windows <4){
            this.windows = windows;
        }
    }
    //refrigerator
    public boolean getRefrigerator() {
        return refrigerator;
    }
    public void setRefrigerator(boolean refrigerator) {
        this.refrigerator = refrigerator;
    }
    //oven
    public boolean getOven() {
        return oven;
    }
    public  void setOven(boolean oven){
        this.oven=oven;
    }
    //width
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    //height
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    //color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
