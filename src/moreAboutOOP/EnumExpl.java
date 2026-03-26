package moreAboutOOP;

enum Size {
    SMALL, MEDIUM, LARGE, EXTRALARGE;

    public String getSize() {
        switch(this) {
            case SMALL:
                return "small";
            case MEDIUM:
                return "medium";
            case LARGE:
                return "large";
            case EXTRALARGE:
                return "extra large";
            default:
                return null;
        }
    }
} // Aquí cierra el enum Size


public class EnumExpl {
   
    public static void main(String[] args) {
        System.out.println("The size of the pizza is " + Size.SMALL.getSize());
    }
} // Aquí cierra la clase EnumExpl