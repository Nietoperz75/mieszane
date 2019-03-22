package pw.robac.vaadin13.ui;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Paragraph;

import pw.robac.vaadin13.dto.ProsteDto;

public class ProsteDtoViewer extends Composite<FormLayout> implements HasSize{
	
	private final Paragraph idText = new Paragraph();
	private final Paragraph nameText = new Paragraph();
	private final Paragraph subNameText = new Paragraph();
	
	public ProsteDtoViewer(ProsteDto prosteDto) {
		final FormLayout layout = getContent();
		
		layout.addFormItem(idText, "Id");
		layout.addFormItem(nameText, "Name");
		layout.addFormItem(subNameText, "SubName");
		refresh(prosteDto);
	}
	
	void refresh(ProsteDto prosteDto) {
		idText.setText(String.valueOf(prosteDto.getId()));
		nameText.setText(prosteDto.getName());
		subNameText.setText(prosteDto.getSubName());
	}
	
}
