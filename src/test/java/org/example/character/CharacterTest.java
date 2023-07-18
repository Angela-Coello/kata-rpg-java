package org.example.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {
@Test
    public void health_should_start_at_1000(){
    Character character = new Character();
    assertEquals(1000,character.getHealth());
}
}