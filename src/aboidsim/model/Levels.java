package aboidsim.model;

/**
 *
 * enum with lifes of single component of the enviroment. Enum arguments:
 *
 * - Boid Level - Boid Life - Boid Influence Radius - Max Boids of same group
 *
 */

enum Levels {

    BOID_L1(1, 10, 1.5, 10, 1.1), BOID_L2(2, 20, 2.5, 9, 1.2), BOID_L3(3, 30, 3.5, 8, 1.3), BOID_L4(4, 40, 4.5, 7,
            1.4), BOID_L5(5, 50, 5.5, 6, 1.5), BOID_L6(6, 60, 6.5, 5, 1.6), BOID_L7(7, 70, 7.5, 4, 1.7), BOID_L8(8, 80,
                    8.5, 3, 1.8), BOID_L9(9, 90, 9.5, 2, 1.9), BOID_L10(10, 100, 10.5, 1, 2.0);

    private final int id;
    private final int life;
    private final double influenceRadius;
    private final int maxMembers;
    private final double averageSpeed;

    /**
     *
     * @param id
     *            Boid Level
     * @param lif
     *            Boid Life
     * @param rad
     *            Boid Influence Radius
     * @param max_m
     *            Max Boids of same group
     * @param avSpeed
     *            Boid average speed
     */
    Levels(final int iD, final int lif, final double rad, final int maxM, final double avSpeed) {
        this.id = iD;
        this.life = lif;
        this.influenceRadius = rad;
        this.maxMembers = maxM;
        this.averageSpeed = avSpeed;
    }

    public int getId() {
        return this.id;
    }

    public int getLife() {
        return this.life;
    }

    public double getInfluenceRadius() {
        return this.influenceRadius;
    }

    public int getMaxMembers() {
        return this.maxMembers;
    }

    public double getAverageSpeed() {
        return this.averageSpeed;
    }
}
