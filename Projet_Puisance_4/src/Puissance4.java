import java.util.InputMismatchException;
import java.util.Scanner;

public class Puissance4 {
    private final static String CURRENT_PLAYER_CHOICE = "Joueur '%s' choisissez une colonne...";
    public static int tokenLine;
    public static int choiceCol;

    // FONCTION - CurrentPlayer joue son tour en faisant son choix de colonne
    public int currentPlayerChoice(String currentPlayer){
        try{
            System.out.println(String.format(CURRENT_PLAYER_CHOICE, currentPlayer));
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            choiceCol = choice;
            if (choice <1 || choice >7){
                System.out.println(String.format("Joueur '%s' Ce choix n'est pas valide. Choisissez une colonne valide" ,currentPlayer));
                currentPlayerChoice(currentPlayer);
            }
            System.out.println(String.format("Joueur '%s' vous avez choisi la colonne n° %x",currentPlayer, choice));
            System.out.println("Confirmation ? (Yes/No)");
            String confirm = sc.next();
            switch (confirm){
                case "Yes":
                    case "yes":
                        case "Y":
                            case "y":
                                {
                                    return choice;
                                }
                                default:{
                                    return currentPlayerChoice(currentPlayer);
                                }
            }
        } catch (InputMismatchException e){
            System.out.println("Les caractères alphabétiques ne sont pas valides. Veuillez saisir un n° de colonne en chiffres");
        }
        return 0;
    }


    // FONCTION - mettre à jour la position des jetons

    public void playerPlayed(Players players, int choosenColumn){
        tokenLine = BoardDisplay.firstLine;
        while (tokenLine > BoardDisplay.lastLine && BoardDisplay.board[choosenColumn][tokenLine - 1] == BoardDisplay.tokenSymbol[2]){
            tokenLine--;
        }
        if (players.currentPlayer == players.players[0]){
            BoardDisplay.board[choosenColumn][tokenLine] = BoardDisplay.tokenSymbol[0];
        } else {
            BoardDisplay.board[choosenColumn][tokenLine] = BoardDisplay.tokenSymbol[1];
        }
        BoardDisplay.gridDisplay();
    }
}






