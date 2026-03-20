package basicsOPP;

public class ejemploPackage {
    public static void main(String[] args) {
        // Obtener el paquete de la clase actual
        Package pkg = ejemploPackage.class.getPackage();
        
        // Mostrar información del paquete
        System.out.println("Nombre del paquete: " + pkg.getName());
        System.out.println("Versión de la especificación: " + pkg.getSpecificationVersion());
        System.out.println("Proveedor de la implementación: " + pkg.getImplementationVendor());
        System.out.println("¿Está sellado?: " + pkg.isSealed());
    }
}