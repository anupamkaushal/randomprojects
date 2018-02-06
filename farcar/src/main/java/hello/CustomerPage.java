package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerPage {

	@RequestMapping("/customerPage")
	public String customerPage() {
		return "customerPage";
	}
}
