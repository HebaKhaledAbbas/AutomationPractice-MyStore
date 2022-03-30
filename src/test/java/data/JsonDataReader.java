package data;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonDataReader {
	
	public String firstname , lastname , password , Address, City , PostalCode, Mobile, AliaAddress ;

	public void JsonReader() throws FileNotFoundException, IOException, ParseException 

	{
		String filePath = System.getProperty("user.dir")+"/src/test/java/data/UserData.json";

		File srcFile = new File(filePath);
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray)parser.parse(new FileReader(srcFile));

		for (Object jsonObj : jArray) 
		{
			JSONObject person = (JSONObject) jsonObj;
			firstname = (String) person.get("firstname");
			System.out.println(firstname);

			lastname = (String ) person.get("lastname");
			System.out.println(lastname);

			password = (String) person.get("password");
			System.out.println(password);

			Address = (String) person.get("Address");
			System.out.println(Address);

 
			City = (String) person.get("City");
			System.out.println(City);


			PostalCode = (String) person.get("PostalCode");
			System.out.println(PostalCode);
			
			Mobile = (String) person.get("Mobile");
			System.out.println(Mobile);

			AliaAddress = (String) person.get("AliaAddress");
			System.out.println(AliaAddress);

			
		}



	}


}
