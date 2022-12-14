package use_your_word.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import use_your_word.request.UtilisateurRequest;

@Controller // on demande ? spring de la manager en tant que Controller web
public class HomeController {
	//@RequestMapping("/welcome")
	@GetMapping("/gameInterface")
//	public String Welcome(HttpSession session,@RequestParam String username, @RequestParam(required=false)Integer id, Model model) {
//		
//		model.addAttribute("utilisateurSession", username);
////		return "/WEB-INF/views/welcome.jsp";
//		return "welcome";
//	}
	public String gameInterface(HttpSession session) {
		if(session.getAttribute("sessionId")==null) {
			return "redirect:/login";
		}
		
	
		return "gameInterface";
	}
	@GetMapping("/gameInterface/{sessionId}")
	public String gameInterfacePathVariable(@PathVariable String sessionId, Model model) {
		model.addAttribute("sessionId", sessionId);
		return "gameInterface";
	}
}
