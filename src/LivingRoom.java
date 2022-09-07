public class LivingRoom {
    //Attributes Private
    private int windows;
    private boolean tv;
    private boolean homeTeather;
    private int width;
    private int height;
    private String color;

    //methods public's
    //windows
    public int getWindows() {
        return windows;
    }
    public void setWindows(int windows) {
        this.windows = windows;
    }
    //tv
    public boolean getTv() {
        return tv;
    }
    public void setTv(boolean tv) {this.tv = tv;}
    //homeTeather
    public boolean getHomeTeather(){
        return  homeTeather;
    }
    public void setHomeTeather(boolean homeTeather) {
        this.homeTeather = homeTeather;
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
