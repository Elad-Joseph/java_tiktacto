public class Game {
    private Board board;
    private Player player;
    public int row;
	public int col;
    public static void main(String[] args) {
        boolean flag = true;
        Board board = new Board(); // create a new board
        Player player = new Player(); // create a new player
        
        String player1 = player.getUserInput(3); // create a name for the player with the mark "x"
        String player2 = player.getUserInput(3); // create a name for the player with the mark "y"
        
        int counter = 0;
        int symbol;

        while (flag){
            System.out.println(board); // print the board
            // set turn
            symbol = 1;
            player = new Player(player1);
            if(counter % 2 != 0){
                symbol = 2;
                player = new Player(player2);
            }
            counter++;

            // get user input
            String row = player.getUserInput(1); // get row from user
            String col = player.getUserInput(2); // get col from user
            
            int rowInt = Integer.parseInt(row); // convert row to int
            int colInt = Integer.parseInt(col); // convert col to int
            board.setCoordinate(rowInt, colInt, symbol); // set the coordinate to the board
        }
        
        //board.setCoordinate(1, 1, 1);
        System.out.println(board);

    }
}
