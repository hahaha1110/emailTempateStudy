package groovy_ch01;
public class AcessModifier {
  public static void main(String[] args) {
    ClassWithSecret secret = new ClassWithSecret();
    System.out.println(secret.privateNariable);
  }
}

class ClassWithSecret{
  private int privateNariable = -1;
}