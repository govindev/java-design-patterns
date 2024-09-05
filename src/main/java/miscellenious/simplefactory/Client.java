package miscellenious.simplefactory;

public class Client {
    public static void main(String[] args) {
        Post post = PostFactory.getPost("blog");
        System.out.println(post);
    }
}
