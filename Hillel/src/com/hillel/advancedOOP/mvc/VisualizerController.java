package com.hillel.advancedOOP.mvc;

/**
 * Created by ANikitiuk on 16.07.2015.
 */
public class VisualizerController {
    public VisualizerController(Model model){
        Visualizer visualizer = new Visualizer();
        model.registerObserver(visualizer);
    }
}
