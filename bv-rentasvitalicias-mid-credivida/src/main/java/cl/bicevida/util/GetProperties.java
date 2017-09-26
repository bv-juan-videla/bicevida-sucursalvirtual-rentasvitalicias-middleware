package cl.bicevida.util;

import java.io.IOException;
import java.util.Properties;

public class GetProperties {

	public GetProperties() {
		// TODO Auto-generated constructor stub
	}
	static Properties prop = new Properties();
	
	public static String obtieneValorProperties(String param) throws IOException{
		
		prop.load(GetProperties.class.getResourceAsStream("/utiles.properties"));
		String url = (String)prop.get(param);
		
		return url;
	}

}
