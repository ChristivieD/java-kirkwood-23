package en.codegym.task.pro.task06.task0607;

/* 
Welcome! But not everyone.
*/

public class Solution {

    public static void main(String[] args) {
        String username = "user";
    }

    public static void signIn(String username) {
        username = "user";
        //write your code here
        if(username == "user"){
            return;
        }
        if(username != "user"){
            System.out.println("Welcome, " + username);
            System.out.println("We've really missed you, " + username);

        }
    }
}
