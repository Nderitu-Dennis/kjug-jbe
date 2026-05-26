import interfacesrecap.IceCreameMachine;
import interfacesrecap.RobustIceCreamMachine;
import interfacesrecap.V12IceCreameMachine;

void main() {
    IceCreameMachine machine = new RobustIceCreamMachine();
    machine.pickFlavor("strawberry");
    var iceCreame = machine.produceIceCreame();
    IO.println("we got " + iceCreame);

    IceCreameMachine v12Machine = new V12IceCreameMachine();
    v12Machine.pickFlavor("Vanilla");
    var v12IceCreame = v12Machine.produceIceCreame();
    IO.println("we got " + v12IceCreame);
}
