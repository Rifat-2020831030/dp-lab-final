package features;

import main_component.Document;

public class Bold extends FeaturesDecorator{

    public Bold(Document decoratedDocument) {
        super(decoratedDocument);
    }
    
    @Override
    public String getFeature() {
        return super.getFeature() + " + BOLD Text";
    }

    @Override
    public String getText() {
        return "<b>" + super.getText() + "</b>";
    }
}
