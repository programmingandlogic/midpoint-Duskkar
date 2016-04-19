/*
 * File: MidpointFindingKarel.java
 * -------------------------------
 * This program makes Karel find the very center of the board. It does this by
 * placeing a row of beeepers, and taking off the ends until there is only one
 * beeper left.
 */

import stanford.karel.*;

public class MidpointFindingKarel extends SuperKarel {

public void run() {
	findmidX();
	findmidY();
}

//finds the middle on an X line
private void findmidX() {
	placeRow();
	bopIt();
	}

//finds the middle on a Y
private void findmidY() {
	turnRight();
	pickBeeper();
	placeRow();
	bopIt();
}

//places a row
private void placeRow() {
	while(frontIsClear()) {
		putBeeper();
		move();
}
	if(!beepersPresent()) {
		putBeeper();
	}
}

//repeats findMid until there is only one beeper.
private void bopIt() {
while(beepersPresent()) {
	findMid();
	} 
		while(frontIsClear()) {
			move();
			}
		turnAround();
		while(!beepersPresent()) {
			move();
		}
	}	

//takes beepers from either side.
private void findMid() {
	while(frontIsClear()) {
		move();
	}
	turnAround();
	while(!beepersPresent()) {
		move();
	}
	pickBeeper();
	while(frontIsClear()) {
		move();
	}
	turnAround();
	while(!beepersPresent()) {
		move();
	}
	pickBeeper();
	move();
	move();
}
}

