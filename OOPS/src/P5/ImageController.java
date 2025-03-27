package q5;

import q4.*;

public class ImageController {
    public static void main(String[] args) {
        ImageLibrary ob = new ImageLibrary(5);
        Image img1 = new Image(200, 200, "#ffffff");
        Image img2 = new Image(300, 300, "#f0f0f0");
        Image img3 = new Image(400, 400, "#000000");
        ob.insertImage(img1);
        ob.insertImage(img2);
        ob.insertImage(img3);
        Image searchResult = ImageLibrary.searchImage(300, 300, "#f0f0f9");
        System.out.println(searchResult != null ? searchResult : "No image found.");
        System.out.println(ob.getImage(1) != null ? "Image at index 1 : "+ob.getImage(1) : "No image at index 1.");
    }
}
