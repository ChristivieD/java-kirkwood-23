package en.codegym.task.pro.task09.task0912;

/* 
URL validation
*/

public class Solution {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.us", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domainExtension = checkDomainExtension(url);

            System.out.println("URL address: " + url + ", network protocol - " + protocol + ", domain extension - " + domainExtension);
        }
    }

    public static String checkProtocol(String url) {
        //write your code here
        if (url.startsWith("http://")) {
            return "http";
        } else if (url.startsWith("https://")) {
            return "https";
        } else {
            return "unknown";
        }
    }

    public static String checkDomainExtension(String url) {
        //write your code here
        if (url.endsWith(".com")) {
            return "com";
        } else if (url.endsWith(".net")) {
            return "net";
        } else if (url.endsWith(".org")) {
            return "org";
        } else if (url.endsWith(".us")) {
            return "us";
        } else {
            return "unknown";
        }
    }
}
