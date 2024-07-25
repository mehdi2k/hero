import org.example.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HeroTest {

    @Test
    void testInitialPosition() {
        char[][] map = {
                {'.', '.', '.', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '.'}
        };
        Hero hero = new Hero(1, 1, map);
        assertEquals(1, hero.getX());
        assertEquals(1, hero.getY());
    }


    @Test
    void testMoveSouth() {
        char[][] map = {
                {'.', '.', '.', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '.'}
        };
        Hero hero = new Hero(1, 1, map);
        hero.move('S');
        assertEquals(1, hero.getX());
        assertEquals(2, hero.getY());
    }

    @Test
    void testMoveEast() {
        char[][] map = {
                {'.', '.', '.', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '.'}
        };
        Hero hero = new Hero(1, 1, map);
        hero.move('E');
        assertEquals(2, hero.getX());
        assertEquals(1, hero.getY());
    }

    @Test
    void testMoveWest() {
        char[][] map = {
                {'.', '.', '.', '.'},
                {'.', '#', '.', '.'},
                {'.', '.', '.', '.'}
        };
        Hero hero = new Hero(1, 1, map);
        hero.move('O');
        assertEquals(0, hero.getX());
        assertEquals(1, hero.getY());
    }


}
