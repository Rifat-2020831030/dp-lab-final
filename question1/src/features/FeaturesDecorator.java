package features;

import main_component.Document;

public class FeaturesDecorator implements Document{

    Document decoratedDocument;

    public FeaturesDecorator(Document decoratedDocument) {
        this.decoratedDocument = decoratedDocument;
    }

    @Override
    public String getFeature() {
        return decoratedDocument.getFeature();
    }

    @Override
    public String getText() {
        return decoratedDocument.getText();
    }
    
}
