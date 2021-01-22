/*This question involves reasoning about 
a simulation of a frog hopping in a straight line.
The frog attempts to hop to a goal within a
specified number of hops. The simulaiton is encapsulated in the folowing
FrogSimulation class.
*/

public class FrogSimulation {
  // Distance, in inches, from the starting position to the goal
  private int goalDistance;
  // Maximum number of hops allowed to reach the goal
  private int maxHops;

  /* Constructs a FrogSimulation where dist is the distance, in inches, from the starting
  position to the goal, and numHops is the maximum nubmer of hops allowed to reach the goal.
  Precondition dist > 0; numHops > 0
  */
  public FrogSimulation(int dist, int numHops) {
    goalDistance = dist;
    maxHops = numHops;
  }

  // Returns an integer representing the distance, in inhces, to be moved when the frog hops.
  private int hopDistance() {

  }

  /* Simulates a frog attempting to reach the goal as discribed in part(a)
  Returns true if the frog successfully reached or passed the goal during the simulation
  false otherwise */
  public boolean simulate() {
    // Your code here
  }

  /** Runs num simulations and returns the proportion of simuations in which the forg
  successfully reached or passed the goal
  Precondition: num > 0 */
  public double runSimulations(int num) {
    // Your code Here
  }
}