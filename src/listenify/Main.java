package listenify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Making Album a1
        Album a1 = new Album("Arijit Singh");

        a1.addSongToAlbum("Tum hi ho", 4.5);
        a1.addSongToAlbum("Dua", 5.0);
        a1.addSongToAlbum("Mareez-e-isque", 6.20);
        a1.addSongToAlbum("Khamosiya", 3.50);

//Making Album a2
        Album a2 = new Album("Yo Yo Honey Singh");

        a2.addSongToAlbum("Bonita", 3.20);
        a2.addSongToAlbum("Birthday Bash", 4.00);
        a2.addSongToAlbum("Blue Eyes", 4.20);
        a2.addSongToAlbum("Brown Rang", 3.50);

//Adding Songs to Playlist from Albums:-
// Here we r trying to use of ploymorphism concept, Method_name same but Signature is different
        List<Song> playlist = new ArrayList<>();
        a1.addSongToPlaylist(1, playlist);
        a1.addSongToPlaylist(3, playlist);
        a2.addSongToPlaylist("Bonita", playlist);
        a2.addSongToPlaylist("Brown Rang", playlist);


        //we r simply trying to play 1st song.
        int currentIndex = 0;
        System.out.println("Now playing " + playlist.get(currentIndex).toString());

        printMenu();

        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();

        boolean keepPlayingPlaylist= true;

        while (keepPlayingPlaylist){

            switch (choice){

                case 1:
                    if(currentIndex != playlist.size()-1)
                        currentIndex++;
                    else
                        currentIndex=0;
                    System.out.println("Now playing " + playlist.get(currentIndex).toString());  //here playlist.get(currentInd..) is object
                                  break;
                case 2:
                    if(currentIndex !=0){
                        currentIndex--;
                    }
                    //for going to last song
                    //playlist.size()-1;

                    System.out.println("Now playing " + playlist.get(currentIndex).toString());
                    break;

                case 3:
                    System.out.println("Now playing " + playlist.get(currentIndex).toString());
                    break;


                case 4:
                             printPlayList(playlist);
                             break;
                case 5:
                    Collections.shuffle(playlist);
                    System.out.println("Shuffled completed");
                    break;

                case 6:
                    printMenu();
                    break;

                case 7:
                    playlist.remove(currentIndex);
                    break;

                case 8:
                    keepPlayingPlaylist=false;
                    break;
            }
            System.out.println("Enter the choice");
            choice=s.nextInt();
        }


    }
    public static void printPlayList(List<Song> playlist){
        System.out.println("The PlayList Songs are :");
        for(Song song :playlist){
            System.out.println(song.toString());
        }
    }
         public static void printMenu(){
            System.out.println("Enter the choice");
            System.out.println("1. Play the next song");
            System.out.println("2. Play the previous song");
            System.out.println("3. Repeat the current song");
            System.out.println("4. Show Playlist");
            System.out.println("5. Shuffle the Playlist");
            System.out.println("6. Print the Menu");
            System.out.println("7. Delete the Song");
            System.out.println("8. Exit the PlayList");





        }




}



