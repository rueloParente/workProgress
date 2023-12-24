package domain.house;

public class RoomDimensions {
    private double width;
    private double length;
    private double height;

    public RoomDimensions(double width, double length, double height) throws IllegalArgumentException {

        if (width <= 0 || length <= 0 || height < 0) {
            throw new IllegalArgumentException("Width and length must be positive values. Height must be a non-negative value");
        }
        this.width = width;
        this.length = length;
        this.height = height;
    }

    public void setHeight(double height) throws IllegalArgumentException {
        if (height < 0) {
            throw new IllegalArgumentException("Height must be a non-negative value");
        }
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setLength(double length)throws IllegalArgumentException {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be a positive value");
        }
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setWidth(double width) throws IllegalArgumentException {
        if (width <= 0) {
            throw new IllegalArgumentException("Width must be a positive value");
        }
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
}
