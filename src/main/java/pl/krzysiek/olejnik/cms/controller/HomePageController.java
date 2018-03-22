package pl.krzysiek.olejnik.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.krzysiek.olejnik.cms.repository.ArticleRepository;

@Controller
public class HomePageController {

	@Autowired
	ArticleRepository articleRepository;
	
	@RequestMapping("")
	public String fiveLeatestArticles(Model model) {
//		model.addAttribute("article", articleRepository.findFiveByCreated());
		return "homepage";
	}
	
}
