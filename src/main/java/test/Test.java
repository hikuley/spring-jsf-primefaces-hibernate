package test;

import com.ibrahimkuley.entity.Article;
import com.ibrahimkuley.service.ArticleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hikuley on 19.10.2014.
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        ArticleService articleDAOImpl = (ArticleService) context.getBean("articleService");
        Article article = new Article();
        article.setAuthor("Halil ibrahim");
        article.setContent("Hayatin Anlami bence Ebru");
        article.setTitle("Ebruyu seviyorum olene kadar!");
        article.setCategory("Ask Mevsimi2 Mevsimi2 Mevsimi2");


        articleDAOImpl.addArticle(article);
        System.out.println("kayıtlar eklendi");
    }

}
