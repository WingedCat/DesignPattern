package edu.xpu.hcp.struct.flyweight;

import java.util.HashMap;

/**
 * Flyweight
 */
public class CharacterFactory {

    private HashMap<String ,Character> characters = new HashMap();



    private static class CharacterFactoryHolder{
         static CharacterFactory singleton = new CharacterFactory();
    }

    public static CharacterFactory getInstance(){
        return CharacterFactoryHolder.singleton;
    }

    private CharacterFactory(){
        characters.put("A",new CharacterA());
        characters.put("B",new CharacterB());
    }

    /**
     * 关键步骤
     * @param key
     * @return
     */
    public Character getCharacter(String key){
        Character character = characters.get(key);
        if(character==null){
            switch (key){
                case "A":character = new CharacterA();break;
                case "B":character = new CharacterB();break;
            }
            characters.put(key,character);
        }
        return character;
    }
}
