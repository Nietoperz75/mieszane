package pw.robac.vaadin13.ui;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the projekt-jakis.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("projekt-jakis")
@HtmlImport("context://src/main/java/pw/robac/vaadin13/ui/projekt-jakis.html")
public class ProjektJakis extends PolymerTemplate<ProjektJakis.ProjektJakisModel> {

    /**
     * Creates a new ProjektJakis.
     */
    public ProjektJakis() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between ProjektJakis and projekt-jakis.html
     */
    public interface ProjektJakisModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
