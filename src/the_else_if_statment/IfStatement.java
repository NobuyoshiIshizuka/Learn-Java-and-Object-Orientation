package the_else_if_statment;

public class IfStatement {
    public static void main(String[] args) {

        int time = 22;
        if (time < 10){
            System.out.println("Good Morning.");
        } else if (time < 20){
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }

}

