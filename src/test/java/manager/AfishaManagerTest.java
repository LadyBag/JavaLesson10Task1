package manager;

import domain.Film;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {


    @Test
    void shouldAdd() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));

        assertEquals(5, afishaManager.getFilmsCount());
    }

    @Test
    void getLastFilmsCount() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));
        assertEquals(10, afishaManager.getLastFilms().length);
    }

    @Test
    void getLastFilmslLessThanMaxDefaultCount() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));

        assertEquals(6,afishaManager.getLastFilms().length);
    }

    @Test
    void getLastFilmslMoreThanMaxDefaultCount() {
        AfishaManager afishaManager = new AfishaManager();
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        afishaManager.add(new Film("url4", "ужас", "java for testers4"));
        afishaManager.add(new Film("url5", "ужас", "java for testers5"));
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        assertEquals(10, afishaManager.getLastFilms().length);
    }

    @Test
    void getLastFilmslMoreThanMaxCount() {
        AfishaManager afishaManager = new AfishaManager(2);
        afishaManager.add(new Film("url1", "ужас", "java for testers1"));
        afishaManager.add(new Film("url2", "ужас", "java for testers2"));
        afishaManager.add(new Film("url3", "ужас", "java for testers3"));
        assertEquals(2, afishaManager.getLastFilms().length);
    }

    @Test
    void getLastFilms() {
        AfishaManager afishaManager = new AfishaManager(2);
        Film film = new Film("url1", "ужас", "java for testers1");
        Film film1 = new Film("url2", "ужас", "java for testers2");
        Film film2 = new Film("url3", "ужас", "java for testers3");
        afishaManager.add(film);
        afishaManager.add(film1);
        afishaManager.add(film2);
        assertArrayEquals(new Film[]{film2, film1}, afishaManager.getLastFilms());
    }

    @Test
    void getLastFilmsLess() {
        AfishaManager afishaManager = new AfishaManager(2);
        Film film = new Film("url1", "ужас", "java for testers1");
        afishaManager.add(film);
        Film[] actual = afishaManager.getLastFilms();
        assertArrayEquals(new Film[]{film}, actual);
    }
}