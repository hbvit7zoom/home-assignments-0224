public class DemoLambda {
    public static void main(String[] args) {
        Swimable action = () -> "I am swim!";

        DoIt doIt = new DoIt();

        System.out.println(doIt.doIt(action));
    }
}

interface Swimable {
    String swim();
}

class DoIt {
    String doIt(Swimable action) {
        return action.swim();
    }
}
