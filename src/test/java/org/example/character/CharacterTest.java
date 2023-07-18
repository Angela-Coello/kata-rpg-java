package org.example.character;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTest {


    Character character = new Character();
@Test
    public void health_should_start_at_1000(){
    assertEquals(1000,character.getHealth());
}

@Test
    public void level_should_satart_at_1(){
    assertEquals(1, character.getLevel() );
}

@Test
    public void May_be_Alive_or_Dead_starting_Alive(){
    assertTrue( character.isAlive());
}
}

