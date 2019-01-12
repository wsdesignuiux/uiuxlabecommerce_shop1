package Model;

/**
 * Created by wolfsoft3 on 21/12/18.
 */

public class Item_Activity2_Model {
    Integer image;
    String style_name;

    public Item_Activity2_Model(Integer image, String style_name) {
        this.image = image;
        this.style_name = style_name;
    }

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public String getStyle_name() {
        return style_name;
    }

    public void setStyle_name(String style_name) {
        this.style_name = style_name;
    }
}
