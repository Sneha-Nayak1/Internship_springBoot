package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class FormController {
	@GetMapping("infooo")
	public String infow() {
		return "info";
	}
	@PostMapping("/details")
	public String viewData(@RequestParam("cid") String cid,@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail, ModelMap m) {
		m.put("cid", cid);
		m.put("cname", cname);
		m.put("cemail", cemail);
		return "view";
			
	}

}
