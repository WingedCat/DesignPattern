package edu.xpu.hcp.struct.bridge;

public abstract class ImageImplementer {
    protected Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public abstract void paintMethod(String str);
}
