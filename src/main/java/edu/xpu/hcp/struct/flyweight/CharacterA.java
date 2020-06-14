package edu.xpu.hcp.struct.flyweight;

public class CharacterA extends Character {

    public CharacterA(){
        this.letter = 'A';
        this.fontSize = 12;
    }
    @Override
    public void display() {
        System.out.println(this.letter+","+this.fontSize);
    }

    @Override
    public void SetFontSize(int fontSize) {
        this.fontSize = fontSize;
    }
}
