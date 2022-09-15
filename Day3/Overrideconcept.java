public class Overrideconcept {
    public static void main(String args[]){

        Travel ov = new Travel();
        ov.travel();
        Travel fl = new Ship();
        fl.travel();
        Travel sh = new Flight();
        sh.travel();

    }

}

    class  Travel{
    public void travel(){
            System.out.println("traveling in all ways ");

    }

    }

    class Flight extends Travel{
        public void travel(){
                System.out.println("travel by sky");
        }
        }

    class Ship extends Travel{
        public void Travel(){
            System.out.println("travel by sky");
        }

    }