package ticTacToe.components;

import ticTacToe.components.*;

public class Board {
    public int size;
    public PlayingPiece[][] board;

    public Board(int size){
        this.size = size;
        board = new PlayingPiece[size][size];
    }

    public boolean addPiece(int row, int column, PlayingPiece piece){
        if( row>=size || column>=size || board[row][column]!=null){return false;}
        board[row][column] = piece;
        return true;
    }

    public void printBoard(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]==null){
                    System.out.print("|   ");
                }
                else if(board[i][j].pieceType == PieceType.X){
                    System.out.print("| X ");
                }
                else if(board[i][j].pieceType == PieceType.O){
                    System.out.print("| O ");
                }
            }
            System.out.println("");
        }
    }

    public boolean isboardFull (){
        int count = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board[i][j]!=null){count++;}
            }
        }
        return count == size*size;
    }
}