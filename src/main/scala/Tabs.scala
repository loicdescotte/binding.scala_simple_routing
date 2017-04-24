
import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import com.thoughtworks.binding.{Binding, dom, Route}
import com.thoughtworks.binding.Binding._
import org.scalajs.dom.window
import org.scalajs.dom.Event
import org.scalajs.dom.raw.Node
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.html.Table
import org.scalajs.dom.html.Input
import org.scalajs.dom.document


case class TabState(content: String, hash: String)

object Tabs extends JSApp {

  @dom def render() = {
    val activeTab: Var[TabState] = Var(TabState("select a tab", "#/"))

    Route.watchHash(activeTab)(new Route.Format[TabState] {
        override def unapply(hashText: String) =  {
          hashText.split("#/").lift(1).map(tab => TabState(s"tab $tab is selected", hashText))
        }
        override def apply(state: TabState): String = state.hash
    })

    <div>
      <span><a onclick={e: Event => activeTab := TabState("tab 1 is selected", "#/1")}>|Tab 1|</a></span>
      <span><a onclick={e: Event => activeTab := TabState("tab 2 is selected", "#/2")}>|Tab 2|</a></span>
      <div>{activeTab.bind.content}</div>
    </div>
  }

  //dom.render(document.body, render)

  @JSExport def main = dom.render(document.body, render)

}
