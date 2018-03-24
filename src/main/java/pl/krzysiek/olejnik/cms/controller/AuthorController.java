package pl.krzysiek.olejnik.cms.controller;

import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.krzysiek.olejnik.cms.model.Author;
import pl.krzysiek.olejnik.cms.repository.ArticleRepository;
import pl.krzysiek.olejnik.cms.repository.AuthorRepository;

@Controller
@RequestMapping("/author")
public class AuthorController {

	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	Validator validator;
	
	private static final String AUTHORFORM = "/form/author";
	private static final String AUTHORLISTREDIRECT = "redirect:/author/all";

	@GetMapping("/create")
	public String createAuthor(Model model) {
		model.addAttribute("author", new Author());
		return AUTHORFORM;
	}

	@PostMapping("/create")
	public String postCreateAuthor(@Valid Author author, BindingResult result) {
		if (result.hasErrors()) {
			return AUTHORFORM;
		} else {
			authorRepository.save(author);
			return AUTHORLISTREDIRECT;
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteAuthor(@PathVariable long id, Model model) {
		authorRepository.deleteById(id);
		return AUTHORLISTREDIRECT;
	}

	@GetMapping("/update/{id}")
	public String updateAuthor(@PathVariable long id, Model model) {
		model.addAttribute("author", authorRepository.findOneById(id));
		return AUTHORFORM;
	}

	@PostMapping("/update/{id}")
	public String postUpdateAuthor(@Valid Author author, BindingResult result) {
		if (result.hasErrors()) {
			return AUTHORFORM;
		} else {
			authorRepository.save(author);
			return AUTHORLISTREDIRECT;
		}	
	}

	@GetMapping("/all")
	public String allAuthors(Model model) {
		model.addAttribute("authors", authorRepository.findAll());
		return "/list/authors";
	}

	@GetMapping("/allarticles/{id}")
	public String allAuthorArticles(@PathVariable long id, Model model) {
		model.addAttribute("authorarticles", articleRepository.findAllArticlesByAuthorId(id));
		model.addAttribute("author", authorRepository.findOneById(id));
		return "/list/articlesbyauthor";
	}

}
