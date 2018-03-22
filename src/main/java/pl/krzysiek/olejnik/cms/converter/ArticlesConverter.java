package pl.krzysiek.olejnik.cms.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.krzysiek.olejnik.cms.model.Article;
import pl.krzysiek.olejnik.cms.repository.ArticleRepository;

public class ArticlesConverter implements Converter<String, Article> {

	@Autowired
	ArticleRepository articleRepository;

	@Override
	public Article convert(String id) {
		return articleRepository.findOneById(Long.parseLong(id));
	}

}
