package pl.krzysiek.olejnik.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krzysiek.olejnik.cms.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{

	Author findOneById(long id);

}
