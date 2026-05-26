package interfacesrecap;

public class RobustIceCreamMachine implements IceCreameMachine{
    private String selectedFlavor = "vanilla";
    @Override
    public void pickFlavor(String flavor) {
        selectedFlavor = flavor;
    }
    @Override
    public String produceIceCreame() {
        return "IceCreame:" + selectedFlavor + addPallet();
    }
}
