
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Juan/Projects/play/testLynxCompliance/conf/routes
// @DATE:Fri Jan 26 02:12:21 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}