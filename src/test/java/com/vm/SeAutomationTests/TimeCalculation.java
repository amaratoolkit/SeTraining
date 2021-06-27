package com.vm.SeAutomationTests;



import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class TimeCalculation {

	@Test(priority = 1)
	public void testing() {
		write("time", "1000Folder", "5sec");
	}
	
	@Test(priority = 2)
	public void testing1() {
		write("time", "1000Folder", "10sec");
	}

	@SuppressWarnings("unchecked")
	public void write(String fileName, String testName, String timeTaken) {
		{

			JSONObject loadingTimeDetails = new JSONObject();
			loadingTimeDetails.put("Time taken to load", timeTaken);

			JSONObject timeObject = new JSONObject();
			timeObject.put(testName, loadingTimeDetails);

			JSONArray detailsList = new JSONArray();
			detailsList.add(timeObject);

			try (FileWriter file = new FileWriter(fileName + ".json")) {

				file.write(detailsList.toJSONString());
				file.flush();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
