package pl.krzysiek.olejnik.cms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import pl.krzysiek.olejnik.cms.model.Article;

public interface ArticleRepository extends JpaRepository<Article, Long>{

	List<Article> findAllArticlesByCategoriesId(long id);
	List<Article> findAllArticlesByAuthorId(long id);
	Article findOneById(long id);
	@Query("SELECT article FROM Article article ORDER BY created DESC LIMIT 5")
	List<Article> findFiveNewestArticles();
	
}
