package edu.xpu.hcp.struct.bridge;

public class Client {
    public static void main(String[] args) {
        ImageImplementer bmp = new BMPImageImplementer();
        Image winImg = new WinImage();
        bmp.setImage(winImg);
        bmp.paintMethod("BMP image");

        bmp.setImage(new LinuxImage());
        bmp.paintMethod("BMP image");


    }
}
