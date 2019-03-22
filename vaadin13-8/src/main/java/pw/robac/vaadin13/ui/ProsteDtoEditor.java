package pw.robac.vaadin13.ui;

import java.util.function.Consumer;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.data.binder.ValidationException;
import com.vaadin.flow.data.converter.StringToIntegerConverter;
import com.vaadin.flow.dom.Element;

import pw.robac.vaadin13.dto.ProsteDto;

public class ProsteDtoEditor extends Composite<VerticalLayout> implements HasComponents, HasSize {

	public ProsteDtoEditor(ProsteDto prosteDto, Consumer<ProsteDto> prosteDtoConsumer) {
		final ProsteDtoFormLayout prosteDtoEditLayout  = new ProsteDtoFormLayout();
		
		final Binder<ProsteDto> binder = new Binder<>(ProsteDto.class);
		
		binder.forField(prosteDtoEditLayout.getIdField()).withConverter(new StringToIntegerConverter("MUSI BYC LICZBA")).bind(ProsteDto::getId, ProsteDto::setId);
		
		binder.forField(prosteDtoEditLayout.getNameField()).bind(ProsteDto::getName, ProsteDto::setName);
		
		binder.forField(prosteDtoEditLayout.getSubNameField()).bind(ProsteDto::getSubName, ProsteDto::setSubName);
		
		binder.readBean(prosteDto);
		
		final HorizontalLayout footer = new HorizontalLayout();
		
		footer.add(new Button("Zapisz", event->{
			try {
				binder.writeBean(prosteDto);
				prosteDtoConsumer.accept(prosteDto);
			} catch (ValidationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}));
		
		footer.add(new Button("Cancel", event -> binder.readBean(prosteDto)));
		footer.getThemeList().set("spacing", true);
		add(prosteDtoEditLayout, footer);
	}
	
	
//	@Override
//	public Element getElement() {
//		// TODO Auto-generated method stub
//		System.out.println("Cos tam");
//		return null;
//	}

}
