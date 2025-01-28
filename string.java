public class string {
    public static void main(String[] args){
        String message = "Good morning ";
        String forYou = "Lie and lyre sounds the same ";
        System.out.println(message);
        System.out.println(forYou + message);
        System.out.println(message.length());
        System.out.println(message.substring(0, 5));
        System.out.println(message.charAt(5));
        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        String message3 = "  This Message is a mess   ";
        System.out.println(message3.trim());

        //Replace one letter or the whole word by this methord
        String message2 = message.replace("morning", "night");
        System.out.println(message2);


    }
}
