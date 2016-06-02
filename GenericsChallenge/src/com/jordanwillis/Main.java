package com.jordanwillis;

public class Main {

    public static void main(String[] args) {
	    // ArrayList<Team> teams;
        // Collections.sort(teams);
        // Create a generic class to implement a league table for a sport.
        // The class should allow teams to be added to the list, and store
        // a list of teams that belong to the league.
        //
        // Your class should have a method to print out the teams in order,
        // with the team at the top of the league printed first.
        //
        // Only teams of the same type should be added to any particular
        // instance of the league class -  the program should fail to compile
        // if an attempt is made to add an incompatible team.

        League<Team<FootballPlayer>> nfl = new League<>("NFL");

        Team<FootballPlayer> colts = new Team<>("Indianapolis Colts");
        Team<FootballPlayer> titans = new Team<>("Tennessee Titans");
        Team<FootballPlayer> texans = new Team<>("Houston Texans");
        Team<FootballPlayer> jaguars = new Team<>("Jacksonville Jaguars");

        nfl.add(colts);
        nfl.add(texans);
        nfl.add(titans);
        nfl.add(jaguars);

        colts.matchResult(jaguars, 45, 17);
        colts.matchResult(texans, 35, 7);
        colts.matchResult(titans, 63, 0);
        jaguars.matchResult(texans, 28, 17);
        jaguars.matchResult(titans, 55, 42);
        texans.matchResult(titans, 21, 7);

        nfl.showLeagueTable();

    }
}
