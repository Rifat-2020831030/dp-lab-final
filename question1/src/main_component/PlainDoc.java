package main_component;

public class PlainDoc implements Document{

    String text;

    public PlainDoc(String text) {
        this.text = text;
    }

    @Override
    public String getFeature() {
        return "Basic editing";
    }

    @Override
    public String getText() {
        return text;
    }
    
}
