
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.59*/routes/*8.65*/.Assets.at("images/favicon.png")),format.raw/*8.97*/("""">
        <script src=""""),_display_(/*9.23*/routes/*9.29*/.Assets.at("javascripts/jquery-2.2.0.min.js")),format.raw/*9.74*/("""" type="text/javascript"></script>
        <script type='text/javascript' src='"""),_display_(/*10.46*/routes/*10.52*/.Assets.at("javascripts/index.js")),format.raw/*10.86*/("""'></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery.dataTables.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/dataTables.bootstrap.min.js")),format.raw/*13.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/dropzone.js")),format.raw/*14.66*/("""" type="text/javascript"></script>

        <link rel="stylesheet" type="text/css" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*16.104*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*17.55*/routes/*17.61*/.Assets.at("stylesheets/dataTables.bootstrap.min.css")),format.raw/*17.115*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.at("stylesheets/myModal.css")),format.raw/*18.98*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/dropzone.css")),format.raw/*19.99*/("""'>
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
    """),format.raw/*23.5*/("""</body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Jan 26 01:58:38 CST 2018
                  SOURCE: /Users/Juan/Projects/play/testLynxCompliance/app/views/main.scala.html
                  HASH: e4155424d8d92ad5b788cd3838417fd10dbbf84f
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1096->156|1110->162|1162->194|1213->219|1227->225|1292->270|1399->350|1414->356|1469->390|1530->424|1545->430|1608->472|1692->529|1707->535|1778->585|1862->642|1877->648|1951->701|2035->758|2050->764|2108->801|2225->891|2240->897|2305->940|2389->997|2404->1003|2480->1057|2564->1114|2579->1120|2637->1157|2721->1214|2736->1220|2795->1258|2857->1293|2885->1300|2917->1305
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|53->22|53->22|54->23
                  -- GENERATED --
              */
          