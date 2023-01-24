package work;

public class Whatsapp {
	private int profit=100;
	int otp;

	public static void main(String[] args) {
		Whatsapp wapp = new Whatsapp();
		wapp.send_msg();
		wapp.call();
		wapp.collect_data();

	}

	void send_msg() {
		System.out.println("sending");

	}

	void call() {
		System.out.println("calling");

	}

	private void collect_data() {
		System.out.println("collectdata");

	}

}
