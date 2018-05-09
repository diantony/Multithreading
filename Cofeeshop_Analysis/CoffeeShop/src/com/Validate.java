package com;

import java.util.List;

import hw3.SimulationEvent;


/**
 * Validates a simulation
 */

/**
 * 
 * @author niran
 * 
 * 
 * @Invariant - the number of customers in the coffee shop can be less then number of tables.
 * @Invariant - The three machines can cook in parellel
 */

public class Validate {
	private static class InvalidSimulationException extends Exception {
		public InvalidSimulationException() { }
	};

	// Helper method for validating the simulation
	private static void check(boolean check,
			String message) throws InvalidSimulationException {
		if (!check) {
			System.err.println("SIMULATION INVALID : "+message);
			throw new Validate.InvalidSimulationException();
		}
	}
	
	/**
	 * @PreCondition - the event list should not be null
	 * @PostCondition - return a boolean flag if the tests passed
	 * @exception - NullPointerException thrown if the events are null
	 */

	/** 
	 * Validates the given list of events is a valid simulation.
	 * Returns true if the simulation is valid, false otherwise.
	 *
	 * @param events - a list of events generated by the simulation
	 *   in the order they were generated.
	 *
	 * @returns res - whether the simulation was valid or not
	 */
	public static boolean validateSimulation(List<SimulationEvent> events) {
		try {
			check(events.get(0).event == SimulationEvent.EventType.SimulationStarting,
					"Simulation didn't start with initiation event");
			check(events.get(events.size()-1).event == 
					SimulationEvent.EventType.SimulationEnded,
					"Simulation didn't end with termination event");

			/* In hw3 you will write validation code for things such as:
				Should not have more eaters than specified
				Should not have more cooks than specified
				The coffee shop capacity should not be exceeded
				The capacity of each machine should not be exceeded
				Eater should not receive order until cook completes it
				Eater should not leave coffee shop until order is received
				Eater should not place more than one order
				Cook should not work on order before it is placed
			 */

			return true;
		} catch (InvalidSimulationException e) {
			return false;
		}
	}
}
