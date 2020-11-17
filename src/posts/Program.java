package posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import posts.entities.Comment;
import posts.entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment comment1 = new Comment("Tenha uma boa viagem");
		Comment comment2 = new Comment("Uau isso é demais");

		String moment = "21/08/2018 13:05:44";
		String title = "Viajando para nova zelandia";
		String content = "Eu estou indo visitar um país maravilhoso";
		Integer likes = 12;

		Post post1 = new Post(sdf.parse(moment), title, content, likes);

		post1.addComment(comment1);
		post1.addComment(comment2);

		System.out.println(post1);

		// Post 2

		Comment comment3 = new Comment("Boa noite");
		Comment comment4 = new Comment("omaha");

		moment = "28/07/2018 23:14:19";
		title = "Boa noite galera";
		content = "Vejo vocês amanha";
		likes = 5;

		Post post2 = new Post(sdf.parse(moment), title, content, likes);

		post2.addComment(comment3);
		post2.addComment(comment4);

		System.out.println(post2);

	}
}
