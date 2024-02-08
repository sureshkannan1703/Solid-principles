package bird_version2;

public interface Flyable {

    abstract void fly();

   // abstract void wingflapping();

    /*
    * Note :
    * Fly and wingflapping looks like related functionalities.if we add it to Flyable interface,
    * In, future if a Aeroplane class can implement the Flyable interface at that time,
    * We need to remove existing wingflapping from Flyable -> Brok's SRP/OCP
    * Or Flyable should forces Aeroplance class to implement wingflapping() -> Broke's Liskov
    *
    * wingfalpping() more related to Bird's so put it in Bird interface.
    * */
}
