
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
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script type='text/javascript' src='"""),_display_(/*10.46*/routes/*10.52*/.Assets.at("javascripts/index.js")),format.raw/*10.86*/("""'></script>
        <script src=""""),_display_(/*11.23*/routes/*11.29*/.Assets.at("javascripts/bootstrap.min.js")),format.raw/*11.71*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*12.23*/routes/*12.29*/.Assets.at("javascripts/jquery.dataTables.min.js")),format.raw/*12.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*13.23*/routes/*13.29*/.Assets.at("javascripts/dataTables.bootstrap.min.js")),format.raw/*13.82*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*14.23*/routes/*14.29*/.Assets.at("javascripts/dropzone.js")),format.raw/*14.66*/("""" type="text/javascript"></script>

        <link rel="stylesheet" type="text/css" href='"""),_display_(/*16.55*/routes/*16.61*/.Assets.at("stylesheets/bootstrap.min.css")),format.raw/*16.104*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*17.55*/routes/*17.61*/.Assets.at("stylesheets/dataTables.bootstrap.min.css")),format.raw/*17.115*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*18.55*/routes/*18.61*/.Assets.at("stylesheets/myModal.css")),format.raw/*18.98*/("""'>
        <link rel="stylesheet" type="text/css" href='"""),_display_(/*19.55*/routes/*19.61*/.Assets.at("stylesheets/dropzone.css")),format.raw/*19.99*/("""'>

        <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid.min.css" />
        <link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid-theme.min.css" />
        <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jsgrid/1.5.3/jsgrid.min.js"></script>


    </head>
    <body>
        """),_display_(/*28.10*/content),format.raw/*28.17*/("""
    """),format.raw/*29.5*/("""</body>
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
                  DATE: Fri Jan 26 09:59:44 CST 2018
                  SOURCE: /Users/juanpurata/Projects/play/play_example_blog/app/views/main.scala.html
                  HASH: 51d2ab1755343d4a217bbab5a47af8eef8e0c6b3
                  MATRIX: 748->1|873->31|901->33|978->84|1003->89|1096->156|1110->162|1162->194|1335->340|1350->346|1405->380|1466->414|1481->420|1544->462|1628->519|1643->525|1714->575|1798->632|1813->638|1887->691|1971->748|1986->754|2044->791|2161->881|2176->887|2241->930|2325->987|2340->993|2416->1047|2500->1104|2515->1110|2573->1147|2657->1204|2672->1210|2731->1248|3171->1661|3199->1668|3231->1673
                  LINES: 27->1|32->1|34->3|38->7|38->7|39->8|39->8|39->8|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|59->28|59->28|60->29
                  -- GENERATED --
              */
          