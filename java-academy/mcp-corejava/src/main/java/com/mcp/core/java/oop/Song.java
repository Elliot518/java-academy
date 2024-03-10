package com.mcp.core.java.oop;

/**
 * @author: Elliot
 * @description:
 * @date: Created in 5:04 PM 3/10/24
 * @modified by:
 */
public class Song {
    private String title;
    private String artist;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void play() {
        System.out.println("The artist: " + artist + " plays the song: " + title);
    }

    public static void main(String[] args) {
        Song song1 = new Song();
        song1.setArtist("Travis");
        song1.setTitle("Sing");
        song1.play();
        Song song2 = new Song();
        song2.setArtist("Sex Pistols");
        song2.setTitle("My Way");
        song2.play();
    }
}
