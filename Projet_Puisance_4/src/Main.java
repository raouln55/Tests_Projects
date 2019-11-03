import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static int playChoice;

    public static void main(String[] args){

    //INITIALISATION DES PARAMETRES

    // Initialisation du nom des joueurs
       Players player = new Players();
       Puissance4 puissance4 = new Puissance4();
       String[] names = player.playerNames();

    // Définition aléatoire du jouer qui joue le premier
       player.firstToPlay(names);

    // Initiaisation dela grille et affichage de la grille avant le début du jeu
       BoardDisplay display = new BoardDisplay();
       display.initializeGrid();
       display.gridDisplay();

    // LANCEMENT DE LA PHASE DE JEU

            // Le currentPlayer fait son choix de colonne
            int playChoice = puissance4.currentPlayerChoice(player.currentPlayer);
            //On vérifie que le choix est valide et que la colonne n'est pas pleine, puis on met à jour la position du jeton avant de lancer l'affichage
           player.checkColumnFilling(puissance4, playChoice);
           player.nextPlayer(player.currentPlayer, player.players);

        while (!Victory_DrawGameConditions.checkVictory() && !Victory_DrawGameConditions.drawGame()) {
            // Le currentPlayer fait son choix de colonne
            playChoice = puissance4.currentPlayerChoice(player.currentPlayer);
            //On vérifie que le choix est valide et que la colonne n'est pas pleine, puis on met à jour la position du jeton avant de lancer l'affichage
            player.checkColumnFilling(puissance4, playChoice);
            player.nextPlayer(player.currentPlayer, player.players);
        }
        if (Victory_DrawGameConditions.checkVictory()){
            System.out.println("Bravo! "+player.currentPlayer + " Vous avez gagné !!");
            newGame();
        }
        if (Victory_DrawGameConditions.drawGame()){
            System.out.println("Plus de possibilités de jeu....Match Nul!!");
            newGame();
        }
    }

    private static void newGame(){
        String[] args = new String[0];
        System.out.println();
        System.out.println("Nouvelle Partie (Yes/No)?");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        switch (result){
            case "Yes":
            case "yes": {
                main(args);
            }
            default:{
                System.out.println("Arrêt du jeu...");
                break;
            }
        }




    }
}
