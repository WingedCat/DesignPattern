package edu.xpu.hcp.struct.bridge;

public class LinuxImage implements Image {
    @Override
    public void paint(String str) {
        System.out.println("Linux Paint() "+str);
    }
}
