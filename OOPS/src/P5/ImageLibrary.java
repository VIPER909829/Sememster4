package q5;
import q4.*;
public class ImageLibrary {
    private static Image[] image;
    private int size;

    public ImageLibrary(int cap) {
        image = new Image[cap];
        size = 0;
    }

    public void insertImage(Image i) {
        if (size < image.length) {
            image[size++] = i;
        }
    }

    public static Image searchImage(int imageWidth, int imageHeight, String colorCode) {
        for (Image i : image) {
            if (i!=null && i.getImageWidth() == imageWidth && i.getImageHeight() == imageHeight
                    && i.getColorCode().equals(colorCode)) {
                return i;
            }
        }
        return null;
    }

    public Image getImage(int index) {
        if (index >= 0 && index < image.length) {
            return image[index];
        }
        return null;
    }

}

