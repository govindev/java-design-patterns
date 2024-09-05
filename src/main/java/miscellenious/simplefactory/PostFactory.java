package miscellenious.simplefactory;

public class PostFactory {

    public static Post getPost(String type) {
        switch(type) {
            case "news" : return new NewsPost();
            case "blog" : return new BlogPost();
            case "product": return new ProductPost();
            default : throw new IllegalArgumentException("Unknown post type");
        }
    }
}
