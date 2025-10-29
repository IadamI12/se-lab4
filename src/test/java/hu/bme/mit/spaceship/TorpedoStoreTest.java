package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {
    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }
    @Test
    void fire_LowAmmunition(){
        TorpedoStore store = new TorpedoStore(0);
        assertThrows(IllegalArgumentException.class, () -> {
            store.fire(2);
        });
    }
    @Test
    void ammo_IsEmpty(){
        TorpedoStore store = new TorpedoStore(0);
        assertEquals(true, store.isEmpty());
    }
    @Test
    void ammo_Get(){
        TorpedoStore store = new TorpedoStore(5);
        assertEquals(5, store.getTorpedoCount());
    }



}
