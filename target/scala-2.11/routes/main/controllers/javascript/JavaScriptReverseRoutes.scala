
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Juan/Projects/play/testLynxCompliance/conf/routes
// @DATE:Fri Jan 26 02:12:21 CST 2018

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:6
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def addBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.addBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "book"})
        }
      """
    )
  
    // @LINE:9
    def getBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.getBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:12
    def editBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.editBook",
      """
        function(id0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "editBook/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:10
    def deleteBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.deleteBook",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteBook/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def getBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.getBook",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "book/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id0)})
        }
      """
    )
  
  }

  // @LINE:17
  class ReversePostController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def showPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.showPosts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "showposts"})
        }
      """
    )
  
    // @LINE:19
    def newPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.newPost",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newpost"})
        }
      """
    )
  
    // @LINE:17
    def addPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.addPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "post"})
        }
      """
    )
  
    // @LINE:21
    def getPosts: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PostController.getPosts",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "posts"})
        }
      """
    )
  
  }

  // @LINE:29
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:16
    def addUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.addUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:22
    def getUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.getUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "users"})
        }
      """
    )
  
    // @LINE:18
    def newUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.newUser",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "newuser"})
        }
      """
    )
  
  }


}
