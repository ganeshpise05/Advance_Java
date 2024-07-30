package Collection;
 

public class HollyWoodSong_Object {
    public static void main(String[] args) {
        // Creating an array of HollywoodSong objects
        HollywoodSong[] songs = new HollywoodSong[10];

        // Adding HollywoodSong objects to the array
        songs[0] = new HollywoodSong("Shallow", "A Star is Born", "A Star is Born", 5, "Lady Gaga, Bradley Cooper", 2018, 3.36, "Lady Gaga, Andrew Wyatt, Anthony Rossomando, Mark Ronson");
        songs[1] = new HollywoodSong("Let It Go", "Frozen", "Frozen", 5, "Idina Menzel", 2013, 3.44, "Kristen Anderson-Lopez, Robert Lopez");
        songs[2] = new HollywoodSong("Skyfall", "Skyfall", "Skyfall", 5, "Adele", 2012, 4.46, "Adele, Paul Epworth");
        songs[3] = new HollywoodSong("My Heart Will Go On", "Titanic", "Titanic", 5, "Celine Dion", 1997, 4.40, "Will Jennings, James Horner");
        songs[4] = new HollywoodSong("Happy", "Despicable Me 2", "Despicable Me 2", 5, "Pharrell Williams", 2013, 3.53, "Pharrell Williams");
        songs[5] = new HollywoodSong("Lose Yourself", "8 Mile", "8 Mile", 5, "Eminem", 2002, 5.26, "Eminem, Jeff Bass, Luis Resto");
        songs[6] = new HollywoodSong("A Whole New World", "Aladdin", "Aladdin", 5, "Peabo Bryson, Regina Belle", 1992, 4.05, "Alan Menken, Tim Rice");
        songs[7] = new HollywoodSong("Beauty and the Beast", "Beauty and the Beast", "Beauty and the Beast", 5, "Celine Dion, Peabo Bryson", 1991, 4.04, "Howard Ashman, Alan Menken");
        songs[8] = new HollywoodSong("I Don't Want to Miss a Thing", "Armageddon", "Armageddon", 5, "Aerosmith", 1998, 4.58, "Diane Warren");
        songs[9] = new HollywoodSong("Everything I Do (I Do It for You)", "Robin Hood: Prince of Thieves", "Robin Hood: Prince of Thieves", 5, "Bryan Adams", 1991, 6.34, "Bryan Adams, Michael Kamen, Robert John Lange");

        // Printing out each song using the toString method
        for (HollywoodSong song : songs) {
            System.out.println(song);
        }
    }
}
