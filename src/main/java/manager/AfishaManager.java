package manager;

import domain.Film;

public class AfishaManager {
    private int filmNumber = 10;

    private Film[] films = new Film[0];

    public int getFilmsCount(){
        return this.films.length;
    }

    public AfishaManager() {
    }

    public AfishaManager(int filmNumber) {
        this.filmNumber = filmNumber;
    }

    public void add(Film film) {
        int length = films.length + 1;
        Film[] newFilms = new Film[length];
        for (int i = 0; i < films.length; i++) {
            newFilms[i] = films[i];
        }
        newFilms[films.length] = film;

        this.films = newFilms;
    }

    public Film[] getLastFilms() {
        Film[] result;
        if (this.films.length <= this.filmNumber) {
            result = new Film[this.films.length];
            for (int i = films.length - 1; i >= 0; i--) {
                result[this.films.length - 1 - i] = this.films[i];
            }
        } else {
            result = new Film[this.filmNumber];
            for (int i = 0; i<this.filmNumber; i++){
                result[i]=this.films[this.films.length-1-i];
            }
        }
        return result;
    }
}
