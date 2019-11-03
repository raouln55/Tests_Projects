public class Victory_DrawGameConditions {
    final static int[] horizontal = new int[]{1,0};
    final static int[] vertical = new int[]{0,1};
    final static int[] diagonalUp = new int[]{1,1};
    final static int[] diagonalDown = new int[]{1,1};
    final static int[][] checkDirection = new int[][]{horizontal,vertical,diagonalUp,diagonalDown};


    //FONCTION - Victoire/Défaite
    public static boolean checkVictory() {
       int n=0;
       while (n < checkDirection.length){
           if (checkDirections(Main.playChoice, Puissance4.tokenLine, checkDirection[n])){
               n++;
               return true;
           }
       }
       return false;
    }

    //FONCTION - Vérifie toutes les direction à partir du dernier pion joué. Si 4 pions sont trouvés dans une direction, renvoie un 'true'
    public static boolean checkDirections (int choosenColumn, int tokenLine, int[] directions){
        int nextColumn = Main.playChoice + directions[0];
        int nextLine = tokenLine + directions[1];
        int right = 0; // Nombre de cases consécutives du joueur vers l'avant
        while (BoardDisplay.board[nextColumn][nextLine] == BoardDisplay.board[Main.playChoice][tokenLine]){
            nextColumn += directions[0];
            nextLine += directions[1];
            System.out.println(BoardDisplay.board[Main.playChoice][tokenLine]);
            right++;
        }

        // pour avoir le nombre de cases consécutives du joueur vers l'arrière
        nextColumn = Main.playChoice - directions[0];
        nextLine = tokenLine - directions[1];
        int left = 0; // Nombre de cases consécutives du joueur vers l'arrière
        while (BoardDisplay.board[nextColumn][nextLine] == BoardDisplay.board[Main.playChoice][tokenLine]){
            nextColumn -= directions[0];
            nextLine -= directions[1];
            left++;
        }
        // Fait le compte du nombre de cases consécutives pour le joueur qui vient de jouer. Si = 4 alors c'est gagné!!!
        return (left + right + 1) >= 4;
    }


    //FONCTION - Match nul
    public static boolean  drawGame() {
        boolean res = true;
        int n = 0;
        if (!checkVictory()) {
            for (int c = BoardDisplay.firstColumn; c <= BoardDisplay.lastColumn; c++) {
                if (BoardDisplay.board[c][BoardDisplay.firstLine] != BoardDisplay.tokenSymbol[2]){
                //n = 0;
                //while (n <= BoardDisplay.lastColumn && (BoardDisplay.board[c][BoardDisplay.firstLine]) != '-') {
                    n += 1;
                }
            }
        }
        if (n >= 7){
            return true;
        }
        return false;
    }

}
