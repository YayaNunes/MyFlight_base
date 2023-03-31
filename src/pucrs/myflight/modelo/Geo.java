package pucrs.myflight.modelo;

public class Geo {
	private double latitude;
	private double longitude;
	public static final double R = 6371.0; // Raio da Terra em km

	public static double distance(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
        return distance;
    }
	public  double distance(Geo geo1) {
        double dLat = Math.toRadians(latitude - geo1.getLatitude());
        double dLon = Math.toRadians(longitude - geo1.getLongitude());
        double a = Math.pow(Math.sin(dLat / 2), 2) + Math.cos(Math.toRadians(geo1.getLatitude())) * Math.cos(Math.toRadians(latitude)) * Math.pow(Math.sin(dLon / 2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double distance = R * c;
        return distance;
    }
	public Geo(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public double getLatitude() {
		return latitude;
	}
	
	public double getLongitude() {
		return longitude;
	}
}
