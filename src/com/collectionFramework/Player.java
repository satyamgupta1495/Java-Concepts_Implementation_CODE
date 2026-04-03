package com.collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Player implements Comparable<Player> {

    String playerName;
    Integer playerSalary;

    public Player(String name, int salary){
        this.playerName = name;
        this.playerSalary = salary;
        System.out.println(this.playerName + " " +  this.playerSalary);
    }

    public static void main(String[] args) {
        Player p = new Player("satyam", 1);
        Player p2 = new Player("shubham", 100);
        List<Player> list = new ArrayList<>();
        list.add(p2);
        list.add(p);
        list.sort(null);
    }

    public int compareTo(Player p1){
        return Integer.compare(this.playerSalary, p1.playerSalary);
    }
}
