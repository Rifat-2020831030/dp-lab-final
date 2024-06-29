package features;

import main_component.Document;

public class Highligting extends FeaturesDecorator{

    public Highligting(Document decoratedDocument) {
        super(decoratedDocument);
    }

    @Override
    public String getFeature() {
        return super.getFeature() + " + Highlighting";
    }

    @Override
    public String getText() {
        return "<mark>" + super.getText() + "</mark>";
    }
    
}
