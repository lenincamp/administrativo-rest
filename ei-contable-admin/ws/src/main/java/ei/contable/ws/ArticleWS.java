package ei.contable.ws;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import ei.contable.cliente.mdl.dto.ArticleDTO;
import ei.contable.cliente.services.IArticleService;
@Controller
@RequestMapping("user")
public class ArticleWS {
	@Autowired
	private IArticleService articleService;
	@GetMapping("article/{id}")
	public ResponseEntity<ArticleDTO> getArticleById(@PathVariable("id") Integer id) {
		ArticleDTO article = articleService.getArticleById(id);
		return new ResponseEntity<ArticleDTO>(article, HttpStatus.OK);
	}
	@GetMapping("articles")
	public ResponseEntity<List<ArticleDTO>> getAllArticles() {
		List<ArticleDTO> list = articleService.getAllArticles();
		return new ResponseEntity<List<ArticleDTO>>(list, HttpStatus.OK);
	}
	@PostMapping("article")
	public ResponseEntity<Void> addArticle(@RequestBody ArticleDTO article, UriComponentsBuilder builder) {
		boolean flag = articleService.addArticle(article);
		if (flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/article/{id}").buildAndExpand(article.getArticleId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@PutMapping("article")
	public ResponseEntity<ArticleDTO> updateArticle(@RequestBody ArticleDTO article) {
		articleService.updateArticle(article);
		return new ResponseEntity<ArticleDTO>(article, HttpStatus.OK);
	}
	@DeleteMapping("article/{id}")
	public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
		articleService.deleteArticle(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
} 