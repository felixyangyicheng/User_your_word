package use_your_word.controller;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/login") //Préfixer tous les mappings des méthode de cette calsse de "/login";
public class LoginController {
	@GetMapping
	public String welcomePathVariable(Model model) {
		// model.addAttribute("utilisateurSession", username);
		return "login";

	}

	@PostMapping
	public String login(@RequestParam String sessionId, HttpSession session, Model model ) {

		if(sessionId.isEmpty()||sessionId.isBlank()) {

			model.addAttribute("error", true);
			
			return "login";
		}
		else {
			
		session.setAttribute("SessionId", sessionId);
		return "redirect:/gameInterface";
		}
	}
}
