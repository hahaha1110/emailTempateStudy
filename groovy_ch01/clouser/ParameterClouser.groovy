class ParameterClouser{
static main(args) {
  def clos = {param -> println "Hello ${param}"}
  clos.call("World")
}

}