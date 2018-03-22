package pl.krzysiek.olejnik.cms.controller;

import java.util.Collection;

import javax.validation.Valid;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pl.krzysiek.olejnik.cms.model.Article;
import pl.krzysiek.olejnik.cms.model.Author;
import pl.krzysiek.olejnik.cms.model.Category;
import pl.krzysiek.olejnik.cms.repository.ArticleRepository;
import pl.krzysiek.olejnik.cms.repository.AuthorRepository;
import pl.krzysiek.olejnik.cms.repository.CategoryRepository;

@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	AuthorRepository authorRepository;
	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	Validator validator;
	
	private static final String ARTICLESFORM = "articlesForm";

	@GetMapping("/create")
	public String createArticle(Model model) {
		model.addAttribute("article", new Article());
		return ARTICLESFORM;
	}

	@PostMapping("/create")
	public String postCreateArticle(@Valid Article article, BindingResult result) {
		if (result.hasErrors()) {
			return ARTICLESFORM;
		} else {
			articleRepository.save(article);
			return "redirect:/article/all";
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteArticle(@PathVariable long id, Model model) {
		articleRepository.deleteById(id);
		return "redirect: article/all";
	}

	@GetMapping("/update/{id}")
	public String updateArticle(@PathVariable long id, Model model) {
		model.addAttribute("article", articleRepository.findOneById(id));
		return ARTICLESFORM;
	}

	@PostMapping("/update/{id}")
	public String postUpdateArticle(@Valid Article article, BindingResult result) {
		if (result.hasErrors()) {
			return "/update/{id}";
		} else {
			articleRepository.save(article);
			return "redirect: article/all";
		}
	}

	@GetMapping("/all")
	public String allArticles(Model model) {
		model.addAttribute("articles", articleRepository.findAll());
		return "articlesList";
	}

	@ModelAttribute("authors")
	public Collection<Author> authors() {
		return authorRepository.findAll();
	}

	@ModelAttribute("categories")
	public Collection<Category> categories() {
		return categoryRepository.findAll();
	}

}
