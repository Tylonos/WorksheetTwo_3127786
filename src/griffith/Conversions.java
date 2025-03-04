package griffith;

    public class Conversions {

        // Converts Euro to Dollar
        public double euroToDollar(double euro) {
            return euro * 1.1; // Assume 1 Euro = 1.1 USD
        }

        // Converts Dollar to Euro
        public double dollarToEuro(double dollar) {
            return dollar * 0.91; // Assume 1 USD = 0.91 Euro
        }
        // Converts a String to an Integer
        public int stringToInteger(String val) {
            return Integer.parseInt(val);
        }

        // Converts an Integer to a String
        public String integerToString(int val) {
            return String.valueOf(val);
        }

        // Switches case (uppercase to lowercase and vice versa)
        public String switchCase() {
            return "";
        }
    }
