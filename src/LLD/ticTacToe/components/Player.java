package ticTacToe.components;

import ticTacToe.components.PlayingPiece;

public class Player {
    public String name;
    public PlayingPiece piece;

    public Player(String n, PlayingPiece p){
        this.name = n;
        this.piece = p;
    }

    public String getPlayerName(){
        return name;
    }

    public void setPlayerName(String newPlayer){
        this.name = newPlayer;
    }

    public PlayingPiece getPlayingPiece(){return this.piece;}

    public void setPlayingPiece(PlayingPiece p){
        this.piece = p;
    }
}