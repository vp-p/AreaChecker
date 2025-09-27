package factory;

public interface ShapeFactory {

    Calculable getShape(ShapeType type, Double[] parameters);
    
}
