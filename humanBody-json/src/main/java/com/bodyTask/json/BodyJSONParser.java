package com.bodyTask.json;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

import com.bodyTask.model.Arm;
import com.bodyTask.model.Head;
import com.bodyTask.model.HumanBody;
import com.bodyTask.model.Leg;
import com.bodyTask.model.LowerPartOfBody;
import com.bodyTask.model.UpperBody;


public class BodyJSONParser {
	
	private final static InputStream BODY_JSON = BodyJSONParser.class.getClass()
            .getResourceAsStream("/body_1.json");

	public static void main(String[] args) throws IOException {

		JsonParser jsonParser = Json.createParser(BODY_JSON);

		HumanBody humanBody = new HumanBody();
		Head head = new Head();
		UpperBody upperBody = new UpperBody();
		LowerPartOfBody lowerPartOfBody = new LowerPartOfBody();
		Leg leg = new Leg();
		Arm arm = new Arm();
		String keyName = null;
		List<Long> upperArm = new ArrayList<Long>();
		List<Long> foreArm = new ArrayList<Long>();
		List<Long> thigh = new ArrayList<Long>();
		List<Long> calf = new ArrayList<Long>();
		
		while (jsonParser.hasNext()) {
			Event event = jsonParser.next();
			switch (event) {
			case KEY_NAME:
				keyName = jsonParser.getString();
				break;
			case VALUE_STRING:
				setStringValues(head, upperBody, arm, keyName, jsonParser.getString());
				break;
			case VALUE_NUMBER:
				setNumberValues(leg, keyName, jsonParser.getLong(), upperArm, foreArm, thigh, calf);
				break;
			case VALUE_NULL:
				// don't set anything
				break;
			default:
				// we are not looking for other events
			}
		}
		long[] upperArmResult = upperArm.stream().mapToLong(l -> l).toArray();
		arm.setUpperArm(upperArmResult);
		
		long[] foreArmResult = foreArm.stream().mapToLong(l -> l).toArray();
		arm.setForearm(foreArmResult);
		
		long[] thighResult = thigh.stream().mapToLong(l -> l).toArray();
		leg.setThigh(thighResult);
		
		long[] calfResult = calf.stream().mapToLong(l -> l).toArray();
		leg.setCalf(calfResult);
		
		upperBody.setArm(arm);
		lowerPartOfBody.setLeg(leg);
		humanBody.setHead(head);
		humanBody.setUpperBody(upperBody);
		humanBody.setLowerPartOfBody(lowerPartOfBody);
		
		
		System.out.println(humanBody);
		
		//close resources
		BODY_JSON.close();
		jsonParser.close();
	}

	private static void setNumberValues(Leg leg,
			String keyName, long value, List<Long> upperArm, List<Long> foreArm, List<Long> thigh, List<Long> calf) {
		switch(keyName){
		case "upper arm":
			upperArm.add(value);
			break;
		case "forearm":
			foreArm.add(value);
			break;
		case "thigh":
			thigh.add(value);
			break;
		case "calf":
			calf.add(value);
			break;
		case "foot":
			leg.setFoot(value);
			break;
		default:
			System.out.println("Unknown element with key="+keyName);	
		}
	}

	private static void setStringValues(Head head, UpperBody upperBody,
			Arm arm, String key, String value) {
		switch(key){
		case "eye":
			head.setEye(value);
			break;
		case "ear":
			head.setEar(value);
			break;
		case "mouth":
			head.setMouth(value);
			break;
		case "shoulder":
			upperBody.setShoulder(value);
			break;
		case "hand":
			arm.setHand(value);
			break;
		default:
			System.out.println("Unkonwn Key="+key);
				
		}
	}

}
