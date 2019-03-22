package pw.robac.vaadin13.ui;

import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.PropertyId;


@SuppressWarnings("serial")
public class ProsteDtoFormLayout extends FormLayout {

	@PropertyId("id")
	final private TextField idField  = new TextField("Id");
	
	@PropertyId("name")
	final private TextField nameField = new TextField("name");
	
	@PropertyId("subName")
	final private TextField subNameField = new TextField("subName");
	
	public ProsteDtoFormLayout() {
		add(idField, nameField, subNameField);
	}

	public TextField getIdField() {
		return idField;
	}

	public TextField getNameField() {
		return nameField;
	}

	public TextField getSubNameField() {
		return subNameField;
	}
	
	
}
