/**
 * Interface for a basic printer.
 */
interface Printer {
    /**
     * Prints a document.
     *
     * @param document The document to be printed.
     */
    void print(String document);
}

/**
 * Interface for a scanner.
 */
interface Scanner {
    /**
     * Scans a document.
     *
     * @return The scanned document.
     */
    String scan();
}

/**
 * Interface for a fax machine.
 */
interface Fax {
    /**
     * Sends a document via fax.
     *
     * @param document The document to be faxed.
     */
    void fax(String document);
}

/**
 * Class representing a multifunction device that implements both Printer and Scanner interfaces.
 */
class MultiFunctionDevice implements Printer, Scanner {
    @Override
    public void print(String document) {
        System.out.println("Printing: " + document);
    }

    @Override
    public String scan() {
        return "Scanned document";
    }
}

/**
 * A simple demonstration of using the MultiFunctionDevice class.
 */
public class Interface_Segregation_Principle {
    public static void main(String[] args) {
        // Create a multifunction device
        MultiFunctionDevice mfd = new MultiFunctionDevice();

        // Perform printing and scanning operations
        mfd.print("Sample document");
        String scannedDoc = mfd.scan();
        System.out.println("Scanned document: " + scannedDoc);
    }
}

/**
 * This example demonstrates the Interface Segregation Principle (ISP) by splitting the functionality
 * of a multifunction device into separate interfaces (Printer and Scanner). Clients can choose to
 * implement only the interfaces they need, avoiding unnecessary dependencies on methods they don't use.
 * This adherence to ISP promotes code modularity and flexibility, as interfaces are tailored to specific
 * client needs, allowing for easier maintenance and extension.
 */

