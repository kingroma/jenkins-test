package app.version;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class VersionController {
	protected static final Logger logger = LoggerFactory.getLogger(VersionController.class);
	
	@PostConstruct
	public void init() {
		logger.info("create finish");
	}
	
	@RequestMapping( value = "/version" , method = RequestMethod.GET )
	@ResponseBody
	public Map<String,Object> version(HttpServletRequest request){
		Map<String,Object> result = new HashMap<String,Object>();
		
		result.put("version", "1.0.0");
		
		return result ; 
	}
}
