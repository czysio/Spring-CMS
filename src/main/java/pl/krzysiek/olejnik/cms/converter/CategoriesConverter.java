package pl.krzysiek.olejnik.cms.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.krzysiek.olejnik.cms.model.Category;
import pl.krzysiek.olejnik.cms.repository.CategoryRepository;

public class CategoriesConverter implements Converter<String, Category> {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public Category convert(String id) {
		return categoryRepository.findOneById(Long.parseLong(id));
	}

}
