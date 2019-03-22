package pw.robac.vaadin13.ui;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteConfiguration;

@Route(value = "tabela", layout = TabelaLayout.class)
@Tag("tabela")
public class TabelaUi extends Component{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TabelaUi() {
		super();
	}
}
