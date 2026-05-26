package interfacesrecap;

public interface IceCreameMachine {
    void pickFlavor(String flavor);
    String produceIceCreame();
    default String addPallet() { // optional
        return "\tAdded Pallets \t";
    }
}
