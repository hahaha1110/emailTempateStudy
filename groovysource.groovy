class Person{
  String name
  static main(String[] args) {
   def p = new Person()
   p.name = "foobar"
   println p.name
  }
}