public class Board{
    Game game = new Game();
    private int[][] board;
    String i0_j0 = " ";
    public Board(){
        // create a new board
        this.board = new int[3][3];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                this.board[i][j] = 0;
            }
        }
    }

    public void setCoordinate(int x, int y, int value){
        this.board[x][y] = value;
    }
    


    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                sb.append("[");
                switch(this.board[i][j]){
                    case 0: sb.append(i+","+j);
                            break;
                    case 1: sb.append(" X ");
                            break;
                    case 2: sb.append(" O ");
                            break;
                }


                sb.append("]");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


}