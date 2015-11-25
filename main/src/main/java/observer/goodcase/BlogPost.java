package observer.goodcase;

/**
 * Created by Kanstantsin_Makarau on 23-Nov-15.
 */
public class BlogPost {
    private String authorName;
    private String content;
    private int authorAge;

    public BlogPost(String authorName, String content, int authorAge) {
        this.authorName = authorName;
        this.content = content;
        this.authorAge = authorAge;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getAuthorAge() {
        return authorAge;
    }

    public void setAuthorAge(int authorAge) {
        this.authorAge = authorAge;
    }

    @Override
    public String toString() {
        return "BlogPost{" +
                "authorName='" + authorName + '\'' +
                ", content='" + content + '\'' +
                ", authorAge=" + authorAge +
                '}';
    }
}
