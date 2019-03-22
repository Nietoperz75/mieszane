package pw.robac.vaadin13.ui;

import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.RouterLayout;

public class MainLayout extends VerticalLayout implements RouterLayout {
	
//	private Div childWrapper = new Div();
	
	public MainLayout() {
		setSizeFull();
		
		final H1 title = new H1("Cwiczenie bindig");
		
		HorizontalLayout mainContent = new HorizontalLayout();
		add(mainContent);
		expand(mainContent);
		
		setAlignItems(Alignment.STRETCH);
//		setAlignSelf(Alignment.CENTER,t);
		
//		mainContent.add(childWrapper);
		mainContent.setAlignItems(Alignment.STRETCH);
//		mainContent.add(childWrapper);
//		mainContent.expand(childWrapper);
	}
//	
//	@Override
//	public void showRouterLayoutContent(HasElement content) {
//		childWrapper.getElement().appendChild(content.getElement());
//	}

}
