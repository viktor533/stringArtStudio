package geomentry;

import geomentry.Layer;

import java.util.ArrayList;
import java.util.List;

public class Project {
    ArrayList<Layer> layers;

    public Project() {
        layers = new ArrayList<Layer>();
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void addLayer(Layer layer) {
        layers.add(layer);
    }

    public int countOdLayers() {
        return layers.size();
    }

    public Layer getLayer(int index) {
        return layers.get(index);
    }

//    public void setLayers(Layer[] layers) {
//        this.layers = layers;
//    }

}
