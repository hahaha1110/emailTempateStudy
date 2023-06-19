class ClouserMethod{
  def static Display(clo){
    clo.call("Inenr");
  }

  static void main(args) {
    def str1 = "Hello";
    def clos = {param -> println "${str1} ${param}"}
    clos.call("world")

    // str1dmf clouser로 변경
    str1 = "Welcome"
    clos.call("World")

    // 클로저를 메소드에 전달
    ClouserMethod.Display(clos)
  }

}