package q4;

public class Image {
    int imageWidth,imageHeight;
    String colorCode;
    public Image(){
        imageWidth=0;
        imageHeight=0;
        colorCode="";
    }
    public Image(int imageWidth, int imageHeight, String colorCode) {
        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
        this.colorCode= colorCode;
    }
    public void setImageWidth(int imageWidth){
        this.imageWidth = imageWidth;
    }
    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }
    public int getImageWidth() {
        return imageWidth;
    }
    public int getImageHeight(){
        return imageHeight;
    }
    public String getColorCode(){
        return colorCode;
    }
    public String toString()
    {
        return "Image [ imageWidth= " + imageWidth + ", imageHeight= " + imageHeight +", colorcode: "+colorCode+" ]";
    }

    public static void main(String[] args) {
        Image defaultImg=new Image();
        System.out.println("Default: "+ defaultImg);
        Image img=new Image(100, 200, "#f0f0f0");
        System.out.println("Custom Image: "+img);
    }
}

