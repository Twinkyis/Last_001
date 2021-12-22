package Last.Strategy;

public class Main {
    public static void main(String[] args) {

        Client_S c = new Client_S();

        int[] arr0 = {4,3,2,1};
        c.getStrategy(new Sort_Z());
        c.executeStrategy(arr0);

        int[] arr1 = {2,6,71,8};
        c.getStrategy(new Sort_V());
        c.executeStrategy(arr1);



    }
}
