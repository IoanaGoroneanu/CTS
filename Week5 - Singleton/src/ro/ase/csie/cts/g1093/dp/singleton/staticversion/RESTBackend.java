package ro.ase.csie.cts.g1093.dp.singleton.staticversion;



public class RESTBackend {
	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	//executed only once:
	static {
		System.out.println("Is executed when the class is loaded by the JVM");
		//get the data from config files or something else
		theBackend = new RESTBackend();
		theBackend.url = "www.acs.ase.ro/cts";
	}
	
	{
		System.out.println("Is executed before every constructor call");
	}
	
	private RESTBackend() {
		
	}
	
	/*
	private RESTBackend() {
	//get the data from config files or something else
	}
	*/
	
	/*public static synchronized RESTBackend getRESTBackend(String url, String data) {
		
		if(theBackend == null) {
			
			theBackend = new RESTBackend(url, data);
		}
		
		return theBackend;
	}*/
}
