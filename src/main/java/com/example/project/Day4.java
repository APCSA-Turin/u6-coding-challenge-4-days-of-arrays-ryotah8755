package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int distanceTraveled;
        private int speed;
        private int runDuration;
        private int restDuration;
        private int timeRun;
        private int timeRest;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            distanceTraveled = 0;
            this.speed = speed;
            this.runDuration = runDuration;
            this.restDuration = restDuration;
            timeRun = runDuration;
            timeRest = restDuration;
        }

        public int getDistanceTraveled(){ // this method is required
            return distanceTraveled;
        }
        
        public String getName() {
            return name;
        }

        public void simulateSecond(){ //this method is required but not tested
            if (timeRun > 0) {
                distanceTraveled += speed;
                timeRun--;
            } else {
                if (timeRest > 0) {
                    timeRest--;
                } else {
                    timeRun = runDuration;
                    timeRest = restDuration;
                }
            }
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        int maxDistance = 0;
        int distance = 0;
        String reindeerLongestDist = "";
        for (int i = 0; i < reindeers.length; i++) {
            for (int j = 0; j < time; j++) {
                reindeers[i].simulateSecond();
                distance = reindeers[i].getDistanceTraveled();
                if (maxDistance < distance) {
                    maxDistance = distance;
                    reindeerLongestDist = reindeers[i].getName();
                }
            }
        }
        return reindeerLongestDist;
    }

    
    public static void main(String[] args) { // for testing purposed

    }

 
}




