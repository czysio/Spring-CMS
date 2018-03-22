package pl.krzysiek.olejnik.cms.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.krzysiek.olejnik.cms.model.Author;
import pl.krzysiek.olejnik.cms.repository.AuthorRepository;

public class AuthorsConverter implements Converter<String, Author> {

	@Autowired
	AuthorRepository authorRepository;

	@Override
	public Author convert(String id) {
		return authorRepository.findOneById(Long.parseLong(id));
	}

}
