package edu.xpu.hcp.struct.flyweight;

public abstract class Character {
    protected char letter;

    protected int fontSize;

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    public abstract void display();

    public abstract void SetFontSize(int fontSize);
}
