public class Game {
    public static int[][] cells = new int[3][3];
    Game(){


    }
    public static void WinChecker(){
        boolean exit = false;
        while(exit == false) {
            int sum = 0;

            //Check For Winning Rows
            for (int i = 0; i < 3; i++) {

                //Fixed i and move through the row with j
                for (int j = 0; j < 3; j++) {
                    final int row = i;
                    final int col = j;

                    sum += Game.cells[row][col];
                }

                //Three options after that:
                if (sum == 3) {
                    System.out.println("X won");
                    exit = true;
                    break;
                } else if (sum == -3) {
                    System.out.println("O won");
                    exit = true;
                    break;
                } else {
                    sum = 0;
                    continue;
                }
            }

            //Check For Winning Columns
            for ( int j = 0; j < 3; j++){

                //Fixed j and move through the column with i
                for ( int i = 0; i < 3; i ++){
                    final int row = i;
                    final int col = j;

                    sum += Game.cells[row][col];
                }

                //Three options:
                if (sum == 3){
                    System.out.println("X won");
                    exit = true;
                    break;
                } else if (sum == -3){
                    System.out.println("O won");
                    exit = true;
                    break;
                } else {
                    sum = 0;
                    continue;
                }
            }

            //Diagonal Win Checker
            for (int i = 0; i < 3; i++){
                final int n = i;

                sum += Game.cells[n][n];
            }
            //Three Options:
            if(sum == 3){
                System.out.println("X won");
                exit = true;
                break;
            } else if (sum == -3){
                System.out.println("O won");
                exit = true;
                break;
            } else {
                sum = 0;
            }

            //Second Diagnal Checker:
            for ( int i =0; i <3; i++){
                for ( int j = 0; j < 3; j++){
                    if ( i + j + 2 == 4){
                        final int row = i;
                        final int col = j;

                        sum += Game.cells[row][col];
                    }
                }
            }
            //Three Options:
            if(sum == 3){
                System.out.println("X won");
                exit = true;
                break;
            } else if (sum == -3){
                System.out.println("O won");
                exit = true;
                break;
            } else {
                sum = 0;
            }


            exit = true;

        }
    }
    public static void XWon(){
        System.out.println("X won");
    }
}
