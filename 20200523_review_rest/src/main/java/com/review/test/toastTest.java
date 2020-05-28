package com.review.test;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class toastTest {
	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/load.do",method = RequestMethod.POST, produces = "applicaton/text; charset=UTF-8;")
	public String load(String seq) throws ParseException {
		System.out.println(seq);
		log.info("============값 저장===========");
		String jsonString="{"
				+ "\"schedule\":"
				+ "[{\"id\":\"1\","
				+ "\"calendarId\":\"song\""
				+ "\"title\":\"java\""
				+ "\"category\":\"time\""
				+ "\"start\":\"2020-05-25T10:30:00\""
				+ "\"end\":\"2020-05-25T12:30:00\""
				+ "\"color\":\"#bbdc00\""
				+ "\"bgColor\":\"#9e5fff\""
				+ "\"dragBgColor\":\"#9e5fff\""
				+ "\"borderColor\":\"#9e5fff\""
				+ "},"
				+ "{\"id\":\"1\","
				+ "\"calendarId\":\"jae\""
				+ "\"title\":\"javascript\""
				+ "\"category\":\"time\""
				+ "\"start\":\"2020-05-26T11:30:00\""
				+ "\"end\":\"2020-05-26T13:30:00\""
				+ "\"color\":\"#bbdc00\""
				+ "\"bgColor\":\"#ff5583\""
				+ "\"dragBgColor\":\"#ff5583\""
				+ "\"borderColor\":\"#ff5583\""
				+ "},"
				+ "{\"id\":\"1\","
				+ "\"calendarId\":\"yeon\""
				+ "\"title\":\"DB\""
				+ "\"category\":\"time\""
				+ "\"start\":\"2020-05-27T12:30:00\""
				+ "\"end\":\"2020-05-27T14:30:00\""
				+ "\"color\":\"#bbdc00\""
				+ "\"bgColor\":\"#dc9656\""
				+ "\"dragBgColor\":\"#dc9656\""
				+ "\"borderColor\":\"#dc9656\""
				+ "}"
				+ "]}";
		
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(jsonString);	
		
		JSONObject json= (JSONObject) obj;
		log.info("============저장된 값 ==={}===",json.toString());
		return json.toString();
	}
	
	@RequestMapping(value="/save.do",method = RequestMethod.POST)
	public String save(String start) {
		System.out.println(start);
		return "";
	}

}
