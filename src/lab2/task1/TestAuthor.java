package lab2.task1;

public class TestAuthor {
    public static void main(String[] args){
        Author author = new Author("Andrey", "andrey15062003@mail.ru", 'm');
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
        author.setEmail("AndreyCringe4@yandex.ru");
        System.out.println(author.toString());
    }
}
