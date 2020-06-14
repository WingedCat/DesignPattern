package edu.xpu.hcp.struct.bridge;

public class WinImage implements Image {
    @Override
    public void paint(String str) {
        System.out.println("Windows Paint() "+str);
    }
}
