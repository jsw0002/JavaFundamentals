package com.jordanwillis;

/**
 * Created by Jordan on 5/26/2016.
 */
public class Bed {
    private String size;
    private String beddingColor;
    private int numberOfPillows;

    public Bed(String size, String beddingColor, int numberOfPillows) {
        this.size = size;
        this.beddingColor = beddingColor;
        this.numberOfPillows = numberOfPillows;
    }

    public void makeBed(){
        System.out.println("All blankets tucked in tight and pillows stacked accordingly.");
    }

    public String getSize() {
        return size;
    }

    public String getBeddingColor() {
        return beddingColor;
    }

    public int getNumberOfPillows() {
        return numberOfPillows;
    }
}
