package com.jordanwillis;

/**
 * Created by Jordan on 6/2/2016.
 */
// Challenge:
// In the following interface declaration, what is the visibility of:
//
// 1. the Accessible interface? - packageprivate accessible to all packages inside com.jordanwillis
// 2. the int variable SOME_CONSTANT - public
// 3. methodA? - public
// 4. methodB and methodC? - public (all interface methods are public)
//
// Hint: think back to the lecture on interfaces before answering.

interface Accessible{
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}