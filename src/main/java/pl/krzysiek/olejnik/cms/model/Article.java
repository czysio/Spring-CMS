package pl.krzysiek.olejnik.cms.model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import pl.krzysiek.olejnik.cms.validator.ArticleContentMinLength;
import pl.krzysiek.olejnik.cms.validator.ArticleTitleMaxLength;

@Entity
@Table(name = "article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ArticleTitleMaxLength
	private String title;
	@ManyToOne
	@JoinColumn(name = "author_id")
	@NotNull
	private Author author;
	@ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();
	@Column(columnDefinition = "TEXT")
	@ArticleContentMinLength
	private String content;
	
	@CreationTimestamp
	@Column(updatable = false)
	private Timestamp created;

	@UpdateTimestamp
	private Timestamp updated;

	public Article() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s, %s %s", title, author, content, created, updated);
	}

	
	
}
