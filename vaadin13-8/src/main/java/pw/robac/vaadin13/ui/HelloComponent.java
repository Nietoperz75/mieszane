package pw.robac.vaadin13.ui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;

import pw.robac.vaadin13.dto.ProsteDto;

@SuppressWarnings("serial")
@Route(value = "bind", layout = MainLayout.class)
public class HelloComponent extends HorizontalLayout{
	/**
	 * 
	 */

	/**
	 * 
	 */
	
	public static final String TITLE = " Binding Forms";
	
	public HelloComponent() {
		final ProsteDto prosteDto = new ProsteDto(1, "a", "b");
		
		ProsteDtoViewer prosteDtoViewer = new ProsteDtoViewer (prosteDto); 
		prosteDtoViewer.setWidth("30%");
		ProsteDtoEditor prosteDtoEditor = new ProsteDtoEditor(prosteDto, prosteDtoViewer::refresh);
		prosteDtoViewer.setWidth("30%");
		add(prosteDtoEditor, prosteDtoViewer);
		getThemeList().set("spacing", true);
	}
}
