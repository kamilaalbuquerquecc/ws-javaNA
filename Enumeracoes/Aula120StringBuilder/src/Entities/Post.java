package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	// pra não ter que colocar em toda aplicação
	private static SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	
	
	private List<Comment> comments = new ArrayList<>();
	//ao criar contrutor, n coloca lista
	
	public Post() {
		
	}
	public Post(Date moment, String title, String content, Integer likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}
	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	public List<Comment> getComments(){
		return comments;
	}
	//não pode ter o set de lista, pois n pode substituir uma lista
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}
	@Override
	/*public String toString() {
		return "Post \nmoment=" + moment + ", \ntitle=" + title + ", \ncontent=" + content + ", \nlikes=" + likes
				+ ", \ncomments=" + comments + "]";
	}*/
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		sb.append(title+"\n");
		sb.append(likes );
		sb.append( " likes - ");
		sb.append( sdf.format(moment) +"\n");
		sb.append(content + "\n");
		sb.append("Comments: \n");
		for ( Comment c: comments) {
			sb.append(c.getText() + "\n");
		}
		//converte o sb pra String
		return sb.toString();
	}
	

}
