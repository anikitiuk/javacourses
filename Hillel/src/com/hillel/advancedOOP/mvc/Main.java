package com.hillel.advancedOOP.mvc;

/**
 * Created by ANikitiuk on 16.07.2015.
 */
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        VisualizerController visualizerController = new VisualizerController(model);
    }
}
