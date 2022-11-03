package org.example;

public class Adapter extends IstrategyFiltre{
    private InterfaceNonStandard interfaceNonStandard=new ImplNonStandard();

    public Adapter(Image image) {
        super(image);
    }

    @Override
    public int[] Filtrer() {
        return interfaceNonStandard.Filtrer("FiltreNonStandard", image.getData());
    }

    public void setInterfaceNonStandard(InterfaceNonStandard interfaceNonStandard) {
        this.interfaceNonStandard = interfaceNonStandard;
    }
}
