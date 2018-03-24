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

import pl.krzysiek.olejnik.cms.model.Category;
import pl.krzysiek.olejnik.cms.repository.ArticleRepository;
import pl.krzysiek.olejnik.cms.repository.CategoryRepository;

@Controller
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryRepository categoryRepository;
	@Autowired
	ArticleRepository articleRepository;
	@Autowired
	Validator validator;
	
	private static final String CATEGORYFORM = "/form/category";
	private static final String CATEGORYLISTREDIRECT = "redirect:/category/all";

	@GetMapping("/create")
	public String createCategory(Model model) {
		model.addAttribute("category", new Category());
		return CATEGORYFORM;
	}

	@PostMapping("/create")
	public String postCreateCategory(@Valid Category category, BindingResult result) {
		if (result.hasErrors()) {
			return CATEGORYFORM;
		} else {
			categoryRepository.save(category);
			return CATEGORYLISTREDIRECT;
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteCategory(@PathVariable long id, Model model) {
		categoryRepository.deleteById(id);
		return CATEGORYLISTREDIRECT;
	}

	@GetMapping("/update/{id}")
	public String updateCategory(@PathVariable long id, Model model) {
		model.addAttribute("category", categoryRepository.findOneById(id));
		return CATEGORYFORM;
	}

	@PostMapping("/update/{id}")
	public String postUpdateCategory(@Valid Category category, BindingResult result) {
		if (result.hasErrors()) {
			return CATEGORYFORM;
		} else {
			categoryRepository.save(category);
			return CATEGORYLISTREDIRECT;
		}
	}

	@GetMapping("/all")
	public String allCategories(Model model) {
		model.addAttribute("categories", categoryRepository.findAll());
		return "/list/categories";
	}

	@GetMapping("/allarticles/{id}")
	public String allArticlesFromCategory(@PathVariable long id, Model model) {
		model.addAttribute("articlesincategory", articleRepository.findAllArticlesByCategoriesId(id));
		model.addAttribute("category", categoryRepository.findOneById(id));
		return "/list/articlesbycategory";
	}

}
