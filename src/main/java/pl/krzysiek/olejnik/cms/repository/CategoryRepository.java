package pl.krzysiek.olejnik.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krzysiek.olejnik.cms.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	Category findOneById(long id);

}
