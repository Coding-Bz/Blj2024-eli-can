import java.util.LinkedList;
import java.util.Scanner;

public class Redirection {


    public void reDirection(LinkedList <String>theList) {
        Scanner scanner = new Scanner(System.in);
        PlayListFunction plf = new PlayListFunction(theList);

        int userChoice = scanner.nextInt();
        if (userChoice==0){
            return;
        }
        switch (userChoice) {
            case 1: {
                System.out.println("Adding a new Song please enter the song name");
                String name = scanner.next();
                plf.addSong(name);

                break;
            }
            case 2: {
                System.out.println("Deleting a song enter the name");
                String name = scanner.next();
                plf.deleteSong(name);

                break;
            }
            case 3: {
                System.out.println("Printing everything out");
                plf.printPlaylist();

                break;

            }
            case 4: {
                System.out.println("Which Song?");
                int user = scanner.nextInt();
                plf.choosingSong(user);

                break;
            }
            case 5: {
                System.out.println("Starting the playlist");
                plf.startPlaylist();

                break;
            }
            case 6: {
                System.out.println("Stoping song-");
                plf.SongStop();

                break;

            }
            case 7: {
                System.out.println("Starting song");
                plf.SongStart();

            }
            default:{
                System.out.println("Invalid choice");
            }
        }


    }}
