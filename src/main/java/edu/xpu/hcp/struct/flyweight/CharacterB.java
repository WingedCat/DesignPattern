package edu.xpu.hcp.struct.flyweight;

public class CharacterB extends Character {

    public CharacterB(){
        this.letter = 'B';
        this.fontSize = 15;
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
