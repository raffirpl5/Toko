package Toko;

//Intheritance (Perwarisan)
public class CD extends Product {
    private String artist;
    private int numSong;
    private String label; 

    public CD() {
        super(); //constructor dari superclass
        this.artist = "";
        this.numSong = 0;
        this.label = "";
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //Override
    public void printInfo() {
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("Total Song: " + numSong);
        System.out.println("Label: " + label);
    
    }
}