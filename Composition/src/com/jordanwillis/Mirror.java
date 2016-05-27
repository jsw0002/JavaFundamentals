package com.jordanwillis;

/**
 * Created by Jordan on 5/26/2016.
 */
public class Mirror {
    private String shape;
    private boolean isDirty;

    public Mirror(String shape, boolean isDirty) {
        this.shape = shape;
        this.isDirty = isDirty;
    }

    public void cleanMirror(){
        System.out.println("Windex and paper towels are all you need to see yourself clearly.");
        isDirty(true);
    }

    public String getShape() {
        return shape;
    }

    public boolean isDirty(boolean isClean) {
        return isDirty = false;
    }
}
