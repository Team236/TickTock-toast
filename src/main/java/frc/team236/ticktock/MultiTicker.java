package frc.team236.ticktock;

import java.util.Vector;

import frc.team236.ticktock.lib.Tickable;

/**
 * MultiLooper.java
 * 
 * Runs several Loopables simultaneously with one Looper. Useful for running a
 * bunch of control loops with only one Thread worth of overhead.
 * 
 * @author Tom Bottiglieri
 */
public class MultiTicker implements Tickable {
	private Ticker ticker;
	private Vector loopables = new Vector();

	public MultiTicker(double period) {
		ticker = new Ticker(this, period);
	}

	@Override
	public void update() {
		int i;
		for (i = 0; i < loopables.size(); ++i) {
			Tickable c = (Tickable) loopables.elementAt(i);
			if (c != null) {
				c.update();
			}
		}
	}

	public void start() {
		ticker.start();
	}

	public void stop() {
		ticker.stop();
	}

	public void addLoopable(Tickable c) {
		loopables.addElement(c);
	}
}
