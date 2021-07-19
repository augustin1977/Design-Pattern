class Main {
  public static void main(String[] args) {
    Factory factory= new Factory();
    AbstractObject A= factory.createObject("C");
    System.out.println(A.getType());
  }
}