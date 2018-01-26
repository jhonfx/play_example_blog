
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Blog demo")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="jumbotron">
            <h3><i class="glyphicon glyphicon-fire"></i> BLOG DEMO</h3>
            <button data-toggle="modal" data-target="#modaluser" class="btn btn-primary"> User</button>
            <button data-toggle="modal" data-target="#modalcategory" class="btn btn-success">Category</button>
            <button data-toggle="modal" data-target="#modalpost" class="btn btn-info"> Post</button>
        </div>

            <table align="center" id="example" class="table table-striped table-bordered table-hover" cellspacing="0" width="80%">
                            <i class="glyphicon glyphicon-plus"></i>Add new</button>
                        <thead>
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Page</th>
                    <th>Cover</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
            <tfoot>
                <tr>
                    <th>Id</th>
                    <th>Title</th>
                    <th>Author</th>
                    <th>Page</th>
                    <th>Cover</th>
                    <th>Action</th>

                </tr>
            </tfoot>
        </table>
    </div>
    <script>
        $(document).ready( function() """),format.raw/*41.39*/("""{"""),format.raw/*41.40*/("""
            """),format.raw/*42.13*/("""var clients = [
                """),format.raw/*43.17*/("""{"""),format.raw/*43.18*/(""" """),format.raw/*43.19*/(""""Name": "Otto Clay", "Age": 25, "Country": 1, "Address": "Ap #897-1459 Quam Avenue", "Married": false """),format.raw/*43.121*/("""}"""),format.raw/*43.122*/(""",
                """),format.raw/*44.17*/("""{"""),format.raw/*44.18*/(""" """),format.raw/*44.19*/(""""Name": "Connor Johnston", "Age": 45, "Country": 2, "Address": "Ap #370-4647 Dis Av.", "Married": true """),format.raw/*44.122*/("""}"""),format.raw/*44.123*/(""",
                """),format.raw/*45.17*/("""{"""),format.raw/*45.18*/(""" """),format.raw/*45.19*/(""""Name": "Lacey Hess", "Age": 29, "Country": 3, "Address": "Ap #365-8835 Integer St.", "Married": false """),format.raw/*45.122*/("""}"""),format.raw/*45.123*/(""",
                """),format.raw/*46.17*/("""{"""),format.raw/*46.18*/(""" """),format.raw/*46.19*/(""""Name": "Timothy Henson", "Age": 56, "Country": 1, "Address": "911-5143 Luctus Ave", "Married": true """),format.raw/*46.120*/("""}"""),format.raw/*46.121*/(""",
                """),format.raw/*47.17*/("""{"""),format.raw/*47.18*/(""" """),format.raw/*47.19*/(""""Name": "Ramona Benton", "Age": 32, "Country": 3, "Address": "Ap #614-689 Vehicula Street", "Married": false """),format.raw/*47.128*/("""}"""),format.raw/*47.129*/("""
            """),format.raw/*48.13*/("""];

            var countries = [
                """),format.raw/*51.17*/("""{"""),format.raw/*51.18*/(""" """),format.raw/*51.19*/("""Name: "", Id: 0 """),format.raw/*51.35*/("""}"""),format.raw/*51.36*/(""",
                """),format.raw/*52.17*/("""{"""),format.raw/*52.18*/(""" """),format.raw/*52.19*/("""Name: "United States", Id: 1 """),format.raw/*52.48*/("""}"""),format.raw/*52.49*/(""",
                """),format.raw/*53.17*/("""{"""),format.raw/*53.18*/(""" """),format.raw/*53.19*/("""Name: "Canada", Id: 2 """),format.raw/*53.41*/("""}"""),format.raw/*53.42*/(""",
                """),format.raw/*54.17*/("""{"""),format.raw/*54.18*/(""" """),format.raw/*54.19*/("""Name: "United Kingdom", Id: 3 """),format.raw/*54.49*/("""}"""),format.raw/*54.50*/("""
            """),format.raw/*55.13*/("""];

            console.log(clients);
            $("#jsGrid").jsGrid("""),format.raw/*58.33*/("""{"""),format.raw/*58.34*/("""
                """),format.raw/*59.17*/("""width: "100%",
                height: "400px",

                inserting: true,
                editing: true,
                sorting: true,
                paging: true,

                data: clients,

                fields: [
                    """),format.raw/*70.21*/("""{"""),format.raw/*70.22*/(""" """),format.raw/*70.23*/("""name: "Name", type: "text", width: 150, validate: "required" """),format.raw/*70.84*/("""}"""),format.raw/*70.85*/(""",
                    """),format.raw/*71.21*/("""{"""),format.raw/*71.22*/(""" """),format.raw/*71.23*/("""name: "Age", type: "number", width: 50 """),format.raw/*71.62*/("""}"""),format.raw/*71.63*/(""",
                    """),format.raw/*72.21*/("""{"""),format.raw/*72.22*/(""" """),format.raw/*72.23*/("""name: "Address", type: "text", width: 200 """),format.raw/*72.65*/("""}"""),format.raw/*72.66*/(""",
                    """),format.raw/*73.21*/("""{"""),format.raw/*73.22*/(""" """),format.raw/*73.23*/("""name: "Country", type: "select", items: countries, valueField: "Id", textField: "Name" """),format.raw/*73.110*/("""}"""),format.raw/*73.111*/(""",
                    """),format.raw/*74.21*/("""{"""),format.raw/*74.22*/(""" """),format.raw/*74.23*/("""name: "Married", type: "checkbox", title: "Is Married", sorting: false """),format.raw/*74.94*/("""}"""),format.raw/*74.95*/(""",
                    """),format.raw/*75.21*/("""{"""),format.raw/*75.22*/(""" """),format.raw/*75.23*/("""type: "control" """),format.raw/*75.39*/("""}"""),format.raw/*75.40*/("""
                """),format.raw/*76.17*/("""]
            """),format.raw/*77.13*/("""}"""),format.raw/*77.14*/(""");
        """),format.raw/*78.9*/("""}"""),format.raw/*78.10*/(""");

    </script>

    <div class="container">
        <div class="row">
            <div id="jsGrid " class="col-sm-10">

                asdasdasdasdas
            </div>
        </div>
    </div>

        <!-- line modal -->


    """),format.raw/*94.23*/("""
    """),format.raw/*95.5*/("""<div class="modal fade" id="modalcategory" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add Category</h3>

                    <form method="POST" action=""""),_display_(/*103.50*/routes/*103.56*/.CategoryController.addCategory()),format.raw/*103.89*/("""" id="formCategory" enctype="multipart/form-data">
                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_category">

                            <div class="form-group">
                                <label for="nameCategory">Name</label>
                                <input type="text" class="form-control" name="name" placeholder="Enter the name category" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="saveCategory" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>


                </div>
            </div>
        </div>
    </div>

    """),format.raw/*132.19*/("""
    """),format.raw/*133.5*/("""<div class="modal fade" id="modalpost" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add new Post</h3>

                    <form method="POST" action=""""),_display_(/*141.50*/routes/*141.56*/.PostController.addPost()),format.raw/*141.81*/("""" id="formPost" enctype="multipart/form-data">

                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_post">

                            <div class="form-group">
                                <label for="titlePost">Title</label>
                                <input type="text" class="form-control" name="title" placeholder="title here" required>
                            </div>
                            <div class="form-group">
                                <label for="commentPost">Comment</label>
                                <input type="text" class="form-control" name="comment" placeholder="comment here" required>
                            </div>
                            <div class="form-group">
                                <label for="authorPost">Author</label>
                                <input type="text" class="form-control" name="author" placeholder="author here">
                            </div>
                            <div class="form-group">
                                <label for="categoryPost">Category</label>
                                <input type="text" class="form-control" name="category" placeholder="category here" required>
                            </div>
                            <div class="form-group">
                                <label for="postFile">Image</label>
                            </div>
                            <input type="file" name="image">
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="savePost" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>


                </div>
            </div>
        </div>
    </div>



    """),format.raw/*189.19*/("""
    """),format.raw/*190.5*/("""<div class="modal fade" id="modaluser" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add User</h3>

                    <form method="POST" action=""""),_display_(/*198.50*/routes/*198.56*/.UserController.addUser()),format.raw/*198.81*/("""" id="formUser" enctype="multipart/form-data">
                        <div class="modal-body">
                                <!-- content goes here -->
                            <input type="hidden" name="id" id="id_user">

                            <div class="form-group">
                                <label for="titleBook">Name</label>
                                <input type="text" class="form-control" name="name" placeholder="Enter the title" required>
                            </div>
                            <div class="form-group">
                                <label for="authorBook">Lastname</label>
                                <input type="text" class="form-control" name="lastname" placeholder="Enter the name of author" required>
                            </div>
                            <div class="form-group">
                                <label for="descriptionBook">Username</label>
                                <input type="text" class="form-control" name="username" placeholder="Enter the description" required>
                            </div>
                            <div class="form-group">
                                <label for="pageBook">Password</label>
                                <input type="password" class="form-control" name="password" placeholder="Enter the number of page" required>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                                <div class="btn-group" role="group">
                                    <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                                </div>
                                <div class="btn-group" role="group">
                                    <button type="submit" id="saveUser" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                        Submit</button>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>

    """),format.raw/*237.21*/("""
    """),format.raw/*238.5*/("""<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true"><span class="glyphicon glyphicon-remove" aria-hidden="true"></span></button>
                    <h4 class="modal-title custom_align" id="Heading">Delete this book</h4>
                </div>
                <form action="/deleteBook/" id="formdel">
                    <div class="modal-body">

                        <div class="alert alert-danger"><span class="glyphicon glyphicon-warning-sign"></span>
                            Are you sure you want to delete this Book?</div>

                    </div>
                    <div class="modal-footer ">
                        <button type="submit" class="btn btn-success" ><span class="glyphicon glyphicon-ok-sign"></span>
                             Yes</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal" ><span class="glyphicon glyphicon-remove"></span>
                             No</button>
                    </div>
                </form>
            </div>

                <!-- /.modal-content -->
        </div>
            <!-- /.modal-dialog -->
    </div>
    """),format.raw/*265.27*/("""
    """),format.raw/*266.5*/("""<div id="modalAffich" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <img src="" class="img-responsive" id="coverid">
                </div>
            </div>
        </div>
    </div>


""")))}),format.raw/*277.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Jan 26 13:41:24 CST 2018
                  SOURCE: /Users/juanpurata/Projects/play/play_example_blog/app/views/index.scala.html
                  HASH: 4f46abae522b80b4aee779c0b06089f22960c1da
                  MATRIX: 738->1|834->3|862->6|887->23|926->25|957->30|2390->1435|2419->1436|2460->1449|2520->1481|2549->1482|2578->1483|2709->1585|2739->1586|2785->1604|2814->1605|2843->1606|2975->1709|3005->1710|3051->1728|3080->1729|3109->1730|3241->1833|3271->1834|3317->1852|3346->1853|3375->1854|3505->1955|3535->1956|3581->1974|3610->1975|3639->1976|3777->2085|3807->2086|3848->2099|3926->2149|3955->2150|3984->2151|4028->2167|4057->2168|4103->2186|4132->2187|4161->2188|4218->2217|4247->2218|4293->2236|4322->2237|4351->2238|4401->2260|4430->2261|4476->2279|4505->2280|4534->2281|4592->2311|4621->2312|4662->2325|4760->2395|4789->2396|4834->2413|5115->2666|5144->2667|5173->2668|5262->2729|5291->2730|5341->2752|5370->2753|5399->2754|5466->2793|5495->2794|5545->2816|5574->2817|5603->2818|5673->2860|5702->2861|5752->2883|5781->2884|5810->2885|5926->2972|5956->2973|6006->2995|6035->2996|6064->2997|6163->3068|6192->3069|6242->3091|6271->3092|6300->3093|6344->3109|6373->3110|6418->3127|6460->3141|6489->3142|6527->3153|6556->3154|6818->3406|6850->3411|7427->3960|7443->3966|7498->3999|8971->5457|9004->5462|9577->6007|9593->6013|9640->6038|12153->8536|12186->8541|12755->9082|12771->9088|12818->9113|15164->11446|15197->11451|16630->12877|16663->12882|17070->13258
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|72->41|72->41|73->42|74->43|74->43|74->43|74->43|74->43|75->44|75->44|75->44|75->44|75->44|76->45|76->45|76->45|76->45|76->45|77->46|77->46|77->46|77->46|77->46|78->47|78->47|78->47|78->47|78->47|79->48|82->51|82->51|82->51|82->51|82->51|83->52|83->52|83->52|83->52|83->52|84->53|84->53|84->53|84->53|84->53|85->54|85->54|85->54|85->54|85->54|86->55|89->58|89->58|90->59|101->70|101->70|101->70|101->70|101->70|102->71|102->71|102->71|102->71|102->71|103->72|103->72|103->72|103->72|103->72|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|105->74|105->74|106->75|106->75|106->75|106->75|106->75|107->76|108->77|108->77|109->78|109->78|125->94|126->95|134->103|134->103|134->103|163->132|164->133|172->141|172->141|172->141|220->189|221->190|229->198|229->198|229->198|268->237|269->238|296->265|297->266|308->277
                  -- GENERATED --
              */
          