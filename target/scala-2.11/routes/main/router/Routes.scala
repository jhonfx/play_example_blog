
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/Juan/Projects/play/testLynxCompliance/conf/routes
// @DATE:Fri Jan 26 02:12:21 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  BookController_0: controllers.BookController,
  // @LINE:16
  UserController_1: controllers.UserController,
  // @LINE:17
  PostController_3: controllers.PostController,
  // @LINE:29
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    BookController_0: controllers.BookController,
    // @LINE:16
    UserController_1: controllers.UserController,
    // @LINE:17
    PostController_3: controllers.PostController,
    // @LINE:29
    Assets_2: controllers.Assets
  ) = this(errorHandler, BookController_0, UserController_1, PostController_3, Assets_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, BookController_0, UserController_1, PostController_3, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.BookController.index()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """book""", """controllers.BookController.addBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """book/""" + "$" + """id<[^/]+>""", """controllers.BookController.getBook(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BookController.getBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteBook/""" + "$" + """id<[^/]+>""", """controllers.BookController.deleteBook(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """editBook/""" + "$" + """id<[^/]+>""", """controllers.BookController.editBook(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.UserController.addUser()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """post""", """controllers.PostController.addPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newuser""", """controllers.UserController.newUser()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """newpost""", """controllers.PostController.newPost()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """posts""", """controllers.PostController.getPosts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """users""", """controllers.UserController.getUsers()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """showposts""", """controllers.PostController.showPosts()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_BookController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_BookController_index0_invoker = createInvoker(
    BookController_0.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_BookController_addBook1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("book")))
  )
  private[this] lazy val controllers_BookController_addBook1_invoker = createInvoker(
    BookController_0.addBook(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "addBook",
      Nil,
      "POST",
      """""",
      this.prefix + """book"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BookController_getBook2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("book/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_getBook2_invoker = createInvoker(
    BookController_0.getBook(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getBook",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """book/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_BookController_getBooks3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BookController_getBooks3_invoker = createInvoker(
    BookController_0.getBooks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getBooks",
      Nil,
      "GET",
      """""",
      this.prefix + """books"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BookController_deleteBook4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_deleteBook4_invoker = createInvoker(
    BookController_0.deleteBook(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "deleteBook",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """deleteBook/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BookController_editBook5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("editBook/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BookController_editBook5_invoker = createInvoker(
    BookController_0.editBook(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "editBook",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """editBook/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_UserController_addUser6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_UserController_addUser6_invoker = createInvoker(
    UserController_1.addUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "addUser",
      Nil,
      "POST",
      """""",
      this.prefix + """user"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_PostController_addPost7_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("post")))
  )
  private[this] lazy val controllers_PostController_addPost7_invoker = createInvoker(
    PostController_3.addPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "addPost",
      Nil,
      "POST",
      """""",
      this.prefix + """post"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_newUser8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newuser")))
  )
  private[this] lazy val controllers_UserController_newUser8_invoker = createInvoker(
    UserController_1.newUser(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "newUser",
      Nil,
      "GET",
      """""",
      this.prefix + """newuser"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_PostController_newPost9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("newpost")))
  )
  private[this] lazy val controllers_PostController_newPost9_invoker = createInvoker(
    PostController_3.newPost(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "newPost",
      Nil,
      "GET",
      """""",
      this.prefix + """newpost"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_PostController_getPosts10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("posts")))
  )
  private[this] lazy val controllers_PostController_getPosts10_invoker = createInvoker(
    PostController_3.getPosts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "getPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """posts"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UserController_getUsers11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("users")))
  )
  private[this] lazy val controllers_UserController_getUsers11_invoker = createInvoker(
    UserController_1.getUsers(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "getUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """users"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_PostController_showPosts12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("showposts")))
  )
  private[this] lazy val controllers_PostController_showPosts12_invoker = createInvoker(
    PostController_3.showPosts(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PostController",
      "showPosts",
      Nil,
      "GET",
      """""",
      this.prefix + """showposts"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_at13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at13_invoker = createInvoker(
    Assets_2.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_BookController_index0_route(params) =>
      call { 
        controllers_BookController_index0_invoker.call(BookController_0.index())
      }
  
    // @LINE:7
    case controllers_BookController_addBook1_route(params) =>
      call { 
        controllers_BookController_addBook1_invoker.call(BookController_0.addBook())
      }
  
    // @LINE:8
    case controllers_BookController_getBook2_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_getBook2_invoker.call(BookController_0.getBook(id))
      }
  
    // @LINE:9
    case controllers_BookController_getBooks3_route(params) =>
      call { 
        controllers_BookController_getBooks3_invoker.call(BookController_0.getBooks())
      }
  
    // @LINE:10
    case controllers_BookController_deleteBook4_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_deleteBook4_invoker.call(BookController_0.deleteBook(id))
      }
  
    // @LINE:12
    case controllers_BookController_editBook5_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_BookController_editBook5_invoker.call(BookController_0.editBook(id))
      }
  
    // @LINE:16
    case controllers_UserController_addUser6_route(params) =>
      call { 
        controllers_UserController_addUser6_invoker.call(UserController_1.addUser())
      }
  
    // @LINE:17
    case controllers_PostController_addPost7_route(params) =>
      call { 
        controllers_PostController_addPost7_invoker.call(PostController_3.addPost())
      }
  
    // @LINE:18
    case controllers_UserController_newUser8_route(params) =>
      call { 
        controllers_UserController_newUser8_invoker.call(UserController_1.newUser())
      }
  
    // @LINE:19
    case controllers_PostController_newPost9_route(params) =>
      call { 
        controllers_PostController_newPost9_invoker.call(PostController_3.newPost())
      }
  
    // @LINE:21
    case controllers_PostController_getPosts10_route(params) =>
      call { 
        controllers_PostController_getPosts10_invoker.call(PostController_3.getPosts())
      }
  
    // @LINE:22
    case controllers_UserController_getUsers11_route(params) =>
      call { 
        controllers_UserController_getUsers11_invoker.call(UserController_1.getUsers())
      }
  
    // @LINE:23
    case controllers_PostController_showPosts12_route(params) =>
      call { 
        controllers_PostController_showPosts12_invoker.call(PostController_3.showPosts())
      }
  
    // @LINE:29
    case controllers_Assets_at13_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at13_invoker.call(Assets_2.at(path, file))
      }
  }
}
