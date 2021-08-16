package com.bouncer77.games;

import java.util.*;

public class Domino {

    private Set<DominoPiece> dominoPieceSet;
    private Set<DominoPiece> playerPieces = new HashSet<>();
    private Set<DominoPiece> computerPieces = new HashSet<>();
    private Set<DominoPiece> stockPieces = new HashSet<>();

    public Domino() {
        dominoPieceSet = generateSetDominoes();

        List<DominoPiece> dominoPieceList = new ArrayList<>(dominoPieceSet);
        //System.out.println("Original items: ");
        //System.out.println(dominoPieceList);
        //System.out.println();

        Collections.shuffle(dominoPieceList);
        //System.out.println("After shuffle");
        //System.out.println(dominoPieceList);

        for (int i = 0; i < dominoPieceList.size(); i++) {
            if (i < 7)
                playerPieces.add(dominoPieceList.get(i));
            else if (i < 14)
                computerPieces.add(dominoPieceList.get(i));
            else
                stockPieces.add(dominoPieceList.get(i));
        }

        System.out.println(printSetDominoes(dominoPieceSet, "DominoPieceSet"));
        System.out.println(printSetDominoes(playerPieces, "PlayerSet"));
        System.out.println(printSetDominoes(computerPieces, "ComputerSet"));
        System.out.println(printSetDominoes(stockPieces, "StockSet"));

    }

    public static String printSetDominoes(Set<DominoPiece> dominoPieces, String name) {
        return name + ":\n"
                + "Size: " + dominoPieces.size() + "\n"
                + dominoPieces + "\n";
    }

    public static Set<DominoPiece> generateSetDominoes() {
        Set<DominoPiece> dominos = new HashSet<>();
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                dominos.add(new DominoPiece(i, j)); // 28 уникальных фишек
            }
        }
        return dominos;
    }

    @Override
    public String toString() {
        return "Domino {"
                + dominoPieceSet.size()
                + ": "
                + dominoPieceSet
                + '}';
    }
}
