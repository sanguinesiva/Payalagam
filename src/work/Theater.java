package work;


public class Theater {
	static String theater_name= "Jazz cinemas";// class specific info
	static String movie_name; // object specific 
	static int movie_time; // object specific
	public Theater() {
		// TODO Auto-generated constructor stub
		System.out.println("pongal Movie ");
	}
	
	public static void main(String[] args) {
		Theater screen1= new Theater();// screen1 object reference
		Theater screen2= new Theater();
		Theater screen3= new Theater();
		screen1.movie_name= "varisu"; // assign or initialize 
		screen2.movie_name= "thunivu";
		screen1.movie_time= 1030;
		screen2.movie_time=1200;
		System.out.println(theater_name);// static information.
		System.out.println(screen1.movie_name);
		System.out.println(screen2.movie_time);
		screen1.movie_release();
		screen2.movie_release();
		screen1.movie_theater();
			
	
		
	}
	void movie_release() {
		System.out.println("new movie " + movie_name);
		System.out.println("new movie " + movie_name);
		
	}
	static void movie_theater() {
		System.out.println("cleaning process " + movie_name);
		
	}

}
