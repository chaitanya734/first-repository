 class ObjectClassMethods {
    public static void main(String[] args) {
        ObjectClassMethods obj = new ObjectClassMethods();

        // getClass() example
        System.out.println("Class Name: " + obj.getClass());

        // hashCode() example
        System.out.println("Hash Code: " + obj.hashCode());

        // toString() example
        System.out.println("String Representation: " + obj.toString());

        // equals() example
        ObjectClassMethods anotherObj = new ObjectClassMethods();
        System.out.println("Are objects equal? " + obj.equals(anotherObj));
    }
}
