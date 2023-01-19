import model.MultipleUser;
import model.SingleUser;

public class Application8 {

    public static void main(String[] args) {
        SingleUser user = SingleUser.getInstance();

        MultipleUser user1 = new MultipleUser();

        SingleUser user2 = SingleUser.getInstance();
        MultipleUser user3 = new MultipleUser();

        System.out.println(user + " - "+user2);
        System.out.println(user1 + " - "+user3);

    }
}
