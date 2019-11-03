import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Players {
    public String [] players = new String[2];
    private String firstToPlay;
    public String currentPlayer;

    private final static String FIRST_TO_PLAY ="%s commence cette partie de jeu";
    private final static String CURRENT_PLAYER = "Au tour de %s de jouer";



    // FONCTION - Enregistre le nom des joueurs et retourne le tableau 'players' avec les 2 noms
    public String[] playerNames(){
        Scanner sc = new Scanner(System.in);

        // Demande à chaque joueur de rentrer son pseudo/nom
        for (int i=0; i<2;i++){
        System.out.println(String.format("Nom du Joueur %x", i+1));
        String name = sc.nextLine();

        //Enregistre les valeurs de nom dans le tableau 'players'
        players[i] = name;
        }
        System.out.println();
        return players;
    }


    // FONCTION - Aléatoire qui définit quel joueur commence la partie
    public void firstToPlay(String[] players){
        Random rand = new Random();
        int r = rand.nextInt(500);

        //Si le nombre aléatoire généré est <250 alors Joueur 1 commence
        if (r < 250){
            firstToPlay = players[0];
            currentPlayer = firstToPlay;
            System.out.println(String.format(FIRST_TO_PLAY, firstToPlay));

        // Sinon v'est joueur 2 qui commence

        // En même temps on définit le joueur qui commence à jouer comme le joueur qui doit jouer
        // Cela va permettre ensuite de donner la main au second joueur le tour suivant

        } else {
            firstToPlay = players[1];
            currentPlayer = firstToPlay;
            System.out.println(String.format(FIRST_TO_PLAY, firstToPlay));
        }
    }


    // FONCTION -  Passe la main au deuxième joueur pour le tour suivant
    public void nextPlayer(String currentPlayer, String[] players){
        if (currentPlayer.equals(players[0])){
            this.currentPlayer = players[1];
        } else {
            this.currentPlayer = players[0];
        }
        System.out.println();
        System.out.println(String.format(CURRENT_PLAYER, this.currentPlayer));
        System.out.println();
    }


    // FONCTION - Vérification que le choix de colonne est valide (Colonne non pleine cad ligne 5 toujours = '-')
    // Si la colonne est pleine on renvoie une demande au joueur
    public void checkColumnFilling(Puissance4 puissance4, int column){
        if (BoardDisplay.board[column][BoardDisplay.firstLine] != BoardDisplay.tokenSymbol[2]){
            System.out.println(this.currentPlayer + " : Cette colonne est pleine. Veuillez choisir une autre colonne!");
            puissance4.currentPlayerChoice(this.currentPlayer);
        }
        //System.out.println("Le choix est valide ! ");
        puissance4.playerPlayed(this, puissance4.choiceCol);
    }
}
