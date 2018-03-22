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

	@GetMapping("/create")
	public String createCategory(Model model) {
		model.addAttribute("category", new Category());
		return "categoriesForm";
	}

	@PostMapping("/create")
	public String postCreateCategory(@Valid Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "categoriesForm";
		} else {
			categoryRepository.save(category);
			return "redirect:/category/all";
		}
	}

	@GetMapping("/delete/{id}")
	public String deleteCategory(@PathVariable long id, Model model) {
		categoryRepository.deleteById(id);
		return "redirect: /SpringCMS/category/all";
	}

	@GetMapping("/find/{id}")
	public String findCategoryById(@PathVariable long id, Model model) {
		model.addAttribute("categories", categoryRepository.findOneById(id));
		return "categoriesList";
	}

	@GetMapping("/update/{id}")
	public String updateCategory(@PathVariable long id, Model model) {
		model.addAttribute("category", categoryRepository.findOneById(id));
		return "categoriesForm";
	}

	@PostMapping("/update/{id}")
	public String postUpdateCategory(@Valid Category category, BindingResult result) {
		if (result.hasErrors()) {
			return "categoriesForm";
		} else {
			categoryRepository.save(category);
			return "redirect: /SpringCMS/category/all";
		}
	}

	@GetMapping("/all")
	public String allCategories(Model model) {
		model.addAttribute("categories", categoryRepository.findAll());
		return "categoriesList";
	}

	@GetMapping("/allarticles/{id}")
	public String allArticlesFromCategory(@PathVariable long id, Model model) {
		model.addAttribute("articlesincategory", articleRepository.findAllByCategoriesId(id));
		model.addAttribute("category", categoryRepository.findOneById(id));
		return "categoryArticles";
	}

}
