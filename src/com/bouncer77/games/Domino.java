package com.bouncer77.games;

import java.util.*;

public class Domino {

    private final List<DominoPiece> dominoPieceSet = generateSetDominoes();
    private List<DominoPiece> playerPieces = new ArrayList<>();
    private List<DominoPiece> computerPieces = new ArrayList<>();
    private List<DominoPiece> stockPieces = new ArrayList<>();

    public Domino() {

        List<DominoPiece> dominoPieceList = new ArrayList<>(dominoPieceSet);
        Collections.shuffle(dominoPieceList);

        for (int i = 0; i < dominoPieceList.size(); i++) {
            if (i < 7)
                playerPieces.add(dominoPieceList.get(i));
            else if (i < 14)
                computerPieces.add(dominoPieceList.get(i));
            else
                stockPieces.add(dominoPieceList.get(i));
        }

        System.out.println(printDominoes(dominoPieceSet, "DominoPieceSet"));
        System.out.println(printDominoes(playerPieces, "PlayerSet"));
        System.out.println(printDominoes(computerPieces, "ComputerSet"));
        System.out.println(printDominoes(stockPieces, "StockSet"));

    }

    public static String printDominoes(List<DominoPiece> dominoPieces, String name) {
        return name + ":\n"
                + "Size: " + dominoPieces.size() + "\n"
                + dominoPieces + "\n";
    }

    public static List<DominoPiece> generateSetDominoes() {
        Set<DominoPiece> dominos = new HashSet<>();
        for (int i = 0; i < 7; ++i) {
            for (int j = 0; j < 7; ++j) {
                dominos.add(new DominoPiece(i, j)); // 28 уникальных фишек
            }
        }
        List<DominoPiece> dominoPieceList = new ArrayList<>(dominos);
        return dominoPieceList;
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
