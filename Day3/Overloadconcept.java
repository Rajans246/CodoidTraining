public class Overloadconcept{

    public static void main(String args[])
    {
        Overloadconcept nt = new Overloadconcept();
                nt.vehicle("bike",100,"hand");
                nt.vehicle("car",200,"leg", "manual door ");
                nt.vehicle("flight",1000,"air brake", "hydralic" ," fly above 36000 feet ");

    }

    void vehicle(String name,int speed,String brake){

        System.out.println("name "+ name +",  type of brake by"+ brake +" speed limit "+ speed );

    }

    void vehicle(String name,int speed,String brake,String doors){

        System.out.println("name "+ name+",  type of brake by"+ brake +" speed limit "+ speed + " doors " + doors);

    }
    void vehicle(String name,int speed,String brake,String doors,String fly){

        System.out.println("name "+ name+",  type of brake by "+ brake +" speed limit "+ speed + " doors " + doors +" fly ability " + fly);

    }

}