
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/juanpurata/Projects/play/play_example_blog/conf/routes
// @DATE:Fri Jan 26 09:24:38 CST 2018


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
