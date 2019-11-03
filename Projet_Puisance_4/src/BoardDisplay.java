public class BoardDisplay {
    public static char[][] board;
    static final char[] tokenSymbol = new char[] {'X', 'O', '-'};
    final static int boardWidth = 9;
    final static int boardHeight = 8;
    final static int firstColumn = 1;
    final static int lastColumn = boardWidth - 2;
    final static int firstLine = boardHeight - 2;
    final static int lastLine = 1;

    //FONCTION - Initialisation de la grille avec des '-' dans chaque case vide
    public void initializeGrid (){
        board = new char[boardWidth][boardHeight];
        for (int i =1; i <boardWidth; i++){
            for (int k = 1; k < boardHeight; k++){
                board[i][k] = tokenSymbol[2];
            }
        }
    }


    // FONCTION - Affichage de la grille
    public static void gridDisplay(){
        // Affche la première ligne du tableau avec numéros des colonnes à choisir de jouer par chaque joueur
        for (int c = firstColumn; c <= lastColumn; c++){
            System.out.print(" "+c+" ");
        }
        System.out.println();

        for (int l = firstLine; l >= lastLine; l--){
            for (int c = firstColumn; c <= lastColumn; c++){
                System.out.print(" "+board[c][l]+" ");
        }
            System.out.println();
        }
    }
}
