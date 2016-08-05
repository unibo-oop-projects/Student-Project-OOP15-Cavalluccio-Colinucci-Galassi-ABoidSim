package aboidsim.model;

/**
 *
 * enum with life of single component of the environment. Enum arguments:
 *
 * - Boid Level - Boid Life - Boid Influence Radius - Max Boids of same group
 *
 */

enum Entities {

	TREE_L0("TREE", "tree.png", 0, 500, 30, 50, 0), HERBIVORE_L1("HERBIVORE - LEVEL 1", "herbivore0.png", 1, 100,
			90, 10, 5), HERBIVORE_L2("HERBIVORE - LEVEL 2", "herbivore1.png", 2, 200, 95, 9, 7), HERBIVORE_L3(
					"HERBIVORE - LEVEL 3", "herbivore2.png", 3, 300, 100, 8,
					9), HERBIVORE_L4("HERBIVORE - LEVEL 4", "herbivore3.png", 4, 400, 105, 7, 11), HERBIVORE_L5(
							"HERBIVORE - LEVEL 5", "herbivore4.png", 5, 500, 110, 6,
							13), PREDATOR_L6("PREDATOR - LEVEL 6", "predator0.png", 6, 600, 115, 5, 15), PREDATOR_L7(
									"PREDATOR - LEVEL 7", "predator1.png", 7, 700, 120, 4,
									17), PREDATOR_L8("PREDATOR - LEVEL 8", "predator2.png", 8, 800, 125, 3,
											19), PREDATOR_L9("PREDATOR - LEVEL 9", "predator3.png", 9, 900, 130, 2,
													21), PREDATOR_L10("PREDATOR - LEVEL 10", "predator4.png", 10, 100,
															135, 1, 23);

	private final String image;
	private final String name;
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
	Entities(final String nam, final String img, final int iD, final int lif, final double rad, final int maxM,
			final double avSpeed) {
		this.name = nam;
		this.image = img;
		this.id = iD;
		this.life = lif;
		this.influenceRadius = rad;
		this.maxMembers = maxM;
		this.averageSpeed = avSpeed;
	}

	public String getName() {
		return this.name;
	}

	public String getImage() {
		return this.image;
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
