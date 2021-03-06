package hi_choi.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PdsController {

	@GetMapping("/pds/list")
	public String list() {
		return "pds/list.tiles";
	}

	@GetMapping("/pds/view")
	public String view() {
		return "pds/view.tiles";
	}

	@GetMapping("/pds/write")
	public String write() {
		return "pds/write.tiles";
	}
	
}
