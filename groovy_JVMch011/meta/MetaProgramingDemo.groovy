import groovy.transform.TypeChecked

@TypeChecked(groovy.transform.TypeCheckingMode.SKIP)
class MetaPrograming{
  def propertyMissing(String name){
    println ("Non-existent property '${name}' was read")
    return -1
  }

  def propertyMissing(String name, agrs){
    println ("Non-existent property '${name}' was written to: '${args}'")
  }

  def methodMissing(String name, args){
    println ("Non-existent method '$name' was called with '$args' parameters")
  }
}
  def demo = new MetaPrograming()
  // 다음 행에서 예외 발생
  demo.nonExistingProperty = "some value"
  println (demo.nonExistingProperty)

  demo.methodThatDoesNoExist(1000, "demo")