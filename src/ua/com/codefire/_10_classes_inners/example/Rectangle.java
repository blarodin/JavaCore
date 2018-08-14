package ua.com.codefire._10_classes_inners.example;

public class Rectangle {

    private int x, y, width, height;

    public static class Builder {
        private Rectangle rectangle;

        public Builder() {
            rectangle = new Rectangle();
        }

        public Builder withX(int x) {
            rectangle.x = x;
            return this;
        }

        public Builder withY(int y) {
            rectangle.y = y;
            return this;
        }

        public Builder withWidth(int width) {
            rectangle.width = width;
            return this;
        }

        public Builder withHeight(int height) {
            rectangle.height = height;
            return this;
        }

        public Rectangle build() {
            return rectangle;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
