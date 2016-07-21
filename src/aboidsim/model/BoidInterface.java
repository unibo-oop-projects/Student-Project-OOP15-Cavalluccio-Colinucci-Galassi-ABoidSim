package aboidsim.model;

import java.util.Set;

import aboidsim.util.Vector;

/**
 *
 * General Boid Interface.
 *
 */

public interface BoidInterface {

    /**
     * check closest boids of other types.
     */
    void checkNearBoids();

    /**
     * check closest boids of same type.
     */
    void checkSameCloseBoid();

    /**
     * decrement life each loop iteration.
     */
    void decrementLife();

    /**
     *
     * @return Is Boid hungry or not
     */
    boolean isHungry();

    /**
     * A boid eating from a tree or eating other boids if predator.
     */
    void eating();

    /**
     *
     * @return Boid level
     */
    int getLevel();

    /**
     *
     * @return Boid position
     */
    Vector getPosition();

    /**
     *
     * @return Boid life
     */
    int getLife();

    /**
     *
     * @return a Set of closest boids
     */
    Set<Boid> getNearBoids();

    /**
     *
     * @return Boid acceleration
     */
    Vector getAcceleration();

    /**
     *
     * @return Boid speed
     */
    Vector getSpeed();

    /**
     *
     * @return Boid average speed
     */
    double getAverageSpeed();

    /**
     *
     * @return max Member of a Boid group
     */
    int getMaxMembers();

    /**
     *
     * @return Boid influence radius
     */
    double getInfluenceRadius();
}
