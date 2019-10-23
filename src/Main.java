public class Main {

    public static void main(String[] args) {
        //sort by lastname then firstname then middle inital finally age descending order
        //capital first letter
        String[] input = {
                "Ben s Rybinski 36",
                "Taylor G Smith 23",
                "Steve j jaden 76",
                "will T Smith 56",
                "Johnson D Stevens 21",
                "Kirk h Willison 33",
                "Steve j Smith 57",
                "steve j smith 58",
                "Albert g Walker 99",
                "Dereck y Albertson 23"
        };
       nameSorter test = new nameSorter();
        for(int i=0;i<test.nameSorter(input).size();i++){
            System.out.println(test.nameSorter(input).get(i).toString());
        }

    }

}
