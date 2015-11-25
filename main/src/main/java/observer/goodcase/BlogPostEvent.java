package observer.goodcase;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class BlogPostEvent {

    private BlogPost blogPost;

    public BlogPostEvent(BlogPost blogPost) {
        this.blogPost = blogPost;
    }

    public BlogPost getBlogPost() {
        return blogPost;
    }

}
