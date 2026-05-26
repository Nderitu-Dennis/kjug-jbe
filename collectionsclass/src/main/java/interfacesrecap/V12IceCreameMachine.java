package interfacesrecap;

public class V12IceCreameMachine implements IceCreameMachine{
    private String selectedFlavor;
    @Override
    public void pickFlavor(String flavor) {
        selectedFlavor = flavor;
    }
    @Override
    public String produceIceCreame() {
        return "IceCreame: Flavor " + selectedFlavor + " brand " + generateInV12() + addPallet();
    }
    private String generateInV12(){
        return "V12 Type";
    }
}
