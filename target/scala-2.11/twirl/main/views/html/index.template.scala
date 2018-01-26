
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

"""),_display_(/*3.2*/main("Lynx compliance test")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
    """),format.raw/*4.5*/("""<div class="container">
        <div class="jumbotron">
            <h3><i class="glyphicon glyphicon-book"></i> Book Store App :</h3>
            <button data-toggle="modal" data-target="#squarespaceModal" class="btn btn-primary">
                <i class="glyphicon glyphicon-plus"></i>Add new</button>
        </div>

        <table align="center" id="example" class="table table-striped table-bordered table-hover" cellspacing="0" width="80%">
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

        <!-- line modal -->
    """),format.raw/*40.29*/("""
    """),format.raw/*41.5*/("""<div class="modal fade" id="squarespaceModal" tabindex="-1" role="dialog" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">                  
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">
                        ×</span><span class="sr-only">Close</span></button>
                    <h3 class="modal-title" id="lineModalLabel">Add to the bookstore</h3>
                </div>
                <form method="POST" action=""""),_display_(/*49.46*/routes/*49.52*/.BookController.addBook()),format.raw/*49.77*/("""" id="formedit" enctype="multipart/form-data">

                    <div class="modal-body">
                            <!-- content goes here -->
                        <input type="hidden" name="id" id="id">

                        <div class="form-group">
                            <label for="titleBook">Title</label>
                            <input type="text" class="form-control" name="title" placeholder="Enter the title" required>
                        </div>
                        <div class="form-group">
                            <label for="authorBook">author</label>
                            <input type="text" class="form-control" name="author" placeholder="Enter the name of author" required>
                        </div>
                        <div class="form-group">
                            <label for="descriptionBook">description</label>
                            <input type="text" class="form-control" name="description" placeholder="Enter the description">
                        </div>
                        <div class="form-group">
                            <label for="pageBook">page</label>
                            <input type="text" class="form-control" name="page" placeholder="Enter the number of page" required>
                        </div>
                        <div class="form-group">
                            <label for="BookInputFile">Cover</label>
                        </div>
                        <input type="file" name="picture">
                    </div>
                    <div class="modal-footer">
                        <div class="btn-group btn-group-justified" role="group" aria-label="group button">
                            <div class="btn-group" role="group">
                                <button type="button" class="btn btn-default" data-dismiss="modal" role="button">Close</button>
                            </div>
                            <div class="btn-group" role="group">
                                <button type="submit" id="saveImage" class="btn btn-default btn-hover-green" data-action="save" role="button">
                                    Submit</button>
                            </div>
                        </div>
                    </div>
                </form>

            </div>
        </div>
    </div>
    """),format.raw/*92.21*/("""
    """),format.raw/*93.5*/("""<div class="modal fade" id="delete" tabindex="-1" role="dialog" aria-labelledby="edit" aria-hidden="true">
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
    """),format.raw/*120.27*/("""
    """),format.raw/*121.5*/("""<div id="modalAffich" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-body">
                    <img src="" class="img-responsive" id="coverid">
                </div>
            </div>
        </div>
    </div>


""")))}),format.raw/*132.2*/("""
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
                  DATE: Fri Jan 26 01:58:38 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/index.scala.html
                  HASH: 4b4bf55b401ea85ad261f910dd01725e2aa5ac29
                  MATRIX: 738->1|834->3|862->6|898->34|937->36|968->41|2143->1212|2175->1217|2798->1813|2813->1819|2859->1844|5241->4214|5273->4219|6706->5645|6739->5650|7146->6026
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|71->40|72->41|80->49|80->49|80->49|123->92|124->93|151->120|152->121|163->132
                  -- GENERATED --
              */
          