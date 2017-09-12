package ei.contable.core.persistencia.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ei.contable.cliente.persistencia.dao.IArticleDAO;
import ei.contable.cliente.mdl.dto.ArticleDTO;
@Transactional
@Repository
public class ArticleDAO implements IArticleDAO {
	@PersistenceContext
	private EntityManager entityManager;	
	@Override
	public ArticleDTO getArticleById(int articleId) {
		return entityManager.find(ArticleDTO.class, articleId);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<ArticleDTO> getAllArticles() {
		String hql = "FROM ArticleDTO as atcl ORDER BY atcl.articleId";
		return (List<ArticleDTO>) entityManager.createQuery(hql).getResultList();
	}	
	@Override
	public void addArticle(ArticleDTO article) {
		entityManager.persist(article);
	}
	@Override
	public void updateArticle(ArticleDTO article) {
		ArticleDTO artcl = getArticleById(article.getArticleId());
		artcl.setTitle(article.getTitle());
		artcl.setCategory(article.getCategory());
		entityManager.flush();
	}
	@Override
	public void deleteArticle(int articleId) {
		entityManager.remove(getArticleById(articleId));
	}
	@Override
	public boolean articleExists(String title, String category) {
		String hql = "FROM ArticleDTO as atcl WHERE atcl.title = ? and atcl.category = ?";
		int count = 0;/*entityManager.createQuery(hql).setParameter(1, title)
		              .setParameter(2, category).getResultList().size();*/
		return count > 0 ? true : false;
	}
}
