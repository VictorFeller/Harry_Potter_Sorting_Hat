package ch.heg.ig.sda;

import ch.heg.ig.sda.business.Character;

import java.util.Collection;

public abstract class CharactersDatabaseLoader {
    protected String filepath;
    protected Collection<Character> characters;

    public CharactersDatabaseLoader(String filepath) {
        this.filepath = filepath;
    }
    public Collection<Character> getCharacters() {
        return characters;
    }
}
