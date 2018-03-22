package pl.krzysiek.olejnik.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.krzysiek.olejnik.cms.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

	List<Article> findAllByCategoriesId(long id);
	List<Article> findAllByAuthorId(long id);
	Article findOneById(long id);
//	List<Article> findFiveByCreated();
	
}
