package edu.xpu.hcp.struct.flyweight;

public class Client {
    public static void main(String[] args) {
        CharacterFactory factory = CharacterFactory.getInstance();

        Character a = factory.getCharacter("A");
        a.SetFontSize(20);
        a.display();

        Character b = factory.getCharacter("B");
        b.SetFontSize(24);
        b.display();
    }
}
