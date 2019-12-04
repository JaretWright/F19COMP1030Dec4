import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExamples {
    public static void main(String[] args)
    {
        //using Arrays
        String[] gifts = new String[5];
        gifts[0] = "iPhone XI";
        gifts[1] = "flying V";
        gifts[2] = "Laptop";
        gifts[3] = "Mazda RX7";
        gifts[4] = "socks";
        //gifts[5] = "Burton snowboard";

        ArrayList<String> giftsAL = new ArrayList<>();
        giftsAL.add("Burton snowboard");
        giftsAL.add("tuition");

        System.out.println("Here is the array called gifts: "+gifts);
        System.out.println("Here is the giftsAL ArrayList: "+giftsAL);

        giftsAL.addAll(Arrays.asList(gifts));
        System.out.println("Here is the giftsAL ArrayList: "+giftsAL);

        giftsAL.add(2, "Nintendo Switch");
        System.out.println("Here is the giftsAL ArrayList: "+giftsAL);

        System.out.printf("Does the list contain \"flying V\": %s%n",
                                giftsAL.contains("flying V")?"yes":"no");
        System.out.printf("Does the list contain \"Canon 5D Mark IV\": %s%n",
                giftsAL.contains("Canon 5D Mark IV")?"yes":"no");

        System.out.printf("\"Mazda RX7\" is in position %d%n",giftsAL.indexOf("Mazda RX7"));

        //can be a generic collection, but then you lose the ability to do
        //specific operations on the objects
        ArrayList anythingAL = new ArrayList();
        anythingAL.add(101);
        anythingAL.add("This is a String");
        anythingAL.add(new SecureRandom());

        for (int i=0; i<anythingAL.size(); i++)
            System.out.println(anythingAL.get(i)+"hello");
    }
}
