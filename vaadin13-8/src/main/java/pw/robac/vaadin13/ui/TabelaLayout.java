package pw.robac.vaadin13.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.timepicker.TimePicker;
import com.vaadin.flow.data.renderer.ComponentRenderer;
import com.vaadin.flow.i18n.I18NProvider;
import com.vaadin.flow.router.RouterLayout;

import pw.robac.vaadin13.dto.ProsteDto;

public class TabelaLayout extends VerticalLayout implements RouterLayout {
	
	private Grid<ProsteDto> grid;
	Locale LOCALE_PL = new Locale("pl", "PL");
	
	public TabelaLayout() {
		DatePicker dataOd = new DatePicker(LocalDate.now());
//		dataOd.setLocale(LOCALE_PL);
		add(dataOd);
		TimePicker godzina = new TimePicker(LocalTime.now());
		add(godzina);
		LocalDateTime teraz = LocalDateTime.of(dataOd.getValue(), godzina.getValue());
		System.out.println(teraz.toString());
		grid = new Grid<>(ProsteDto.class);
		grid.setSizeFull();
		
		List<ProsteDto> lista = new ArrayList<>();
		lista.add(new ProsteDto(1, "a", "aa"));
		lista.add(new ProsteDto(2, "b", "bb"));
		lista.add(new ProsteDto(4, "ffds", "efsdsf"));
		boolean czyPamieci = grid.getDataProvider().isInMemory();
		System.out.println(czyPamieci);
		grid.setItems(lista);
		grid.setItemDetailsRenderer(new ComponentRenderer<>(prosteDto ->{
			return new Label(prosteDto.getId()+"");
		}
		));
		setSizeFull();
		add(grid);
//		set
	}
	
//	public void tabelaSetItems(List<ProsteDto> lista) {
//		this.grid.setItems(lista);
//	}
}
