package ticTacToe;

import ticTacToe.components.Player;
import ticTacToe.components.Board;
import ticTacToe.components.PlayingPiece;
import ticTacToe.components.PieceType;
import ticTacToe.components.PieceO;
import ticTacToe.components.PieceX;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Game {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame(){
        players = new LinkedList<>();
        PlayingPiece cross = new PieceX();
        PlayingPiece donut = new PieceO();

        Player p1 = new Player("Alice", cross);
        Player p2 = new Player("Bob", donut);

        players.add(p1);
        players.add(p2);

        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean winner = false;

        while(!winner){
            gameBoard.printBoard();

            Player playerTurn = players.removeFirst();

            if(gameBoard.isboardFull()){winner=true; break;}

            //reading the user input
            System.out.print("Player:" + playerTurn.name + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean correctInput = gameBoard.addPiece(inputRow, inputColumn, playerTurn.piece);

            if(!correctInput){
                System.out.println("Incorrect position choose, please try again");
                players.addFirst(playerTurn);
                continue;
            }

            players.addLast(playerTurn);

            winner = isThereWinner(inputRow, inputColumn, playerTurn.piece.pieceType);
            if(winner){
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column, PieceType pieceType) {

        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        //need to check in column
        for(int i=0;i<gameBoard.size;i++) {

            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}