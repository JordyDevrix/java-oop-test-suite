package kassaSysteem;

import java.util.ArrayList;

public class WinkelWagen {
    private ArrayList<String> barcodes;
    private String winkelWagenEigenaar;

    // Creating constructor
    public WinkelWagen(String winkelWagenEigenaar) {
        this.winkelWagenEigenaar = winkelWagenEigenaar;
        this.barcodes = new ArrayList<>();
    }

    public void addProduct(String barcode) {
        barcodes.add(barcode);
    }

    public ArrayList<String> viewWinkelWagen() {
        return barcodes;
    }

    public void removeProduct(String barcode) {
        barcodes.remove(barcode);
    }

    public String devTestView() {
        return String.format("Owner:\t\t%s\nbarcodes:\t%s", winkelWagenEigenaar, barcodes);
    }
}
