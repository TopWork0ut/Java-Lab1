package iot;

record ArtificialChrismasTree(String manufacturerName, int heightInSm, float priceInUAH, String material,
	int ageInYears, boolean withArtificialSnow) {

    private static String color = "green";

    public static String getColor() {
	return color;
    }

    public ArtificialChrismasTree() {
	this("CoArtsInnovation", 160, 2000);
    }

    public ArtificialChrismasTree(String manufacturerName, int heightInSm, float priceInUAH) {
	this(manufacturerName, heightInSm, priceInUAH, "plactic", 1, false);
    }

    @Override
    public String toString() {
	return String.format(
		"Manufacturer name of the Christmastree is - %s, the height is %d, the price in uah - %.1f, "
			+ "material - %s, age in years - %d, and the presense of snow is - %b",
		manufacturerName, heightInSm, priceInUAH, material, ageInYears, withArtificialSnow);
    }
}
