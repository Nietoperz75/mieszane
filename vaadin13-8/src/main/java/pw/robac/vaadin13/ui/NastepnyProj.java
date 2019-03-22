package pw.robac.vaadin13.ui;

import com.vaadin.flow.templatemodel.TemplateModel;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;

/**
 * A Designer generated component for the nastepny-proj.html template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("nastepny-proj")
@HtmlImport("context://src/main/java/pw/robac/vaadin13/ui/nastepny-proj.html")
public class NastepnyProj extends PolymerTemplate<NastepnyProj.NastepnyProjModel> {

    /**
     * Creates a new NastepnyProj.
     */
    public NastepnyProj() {
        // You can initialise any data required for the connected UI components here.
    }

    /**
     * This model binds properties between NastepnyProj and nastepny-proj.html
     */
    public interface NastepnyProjModel extends TemplateModel {
        // Add setters and getters for template properties here.
    }
}
