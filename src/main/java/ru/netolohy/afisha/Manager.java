package ru.netolohy.afisha;
public class Manager {
    private Posters[] postersLine = new Posters[0];
    private int limit;

    public Manager() {
        this.limit = 5;
    }

    public Manager(int limit) {
        this.limit = limit;
    }

    public void addFilm(Posters poster) {
        Posters[] tmp = new Posters[postersLine.length +1];
        for (int i = 0; i < postersLine.length; i++) {
            tmp[i] = postersLine[i];
        }
        tmp[tmp.length - 1] = poster;
        postersLine = tmp;
    }

    public Posters[] findAll() {
        return postersLine;
    }
    public Posters[] findLast() {
        int reversedLength;
        Posters[] all = findAll();
        if (all.length < limit) {
            reversedLength = all.length;
        } else {
            reversedLength = limit;
        }
        Posters[] reversed = new Posters[reversedLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }
}