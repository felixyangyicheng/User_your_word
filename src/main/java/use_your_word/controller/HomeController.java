package use_your_word.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import use_your_word.request.UtilisateurRequest;

@Controller // on demande à spring de la manager en tant que Controller web
public class HomeController {
	//@RequestMapping("/welcome")
	@GetMapping("/welcome")
//	public String Welcome(HttpSession session,@RequestParam String username, @RequestParam(required=false)Integer id, Model model) {
//		
//		model.addAttribute("utilisateurSession", username);
////		return "/WEB-INF/views/welcome.jsp";
//		return "welcome";
//	}
	public String Welcome(HttpSession session) {
		
	
		if(session.getAttribute("utilisateurSession")==null) {
			return "redirect:/login";
		}
		
	
		return "welcome";
	}
	
	@GetMapping("/welcome-binding")
	
	public String welcomeBinding(UtilisateurRequest utilisateurRequest) {
		
		System.out.println(utilisateurRequest.getUsername());
		System.out.println(utilisateurRequest.getId());
		return "welcome";
	}
	
	@GetMapping("/welcome/{username}")
	public String welcomePathVariable(@PathVariable String username, Model model) {
		model.addAttribute("utilisateurSession", username);
		return "welcome";
	}
}
