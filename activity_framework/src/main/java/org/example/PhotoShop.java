package org.example;

public class PhotoShop {
    private Image image;
    private IstrategyFiltre istrategyFiltre;
    private Compression compression;

    public PhotoShop(Image image, IstrategyFiltre istrategyFiltre, Compression compression) {
        this.image = image;
        this.istrategyFiltre = istrategyFiltre;
        this.compression = compression;
    }
    public int[] EffectuerComression(){
        return compression.compression_Impl();
    }

    public  int[] EffectuerFiltre(){
        return istrategyFiltre.Filtrer();
    }
    public PhotoShop() {
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public IstrategyFiltre getIstrategyFiltre() {
        return istrategyFiltre;
    }

    public void setIstrategyFiltre(IstrategyFiltre istrategyFiltre) {
        this.istrategyFiltre = istrategyFiltre;
    }

    public Compression getCompression() {
        return compression;
    }

    public void setCompression(Compression compression) {
        this.compression = compression;
    }
}
